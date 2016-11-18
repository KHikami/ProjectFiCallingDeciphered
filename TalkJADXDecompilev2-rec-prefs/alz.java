package p000;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

final class alz {
    public static final boolean f1263a = aly.f1262b;
    private final List<ama> f1264b = new ArrayList();
    private boolean f1265c = false;

    alz() {
    }

    public synchronized void m2887a(String str, long j) {
        if (this.f1265c) {
            throw new IllegalStateException("Marker added to finished log");
        }
        this.f1264b.add(new ama(str, j, SystemClock.elapsedRealtime()));
    }

    public synchronized void m2886a(String str) {
        long j;
        this.f1265c = true;
        if (this.f1264b.size() == 0) {
            j = 0;
        } else {
            j = ((ama) this.f1264b.get(this.f1264b.size() - 1)).f1270c - ((ama) this.f1264b.get(0)).f1270c;
        }
        if (j > 0) {
            long j2 = ((ama) this.f1264b.get(0)).f1270c;
            aly.m2885d("(%-4d ms) %s", Long.valueOf(j), str);
            j = j2;
            for (ama ama : this.f1264b) {
                aly.m2885d("(+%-4d) [%2d] %s", Long.valueOf(ama.f1270c - j), Long.valueOf(ama.f1269b), ama.f1268a);
                j = ama.f1270c;
            }
        }
    }

    protected void finalize() {
        if (!this.f1265c) {
            m2886a("Request on the loose");
            aly.m2884c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
        }
    }
}
