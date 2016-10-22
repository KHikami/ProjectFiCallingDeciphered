package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: msf */
final class msf extends msa {
    final AtomicReferenceFieldUpdater<msl, Thread> a;
    final AtomicReferenceFieldUpdater<msl, msl> b;
    final AtomicReferenceFieldUpdater<mrz, msl> c;
    final AtomicReferenceFieldUpdater<mrz, mse> d;
    final AtomicReferenceFieldUpdater<mrz, Object> e;

    void a(msl msl, Thread thread) {
        this.a.lazySet(msl, thread);
    }

    void a(msl msl, msl msl2) {
        this.b.lazySet(msl, msl2);
    }

    boolean a(mrz<?> mrz_, msl msl, msl msl2) {
        return this.c.compareAndSet(mrz_, msl, msl2);
    }

    boolean a(mrz<?> mrz_, mse mse, mse mse2) {
        return this.d.compareAndSet(mrz_, mse, mse2);
    }

    boolean a(mrz<?> mrz_, Object obj, Object obj2) {
        return this.e.compareAndSet(mrz_, obj, obj2);
    }

    msf(AtomicReferenceFieldUpdater<msl, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<msl, msl> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<mrz, msl> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<mrz, mse> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<mrz, Object> atomicReferenceFieldUpdater5) {
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicReferenceFieldUpdater2;
        this.c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.e = atomicReferenceFieldUpdater5;
    }
}
