public final class kig extends nyx<kig> {
    public Integer a;
    public String b;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public kig() {
        d();
    }

    private kig d() {
        this.b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.b != null) {
            nyu.a(1, this.b);
        }
        if (this.a != null) {
            nyu.a(2, this.a.intValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.b != null) {
            b += nyu.b(1, this.b);
        }
        if (this.a != null) {
            return b + nyu.f(2, this.a.intValue());
        }
        return b;
    }

    private kig b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.dr /*10*/:
                    this.b = nyt.j();
                    continue;
                case wi.dI /*16*/:
                    a = nyt.f();
                    switch (a) {
                        case wi.w /*0*/:
                        case wi.j /*1*/:
                            this.a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
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
