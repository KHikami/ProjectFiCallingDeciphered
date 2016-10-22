import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

final class alz {
    public static final boolean a;
    private final List<ama> b;
    private boolean c;

    alz() {
        this.b = new ArrayList();
        this.c = false;
    }

    static {
        a = aly.b;
    }

    public synchronized void a(String str, long j) {
        if (this.c) {
            throw new IllegalStateException("Marker added to finished log");
        }
        this.b.add(new ama(str, j, SystemClock.elapsedRealtime()));
    }

    public synchronized void a(String str) {
        long j;
        this.c = true;
        if (this.b.size() == 0) {
            j = 0;
        } else {
            j = ((ama) this.b.get(this.b.size() - 1)).c - ((ama) this.b.get(0)).c;
        }
        if (j > 0) {
            long j2 = ((ama) this.b.get(0)).c;
            aly.d("(%-4d ms) %s", Long.valueOf(j), str);
            j = j2;
            for (ama ama : this.b) {
                aly.d("(+%-4d) [%2d] %s", Long.valueOf(ama.c - j), Long.valueOf(ama.b), ama.a);
                j = ama.c;
            }
        }
    }

    protected void finalize() {
        if (!this.c) {
            a("Request on the loose");
            aly.c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
        }
    }
}
