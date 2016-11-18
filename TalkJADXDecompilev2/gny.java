package defpackage;

final class gny implements Runnable {
    final /* synthetic */ gnw a;
    final /* synthetic */ gnw b;

    gny(gnw gnw, gnw gnw2) {
        this.b = gnw;
        this.a = gnw2;
    }

    public void run() {
        this.b.a();
        this.b.c.h.remove(this.a);
    }
}
