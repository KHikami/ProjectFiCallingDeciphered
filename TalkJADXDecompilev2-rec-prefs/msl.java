package p000;

import java.util.concurrent.locks.LockSupport;

final class msl {
    static final msl f28265a = new msl();
    volatile msl next;
    volatile Thread thread;

    msl() {
    }

    msl(byte b) {
        mrz.f28241d.mo3932a(this, Thread.currentThread());
    }

    void m32854a() {
        Thread thread = this.thread;
        if (thread != null) {
            this.thread = null;
            LockSupport.unpark(thread);
        }
    }

    void m32855a(msl msl) {
        mrz.f28241d.mo3933a(this, msl);
    }
}
