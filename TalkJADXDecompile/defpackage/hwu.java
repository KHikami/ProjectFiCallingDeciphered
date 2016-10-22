package defpackage;

import android.content.Context;
import android.util.Log;
import java.lang.reflect.Method;

/* renamed from: hwu */
public final class hwu {
    static final gtq a;
    private static final Object b;
    private static Method c;

    public static void a(Context context) {
        gwb.f((Object) context, (Object) "Context must not be null");
        a.b(context);
        Context g = gtv.g(context);
        if (g == null) {
            Log.e("ProviderInstaller", "Failed to get remote context");
            throw new gtr(8);
        }
        synchronized (b) {
            try {
                if (c == null) {
                    c = g.getClassLoader().loadClass("com.google.android.gms.common.security.ProviderInstallerImpl").getMethod("insertProvider", new Class[]{Context.class});
                }
                c.invoke(null, new Object[]{g});
            } catch (Exception e) {
                String str = "ProviderInstaller";
                String str2 = "Failed to install provider: ";
                String valueOf = String.valueOf(e.getMessage());
                Log.e(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                throw new gtr(8);
            }
        }
    }

    public static void a(Context context, hww hww) {
        gwb.f((Object) context, (Object) "Context must not be null");
        gwb.f((Object) hww, (Object) "Listener must not be null");
        gwb.N("Must be called on the UI thread");
        new hwv(context, hww).execute(new Void[0]);
    }

    static {
        a = gtq.d;
        b = new Object();
        c = null;
    }
}
