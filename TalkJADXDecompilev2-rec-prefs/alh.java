package p000;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

public final class alh extends Thread {
    private static final boolean f1189b = aly.f1262b;
    final BlockingQueue<alo<?>> f1190a;
    private final BlockingQueue<alo<?>> f1191c;
    private final alf f1192d;
    private final alv f1193e;
    private volatile boolean f1194f = false;

    public alh(BlockingQueue<alo<?>> blockingQueue, BlockingQueue<alo<?>> blockingQueue2, alf alf, alv alv) {
        this.f1191c = blockingQueue;
        this.f1190a = blockingQueue2;
        this.f1192d = alf;
        this.f1193e = alv;
    }

    public void m2831a() {
        this.f1194f = true;
        interrupt();
    }

    public void run() {
        if (f1189b) {
            aly.m2882a("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f1192d.mo1787a();
        while (true) {
            try {
                alo alo = (alo) this.f1191c.take();
                alo.m2843a("cache-queue-take");
                if (alo.m2850f()) {
                    alo.m2846b("cache-discard-canceled");
                } else {
                    alg a = this.f1192d.mo1786a(alo.m2848d());
                    if (a == null) {
                        alo.m2843a("cache-miss");
                        this.f1190a.put(alo);
                    } else if (a.m2829a()) {
                        alo.m2843a("cache-hit-expired");
                        alo.m2837a(a);
                        this.f1190a.put(alo);
                    } else {
                        alo.m2843a("cache-hit");
                        als a2 = alo.mo460a(new aln(a.f1182a, a.f1188g));
                        alo.m2843a("cache-hit-parsed");
                        if (a.m2830b()) {
                            alo.m2843a("cache-hit-refresh-needed");
                            alo.m2837a(a);
                            a2.f1248d = true;
                            this.f1193e.m2876a(alo, a2, new ali(this, alo));
                        } else {
                            this.f1193e.m2875a(alo, a2);
                        }
                    }
                }
            } catch (InterruptedException e) {
                if (this.f1194f) {
                    return;
                }
            }
        }
    }
}
