package defpackage;

final class frg implements Runnable {
    final /* synthetic */ frj a;
    final /* synthetic */ frf b;

    frg(frf frf, frj frj) {
        this.b = frf;
        this.a = frj;
    }

    public void run() {
        this.b.a(this.a);
    }
}
