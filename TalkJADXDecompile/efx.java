final class efx extends bcm {
    final /* synthetic */ eft a;

    efx(eft eft) {
        this.a = eft;
    }

    public void a() {
        if (this.a.c.b() <= 1) {
            this.a.getActivity().invalidateOptionsMenu();
        }
        if (this.a.b()) {
            this.a.e.a(this.a.c());
        }
    }

    public void a(String str) {
        this.a.e.a(this.a.c());
        if (this.a.e()) {
            this.a.h.a(str);
        }
    }

    public void b(String str) {
        this.a.aj = str;
    }

    public void a(bcj bcj) {
        this.a.a(bcj);
        this.a.getActivity().invalidateOptionsMenu();
        if (!gld.a(this.a.getContext()) && this.a.e != null) {
            this.a.e.a(this.a.c());
        }
    }
}
