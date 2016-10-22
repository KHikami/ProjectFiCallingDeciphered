import java.util.logging.Logger;

/* compiled from: PG */
public class dkl {
    static {
        Logger.getLogger(dkl.class.getName());
    }

    private dkl() {
    }

    public static void a(dfh dfh, Object obj, dko dko) {
        a(dfh, obj, new dkm(dfh, dko, false), false);
    }

    private static void a(dfh dfh, Object obj, dfi dfi, boolean z) {
        dfh.a(dfi, new dgr());
        if (z) {
            dfh.a(1);
        } else {
            dfh.a(2);
        }
        try {
            dfh.a(obj);
            dfh.a();
        } catch (Throwable th) {
            dfh.a(null, th);
            RuntimeException runtimeException;
            if (th instanceof RuntimeException) {
                runtimeException = (RuntimeException) th;
            } else {
                runtimeException = new RuntimeException(th);
            }
        }
    }
}
