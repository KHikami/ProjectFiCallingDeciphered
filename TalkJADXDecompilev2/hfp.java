package defpackage;

import android.os.Process;
import android.util.SparseArray;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.atomic.AtomicBoolean;

final class hfp extends Thread {
    final AtomicBoolean a = new AtomicBoolean();
    private final ReferenceQueue<guu<?>> b;
    private final SparseArray<hfo> c;

    public hfp(ReferenceQueue<guu<?>> referenceQueue, SparseArray<hfo> sparseArray) {
        super("GoogleApiCleanup");
        this.b = referenceQueue;
        this.c = sparseArray;
    }

    public void run() {
        this.a.set(true);
        Process.setThreadPriority(10);
        while (this.a.get()) {
            try {
                hfo hfo = (hfo) this.b.remove();
                this.c.remove(hfo.a);
                hfo.a();
            } catch (InterruptedException e) {
            } finally {
                this.a.set(false);
            }
        }
    }
}
