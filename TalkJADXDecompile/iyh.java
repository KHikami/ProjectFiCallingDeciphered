final class iyh implements Runnable {
    final /* synthetic */ Runnable a;
    final /* synthetic */ iyg b;

    iyh(iyg iyg, Runnable runnable) {
        this.b = iyg;
        this.a = runnable;
    }

    public void run() {
        this.a.run();
    }
}
