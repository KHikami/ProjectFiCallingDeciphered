package defpackage;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

/* renamed from: hfo */
final class hfo extends PhantomReference<guu<?>> {
    final int a;
    final /* synthetic */ hfn b;

    public hfo(hfn hfn, guu guu, int i, ReferenceQueue<guu<?>> referenceQueue) {
        this.b = hfn;
        super(guu, referenceQueue);
        this.a = i;
    }

    public void a() {
        this.b.m.sendMessage(this.b.m.obtainMessage(2, this.a, 2));
    }
}
