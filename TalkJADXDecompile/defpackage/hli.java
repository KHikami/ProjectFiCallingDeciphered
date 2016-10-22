package defpackage;

import android.content.Context;
import android.os.RemoteException;

/* renamed from: hli */
public final class hli {
    private static boolean a;

    static {
        a = false;
    }

    public static synchronized int a(Context context) {
        int i = 0;
        synchronized (hli.class) {
            gwb.f((Object) context, (Object) "Context is null");
            if (!a) {
                try {
                    hmy a = hmu.a(context);
                    gwb.a(a.a());
                    gwb.a(a.b());
                    a = true;
                } catch (RemoteException e) {
                    throw new dt(e);
                } catch (gtr e2) {
                    i = e2.a;
                }
            }
        }
        return i;
    }
}
