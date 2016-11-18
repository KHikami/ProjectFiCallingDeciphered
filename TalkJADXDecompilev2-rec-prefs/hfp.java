package p000;

import android.os.Process;
import android.util.SparseArray;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.atomic.AtomicBoolean;

final class hfp extends Thread {
    final AtomicBoolean f16862a = new AtomicBoolean();
    private final ReferenceQueue<guu<?>> f16863b;
    private final SparseArray<hfo> f16864c;

    public hfp(ReferenceQueue<guu<?>> referenceQueue, SparseArray<hfo> sparseArray) {
        super("GoogleApiCleanup");
        this.f16863b = referenceQueue;
        this.f16864c = sparseArray;
    }

    public void run() {
        this.f16862a.set(true);
        Process.setThreadPriority(10);
        while (this.f16862a.get()) {
            try {
                hfo hfo = (hfo) this.f16863b.remove();
                this.f16864c.remove(hfo.f16860a);
                hfo.m19670a();
            } catch (InterruptedException e) {
            } finally {
                this.f16862a.set(false);
            }
        }
    }
}
