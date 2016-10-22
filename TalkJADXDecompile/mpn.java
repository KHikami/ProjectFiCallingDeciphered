import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

public final class mpn extends mpg {
    public static final AtomicReference<mph> a;
    private static final AtomicLong c;
    private static final ConcurrentLinkedQueue<mpp> d;
    private volatile mor b;

    static {
        a = new AtomicReference();
        c = new AtomicLong();
        d = new ConcurrentLinkedQueue();
    }

    public static void c() {
        while (true) {
            mpn mpn = (mpn) mpo.a.poll();
            if (mpn != null) {
                mpn.b = ((mph) a.get()).a(mpn.b());
                d();
            } else {
                return;
            }
        }
    }

    public mpn(String str) {
        super(str);
    }

    private static void d() {
        while (true) {
            mpp mpp = (mpp) d.poll();
            if (mpp != null) {
                c.getAndDecrement();
                mor a = mpp.a();
                a b = mpp.b();
                if (a.a(b.w())) {
                    a.a(b);
                }
            } else {
                return;
            }
        }
    }

    public boolean a(Level level) {
        if (this.b != null) {
            return this.b.a(level);
        }
        return true;
    }

    public void a(a aVar) {
        if (this.b != null) {
            this.b.a(aVar);
            return;
        }
        if (c.incrementAndGet() > 20) {
            d.poll();
        }
        d.offer(new mpk(this, aVar));
        if (this.b != null) {
            d();
        }
    }
}
