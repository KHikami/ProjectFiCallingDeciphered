package p000;

import java.util.List;

final class chb implements Runnable {
    final /* synthetic */ List f5307a;
    final /* synthetic */ bpd f5308b;
    final /* synthetic */ cgy f5309c;

    chb(cgy cgy, List list, bpd bpd) {
        this.f5309c = cgy;
        this.f5307a = list;
        this.f5308b = bpd;
    }

    public void run() {
        if (this.f5309c.f5291e != null) {
            this.f5309c.f5291e.m17983a("finish fg");
            this.f5309c.f5291e = null;
        }
        if (!this.f5309c.f5292f) {
            this.f5309c.f5288b.m7643a(this.f5307a, this.f5308b);
        }
    }
}
