package p000;

import android.net.TrafficStats;

final class our implements Runnable {
    final /* synthetic */ Runnable f34337a;
    final /* synthetic */ ouq f34338b;

    our(ouq ouq, Runnable runnable) {
        this.f34338b = ouq;
        this.f34337a = runnable;
    }

    public void run() {
        int threadStatsTag = TrafficStats.getThreadStatsTag();
        TrafficStats.setThreadStatsTag(this.f34338b.f34336b.f34324g);
        try {
            this.f34337a.run();
        } finally {
            TrafficStats.setThreadStatsTag(threadStatsTag);
        }
    }
}
