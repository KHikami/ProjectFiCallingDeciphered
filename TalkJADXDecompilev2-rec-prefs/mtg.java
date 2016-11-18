package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

final class mtg extends mtf {
    final AtomicReferenceFieldUpdater<mte, Thread> f28285a;

    boolean mo3939a(mte mte, Thread thread, Thread thread2) {
        return this.f28285a.compareAndSet(mte, null, thread2);
    }

    mtg(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater) {
        this.f28285a = atomicReferenceFieldUpdater;
    }
}
