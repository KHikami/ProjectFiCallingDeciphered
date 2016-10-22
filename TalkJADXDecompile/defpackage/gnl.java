package defpackage;

/* renamed from: gnl */
public class gnl {
    public final /* synthetic */ eft a;

    public void a(gnk gnk, boolean z) {
        gon gon = (gon) gnk;
        switch (efw.a[gon.b().ordinal()]) {
            case wi.j /*1*/:
                a(dvr.COMBINED, gon, z);
            case wi.l /*2*/:
                a(dvr.DOMAIN, gon, z);
            case wi.h /*4*/:
                a(dvr.HIGH_AFFINITY, gon, z);
            default:
        }
    }

    public gnl(eft eft) {
        this.a = eft;
    }

    public void a(dvr dvr, gon gon, boolean z) {
        int a = this.a.d.a(gon);
        if (a == -1) {
            return;
        }
        if (z) {
            this.a.h.a(this.a.context, dvr, gon.a(), a);
        } else {
            this.a.h.a(gon.a());
        }
    }
}
