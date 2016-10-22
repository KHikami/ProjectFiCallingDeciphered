final class ali implements Runnable {
    final /* synthetic */ alo a;
    final /* synthetic */ alh b;

    ali(alh alh, alo alo) {
        this.b = alh;
        this.a = alo;
    }

    public void run() {
        try {
            this.b.a.put(this.a);
        } catch (InterruptedException e) {
        }
    }
}
