package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.logging.Logger;

public class omr {
    static final Logger a = Logger.getLogger(omr.class.getName());

    private omr() {
    }

    public static <ReqT, RespT> RespT a(ojn ojn, olh<ReqT, RespT> olh_ReqT__RespT, ojm ojm, ReqT reqT) {
        Executor omt = new omt();
        ojo a = ojn.a(olh_ReqT__RespT, ojm.a(omt));
        try {
            Future oms = new oms(a);
            omr.a(a, (Object) reqT, new omu(oms), false);
            while (!oms.isDone()) {
                omt.a();
            }
            return omr.a(oms);
        } catch (Throwable e) {
            Thread.currentThread().interrupt();
            throw olv.c.b(e).e();
        } catch (Throwable e2) {
            a.a(null, e2);
            RuntimeException runtimeException;
            if (e2 instanceof RuntimeException) {
                runtimeException = (RuntimeException) e2;
            } else {
                runtimeException = new RuntimeException(e2);
            }
        }
    }

    private static <V> V a(Future<V> future) {
        Throwable e;
        oma oma;
        try {
            return future.get();
        } catch (Throwable e2) {
            Thread.currentThread().interrupt();
            throw olv.c.b(e2).e();
        } catch (Throwable e3) {
            e2 = (Throwable) bm.a(e3, "t");
            while (e2 != null) {
                if (e2 instanceof olz) {
                    olz olz = (olz) e2;
                    oma = new oma(olz.a, olz.b);
                    break;
                } else if (e2 instanceof oma) {
                    oma = (oma) e2;
                    oma = new oma(oma.a, oma.b);
                    break;
                } else {
                    e2 = e2.getCause();
                }
            }
            oma = olv.d.b(e3).e();
            throw oma;
        }
    }

    private static <ReqT, RespT> void a(ojo<ReqT, RespT> ojo_ReqT__RespT, ReqT reqT, ojp<RespT> ojp_RespT, boolean z) {
        ojo_ReqT__RespT.a((ojp) ojp_RespT, new okw());
        ojo_ReqT__RespT.a(2);
        try {
            ojo_ReqT__RespT.a((Object) reqT);
            ojo_ReqT__RespT.a();
        } catch (Throwable th) {
            ojo_ReqT__RespT.a(null, th);
            RuntimeException runtimeException;
            if (th instanceof RuntimeException) {
                runtimeException = (RuntimeException) th;
            } else {
                runtimeException = new RuntimeException(th);
            }
        }
    }
}
