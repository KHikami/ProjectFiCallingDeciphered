package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

abstract class mte implements Runnable {
    private static final mtf c;
    private static final Logger d = Logger.getLogger(mte.class.getName());
    volatile Thread a;
    volatile boolean b;

    abstract void a();

    abstract boolean b();

    mte() {
    }

    static {
        mtf mtg;
        try {
            mtg = new mtg(AtomicReferenceFieldUpdater.newUpdater(mte.class, Thread.class, "a"));
        } catch (Throwable th) {
            d.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
            mtg = new mth();
        }
        c = mtg;
    }

    public final void run() {
        if (c.a(this, null, Thread.currentThread())) {
            try {
                a();
                if (b()) {
                    while (!this.b) {
                        Thread.yield();
                    }
                }
            } catch (Throwable th) {
                if (b()) {
                    while (!this.b) {
                        Thread.yield();
                    }
                }
            }
        }
    }
}
