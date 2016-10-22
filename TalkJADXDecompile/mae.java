public final class mae extends nyx<mae> {
    public String a;
    public Float b;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public mae() {
        d();
    }

    private mae d() {
        this.a = null;
        this.b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        nyu.a(1, this.a);
        if (this.b != null) {
            nyu.a(2, this.b.floatValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b() + nyu.b(1, this.a);
        if (this.b == null) {
            return b;
        }
        this.b.floatValue();
        return b + (nyu.h(2) + 4);
    }

    private mae b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.dr /*10*/:
                    this.a = nyt.j();
                    continue;
                case wi.f /*21*/:
                    this.b = Float.valueOf(nyt.c());
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
