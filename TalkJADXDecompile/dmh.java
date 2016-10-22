final class dmh implements dhx {
    final /* synthetic */ dhw a;
    final /* synthetic */ dme b;

    dmh(dme dme, dhw dhw) {
        this.b = dme;
        this.a = dhw;
    }

    public void a(itl itl) {
        if (itl.f()) {
            dme dme = this.b;
            dhw dhw = this.a;
            boolean i = dme.b.i();
            if (dhw.a() == i) {
                dhw.a(!i);
                gwb.f(i ? 181 : 183);
            }
        }
    }

    public void a(did did) {
    }
}
