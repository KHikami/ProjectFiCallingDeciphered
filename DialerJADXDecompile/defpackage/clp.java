package defpackage;

/* renamed from: clp */
final class clp implements Runnable {
    private /* synthetic */ clo a;

    clp(clo clo) {
        this.a = clo;
    }

    public final void run() {
        synchronized (this.a.g) {
            if (this.a.h <= this.a.e.b() && this.a.k != null) {
                this.a.k.c();
                this.a.k = null;
            }
        }
    }
}
