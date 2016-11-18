package defpackage;

final class ioc implements Runnable {
    final /* synthetic */ iny a;

    ioc(iny iny) {
        this.a = iny;
    }

    public void run() {
        if (this.a.h != null) {
            this.a.h.c();
        }
        if (this.a.g != null) {
            this.a.g.release();
        }
        if (this.a.f != null) {
            this.a.f.release();
        }
        if (this.a.e != 0) {
            gwb.E(this.a.e);
            this.a.e = 0;
        }
    }
}
