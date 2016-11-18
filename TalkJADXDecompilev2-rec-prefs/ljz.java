package p000;

final class ljz implements Runnable {
    final /* synthetic */ ljo f25129a;
    final /* synthetic */ Runnable f25130b;

    ljz(ljo ljo, Runnable runnable) {
        this.f25129a = ljo;
        this.f25130b = runnable;
    }

    public void run() {
        ljo a = lkb.m29204a();
        lkb.m29211b(this.f25129a);
        try {
            this.f25130b.run();
        } finally {
            lkb.m29211b(a);
        }
    }
}
