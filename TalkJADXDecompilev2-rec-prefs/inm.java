package p000;

final class inm implements Runnable {
    final /* synthetic */ Runnable f18156a;
    final /* synthetic */ inj f18157b;

    inm(inj inj, Runnable runnable) {
        this.f18157b = inj;
        this.f18156a = runnable;
    }

    public void run() {
        if (this.f18157b.f18144h != null) {
            this.f18157b.f18144h.release();
            this.f18157b.f18144h = null;
        }
        this.f18157b.f18139c.m22313a(null, this.f18156a);
        this.f18157b.m22387l();
    }
}
