import android.view.Surface;

final class irr extends itr {
    final /* synthetic */ irq a;

    irr(irq irq) {
        this.a = irq;
    }

    public void a(itt itt) {
        gwb.aJ();
        synchronized (this.a.y) {
            if (this.a.v == null || this.a.m == null) {
                itx.a(4, "vclib", "Capture targets changed, but camera isn't open yet.");
            } else if (this.a.A.a == 0 || this.a.A.b == 0) {
                itx.a(4, "vclib", "Preview size isn't set, ignoring capture target change.");
            } else {
                if (this.a.i != null) {
                    this.a.h.remove(this.a.i);
                    this.a.i.release();
                }
                if (itt.a != null && this.a.g) {
                    itt.a.setDefaultBufferSize(this.a.o.a, this.a.o.b);
                    this.a.h.clear();
                    this.a.i = new Surface(itt.a);
                    this.a.h.add(this.a.i);
                } else if (this.a.h.containsAll(itt.b)) {
                    itx.a(4, "vclib", "Surfaces did not change, ignoring capture target change.");
                    return;
                }
                this.a.h.addAll(itt.b);
                this.a.v.removeCallbacks(this.a.d);
                this.a.v.postDelayed(this.a.d, 5);
            }
        }
    }
}
