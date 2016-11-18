package defpackage;

final class cfp implements Runnable {
    final /* synthetic */ cgt a;
    final /* synthetic */ cdr b;

    cfp(cdr cdr, cgt cgt) {
        this.b = cdr;
        this.a = cgt;
    }

    public void run() {
        this.a.a(this.b.context);
    }
}
