final class ipi implements Runnable {
    final /* synthetic */ ipg a;

    ipi(ipg ipg) {
        this.a = ipg;
    }

    public void run() {
        if (this.a.i != null) {
            this.a.i.cancel(true);
            this.a.i = null;
        }
        this.a.c.a();
    }
}
