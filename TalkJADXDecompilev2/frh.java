package defpackage;

final class frh implements Runnable {
    final /* synthetic */ frj a;
    final /* synthetic */ frf b;

    frh(frf frf, frj frj) {
        this.b = frf;
        this.a = frj;
    }

    public void run() {
        this.b.b(this.a);
    }
}
