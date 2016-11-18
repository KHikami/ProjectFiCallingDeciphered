package p000;

final class efu implements bpu {
    final /* synthetic */ eft f11392a;

    efu(eft eft) {
        this.f11392a = eft;
    }

    public void mo903a(bjg bjg, boolean z, int i) {
        if (z) {
            if (i == bps.f4165b) {
                this.f11392a.al.add(bjg);
            }
            if (!this.f11392a.m13827q() && this.f11392a.f11385c.m4867b() == 1) {
                this.f11392a.m13825d();
            }
        }
    }

    public void mo904a(String str) {
        int i;
        boolean z = true;
        if (this.f11392a.f11385c.m4867b() > 1) {
            i = 2;
        } else {
            i = 1;
        }
        dbo dbo = this.f11392a.f11384b;
        if (this.f11392a.f11391i != bxt.VIDEO_CALL) {
            z = false;
        }
        dbo.mo1179a(str, i, z, this.f11392a.f11385c.m4861a());
    }

    public void mo902a() {
    }
}
