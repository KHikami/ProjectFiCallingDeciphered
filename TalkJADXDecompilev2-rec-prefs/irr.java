package p000;

import android.view.Surface;

final class irr extends itr {
    final /* synthetic */ irq f18836a;

    irr(irq irq) {
        this.f18836a = irq;
    }

    public void mo3392a(itt itt) {
        gwb.aJ();
        synchronized (this.f18836a.y) {
            if (this.f18836a.v == null || this.f18836a.f18831m == null) {
                itx.m23277a(4, "vclib", "Capture targets changed, but camera isn't open yet.");
            } else if (this.f18836a.A.f19032a == 0 || this.f18836a.A.f19033b == 0) {
                itx.m23277a(4, "vclib", "Preview size isn't set, ignoring capture target change.");
            } else {
                if (this.f18836a.f18827i != null) {
                    this.f18836a.f18826h.remove(this.f18836a.f18827i);
                    this.f18836a.f18827i.release();
                }
                if (itt.f19006a != null && this.f18836a.f18825g) {
                    itt.f19006a.setDefaultBufferSize(this.f18836a.f18833o.f19032a, this.f18836a.f18833o.f19033b);
                    this.f18836a.f18826h.clear();
                    this.f18836a.f18827i = new Surface(itt.f19006a);
                    this.f18836a.f18826h.add(this.f18836a.f18827i);
                } else if (this.f18836a.f18826h.containsAll(itt.f19007b)) {
                    itx.m23277a(4, "vclib", "Surfaces did not change, ignoring capture target change.");
                    return;
                }
                this.f18836a.f18826h.addAll(itt.f19007b);
                this.f18836a.v.removeCallbacks(this.f18836a.f18822d);
                this.f18836a.v.postDelayed(this.f18836a.f18822d, 5);
            }
        }
    }
}
