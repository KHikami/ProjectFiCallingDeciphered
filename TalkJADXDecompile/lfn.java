final class lfn implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ lfl c;

    lfn(lfl lfl, int i, int i2) {
        this.c = lfl;
        this.a = i;
        this.b = i2;
    }

    public void run() {
        boolean z;
        jcb jcb;
        jcb jcb2;
        lfl lfl = this.c;
        if (this.c.a != this.a) {
            z = true;
        } else {
            z = false;
        }
        if (this.a == -1) {
            jcb = jcb.INVALID;
        } else {
            jcb = jcb.VALID;
        }
        if (this.b == -1) {
            jcb2 = jcb.INVALID;
        } else {
            jcb2 = jcb.VALID;
        }
        lfl.a(z, jcb, jcb2, this.a, this.b);
    }
}
