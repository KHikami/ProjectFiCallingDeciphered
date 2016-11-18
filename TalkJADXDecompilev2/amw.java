package defpackage;

final class amw implements Runnable {
    final /* synthetic */ azx a;
    final /* synthetic */ amu b;

    amw(amu amu, azx azx) {
        this.b = amu;
        this.a = azx;
    }

    public void run() {
        this.b.a(this.a);
    }
}
