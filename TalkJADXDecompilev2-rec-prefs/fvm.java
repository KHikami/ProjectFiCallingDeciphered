package p000;

final class fvm implements jwm {
    final /* synthetic */ fvl f14105a;

    fvm(fvl fvl) {
        this.f14105a = fvl;
    }

    public boolean mo1377a(jwi jwi, Object obj) {
        int i;
        boolean b = gwb.m2061b((Boolean) obj);
        this.f14105a.f14101d = new czd(this.f14105a.getActivity());
        if (jwi == this.f14105a.f14103f) {
            i = 2;
        } else {
            ba.m4609b(jwi == this.f14105a.f14102e);
            i = 6;
        }
        czc.m11324a(new fvn(this.f14105a, i, b), this.f14105a.f14101d).m11327a();
        return true;
    }
}
