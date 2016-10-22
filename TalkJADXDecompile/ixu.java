public final class ixu {
    private izw a;
    private iyd b;
    private iym c;
    private ixw d;
    private iye e;
    private iyf f;
    private iyb g;

    ixu() {
    }

    public ixu a(izw izw) {
        this.a = izw;
        return this;
    }

    public ixu a(iyd iyd) {
        this.b = iyd;
        return this;
    }

    public ixu a(iym iym) {
        this.c = iym;
        return this;
    }

    public ixu a(ixw ixw) {
        this.d = ixw;
        return this;
    }

    public ixu a(iye iye) {
        this.e = iye;
        return this;
    }

    public ixu a(iyf iyf) {
        this.f = iyf;
        return this;
    }

    @Deprecated
    public ixu a(iyc iyc) {
        this.g = iyc.b();
        return this;
    }

    public ixt a() {
        return new ixt(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
    }
}
