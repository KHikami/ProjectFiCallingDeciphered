package p000;

import android.net.TrafficStats;
import android.os.Build.VERSION;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import java.util.concurrent.BlockingQueue;

public final class alm extends Thread {
    private final BlockingQueue<alo<?>> f1203a;
    private final all f1204b;
    private final alf f1205c;
    private final alv f1206d;
    private volatile boolean f1207e = false;

    public alm(BlockingQueue<alo<?>> blockingQueue, all all, alf alf, alv alv) {
        this.f1203a = blockingQueue;
        this.f1204b = all;
        this.f1205c = alf;
        this.f1206d = alv;
    }

    public void m2833a() {
        this.f1207e = true;
        interrupt();
    }

    public void run() {
        Process.setThreadPriority(10);
        while (true) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                alo alo = (alo) this.f1203a.take();
                try {
                    alo.m2843a("network-queue-take");
                    if (alo.m2850f()) {
                        alo.m2846b("network-discard-cancelled");
                    } else {
                        if (VERSION.SDK_INT >= 14) {
                            TrafficStats.setThreadStatsTag(alo.m2844b());
                        }
                        aln a = this.f1204b.mo258a(alo);
                        alo.m2843a("network-http-complete");
                        if (a.f1211d && alo.m2863s()) {
                            alo.m2846b("not-modified");
                        } else {
                            als a2 = alo.mo460a(a);
                            alo.m2843a("network-parse-complete");
                            if (alo.f1215c && a2.f1246b != null) {
                                this.f1205c.mo1788a(alo.m2848d(), a2.f1246b);
                                alo.m2843a("network-cache-written");
                            }
                            alo.m2862r();
                            this.f1206d.m2875a(alo, a2);
                        }
                    }
                } catch (alx e) {
                    e.m2824a(SystemClock.elapsedRealtime() - elapsedRealtime);
                    this.f1206d.m2877a(alo, alo.m2841a(e));
                } catch (Throwable e2) {
                    Log.e(aly.f1261a, aly.m2885d("Unhandled exception %s", e2.toString()), e2);
                    alx alx = new alx(e2);
                    alx.m2824a(SystemClock.elapsedRealtime() - elapsedRealtime);
                    this.f1206d.m2877a(alo, alx);
                }
            } catch (InterruptedException e3) {
                if (this.f1207e) {
                    return;
                }
            }
        }
    }
}
