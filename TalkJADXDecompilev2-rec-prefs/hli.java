package p000;

import android.content.Context;
import android.os.RemoteException;

public final class hli {
    private static boolean f17077a = false;

    public static synchronized int m20027a(Context context) {
        int i = 0;
        synchronized (hli.class) {
            gwb.m2195f((Object) context, (Object) "Context is null");
            if (!f17077a) {
                try {
                    hmy a = hmu.m20360a(context);
                    gwb.m1842a(a.mo2775a());
                    gwb.m1843a(a.mo2781b());
                    f17077a = true;
                } catch (RemoteException e) {
                    throw new dt(e);
                } catch (gtr e2) {
                    i = e2.f16133a;
                }
            }
        }
        return i;
    }
}
