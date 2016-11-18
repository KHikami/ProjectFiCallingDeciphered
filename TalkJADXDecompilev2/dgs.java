package defpackage;

final class dgs extends ikg {
    final /* synthetic */ dgg a;

    dgs(dgg dgg) {
        this.a = dgg;
    }

    public void a(iqo iqo, ayo ayo) {
        int i = 0;
        if (this.a.q == null) {
            super.a(iqo, ayo);
            return;
        }
        int i2;
        if (ayo instanceof iqq) {
            if (iqo.k()) {
                for (itg a : this.a.a) {
                    a.a((iqs) iqo);
                }
                i2 = 0;
            } else if (iqo.i()) {
                glk.a("Babel_calls", "Starting outgoing ringtone without media", new Object[0]);
                this.a.q.I();
                i2 = 0;
            } else {
                if (!iqo.f()) {
                    this.a.q.a(iqo);
                    i2 = 1;
                }
                i2 = 0;
            }
        } else if (!(ayo instanceof iqn) || iqo.k()) {
            if (ayo instanceof iqr) {
                iqr iqr = (iqr) ayo;
                if (iqo.f()) {
                    i2 = 0;
                } else {
                    i2 = 1;
                }
                this.a.q.a(iqo, iqr.a());
                int i3 = i2;
                i2 = 0;
                i = i3;
            }
            i2 = 0;
        } else if (iqo.j()) {
            this.a.q.a(iqo);
            i2 = 1;
        } else if (iqo.h()) {
            this.a.q.b(iqo);
            i2 = 0;
        } else {
            if (iqo.i()) {
                glk.a("Babel_calls", "Starting outgoing ringtone after media established.", new Object[0]);
                this.a.q.I();
                i2 = 0;
            }
            i2 = 0;
        }
        int H = this.a.q.H();
        if (i2 != 0 && H == 1) {
            for (itg a2 : this.a.a) {
                a2.d();
            }
        } else if (i != 0 && H == 0) {
            for (itg a22 : this.a.a) {
                a22.i();
            }
        }
    }
}
