package defpackage;

/* compiled from: PG */
/* renamed from: dcl */
final class dcl extends dce {
    final void a(dcp dcp, Thread thread) {
        dcp.thread = thread;
    }

    final void a(dcp dcp, dcp dcp2) {
        dcp.next = dcp2;
    }

    final boolean a(dcd dcd, dcp dcp, dcp dcp2) {
        boolean z;
        synchronized (dcd) {
            if (dcd.waiters == dcp) {
                dcd.waiters = dcp2;
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    final boolean a(dcd dcd, dci dci, dci dci2) {
        boolean z;
        synchronized (dcd) {
            if (dcd.listeners == dci) {
                dcd.listeners = dci2;
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    final boolean a(dcd dcd, Object obj, Object obj2) {
        boolean z;
        synchronized (dcd) {
            if (dcd.value == obj) {
                dcd.value = obj2;
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    dcl() {
    }
}
