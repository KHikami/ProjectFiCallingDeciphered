package p000;

final class bno implements Runnable {
    final /* synthetic */ gkt f4044a;
    final /* synthetic */ gjo f4045b;
    final /* synthetic */ boolean f4046c;
    final /* synthetic */ boolean f4047d;
    final /* synthetic */ bnn f4048e;

    bno(bnn bnn, gkt gkt, gjo gjo, boolean z, boolean z2) {
        this.f4048e = bnn;
        this.f4044a = gkt;
        this.f4045b = gjo;
        this.f4046c = z;
        this.f4047d = z2;
    }

    public void run() {
        try {
            bnn.f3560b.m18078b("deliverImageOnCorrectThread");
            this.f4048e.f3561c.mo604a(this.f4044a, this.f4045b, this.f4046c, this.f4048e, this.f4047d);
        } finally {
            bnn.f3560b.m18079c("deliverImageOnCorrectThread");
        }
    }
}
