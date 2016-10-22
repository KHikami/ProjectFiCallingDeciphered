final class brh implements Runnable {
    final /* synthetic */ bpd a;
    final /* synthetic */ brg b;

    brh(brg brg, bpd bpd) {
        this.b = brg;
        this.a = bpd;
    }

    public void run() {
        if (this.b.a != null) {
            this.b.a.a(this.a.a);
        }
    }
}
