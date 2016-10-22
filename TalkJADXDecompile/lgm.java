final class lgm implements Runnable {
    final /* synthetic */ mtj a;
    final /* synthetic */ lgl b;

    lgm(lgl lgl, mtj mtj) {
        this.b = lgl;
        this.a = mtj;
    }

    public void run() {
        this.b.execute(this.a);
    }
}
