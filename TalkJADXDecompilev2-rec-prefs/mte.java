package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

abstract class mte implements Runnable {
    private static final mtf f28281c;
    private static final Logger f28282d = Logger.getLogger(mte.class.getName());
    volatile Thread f28283a;
    volatile boolean f28284b;

    abstract void mo3945a();

    abstract boolean mo3946b();

    mte() {
    }

    static {
        mtf mtg;
        try {
            mtg = new mtg(AtomicReferenceFieldUpdater.newUpdater(mte.class, Thread.class, "a"));
        } catch (Throwable th) {
            f28282d.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
            mtg = new mth();
        }
        f28281c = mtg;
    }

    public final void run() {
        if (f28281c.mo3939a(this, null, Thread.currentThread())) {
            try {
                mo3945a();
                if (mo3946b()) {
                    while (!this.f28284b) {
                        Thread.yield();
                    }
                }
            } catch (Throwable th) {
                if (mo3946b()) {
                    while (!this.f28284b) {
                        Thread.yield();
                    }
                }
            }
        }
    }
}
