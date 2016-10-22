final class iwn implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ iwm b;

    iwn(iwm iwm, int i) {
        this.b = iwm;
        this.a = i;
    }

    public void run() {
        this.b.a(this.a);
    }
}
