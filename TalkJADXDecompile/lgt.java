final class lgt implements Runnable {
    final /* synthetic */ lgs a;

    lgt(lgs lgs) {
        this.a = lgs;
    }

    public void run() {
        this.a.a.cancel(false);
    }
}
