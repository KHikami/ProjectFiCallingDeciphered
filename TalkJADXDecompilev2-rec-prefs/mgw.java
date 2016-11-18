package p000;

import com.google.common.cache.LocalCache;
import java.util.logging.Level;

final class mgw implements Runnable {
    final /* synthetic */ Object f27703a;
    final /* synthetic */ int f27704b;
    final /* synthetic */ mgs f27705c;
    final /* synthetic */ mti f27706d;
    final /* synthetic */ mgv f27707e;

    mgw(mgv mgv, Object obj, int i, mgs mgs, mti mti) {
        this.f27707e = mgv;
        this.f27703a = obj;
        this.f27704b = i;
        this.f27705c = mgs;
        this.f27706d = mti;
    }

    public void run() {
        try {
            this.f27707e.m32109a(this.f27703a, this.f27704b, this.f27705c, this.f27706d);
        } catch (Throwable th) {
            LocalCache.f8694a.log(Level.WARNING, "Exception thrown during refresh", th);
            this.f27705c.m32059a(th);
        }
    }
}
