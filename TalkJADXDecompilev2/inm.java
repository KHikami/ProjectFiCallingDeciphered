package defpackage;

final class inm implements Runnable {
    final /* synthetic */ Runnable a;
    final /* synthetic */ inj b;

    inm(inj inj, Runnable runnable) {
        this.b = inj;
        this.a = runnable;
    }

    public void run() {
        if (this.b.h != null) {
            this.b.h.release();
            this.b.h = null;
        }
        this.b.c.a(null, this.a);
        this.b.l();
    }
}
