package defpackage;

/* renamed from: djf */
final class djf implements Runnable {
    final /* synthetic */ djd a;

    djf(djd djd) {
        this.a = djd;
    }

    public void run() {
        if (this.a.m()) {
            iry l = this.a.b.l();
            if (l != null) {
                glk.c("Babel_calls", "Disabling camera because the earpiece is on.", new Object[0]);
                l.a(false);
            }
        }
    }
}
