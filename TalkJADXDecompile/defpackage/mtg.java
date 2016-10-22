package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: mtg */
final class mtg extends mtf {
    final AtomicReferenceFieldUpdater<mte, Thread> a;

    boolean a(mte mte, Thread thread, Thread thread2) {
        return this.a.compareAndSet(mte, null, thread2);
    }

    mtg(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater) {
        this.a = atomicReferenceFieldUpdater;
    }
}
