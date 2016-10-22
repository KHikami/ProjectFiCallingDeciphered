import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.os.Looper;
import android.util.Base64;
import java.io.IOException;
import java.security.KeyPair;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

public final class hbo {
    static Map<String, hbo> a;
    public static hbw c;
    static hbr d;
    static String h;
    Context b;
    KeyPair e;
    String f;
    long g;

    static {
        a = new HashMap();
    }

    private hbo(Context context, String str) {
        this.f = "";
        this.b = context.getApplicationContext();
        this.f = str;
    }

    static int a(Context context) {
        int i = 0;
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (NameNotFoundException e) {
            String valueOf = String.valueOf(e);
            new StringBuilder(String.valueOf(valueOf).length() + 38).append("Never happens: can't find own package ").append(valueOf);
            return i;
        }
    }

    public static synchronized hbo a(Context context, Bundle bundle) {
        hbo hbo;
        synchronized (hbo.class) {
            String string = bundle == null ? "" : bundle.getString("subtype");
            String str = string == null ? "" : string;
            Context applicationContext = context.getApplicationContext();
            if (c == null) {
                c = new hbw(applicationContext);
                d = new hbr(applicationContext);
            }
            h = Integer.toString(a(applicationContext));
            hbo = (hbo) a.get(str);
            if (hbo == null) {
                hbo = new hbo(applicationContext, str);
                a.put(str, hbo);
            }
        }
        return hbo;
    }

    static String a(KeyPair keyPair) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(keyPair.getPublic().getEncoded());
            digest[0] = (byte) ((digest[0] & 15) + 112);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException e) {
            return null;
        }
    }

    static String a(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    static String b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (NameNotFoundException e) {
            String valueOf = String.valueOf(e);
            new StringBuilder(String.valueOf(valueOf).length() + 38).append("Never happens: can't find own package ").append(valueOf);
            return null;
        }
    }

    private KeyPair b() {
        if (this.e == null) {
            this.e = c.b(this.f);
        }
        if (this.e == null) {
            this.g = System.currentTimeMillis();
            this.e = c.a(this.f, this.g);
        }
        return this.e;
    }

    public static hbo c(Context context) {
        return a(context, null);
    }

    public String a(String str, String str2, Bundle bundle) {
        Object obj = null;
        Object obj2 = 1;
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IOException("MAIN_THREAD");
        }
        Object obj3;
        String a = c.a("appVersion");
        if (a == null || !a.equals(h)) {
            obj3 = 1;
        } else {
            a = c.a("lastToken");
            int i;
            if (a == null) {
                i = 1;
            } else {
                if ((System.currentTimeMillis() / 1000) - Long.valueOf(Long.parseLong(a)).longValue() > 604800) {
                    i = 1;
                } else {
                    obj3 = null;
                }
            }
        }
        String a2 = obj3 != null ? null : c.a(this.f, str, str2);
        if (a2 == null) {
            if (bundle.getString("ttl") != null) {
                obj2 = null;
            }
            if (!"jwt".equals(bundle.getString("type"))) {
                obj = obj2;
            }
            a2 = b(str, str2, bundle);
            if (!(a2 == null || r1 == null)) {
                c.a(this.f, str, str2, a2, h);
            }
        }
        return a2;
    }

    public void a() {
        this.g = 0;
        c.c(this.f);
        this.e = null;
    }

    public String b(String str, String str2, Bundle bundle) {
        if (str2 != null) {
            bundle.putString("scope", str2);
        }
        bundle.putString("sender", str);
        String str3 = "".equals(this.f) ? str : this.f;
        if (!bundle.containsKey("legacy.register")) {
            bundle.putString("subscription", str);
            bundle.putString("subtype", str3);
            bundle.putString("X-subscription", str);
            bundle.putString("X-subtype", str3);
        }
        Intent a = d.a(bundle, b());
        if (a == null) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        str3 = a.getStringExtra("registration_id");
        if (str3 == null) {
            str3 = a.getStringExtra("unregistered");
        }
        a.getLongExtra("Retry-After", 0);
        if (str3 != null) {
            return str3;
        }
        str3 = a.getStringExtra("error");
        if (str3 != null) {
            throw new IOException(str3);
        }
        str3 = String.valueOf(a.getExtras());
        new StringBuilder(String.valueOf(str3).length() + 29).append("Unexpected response from GCM ").append(str3);
        Throwable th = new Throwable();
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }
}
