package defpackage;

/* renamed from: lfm */
final class lfm implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ lfl b;

    lfm(lfl lfl, int i) {
        this.b = lfl;
        this.a = i;
    }

    public void run() {
        jcb jcb;
        this.b.b = false;
        lfl lfl = this.b;
        jcb jcb2 = jcb.UNKNOWN;
        if (this.a == -1) {
            jcb = jcb.INVALID;
        } else {
            jcb = jcb.VALID;
        }
        lfl.a(true, jcb2, jcb, -1, this.a);
    }
}
