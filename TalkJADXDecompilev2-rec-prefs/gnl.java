package p000;

public class gnl {
    public final /* synthetic */ eft f15736a;

    public void m18183a(gnk gnk, boolean z) {
        gon gon = (gon) gnk;
        switch (efw.f11394a[gon.m18233b().ordinal()]) {
            case 1:
                m18182a(dvr.COMBINED, gon, z);
                return;
            case 2:
                m18182a(dvr.DOMAIN, gon, z);
                return;
            case 4:
                m18182a(dvr.HIGH_AFFINITY, gon, z);
                return;
            default:
                return;
        }
    }

    public gnl(eft eft) {
        this.f15736a = eft;
    }

    public void m18182a(dvr dvr, gon gon, boolean z) {
        int a = this.f15736a.f11386d.m13899a(gon);
        if (a == -1) {
            return;
        }
        if (z) {
            this.f15736a.f11390h.mo1724a(this.f15736a.context, dvr, gon.m18227a(), a);
        } else {
            this.f15736a.f11390h.mo1726a(gon.m18227a());
        }
    }
}
