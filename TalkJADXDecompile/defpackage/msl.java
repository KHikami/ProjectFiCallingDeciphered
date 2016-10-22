package defpackage;

import java.util.concurrent.locks.LockSupport;

/* renamed from: msl */
final class msl {
    static final msl a;
    volatile msl next;
    volatile Thread thread;

    static {
        a = new msl();
    }

    msl() {
    }

    msl(byte b) {
        mrz.d.a(this, Thread.currentThread());
    }

    void a() {
        Thread thread = this.thread;
        if (thread != null) {
            this.thread = null;
            LockSupport.unpark(thread);
        }
    }

    void a(msl msl) {
        mrz.d.a(this, msl);
    }
}
