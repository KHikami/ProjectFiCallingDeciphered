package defpackage;

/* renamed from: fsm */
final class fsm implements Runnable {
    final /* synthetic */ fsr a;
    final /* synthetic */ fsi b;

    fsm(fsi fsi, fsr fsr) {
        this.b = fsi;
        this.a = fsr;
    }

    public void run() {
        this.a.h();
    }
}
