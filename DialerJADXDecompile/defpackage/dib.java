package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* renamed from: dib */
final class dib implements Runnable {
    private /* synthetic */ dhv a;

    dib(dhv dhv) {
        this.a = dhv;
    }

    public final void run() {
        if (this.a.b != null) {
            try {
                this.a.b.close();
                this.a.c.close();
            } catch (Throwable e) {
                dhv.a.log(Level.WARNING, "Failed closing connection", e);
            }
        }
    }
}
