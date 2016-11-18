package p000;

final class lfm implements Runnable {
    final /* synthetic */ int f24916a;
    final /* synthetic */ lfl f24917b;

    lfm(lfl lfl, int i) {
        this.f24917b = lfl;
        this.f24916a = i;
    }

    public void run() {
        jcb jcb;
        this.f24917b.f24907b = false;
        lfl lfl = this.f24917b;
        jcb jcb2 = jcb.UNKNOWN;
        if (this.f24916a == -1) {
            jcb = jcb.INVALID;
        } else {
            jcb = jcb.VALID;
        }
        lfl.m28982a(true, jcb2, jcb, -1, this.f24916a);
    }
}
