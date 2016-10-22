package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: PG */
/* renamed from: dcj */
final class dcj extends dce {
    final AtomicReferenceFieldUpdater a;
    final AtomicReferenceFieldUpdater b;
    final AtomicReferenceFieldUpdater c;
    final AtomicReferenceFieldUpdater d;
    final AtomicReferenceFieldUpdater e;

    final void a(dcp dcp, Thread thread) {
        this.a.lazySet(dcp, thread);
    }

    final void a(dcp dcp, dcp dcp2) {
        this.b.lazySet(dcp, dcp2);
    }

    final boolean a(dcd dcd, dcp dcp, dcp dcp2) {
        return this.c.compareAndSet(dcd, dcp, dcp2);
    }

    final boolean a(dcd dcd, dci dci, dci dci2) {
        return this.d.compareAndSet(dcd, dci, dci2);
    }

    final boolean a(dcd dcd, Object obj, Object obj2) {
        return this.e.compareAndSet(dcd, obj, obj2);
    }

    dcj(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.a = atomicReferenceFieldUpdater;
        this.b = atomicReferenceFieldUpdater2;
        this.c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.e = atomicReferenceFieldUpdater5;
    }
}
