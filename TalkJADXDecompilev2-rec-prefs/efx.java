package p000;

final class efx extends bcm {
    final /* synthetic */ eft f11396a;

    efx(eft eft) {
        this.f11396a = eft;
    }

    public void mo1868a() {
        if (this.f11396a.f11385c.m4867b() <= 1) {
            this.f11396a.getActivity().invalidateOptionsMenu();
        }
        if (this.f11396a.m13823b()) {
            this.f11396a.f11387e.m13925a(this.f11396a.m13824c());
        }
    }

    public void mo1870a(String str) {
        this.f11396a.f11387e.m13925a(this.f11396a.m13824c());
        if (this.f11396a.m13826e()) {
            this.f11396a.f11390h.mo1727a(str);
        }
    }

    public void mo1871b(String str) {
        this.f11396a.aj = str;
    }

    public void mo1869a(bcj bcj) {
        this.f11396a.m13820a(bcj);
        this.f11396a.getActivity().invalidateOptionsMenu();
        if (!gld.m17937a(this.f11396a.getContext()) && this.f11396a.f11387e != null) {
            this.f11396a.f11387e.m13925a(this.f11396a.m13824c());
        }
    }
}
