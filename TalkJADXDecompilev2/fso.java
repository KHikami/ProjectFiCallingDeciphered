package defpackage;

final class fso implements Runnable {
    final /* synthetic */ fsr a;
    final /* synthetic */ fsi b;

    fso(fsi fsi, fsr fsr) {
        this.b = fsi;
        this.a = fsr;
    }

    public void run() {
        this.a.g();
    }
}
