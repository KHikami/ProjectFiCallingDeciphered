package defpackage;

import android.net.TrafficStats;

final class our implements Runnable {
    final /* synthetic */ Runnable a;
    final /* synthetic */ ouq b;

    our(ouq ouq, Runnable runnable) {
        this.b = ouq;
        this.a = runnable;
    }

    public void run() {
        int threadStatsTag = TrafficStats.getThreadStatsTag();
        TrafficStats.setThreadStatsTag(this.b.b.g);
        try {
            this.a.run();
        } finally {
            TrafficStats.setThreadStatsTag(threadStatsTag);
        }
    }
}
