final class bno implements Runnable {
    final /* synthetic */ gkt a;
    final /* synthetic */ gjo b;
    final /* synthetic */ boolean c;
    final /* synthetic */ boolean d;
    final /* synthetic */ bnn e;

    bno(bnn bnn, gkt gkt, gjo gjo, boolean z, boolean z2) {
        this.e = bnn;
        this.a = gkt;
        this.b = gjo;
        this.c = z;
        this.d = z2;
    }

    public void run() {
        try {
            bnn.b.b("deliverImageOnCorrectThread");
            this.e.c.a(this.a, this.b, this.c, this.e, this.d);
        } finally {
            bnn.b.c("deliverImageOnCorrectThread");
        }
    }
}
