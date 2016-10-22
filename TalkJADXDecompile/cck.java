final class cck implements Runnable {
    final /* synthetic */ ccj a;

    cck(ccj ccj) {
        this.a = ccj;
    }

    public void run() {
        blo blo = new blo(this.a.b.a, this.a.a);
        blo.a();
        try {
            blo.B(this.a.b.c.a);
            blo.b();
            blf.a(this.a.a);
        } finally {
            blo.c();
        }
    }
}
