final class fvm implements jwm {
    final /* synthetic */ fvl a;

    fvm(fvl fvl) {
        this.a = fvl;
    }

    public boolean a(jwi jwi, Object obj) {
        int i;
        boolean b = gwb.b((Boolean) obj);
        this.a.d = new czd(this.a.getActivity());
        if (jwi == this.a.f) {
            i = 2;
        } else {
            ba.b(jwi == this.a.e);
            i = 6;
        }
        czc.a(new fvn(this.a, i, b), this.a.d).a();
        return true;
    }
}
