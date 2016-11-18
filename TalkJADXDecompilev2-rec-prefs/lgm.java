package p000;

final class lgm implements Runnable {
    final /* synthetic */ mtj f24962a;
    final /* synthetic */ lgl f24963b;

    lgm(lgl lgl, mtj mtj) {
        this.f24963b = lgl;
        this.f24962a = mtj;
    }

    public void run() {
        this.f24963b.execute(this.f24962a);
    }
}
