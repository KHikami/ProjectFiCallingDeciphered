package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class jzv implements kbl, kco, kcp, kcq {
    private List<C0000a> f21326a = new ArrayList();
    private boolean f21327b;
    private boolean f21328c;
    private boolean f21329d = true;

    jzv(kbu kbu) {
        kbu.m25514a((kcq) this);
    }

    jzv(kbu kbu, byte b) {
        kbu.m25514a((kcq) this);
    }

    public void mo3632a(boolean z) {
        this.f21329d = z;
        m25484b();
    }

    public void z_() {
        this.f21327b = true;
        m25484b();
    }

    public void A_() {
        this.f21327b = false;
        m25484b();
    }

    private void m25484b() {
        boolean z = this.f21327b && this.f21329d;
        if (z != this.f21328c) {
            this.f21328c = z;
            Iterator it = this.f21326a.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }
}
