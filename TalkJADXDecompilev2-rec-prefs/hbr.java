package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.iid.MessengerCompat;
import java.io.IOException;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.interfaces.RSAPrivateKey;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public final class hbr {
    static String f16536a = null;
    static int f16537b = 0;
    static int f16538c = 0;
    static int f16539d = 0;
    Context f16540e;
    Map<String, Object> f16541f = new HashMap();
    Messenger f16542g;
    Messenger f16543h;
    MessengerCompat f16544i;
    PendingIntent f16545j;
    long f16546k;
    long f16547l;
    int f16548m;
    int f16549n;
    long f16550o;

    public hbr(Context context) {
        this.f16540e = context;
    }

    public static String m19157a(Context context) {
        if (f16536a != null) {
            return f16536a;
        }
        f16537b = Process.myUid();
        PackageManager packageManager = context.getPackageManager();
        for (ResolveInfo resolveInfo : packageManager.queryIntentServices(new Intent("com.google.android.c2dm.intent.REGISTER"), 0)) {
            String str;
            if (packageManager.checkPermission("com.google.android.c2dm.permission.RECEIVE", resolveInfo.serviceInfo.packageName) == 0) {
                try {
                    ApplicationInfo applicationInfo = packageManager.getApplicationInfo(resolveInfo.serviceInfo.packageName, 0);
                    new StringBuilder(17).append("Found ").append(applicationInfo.uid);
                    f16538c = applicationInfo.uid;
                    str = resolveInfo.serviceInfo.packageName;
                    f16536a = str;
                    return str;
                } catch (NameNotFoundException e) {
                }
            } else {
                str = String.valueOf(resolveInfo.serviceInfo.packageName);
                String valueOf = String.valueOf("com.google.android.c2dm.intent.REGISTER");
                new StringBuilder((String.valueOf(str).length() + 56) + String.valueOf(valueOf).length()).append("Possible malicious package ").append(str).append(" declares ").append(valueOf).append(" without permission");
            }
        }
        ApplicationInfo applicationInfo2;
        try {
            applicationInfo2 = packageManager.getApplicationInfo("com.google.android.gms", 0);
            f16536a = applicationInfo2.packageName;
            f16538c = applicationInfo2.uid;
            return f16536a;
        } catch (NameNotFoundException e2) {
            try {
                applicationInfo2 = packageManager.getApplicationInfo("com.google.android.gsf", 0);
                f16536a = applicationInfo2.packageName;
                f16538c = applicationInfo2.uid;
                return f16536a;
            } catch (NameNotFoundException e3) {
                return null;
            }
        }
    }

    private static String m19158a(KeyPair keyPair, String... strArr) {
        String str = null;
        try {
            byte[] bytes = TextUtils.join("\n", strArr).getBytes("UTF-8");
            try {
                PrivateKey privateKey = keyPair.getPrivate();
                Signature instance = Signature.getInstance(privateKey instanceof RSAPrivateKey ? "SHA256withRSA" : "SHA256withECDSA");
                instance.initSign(privateKey);
                instance.update(bytes);
                str = hbo.m19146a(instance.sign());
            } catch (Throwable e) {
                Log.e("InstanceID/Rpc", "Unable to sign registration request", e);
            }
        } catch (Throwable e2) {
            Log.e("InstanceID/Rpc", "Unable to encode string", e2);
        }
        return str;
    }

    private void m19159a() {
        if (this.f16542g == null) {
            hbr.m19157a(this.f16540e);
            this.f16542g = new Messenger(new hbs(this, Looper.getMainLooper()));
        }
    }

    private void m19160a(Intent intent, String str) {
        this.f16546k = SystemClock.elapsedRealtime();
        intent.putExtra("kid", new StringBuilder(String.valueOf(str).length() + 5).append("|ID|").append(str).append("|").toString());
        intent.putExtra("X-kid", new StringBuilder(String.valueOf(str).length() + 5).append("|ID|").append(str).append("|").toString());
        boolean equals = "com.google.android.gsf".equals(f16536a);
        String stringExtra = intent.getStringExtra("useGsf");
        if (stringExtra != null) {
            equals = "1".equals(stringExtra);
        }
        if (Log.isLoggable("InstanceID/Rpc", 3)) {
            stringExtra = String.valueOf(intent.getExtras());
            new StringBuilder(String.valueOf(stringExtra).length() + 8).append("Sending ").append(stringExtra);
        }
        if (this.f16543h != null) {
            intent.putExtra("google.messenger", this.f16542g);
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                this.f16543h.send(obtain);
                return;
            } catch (RemoteException e) {
            }
        }
        if (equals) {
            Intent intent2 = new Intent("com.google.android.gms.iid.InstanceID");
            intent2.setPackage(this.f16540e.getPackageName());
            intent2.putExtra("GSF", intent);
            this.f16540e.startService(intent2);
            return;
        }
        intent.putExtra("google.messenger", this.f16542g);
        intent.putExtra("messenger2", "1");
        if (this.f16544i != null) {
            Message obtain2 = Message.obtain();
            obtain2.obj = intent;
            try {
                this.f16544i.m9763a(obtain2);
                return;
            } catch (RemoteException e2) {
            }
        }
        this.f16540e.startService(intent);
    }

    private void m19161a(Bundle bundle, KeyPair keyPair, String str) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f16550o == 0 || elapsedRealtime > this.f16550o) {
            m19159a();
            if (f16536a == null) {
                throw new IOException("MISSING_INSTANCEID_SERVICE");
            }
            this.f16546k = SystemClock.elapsedRealtime();
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage(f16536a);
            bundle.putString("gmsv", Integer.toString(hbr.m19165b(this.f16540e)));
            bundle.putString("osv", Integer.toString(VERSION.SDK_INT));
            bundle.putString("app_ver", Integer.toString(hbo.m19143a(this.f16540e)));
            bundle.putString("app_ver_name", hbo.m19147b(this.f16540e));
            bundle.putString("cliv", "1");
            bundle.putString("appid", hbo.m19145a(keyPair));
            bundle.putString("pub2", hbo.m19146a(keyPair.getPublic().getEncoded()));
            bundle.putString("sig", hbr.m19158a(keyPair, this.f16540e.getPackageName(), r1));
            intent.putExtras(bundle);
            m19168b(intent);
            m19160a(intent, str);
            return;
        }
        elapsedRealtime = this.f16550o - elapsedRealtime;
        new StringBuilder(78).append("Backoff mode, next request attempt: ").append(elapsedRealtime).append(" interval: ").append(this.f16549n);
        throw new IOException("RETRY_LATER");
    }

    private void m19162a(Object obj) {
        synchronized (getClass()) {
            for (String str : this.f16541f.keySet()) {
                Object obj2 = this.f16541f.get(str);
                this.f16541f.put(str, obj);
                hbr.m19163a(obj2, obj);
            }
        }
    }

    private static void m19163a(Object obj, Object obj2) {
        if (obj instanceof ConditionVariable) {
            ((ConditionVariable) obj).open();
        }
        if (obj instanceof Messenger) {
            Messenger messenger = (Messenger) obj;
            Message obtain = Message.obtain();
            obtain.obj = obj2;
            try {
                messenger.send(obtain);
            } catch (RemoteException e) {
                String valueOf = String.valueOf(e);
                new StringBuilder(String.valueOf(valueOf).length() + 24).append("Failed to send response ").append(valueOf);
            }
        }
    }

    private void m19164a(String str, Object obj) {
        synchronized (getClass()) {
            Object obj2 = this.f16541f.get(str);
            this.f16541f.put(str, obj);
            hbr.m19163a(obj2, obj);
        }
    }

    private static int m19165b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(hbr.m19157a(context), 0).versionCode;
        } catch (NameNotFoundException e) {
            return -1;
        }
    }

    private Intent m19166b(Bundle bundle, KeyPair keyPair) {
        Intent intent;
        ConditionVariable conditionVariable = new ConditionVariable();
        String b = hbr.m19167b();
        synchronized (getClass()) {
            this.f16541f.put(b, conditionVariable);
        }
        m19161a(bundle, keyPair, b);
        conditionVariable.block(30000);
        synchronized (getClass()) {
            Object remove = this.f16541f.remove(b);
            if (remove instanceof Intent) {
                intent = (Intent) remove;
            } else if (remove instanceof String) {
                throw new IOException((String) remove);
            } else {
                String valueOf = String.valueOf(remove);
                new StringBuilder(String.valueOf(valueOf).length() + 12).append("No response ").append(valueOf);
                throw new IOException("TIMEOUT");
            }
        }
        return intent;
    }

    private static synchronized String m19167b() {
        String num;
        synchronized (hbr.class) {
            int i = f16539d;
            f16539d = i + 1;
            num = Integer.toString(i);
        }
        return num;
    }

    private synchronized void m19168b(Intent intent) {
        if (this.f16545j == null) {
            Intent intent2 = new Intent();
            intent2.setPackage("com.google.example.invalidpackage");
            this.f16545j = PendingIntent.getBroadcast(this.f16540e, 0, intent2, 0);
        }
        intent.putExtra("app", this.f16545j);
    }

    private void m19169c(Intent intent) {
        Object stringExtra = intent.getStringExtra("error");
        if (stringExtra == null) {
            String valueOf = String.valueOf(intent.getExtras());
            new StringBuilder(String.valueOf(valueOf).length() + 49).append("Unexpected response, no error or registration id ").append(valueOf);
            return;
        }
        if (Log.isLoggable("InstanceID/Rpc", 3)) {
            valueOf = "Received InstanceID error ";
            String valueOf2 = String.valueOf(stringExtra);
            if (valueOf2.length() != 0) {
                valueOf.concat(valueOf2);
            } else {
                valueOf2 = new String(valueOf);
            }
        }
        valueOf = null;
        if (stringExtra.startsWith("|")) {
            String[] split = stringExtra.split("\\|");
            if (!"ID".equals(split[1])) {
                String str = "Unexpected structured response ";
                String valueOf3 = String.valueOf(stringExtra);
                if (valueOf3.length() != 0) {
                    str.concat(valueOf3);
                } else {
                    valueOf3 = new String(str);
                }
            }
            if (split.length > 2) {
                valueOf = split[2];
                stringExtra = split[3];
                if (stringExtra.startsWith(":")) {
                    stringExtra = stringExtra.substring(1);
                }
            } else {
                stringExtra = "UNKNOWN";
            }
            intent.putExtra("error", stringExtra);
        }
        if (valueOf == null) {
            m19162a(stringExtra);
        } else {
            m19164a(valueOf, stringExtra);
        }
        long longExtra = intent.getLongExtra("Retry-After", 0);
        if (longExtra > 0) {
            this.f16547l = SystemClock.elapsedRealtime();
            this.f16549n = ((int) longExtra) * 1000;
            this.f16550o = SystemClock.elapsedRealtime() + ((long) this.f16549n);
            new StringBuilder(52).append("Explicit request from server to backoff: ").append(this.f16549n);
        } else if (("SERVICE_NOT_AVAILABLE".equals(stringExtra) || "AUTHENTICATION_FAILED".equals(stringExtra)) && "com.google.android.gsf".equals(f16536a)) {
            this.f16548m++;
            if (this.f16548m >= 3) {
                if (this.f16548m == 3) {
                    this.f16549n = new Random().nextInt(1000) + 1000;
                }
                this.f16549n <<= 1;
                this.f16550o = SystemClock.elapsedRealtime() + ((long) this.f16549n);
                new StringBuilder(String.valueOf(stringExtra).length() + 31).append("Backoff due to ").append(stringExtra).append(" for ").append(this.f16549n);
            }
        }
    }

    Intent m19170a(Bundle bundle, KeyPair keyPair) {
        Intent b = m19166b(bundle, keyPair);
        return (b == null || !b.hasExtra("google.messenger")) ? b : m19166b(bundle, keyPair);
    }

    public void m19171a(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            String stringExtra;
            if ("com.google.android.c2dm.intent.REGISTRATION".equals(action) || "com.google.android.gms.iid.InstanceID".equals(action)) {
                action = intent.getStringExtra("registration_id");
                stringExtra = action == null ? intent.getStringExtra("unregistered") : action;
                if (stringExtra == null) {
                    m19169c(intent);
                    return;
                }
                this.f16546k = SystemClock.elapsedRealtime();
                this.f16550o = 0;
                this.f16548m = 0;
                this.f16549n = 0;
                if (Log.isLoggable("InstanceID/Rpc", 3)) {
                    action = String.valueOf(intent.getExtras());
                    new StringBuilder((String.valueOf(stringExtra).length() + 16) + String.valueOf(action).length()).append("AppIDResponse: ").append(stringExtra).append(" ").append(action);
                }
                action = null;
                if (stringExtra.startsWith("|")) {
                    String[] split = stringExtra.split("\\|");
                    if (!"ID".equals(split[1])) {
                        String str = "Unexpected structured response ";
                        stringExtra = String.valueOf(stringExtra);
                        if (stringExtra.length() != 0) {
                            str.concat(stringExtra);
                        } else {
                            stringExtra = new String(str);
                        }
                    }
                    stringExtra = split[2];
                    if (split.length > 4) {
                        if ("SYNC".equals(split[3])) {
                            Context context = this.f16540e;
                            Intent intent2 = new Intent("com.google.android.gms.iid.InstanceID");
                            intent2.setPackage(context.getPackageName());
                            intent2.putExtra(hbp.f16529d, "SYNC");
                            context.startService(intent2);
                        } else if ("RST".equals(split[3])) {
                            Context context2 = this.f16540e;
                            hbo.m19149c(this.f16540e);
                            hbp.m19155a(context2, hbo.f16521c);
                            intent.removeExtra("registration_id");
                            m19164a(stringExtra, (Object) intent);
                            return;
                        }
                    }
                    action = split[split.length - 1];
                    if (action.startsWith(":")) {
                        action = action.substring(1);
                    }
                    intent.putExtra("registration_id", action);
                    action = stringExtra;
                }
                if (action == null) {
                    m19162a((Object) intent);
                } else {
                    m19164a(action, (Object) intent);
                }
            } else if (Log.isLoggable("InstanceID/Rpc", 3)) {
                action = "Unexpected response ";
                stringExtra = String.valueOf(intent.getAction());
                if (stringExtra.length() != 0) {
                    action.concat(stringExtra);
                } else {
                    stringExtra = new String(action);
                }
            }
        }
    }

    public void m19172a(Message message) {
        if (message != null && (message.obj instanceof Intent)) {
            Intent intent = (Intent) message.obj;
            intent.setExtrasClassLoader(MessengerCompat.class.getClassLoader());
            if (intent.hasExtra("google.messenger")) {
                Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                if (parcelableExtra instanceof MessengerCompat) {
                    this.f16544i = (MessengerCompat) parcelableExtra;
                }
                if (parcelableExtra instanceof Messenger) {
                    this.f16543h = (Messenger) parcelableExtra;
                }
            }
            m19171a((Intent) message.obj);
        }
    }
}
