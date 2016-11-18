package defpackage;

final class efu implements bpu {
    final /* synthetic */ eft a;

    efu(eft eft) {
        this.a = eft;
    }

    public void a(bjg bjg, boolean z, int i) {
        if (z) {
            if (i == bps.b) {
                this.a.al.add(bjg);
            }
            if (!this.a.q() && this.a.c.b() == 1) {
                this.a.d();
            }
        }
    }

    public void a(String str) {
        int i;
        boolean z = true;
        if (this.a.c.b() > 1) {
            i = 2;
        } else {
            i = 1;
        }
        dbo dbo = this.a.b;
        if (this.a.i != bxt.VIDEO_CALL) {
            z = false;
        }
        dbo.a(str, i, z, this.a.c.a());
    }

    public void a() {
    }
}
