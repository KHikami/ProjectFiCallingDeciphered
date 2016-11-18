package p000;

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
    static Map<String, hbo> f16520a = new HashMap();
    public static hbw f16521c;
    static hbr f16522d;
    static String f16523h;
    Context f16524b;
    KeyPair f16525e;
    String f16526f = "";
    long f16527g;

    private hbo(Context context, String str) {
        this.f16524b = context.getApplicationContext();
        this.f16526f = str;
    }

    static int m19143a(Context context) {
        int i = 0;
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (NameNotFoundException e) {
            String valueOf = String.valueOf(e);
            new StringBuilder(String.valueOf(valueOf).length() + 38).append("Never happens: can't find own package ").append(valueOf);
            return i;
        }
    }

    public static synchronized hbo m19144a(Context context, Bundle bundle) {
        hbo hbo;
        synchronized (hbo.class) {
            String string = bundle == null ? "" : bundle.getString("subtype");
            String str = string == null ? "" : string;
            Context applicationContext = context.getApplicationContext();
            if (f16521c == null) {
                f16521c = new hbw(applicationContext);
                f16522d = new hbr(applicationContext);
            }
            f16523h = Integer.toString(hbo.m19143a(applicationContext));
            hbo = (hbo) f16520a.get(str);
            if (hbo == null) {
                hbo = new hbo(applicationContext, str);
                f16520a.put(str, hbo);
            }
        }
        return hbo;
    }

    static String m19145a(KeyPair keyPair) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(keyPair.getPublic().getEncoded());
            digest[0] = (byte) ((digest[0] & 15) + 112);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException e) {
            return null;
        }
    }

    static String m19146a(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    static String m19147b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (NameNotFoundException e) {
            String valueOf = String.valueOf(e);
            new StringBuilder(String.valueOf(valueOf).length() + 38).append("Never happens: can't find own package ").append(valueOf);
            return null;
        }
    }

    private KeyPair m19148b() {
        if (this.f16525e == null) {
            this.f16525e = f16521c.m19185b(this.f16526f);
        }
        if (this.f16525e == null) {
            this.f16527g = System.currentTimeMillis();
            this.f16525e = f16521c.m19182a(this.f16526f, this.f16527g);
        }
        return this.f16525e;
    }

    public static hbo m19149c(Context context) {
        return hbo.m19144a(context, null);
    }

    public String m19150a(String str, String str2, Bundle bundle) {
        Object obj = null;
        Object obj2 = 1;
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IOException("MAIN_THREAD");
        }
        Object obj3;
        String a = f16521c.m19180a("appVersion");
        if (a == null || !a.equals(f16523h)) {
            obj3 = 1;
        } else {
            a = f16521c.m19180a("lastToken");
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
        String a2 = obj3 != null ? null : f16521c.m19181a(this.f16526f, str, str2);
        if (a2 == null) {
            if (bundle.getString("ttl") != null) {
                obj2 = null;
            }
            if (!"jwt".equals(bundle.getString("type"))) {
                obj = obj2;
            }
            a2 = m19152b(str, str2, bundle);
            if (!(a2 == null || r1 == null)) {
                f16521c.m19183a(this.f16526f, str, str2, a2, f16523h);
            }
        }
        return a2;
    }

    public void m19151a() {
        this.f16527g = 0;
        f16521c.m19187c(this.f16526f);
        this.f16525e = null;
    }

    public String m19152b(String str, String str2, Bundle bundle) {
        if (str2 != null) {
            bundle.putString("scope", str2);
        }
        bundle.putString("sender", str);
        String str3 = "".equals(this.f16526f) ? str : this.f16526f;
        if (!bundle.containsKey("legacy.register")) {
            bundle.putString("subscription", str);
            bundle.putString("subtype", str3);
            bundle.putString("X-subscription", str);
            bundle.putString("X-subtype", str3);
        }
        Intent a = f16522d.m19170a(bundle, m19148b());
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
