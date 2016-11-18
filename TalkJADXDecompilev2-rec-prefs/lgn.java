package p000;

final class lgn implements Runnable {
    final /* synthetic */ mtj f24964a;
    final /* synthetic */ lgl f24965b;

    lgn(lgl lgl, mtj mtj) {
        this.f24965b = lgl;
        this.f24964a = mtj;
    }

    public void run() {
        this.f24965b.execute(this.f24964a);
    }
}
