import com.google.common.cache.LocalCache;
import java.util.logging.Level;

final class mgw implements Runnable {
    final /* synthetic */ Object a;
    final /* synthetic */ int b;
    final /* synthetic */ mgs c;
    final /* synthetic */ mti d;
    final /* synthetic */ mgv e;

    mgw(mgv mgv, Object obj, int i, mgs mgs, mti mti) {
        this.e = mgv;
        this.a = obj;
        this.b = i;
        this.c = mgs;
        this.d = mti;
    }

    public void run() {
        try {
            this.e.a(this.a, this.b, this.c, this.d);
        } catch (Throwable th) {
            LocalCache.a.log(Level.WARNING, "Exception thrown during refresh", th);
            this.c.a(th);
        }
    }
}
