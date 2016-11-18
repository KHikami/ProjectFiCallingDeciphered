package p000;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

final class hfo extends PhantomReference<guu<?>> {
    final int f16860a;
    final /* synthetic */ hfn f16861b;

    public hfo(hfn hfn, guu guu, int i, ReferenceQueue<guu<?>> referenceQueue) {
        this.f16861b = hfn;
        super(guu, referenceQueue);
        this.f16860a = i;
    }

    public void m19670a() {
        this.f16861b.f16856m.sendMessage(this.f16861b.f16856m.obtainMessage(2, this.f16860a, 2));
    }
}
