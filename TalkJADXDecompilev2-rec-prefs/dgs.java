package p000;

final class dgs extends ikg {
    final /* synthetic */ dgg f9713a;

    dgs(dgg dgg) {
        this.f9713a = dgg;
    }

    public void mo1552a(iqo iqo, ayo ayo) {
        int i = 0;
        if (this.f9713a.f9694q == null) {
            super.mo1552a(iqo, ayo);
            return;
        }
        int i2;
        if (ayo instanceof iqq) {
            if (iqo.m22969k()) {
                for (itg a : this.f9713a.f9678a) {
                    a.mo2257a((iqs) iqo);
                }
                i2 = 0;
            } else if (iqo.m22967i()) {
                glk.m17970a("Babel_calls", "Starting outgoing ringtone without media", new Object[0]);
                this.f9713a.f9694q.m11944I();
                i2 = 0;
            } else {
                if (!iqo.m22964f()) {
                    this.f9713a.f9694q.m11963a(iqo);
                    i2 = 1;
                }
                i2 = 0;
            }
        } else if (!(ayo instanceof iqn) || iqo.m22969k()) {
            if (ayo instanceof iqr) {
                iqr iqr = (iqr) ayo;
                if (iqo.m22964f()) {
                    i2 = 0;
                } else {
                    i2 = 1;
                }
                this.f9713a.f9694q.m11964a(iqo, iqr.m22977a());
                int i3 = i2;
                i2 = 0;
                i = i3;
            }
            i2 = 0;
        } else if (iqo.m22968j()) {
            this.f9713a.f9694q.m11963a(iqo);
            i2 = 1;
        } else if (iqo.m22966h()) {
            this.f9713a.f9694q.m11974b(iqo);
            i2 = 0;
        } else {
            if (iqo.m22967i()) {
                glk.m17970a("Babel_calls", "Starting outgoing ringtone after media established.", new Object[0]);
                this.f9713a.f9694q.m11944I();
                i2 = 0;
            }
            i2 = 0;
        }
        int H = this.f9713a.f9694q.m11943H();
        if (i2 != 0 && H == 1) {
            for (itg a2 : this.f9713a.f9678a) {
                a2.mo1559d();
            }
        } else if (i != 0 && H == 0) {
            for (itg a22 : this.f9713a.f9678a) {
                a22.mo1578i();
            }
        }
    }
}
