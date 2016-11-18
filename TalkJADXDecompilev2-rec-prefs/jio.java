package p000;

import java.util.ArrayList;
import java.util.List;

public class jio implements kcg, kco, kcp, kcq {
    private final List<jiq> f20134a = new ArrayList();
    private boolean f20135b;
    private boolean f20136c;

    public jio(kbu kbu) {
        kbu.m25514a((kcq) this);
    }

    public synchronized ggn m24316a(Runnable runnable) {
        return m24317a(runnable, 0);
    }

    public synchronized ggn m24317a(Runnable runnable, long j) {
        ggn ggn;
        if (this.f20136c) {
            ggn = null;
        } else {
            ggn = new jiq(this, runnable, 0);
            this.f20134a.add(ggn);
            if (this.f20135b) {
                ggn.m24324a();
            }
        }
        return ggn;
    }

    public synchronized void m24318a(ggn ggn) {
        if (ggn != null) {
            ggn.mo2263d();
        }
    }

    public synchronized void z_() {
        this.f20135b = true;
        for (int i = 0; i < this.f20134a.size(); i++) {
            ((jiq) this.f20134a.get(i)).m24324a();
        }
    }

    public synchronized void A_() {
        this.f20135b = false;
        for (int i = 0; i < this.f20134a.size(); i++) {
            ((jiq) this.f20134a.get(i)).m24325b();
        }
    }

    public synchronized void o_() {
        this.f20136c = true;
        for (int i = 0; i < this.f20134a.size(); i++) {
            ((jiq) this.f20134a.get(i)).mo2263d();
        }
        this.f20134a.clear();
    }

    synchronized void m24319a(jiq jiq) {
        this.f20134a.remove(jiq);
    }

    synchronized void m24320b(jiq jiq) {
        this.f20134a.remove(jiq);
    }
}
