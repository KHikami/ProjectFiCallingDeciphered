package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

final class msf extends msa {
    final AtomicReferenceFieldUpdater<msl, Thread> f28252a;
    final AtomicReferenceFieldUpdater<msl, msl> f28253b;
    final AtomicReferenceFieldUpdater<mrz, msl> f28254c;
    final AtomicReferenceFieldUpdater<mrz, mse> f28255d;
    final AtomicReferenceFieldUpdater<mrz, Object> f28256e;

    void mo3932a(msl msl, Thread thread) {
        this.f28252a.lazySet(msl, thread);
    }

    void mo3933a(msl msl, msl msl2) {
        this.f28253b.lazySet(msl, msl2);
    }

    boolean mo3936a(mrz<?> mrz_, msl msl, msl msl2) {
        return this.f28254c.compareAndSet(mrz_, msl, msl2);
    }

    boolean mo3935a(mrz<?> mrz_, mse mse, mse mse2) {
        return this.f28255d.compareAndSet(mrz_, mse, mse2);
    }

    boolean mo3934a(mrz<?> mrz_, Object obj, Object obj2) {
        return this.f28256e.compareAndSet(mrz_, obj, obj2);
    }

    msf(AtomicReferenceFieldUpdater<msl, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<msl, msl> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<mrz, msl> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<mrz, mse> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<mrz, Object> atomicReferenceFieldUpdater5) {
        this.f28252a = atomicReferenceFieldUpdater;
        this.f28253b = atomicReferenceFieldUpdater2;
        this.f28254c = atomicReferenceFieldUpdater3;
        this.f28255d = atomicReferenceFieldUpdater4;
        this.f28256e = atomicReferenceFieldUpdater5;
    }
}
