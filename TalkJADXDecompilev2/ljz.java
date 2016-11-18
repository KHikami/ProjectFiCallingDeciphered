package defpackage;

final class ljz implements Runnable {
    final /* synthetic */ ljo a;
    final /* synthetic */ Runnable b;

    ljz(ljo ljo, Runnable runnable) {
        this.a = ljo;
        this.b = runnable;
    }

    public void run() {
        ljo a = lkb.a();
        lkb.b(this.a);
        try {
            this.b.run();
        } finally {
            lkb.b(a);
        }
    }
}
