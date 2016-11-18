package p000;

final class ioc implements Runnable {
    final /* synthetic */ iny f18573a;

    ioc(iny iny) {
        this.f18573a = iny;
    }

    public void run() {
        if (this.f18573a.f18214h != null) {
            this.f18573a.f18214h.mo1317c();
        }
        if (this.f18573a.f18213g != null) {
            this.f18573a.f18213g.release();
        }
        if (this.f18573a.f18212f != null) {
            this.f18573a.f18212f.release();
        }
        if (this.f18573a.f18211e != 0) {
            gwb.m1387E(this.f18573a.f18211e);
            this.f18573a.f18211e = 0;
        }
    }
}
