import java.util.ArrayList;

final class irv implements Runnable {
    final /* synthetic */ irq a;

    irv(irq irq) {
        this.a = irq;
    }

    public void run() {
        try {
            synchronized (this.a.y) {
                if (this.a.n != null) {
                    itx.a("vclib", "Aborting captures for capture session: %s", this.a.n);
                    this.a.n.abortCaptures();
                    this.a.n = null;
                }
                itx.a("vclib", "Requested to create capture session; camera=%s, surfaces=%s", this.a.m, this.a.h);
                if (!(this.a.m == null || this.a.h.isEmpty())) {
                    this.a.m.createCaptureSession(new ArrayList(this.a.h), this.a.b, this.a.v);
                }
            }
        } catch (Throwable e) {
            itx.a("vclib", "Failed to create capture session.", e);
            this.a.l();
        }
    }
}
