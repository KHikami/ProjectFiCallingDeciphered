package p000;

final class gnr implements bnq {
    final /* synthetic */ gno f15741a;

    gnr(gno gno) {
        this.f15741a = gno;
    }

    public void mo604a(gkt gkt, gjo gjo, boolean z, bnn bnn, boolean z2) {
        if (this.f15741a.f6911d == bnn) {
            this.f15741a.f6911d = null;
            if (!z) {
                return;
            }
            if (gjo != null) {
                this.f15741a.mo1221b(new gol(gjo));
                return;
            }
            iil.m21875b("Expected non-null", (Object) gkt);
            iil.m21875b("Expected non-null", gkt.m17898e());
            iil.m21872a("Expected null", this.f15741a.f6912e);
            this.f15741a.f6912e = gkt;
            this.f15741a.mo1214a(this.f15741a.f6912e.m17898e());
            this.f15741a.mo1229d(0);
        } else if (gkt != null) {
            gkt.mo2292b();
        }
    }
}
