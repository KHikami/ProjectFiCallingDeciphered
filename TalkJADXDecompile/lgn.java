final class lgn implements Runnable {
    final /* synthetic */ mtj a;
    final /* synthetic */ lgl b;

    lgn(lgl lgl, mtj mtj) {
        this.b = lgl;
        this.a = mtj;
    }

    public void run() {
        this.b.execute(this.a);
    }
}
