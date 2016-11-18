package defpackage;

import java.util.List;

final class chb implements Runnable {
    final /* synthetic */ List a;
    final /* synthetic */ bpd b;
    final /* synthetic */ cgy c;

    chb(cgy cgy, List list, bpd bpd) {
        this.c = cgy;
        this.a = list;
        this.b = bpd;
    }

    public void run() {
        if (this.c.e != null) {
            this.c.e.a("finish fg");
            this.c.e = null;
        }
        if (!this.c.f) {
            this.c.b.a(this.a, this.b);
        }
    }
}
