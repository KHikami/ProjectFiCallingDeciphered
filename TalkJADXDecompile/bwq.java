final class bwq implements Runnable {
    final /* synthetic */ buc a;
    final /* synthetic */ bwo b;

    bwq(bwo bwo, buc buc) {
        this.b = bwo;
        this.a = buc;
    }

    public void run() {
        this.a.b();
        this.b.c = glj.b();
    }
}
