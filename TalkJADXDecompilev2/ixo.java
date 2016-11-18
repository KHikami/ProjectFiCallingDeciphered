package defpackage;

final class ixo implements Runnable {
    final /* synthetic */ ixm a;

    ixo(ixm ixm) {
        this.a = ixm;
    }

    public void run() {
        try {
            this.a.c();
        } catch (RuntimeException e) {
            this.a.d();
        }
    }
}
