package defpackage;

import android.content.Context;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

public final class frq implements fsg {
    static final boolean a = false;
    static frq b;
    static final Object g = new Object();
    private static final gma j = gma.a("BabelPeopleCache");
    private static Runnable y = new frt();
    boolean c;
    final gui d;
    public final Handler e = new Handler(Looper.getMainLooper());
    final Object f = new Object();
    public final Runnable h = new fru(this);
    hsi i = new hsi(this);
    private Context k;
    private int l;
    private boolean m;
    private final ConditionVariable n = new ConditionVariable();
    private final List<a> o = new ArrayList();
    private frx p;
    private hwl q;
    private hwq r;
    private ky<String, ArrayList<Integer>> s = new ky();
    private ky<String, ArrayList<Integer>> t = new ky();
    private boolean u = false;
    private long v = 0;
    private boolean w = false;
    private String x = "N/A";

    static {
        kae kae = glk.q;
    }

    private frq(Context context) {
        this.k = context;
        gui gui = (gui) jyn.b(context, gui.class);
        if (gui == null) {
            guj guj = new guj(gwb.H());
            guj.a(hsj.c, new hsm().a(117).a());
            guj.a(new frr(this));
            guj.a(new frs(this));
            gui = guj.b();
        }
        this.d = gui;
    }

    public static frq a() {
        frq frq;
        synchronized (g) {
            if (b == null || !Thread.holdsLock(b.f)) {
                if (b == null) {
                    b = new frq(gwb.H());
                }
                b.h();
                frq = b;
            } else {
                throw new IllegalStateException("Invalid lock ordering");
            }
        }
        return frq;
    }

    void a(boolean z) {
        String b = j.b("refreshInternal");
        synchronized (this.f) {
            if (!this.u) {
                glk.a("BabelPeopleCache", "GmsPeopleCache: Refresh requested. Performing now", new Object[0]);
                d();
            } else if (z) {
                glk.a("BabelPeopleCache", "GmsPeopleCache: Load in progress. Queueing up refresh", new Object[0]);
                this.w = true;
            } else {
                glk.a("BabelPeopleCache", "GmsPeopleCache: Load in progress. Piggyback refresh", new Object[0]);
            }
        }
        j.c(b);
    }

    public static void b(boolean z) {
        frq a = frq.a();
        try {
            a.a(z);
        } finally {
            a.b();
        }
    }

    private void h() {
        synchronized (this.f) {
            this.l++;
            if (a) {
                int i = this.l;
                String valueOf = String.valueOf(Log.getStackTraceString(new Throwable()));
                new StringBuilder(String.valueOf(valueOf).length() + 40).append("GmsPeopleCache: addRef  ref:").append(i).append("\n").append(valueOf);
            }
            if (this.l == 1) {
                this.e.removeCallbacks(y);
            }
            if (!(this.d.e() || this.d.f())) {
                this.d.b();
            }
        }
    }

    public void b() {
        synchronized (this.f) {
            if (this.l <= 0) {
                throw new IllegalStateException("number of clients should be bigger than 0");
            }
            this.l--;
            if (a) {
                new StringBuilder(43).append("GmsPeopleCache: releaseRef  ref:").append(this.l);
            }
            if (this.l == 0) {
                this.e.postDelayed(y, 60000);
            }
        }
    }

    boolean c() {
        boolean z = true;
        synchronized (this.f) {
            if (this.l != 0) {
                z = false;
            } else {
                iil.a("Expected condition to be true", this.o.isEmpty());
                if (this.d.e() || this.d.f()) {
                    if (this.d.e()) {
                        hsj.m.a(this.d, this.i);
                    }
                    this.d.d();
                }
                if (this.q != null) {
                    this.q.b();
                    this.q = null;
                }
                if (this.r != null) {
                    this.r.b();
                    this.r = null;
                }
                this.e.removeCallbacks(this.h);
                this.t.clear();
                this.s.clear();
                this.c = true;
            }
        }
        return z;
    }

    void d() {
        String b = j.b("load");
        synchronized (this.f) {
            h();
            if (this.d.e() || this.d.f()) {
                glk.a("BabelPeopleCache", "GmsPeopleCache: PeopleLoader load() begins", new Object[0]);
                this.u = true;
                this.v = glj.a();
                new fsb(this.d, null, this).b();
                j.c(b);
                return;
            }
            glk.a("BabelPeopleCache", "GmsPeopleCache: disconnected in load(). Reconnecting", new Object[0]);
            this.d.b();
        }
    }

    public void a(fsb fsb, hwl hwl, hwq hwq) {
        synchronized (this.f) {
            if (a) {
                new StringBuilder(53).append("GmsPeopleCache: onPeopleReady ").append(glj.a() - this.v).append(" ms");
            }
            iiq.a(new frv(this, hwl, hwq));
        }
    }

    void a(hwl hwl, hwq hwq) {
        String b = j.b("buildCache");
        ky kyVar = new ky();
        ky kyVar2 = new ky();
        long a = glj.a();
        try {
            String valueOf;
            MessageDigest instance = MessageDigest.getInstance("md5");
            if (hwl != null) {
                int a2 = gwb.a(gwb.H(), "babel_gms_people_cache_maximum_contacts_size", 2000);
                for (int i = 0; i < hwl.a(); i++) {
                    if (i >= a2) {
                        new StringBuilder(63).append("Maximum contacts reached. Total ").append(hwl.a()).append("; max is ").append(a2);
                        break;
                    }
                    ArrayList arrayList;
                    String valueOf2;
                    String valueOf3;
                    hwk hwk = (hwk) hwl.a(i);
                    String e = hwk.e();
                    if (!TextUtils.isEmpty(e)) {
                        if (a) {
                            valueOf = String.valueOf(hwk.a());
                            new StringBuilder((String.valueOf(e).length() + 50) + String.valueOf(valueOf).length()).append("GmsPeopleCache: adding entry from gaia:").append(e).append(" to person:").append(valueOf);
                        }
                        arrayList = (ArrayList) kyVar.get(e);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            kyVar.put(e, arrayList);
                        } else if (a && glk.a("BabelPeopleCache", 3)) {
                            valueOf2 = String.valueOf(hwk.a());
                            glk.b("BabelPeopleCache", new StringBuilder((String.valueOf(e).length() + 53) + String.valueOf(valueOf2).length()).append("GmsPeopleCache_Error: duplicate entry for gaia:").append(e).append(" name:").append(valueOf2).toString(), new Object[0]);
                            ArrayList arrayList2 = arrayList;
                            int size = arrayList2.size();
                            int i2 = 0;
                            while (i2 < size) {
                                Object obj = arrayList2.get(i2);
                                i2++;
                                String str = "BabelPeopleCache";
                                String str2 = "GmsPeopleCache_Error: dup person name:";
                                valueOf3 = String.valueOf(((hwk) hwl.a(gwb.a((Integer) obj))).a());
                                if (valueOf3.length() != 0) {
                                    valueOf3 = str2.concat(valueOf3);
                                } else {
                                    valueOf3 = new String(str2);
                                }
                                glk.b(str, valueOf3, new Object[0]);
                            }
                        }
                        arrayList.add(Integer.valueOf(i));
                    }
                    for (hwr hwr : hwk.d()) {
                        valueOf3 = glq.f(hwr.b());
                        if (a) {
                            valueOf = String.valueOf(hwr.b());
                            valueOf2 = String.valueOf(hwk.a());
                            new StringBuilder(((String.valueOf(valueOf).length() + 57) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()).append("GmsPeopleCache: adding entry from phone:").append(valueOf).append(" to person:").append(valueOf2).append(" key: ").append(valueOf3);
                        }
                        arrayList = (ArrayList) kyVar2.get(valueOf3);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            kyVar2.put(valueOf3, arrayList);
                        }
                        if (!arrayList.contains(Integer.valueOf(i))) {
                            arrayList.add(Integer.valueOf(i));
                        }
                    }
                    ((fsx) hwk).a(instance);
                }
                long a3 = glj.a();
                if (a) {
                    a3 -= a;
                    new StringBuilder(88).append("GmsPeopleCache: End building cache. Total: ").append(a3).append("ms; ").append(hwl.a()).append(" contacts.");
                }
            }
            synchronized (this.f) {
                this.p = new frx(this.o, hwl, hwq, this.q, this.r);
                this.q = hwl;
                this.r = hwq;
                this.t = kyVar2;
                this.s = kyVar;
                String valueOf4 = String.valueOf(blo.c(gwb.H()));
                valueOf = String.valueOf(gwb.c(instance.digest()));
                this.x = new StringBuilder((String.valueOf(valueOf4).length() + 1) + String.valueOf(valueOf).length()).append(valueOf4).append("|").append(valueOf).toString();
                this.u = false;
                this.m = true;
                this.n.open();
                iiq.a(new frw(this));
                if (this.w) {
                    glk.a("BabelPeopleCache", "GmsPeopleCache: Triggering queued refresh.", new Object[0]);
                    this.w = false;
                    d();
                }
                synchronized (this.f) {
                    long a4 = glj.a();
                    if (this.q != null && this.q.a() > 0) {
                        this.q.a(0);
                    }
                    if (a) {
                        new StringBuilder(59).append("GmsPeopleCache: prefetchFirstPerson ").append(glj.a() - a4).append(" ms");
                    }
                }
            }
            this.e.post(this.p);
            j.c(b);
        } catch (NoSuchAlgorithmException e2) {
            throw new IllegalStateException("md5 not available");
        }
    }

    public boolean e() {
        boolean z;
        synchronized (this.f) {
            z = this.m;
        }
        return z;
    }

    public ArrayList<hwk> a(String str) {
        i();
        synchronized (this.f) {
            if (this.s.containsKey(str)) {
                ArrayList<hwk> arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) this.s.get(str);
                int size = arrayList2.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList2.get(i);
                    i++;
                    arrayList.add((hwk) this.q.a(gwb.a((Integer) obj)));
                }
                return arrayList;
            }
            return null;
        }
    }

    private ArrayList<hwk> d(String str) {
        if (str == null) {
            return null;
        }
        String f = glq.f(str);
        ArrayList arrayList = (ArrayList) this.t.get(f);
        if (arrayList != null) {
            ArrayList<hwk> arrayList2 = new ArrayList();
            arrayList = arrayList;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                hwk hwk = (hwk) this.q.a(gwb.a((Integer) arrayList.get(i)));
                for (hwr hwr : hwk.d()) {
                    if (f.equals(glq.f(hwr.b()))) {
                        if (glq.a().a(gwb.H(), str, hwr.b())) {
                            arrayList2.add(hwk);
                            i = i2;
                            break;
                        }
                    }
                }
                i = i2;
            }
            if (arrayList2.size() > 0) {
                return arrayList2;
            }
        }
        return null;
    }

    public ArrayList<hwk> b(String str) {
        ArrayList<hwk> d;
        i();
        synchronized (this.f) {
            d = d(str);
        }
        return d;
    }

    public hwk c(String str) {
        if (!i()) {
            return null;
        }
        synchronized (this.f) {
            ArrayList d = d(str);
            if (d == null) {
                return null;
            } else if (d.size() == 1) {
                hwk hwk = (hwk) d.get(0);
                return hwk;
            } else {
                d = d;
                int size = d.size();
                int i = 0;
                hwk hwk2 = null;
                while (i < size) {
                    Object obj = d.get(i);
                    i++;
                    hwk hwk3 = (hwk) obj;
                    if (TextUtils.isEmpty(hwk3.e())) {
                        hwk3 = hwk2;
                    } else if (hwk2 != null) {
                        return null;
                    }
                    hwk2 = hwk3;
                }
                return hwk2;
            }
        }
    }

    private boolean i() {
        String b = j.b("waitForReady");
        if (Thread.holdsLock(this.f)) {
            throw new IllegalStateException("Invalid lock ordering");
        } else if (giw.e(this.k)) {
            return false;
        } else {
            boolean block = this.n.block(2000);
            j.c(b);
            return block;
        }
    }

    public static long f() {
        return gwb.a(gwb.H(), "babel_gms_people_cache_notification_lag", 25000);
    }

    public static void g() {
        if (!((cxg) jyn.a(gwb.H(), cxg.class)).a("use_merged_contacts_instead_of_gmspeoplecache")) {
            frq a = frq.a();
            try {
                a.b();
                String N = gwb.M();
                String str = a.x;
                String str2 = "GmsPeopleCache: old Thumbprint: ";
                String valueOf = String.valueOf(N);
                if (valueOf.length() != 0) {
                    str2.concat(valueOf);
                } else {
                    valueOf = new String(str2);
                }
                str2 = "GmsPeopleCache: current Thumbprint: ";
                valueOf = String.valueOf(str);
                if (valueOf.length() != 0) {
                    str2.concat(valueOf);
                } else {
                    valueOf = new String(str2);
                }
                if (!(gwb.a(gwb.H(), "babel_refresh_contacts_derived_data_use_thumbprint", true) && str.equals(N))) {
                    blo.d(gwb.H());
                }
                gwb.a(glj.a(), str);
            } finally {
                a.b();
            }
        }
    }
}
