package p000;

final class lfn implements Runnable {
    final /* synthetic */ int f24918a;
    final /* synthetic */ int f24919b;
    final /* synthetic */ lfl f24920c;

    lfn(lfl lfl, int i, int i2) {
        this.f24920c = lfl;
        this.f24918a = i;
        this.f24919b = i2;
    }

    public void run() {
        boolean z;
        jcb jcb;
        jcb jcb2;
        lfl lfl = this.f24920c;
        if (this.f24920c.f24906a != this.f24918a) {
            z = true;
        } else {
            z = false;
        }
        if (this.f24918a == -1) {
            jcb = jcb.INVALID;
        } else {
            jcb = jcb.VALID;
        }
        if (this.f24919b == -1) {
            jcb2 = jcb.INVALID;
        } else {
            jcb2 = jcb.VALID;
        }
        lfl.m28982a(z, jcb, jcb2, this.f24918a, this.f24919b);
    }
}
