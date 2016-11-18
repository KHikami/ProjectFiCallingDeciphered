package defpackage;

import android.net.TrafficStats;
import android.os.Build.VERSION;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import java.util.concurrent.BlockingQueue;

public final class alm extends Thread {
    private final BlockingQueue<alo<?>> a;
    private final all b;
    private final alf c;
    private final alv d;
    private volatile boolean e = false;

    public alm(BlockingQueue<alo<?>> blockingQueue, all all, alf alf, alv alv) {
        this.a = blockingQueue;
        this.b = all;
        this.c = alf;
        this.d = alv;
    }

    public void a() {
        this.e = true;
        interrupt();
    }

    public void run() {
        Process.setThreadPriority(10);
        while (true) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                alo alo = (alo) this.a.take();
                try {
                    alo.a("network-queue-take");
                    if (alo.f()) {
                        alo.b("network-discard-cancelled");
                    } else {
                        if (VERSION.SDK_INT >= 14) {
                            TrafficStats.setThreadStatsTag(alo.b());
                        }
                        aln a = this.b.a(alo);
                        alo.a("network-http-complete");
                        if (a.d && alo.s()) {
                            alo.b("not-modified");
                        } else {
                            als a2 = alo.a(a);
                            alo.a("network-parse-complete");
                            if (alo.c && a2.b != null) {
                                this.c.a(alo.d(), a2.b);
                                alo.a("network-cache-written");
                            }
                            alo.r();
                            this.d.a(alo, a2);
                        }
                    }
                } catch (alx e) {
                    e.a(SystemClock.elapsedRealtime() - elapsedRealtime);
                    this.d.a(alo, alo.a(e));
                } catch (Throwable e2) {
                    Log.e(aly.a, aly.d("Unhandled exception %s", e2.toString()), e2);
                    alx alx = new alx(e2);
                    alx.a(SystemClock.elapsedRealtime() - elapsedRealtime);
                    this.d.a(alo, alx);
                }
            } catch (InterruptedException e3) {
                if (this.e) {
                    return;
                }
            }
        }
    }
}
