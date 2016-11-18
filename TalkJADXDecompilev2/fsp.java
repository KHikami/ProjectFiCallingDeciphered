package defpackage;

final class fsp implements Runnable {
    final /* synthetic */ fsr a;
    final /* synthetic */ fsi b;

    fsp(fsi fsi, fsr fsr) {
        this.b = fsi;
        this.a = fsr;
    }

    public void run() {
        this.b.a(this.a);
    }
}
