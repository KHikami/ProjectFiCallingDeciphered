package defpackage;

/* renamed from: frv */
final class frv implements Runnable {
    final /* synthetic */ hwl a;
    final /* synthetic */ hwq b;
    final /* synthetic */ frq c;

    frv(frq frq, hwl hwl, hwq hwq) {
        this.c = frq;
        this.a = hwl;
        this.b = hwq;
    }

    public void run() {
        this.c.a(this.a, this.b);
    }
}
