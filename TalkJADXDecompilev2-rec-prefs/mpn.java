package p000;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

public final class mpn extends mpg {
    public static final AtomicReference<mph> f28052a = new AtomicReference();
    private static final AtomicLong f28053c = new AtomicLong();
    private static final ConcurrentLinkedQueue<mpp> f28054d = new ConcurrentLinkedQueue();
    private volatile mor f28055b;

    public static void m32662c() {
        while (true) {
            mpn mpn = (mpn) mpo.f28056a.poll();
            if (mpn != null) {
                mpn.f28055b = ((mph) f28052a.get()).mo3712a(mpn.m29091b());
                mpn.m32663d();
            } else {
                return;
            }
        }
    }

    public mpn(String str) {
        super(str);
    }

    private static void m32663d() {
        while (true) {
            mpp mpp = (mpp) f28054d.poll();
            if (mpp != null) {
                f28053c.getAndDecrement();
                mor a = mpp.mo3907a();
                C0000a b = mpp.mo3908b();
                if (a.mo3711a(b.m26w())) {
                    a.mo3710a(b);
                }
            } else {
                return;
            }
        }
    }

    public boolean mo3711a(Level level) {
        if (this.f28055b != null) {
            return this.f28055b.mo3711a(level);
        }
        return true;
    }

    public void mo3710a(C0000a c0000a) {
        if (this.f28055b != null) {
            this.f28055b.mo3710a(c0000a);
            return;
        }
        if (f28053c.incrementAndGet() > 20) {
            f28054d.poll();
        }
        f28054d.offer(new mpk(this, c0000a));
        if (this.f28055b != null) {
            mpn.m32663d();
        }
    }
}
