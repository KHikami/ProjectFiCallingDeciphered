package defpackage;

/* renamed from: lgh */
final class lgh implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ lgg b;

    lgh(lgg lgg, int i) {
        this.b = lgg;
        this.a = i;
    }

    public void run() {
        this.b.stopSelf(this.a);
    }
}
