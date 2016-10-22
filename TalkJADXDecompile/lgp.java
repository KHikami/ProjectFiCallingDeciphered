final class lgp implements Runnable {
    final /* synthetic */ lgo a;

    lgp(lgo lgo) {
        this.a = lgo;
    }

    public void run() {
        try {
            this.a.b.run();
        } catch (Throwable th) {
            this.a.c.a(th);
        }
    }
}
