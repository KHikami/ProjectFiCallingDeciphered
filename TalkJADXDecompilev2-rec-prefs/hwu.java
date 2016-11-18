package p000;

import android.content.Context;
import android.util.Log;
import java.lang.reflect.Method;

public final class hwu {
    static final gtq f17427a = gtq.f16130d;
    private static final Object f17428b = new Object();
    private static Method f17429c = null;

    public static void m21152a(Context context) {
        gwb.m2195f((Object) context, (Object) "Context must not be null");
        f17427a.m18551b(context);
        Context g = gtv.m18577g(context);
        if (g == null) {
            Log.e("ProviderInstaller", "Failed to get remote context");
            throw new gtr(8);
        }
        synchronized (f17428b) {
            try {
                if (f17429c == null) {
                    f17429c = g.getClassLoader().loadClass("com.google.android.gms.common.security.ProviderInstallerImpl").getMethod("insertProvider", new Class[]{Context.class});
                }
                f17429c.invoke(null, new Object[]{g});
            } catch (Exception e) {
                String str = "ProviderInstaller";
                String str2 = "Failed to install provider: ";
                String valueOf = String.valueOf(e.getMessage());
                Log.e(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                throw new gtr(8);
            }
        }
    }

    public static void m21153a(Context context, hww hww) {
        gwb.m2195f((Object) context, (Object) "Context must not be null");
        gwb.m2195f((Object) hww, (Object) "Listener must not be null");
        gwb.m1430N("Must be called on the UI thread");
        new hwv(context, hww).execute(new Void[0]);
    }
}
