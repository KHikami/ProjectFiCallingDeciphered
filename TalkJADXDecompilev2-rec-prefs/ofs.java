package p000;

public final class ofs extends nyx<ofs> {
    public String f32671a;

    public /* synthetic */ nzf m38106a(nyt nyt) {
        return m38104b(nyt);
    }

    public ofs() {
        m38105d();
    }

    private ofs m38105d() {
        this.f32671a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m38107a(nyu nyu) {
        if (this.f32671a != null) {
            nyu.m37170a(1, this.f32671a);
        }
        super.a(nyu);
    }

    protected int m38108b() {
        int b = super.b();
        if (this.f32671a != null) {
            return b + nyu.m37137b(1, this.f32671a);
        }
        return b;
    }

    private ofs m38104b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f32671a = nyt.m37117j();
                    continue;
                default:
                    if (!super.a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
