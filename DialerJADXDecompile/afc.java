import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorDescription;
import android.accounts.OnAccountsUpdateListener;
import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SyncAdapterType;
import android.content.SyncStatusObserver;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.provider.ContactsContract.Contacts;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Log;
import android.util.TimingLogger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
final class afc extends afb implements OnAccountsUpdateListener, SyncStatusObserver {
    private static final Map e;
    private static final Uri f;
    private static final Comparator g;
    final afi a;
    final AtomicBoolean b;
    Context c;
    Handler d;
    private final AtomicBoolean h;
    private final Handler i;
    private final Runnable j;
    private AccountManager k;
    private afv l;
    private List m;
    private List n;
    private List o;
    private Map p;
    private Map q;
    private HandlerThread r;
    private BroadcastReceiver s;
    private volatile CountDownLatch t;

    static {
        e = Collections.unmodifiableMap(new HashMap());
        f = Contacts.getLookupUri(1, "xxx");
        g = new afd();
    }

    public afc(Context context) {
        this.h = new AtomicBoolean(false);
        this.b = new AtomicBoolean(false);
        this.i = new Handler(Looper.getMainLooper());
        this.j = new afe(this);
        this.m = new ArrayList();
        this.n = new ArrayList();
        this.o = new ArrayList();
        this.p = new ArrayMap();
        this.q = e;
        this.s = new aff(this);
        this.t = new CountDownLatch(1);
        this.c = context;
        this.l = new ahi(context);
        this.k = AccountManager.get(this.c);
        this.r = new HandlerThread("AccountChangeListener");
        this.r.start();
        this.d = new afg(this, this.r.getLooper());
        this.a = new afi();
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
        intentFilter.addAction("android.intent.action.PACKAGE_CHANGED");
        intentFilter.addDataScheme("package");
        this.c.registerReceiver(this.s, intentFilter);
        intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.EXTERNAL_APPLICATIONS_AVAILABLE");
        intentFilter.addAction("android.intent.action.EXTERNAL_APPLICATIONS_UNAVAILABLE");
        this.c.registerReceiver(this.s, intentFilter);
        this.c.registerReceiver(this.s, new IntentFilter("android.intent.action.LOCALE_CHANGED"));
        this.k.addOnAccountsUpdatedListener(this, this.d, false);
        ContentResolver.addStatusChangeListener(1, this);
        this.d.sendEmptyMessage(0);
    }

    private static AuthenticatorDescription a(AuthenticatorDescription[] authenticatorDescriptionArr, String str) {
        for (AuthenticatorDescription authenticatorDescription : authenticatorDescriptionArr) {
            if (str.equals(authenticatorDescription.type)) {
                return authenticatorDescription;
            }
        }
        return null;
    }

    private static Map a(Collection collection, Map map) {
        Map arrayMap = new ArrayMap();
        for (agd agd : collection) {
            agc agc = agd.d;
            afv afv = (afv) map.get(agc);
            if (!(afv == null || arrayMap.containsKey(agc))) {
                if (Log.isLoggable("AccountTypeManager", 3)) {
                    String valueOf = String.valueOf(agc);
                    String valueOf2 = String.valueOf(afv.c());
                    new StringBuilder((String.valueOf(valueOf).length() + 18) + String.valueOf(valueOf2).length()).append("Type ").append(valueOf).append(" inviteClass=").append(valueOf2);
                }
                if (!TextUtils.isEmpty(afv.c())) {
                    arrayMap.put(agc, afv);
                }
            }
        }
        return Collections.unmodifiableMap(arrayMap);
    }

    public final void onStatusChanged(int i) {
        this.d.sendEmptyMessage(0);
    }

    public final void onAccountsUpdated(Account[] accountArr) {
        c();
    }

    private void d() {
        CountDownLatch countDownLatch = this.t;
        if (countDownLatch != null) {
            while (true) {
                try {
                    countDownLatch.await();
                    break;
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    protected final void c() {
        String valueOf;
        TimingLogger timingLogger = new TimingLogger("AccountTypeManager", "loadAccountsInBackground");
        long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Map arrayMap = new ArrayMap();
        Map arrayMap2 = new ArrayMap();
        Collection arrayList = new ArrayList();
        List arrayList2 = new ArrayList();
        List arrayList3 = new ArrayList();
        Set<String> hashSet = new HashSet();
        AccountManager accountManager = this.k;
        SyncAdapterType[] syncAdapterTypes = ContentResolver.getSyncAdapterTypes();
        AuthenticatorDescription[] authenticatorTypes = accountManager.getAuthenticatorTypes();
        for (SyncAdapterType syncAdapterType : syncAdapterTypes) {
            afv ahj;
            if ("com.android.contacts".equals(syncAdapterType.authority)) {
                String str = syncAdapterType.accountType;
                AuthenticatorDescription a = a(authenticatorTypes, str);
                if (a == null) {
                    Log.w("AccountTypeManager", new StringBuilder(String.valueOf(str).length() + 46).append("No authenticator found for type=").append(str).append(", ignoring it.").toString());
                } else {
                    if ("com.google".equals(str)) {
                        ahj = new ahj(this.c, a.packageName);
                    } else if (ahg.a(str)) {
                        ahj = new ahg(this.c, a.packageName, str);
                    } else {
                        if (ahk.a(this.c, str, a.packageName)) {
                            ahj = new ahk(this.c, a.packageName, str);
                        } else {
                            valueOf = String.valueOf(a.packageName);
                            new StringBuilder((String.valueOf(str).length() + 48) + String.valueOf(valueOf).length()).append("Registering external account type=").append(str).append(", packageName=").append(valueOf);
                            ahj = new ahh(this.c, a.packageName, false);
                        }
                    }
                    if (ahj.g) {
                        ahj.a = a.type;
                        ahj.e = a.labelId;
                        ahj.f = a.iconId;
                        a(ahj, arrayMap, arrayMap2);
                        hashSet.addAll(ahj.f());
                    } else if (ahj.a()) {
                        String str2 = "Problem initializing embedded type ";
                        valueOf = String.valueOf(ahj.getClass().getCanonicalName());
                        if (valueOf.length() != 0) {
                            valueOf = str2.concat(valueOf);
                        } else {
                            valueOf = new String(str2);
                        }
                        throw new IllegalStateException(valueOf);
                    }
                }
            }
        }
        if (!hashSet.isEmpty()) {
            new StringBuilder(42).append("Registering ").append(hashSet.size()).append(" extension packages");
            for (String valueOf2 : hashSet) {
                afv ahh = new ahh(this.c, valueOf2, true);
                if (ahh.g) {
                    if (ahh.j) {
                        if (TextUtils.isEmpty(ahh.a)) {
                            Log.w("AccountTypeManager", new StringBuilder(String.valueOf(valueOf2).length() + 106).append("Skipping extension package ").append(valueOf2).append(" because the CONTACTS_STRUCTURE metadata doesn't have the accountType attribute").toString());
                        } else {
                            String str3 = ahh.a;
                            String str4 = ahh.b;
                            new StringBuilder(((String.valueOf(str3).length() + 67) + String.valueOf(str4).length()) + String.valueOf(valueOf2).length()).append("Registering extension package account type=").append(str3).append(", dataSet=").append(str4).append(", packageName=").append(valueOf2);
                            a(ahh, arrayMap, arrayMap2);
                        }
                    } else {
                        Log.w("AccountTypeManager", new StringBuilder(String.valueOf(valueOf2).length() + 83).append("Skipping extension package ").append(valueOf2).append(" because it doesn't have the CONTACTS_STRUCTURE metadata").toString());
                    }
                }
            }
        }
        timingLogger.addSplit("Loaded account types");
        for (Account account : this.k.getAccounts()) {
            if ((ContentResolver.getIsSyncable(account, "com.android.contacts") > 0 ? 1 : null) != null) {
                List<afv> list = (List) arrayMap2.get(account.type);
                if (list != null) {
                    for (afv ahj2 : list) {
                        agd agd = new agd(account.name, account.type, ahj2.b);
                        arrayList.add(agd);
                        if (ahj2.b()) {
                            arrayList2.add(agd);
                        }
                        if (ahj2.g()) {
                            arrayList3.add(agd);
                        }
                    }
                }
            }
        }
        Collections.sort(arrayList, g);
        Collections.sort(arrayList2, g);
        Collections.sort(arrayList3, g);
        timingLogger.addSplit("Loaded accounts");
        synchronized (this) {
            this.p = arrayMap;
            this.m = arrayList;
            this.n = arrayList2;
            this.o = arrayList3;
            this.q = a(arrayList, arrayMap);
        }
        timingLogger.dumpToLog();
        long currentThreadTimeMillis2 -= currentThreadTimeMillis;
        new StringBuilder(128).append("Loaded meta-data for ").append(this.p.size()).append(" account types, ").append(this.m.size()).append(" accounts in ").append(r4 -= elapsedRealtime).append("ms(wall) ").append(currentThreadTimeMillis2).append("ms(cpu)");
        if (this.t != null) {
            this.t.countDown();
            this.t = null;
        }
        this.i.post(this.j);
    }

    public final List a(boolean z) {
        d();
        return z ? this.n : this.m;
    }

    public final List a() {
        d();
        return this.o;
    }

    public final afv a(agc agc) {
        afv afv;
        d();
        synchronized (this) {
            afv = (afv) this.p.get(agc);
            if (afv == null) {
                afv = this.l;
            }
        }
        return afv;
    }

    private final Map e() {
        d();
        return this.q;
    }

    public final Map b() {
        d();
        if (this.h.get()) {
            boolean z;
            if (SystemClock.elapsedRealtime() - this.a.b > 60000) {
                z = true;
            } else {
                z = false;
            }
            if (z && this.b.compareAndSet(false, true)) {
                new afh(this).execute(new Void[0]);
            }
        } else {
            this.a.a(b(this.c));
            this.h.set(true);
        }
        return this.a.a;
    }

    final Map b(Context context) {
        Map e = e();
        if (e.isEmpty()) {
            return e;
        }
        Map arrayMap = new ArrayMap();
        arrayMap.putAll(e);
        PackageManager packageManager = context.getPackageManager();
        for (agc agc : e.keySet()) {
            Intent a = abn.a((afv) e.get(agc), f);
            if (a == null) {
                arrayMap.remove(agc);
            } else if (packageManager.resolveActivity(a, 65536) == null) {
                arrayMap.remove(agc);
            } else if (!agc.a(context)) {
                arrayMap.remove(agc);
            }
        }
        return Collections.unmodifiableMap(arrayMap);
    }

    private static void a(afv afv, Map map, Map map2) {
        map.put(agc.a(afv.a, afv.b), afv);
        List list = (List) map2.get(afv.a);
        if (list == null) {
            list = new ArrayList();
        }
        list.add(afv);
        map2.put(afv.a, list);
    }
}
