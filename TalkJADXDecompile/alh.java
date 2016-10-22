import android.os.Process;
import java.util.concurrent.BlockingQueue;

public final class alh extends Thread {
    private static final boolean b;
    final BlockingQueue<alo<?>> a;
    private final BlockingQueue<alo<?>> c;
    private final alf d;
    private final alv e;
    private volatile boolean f;

    static {
        b = aly.b;
    }

    public alh(BlockingQueue<alo<?>> blockingQueue, BlockingQueue<alo<?>> blockingQueue2, alf alf, alv alv) {
        this.f = false;
        this.c = blockingQueue;
        this.a = blockingQueue2;
        this.d = alf;
        this.e = alv;
    }

    public void a() {
        this.f = true;
        interrupt();
    }

    public void run() {
        if (b) {
            aly.a("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.d.a();
        while (true) {
            try {
                alo alo = (alo) this.c.take();
                alo.a("cache-queue-take");
                if (alo.f()) {
                    alo.b("cache-discard-canceled");
                } else {
                    alg a = this.d.a(alo.d());
                    if (a == null) {
                        alo.a("cache-miss");
                        this.a.put(alo);
                    } else if (a.a()) {
                        alo.a("cache-hit-expired");
                        alo.a(a);
                        this.a.put(alo);
                    } else {
                        alo.a("cache-hit");
                        als a2 = alo.a(new aln(a.a, a.g));
                        alo.a("cache-hit-parsed");
                        if (a.b()) {
                            alo.a("cache-hit-refresh-needed");
                            alo.a(a);
                            a2.d = true;
                            this.e.a(alo, a2, new ali(this, alo));
                        } else {
                            this.e.a(alo, a2);
                        }
                    }
                }
            } catch (InterruptedException e) {
                if (this.f) {
                    return;
                }
            }
        }
    }
}
