package p000;

import java.util.ArrayList;

final class irv implements Runnable {
    final /* synthetic */ irq f18840a;

    irv(irq irq) {
        this.f18840a = irq;
    }

    public void run() {
        try {
            synchronized (this.f18840a.y) {
                if (this.f18840a.f18832n != null) {
                    itx.m23282a("vclib", "Aborting captures for capture session: %s", this.f18840a.f18832n);
                    this.f18840a.f18832n.abortCaptures();
                    this.f18840a.f18832n = null;
                }
                itx.m23282a("vclib", "Requested to create capture session; camera=%s, surfaces=%s", this.f18840a.f18831m, this.f18840a.f18826h);
                if (!(this.f18840a.f18831m == null || this.f18840a.f18826h.isEmpty())) {
                    this.f18840a.f18831m.createCaptureSession(new ArrayList(this.f18840a.f18826h), this.f18840a.f18820b, this.f18840a.v);
                }
            }
        } catch (Throwable e) {
            itx.m23281a("vclib", "Failed to create capture session.", e);
            this.f18840a.m23074l();
        }
    }
}
