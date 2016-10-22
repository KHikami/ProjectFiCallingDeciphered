public final class lwc extends nyx<lwc> {
    public ltu a;
    public Boolean b;
    public Integer c;
    public luq responseHeader;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public lwc() {
        d();
    }

    private lwc d() {
        this.responseHeader = null;
        this.a = null;
        this.b = null;
        this.c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.responseHeader != null) {
            nyu.b(1, this.responseHeader);
        }
        if (this.a != null) {
            nyu.b(2, this.a);
        }
        if (this.b != null) {
            nyu.a(3, this.b.booleanValue());
        }
        if (this.c != null) {
            nyu.c(4, this.c.intValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.responseHeader != null) {
            b += nyu.d(1, this.responseHeader);
        }
        if (this.a != null) {
            b += nyu.d(2, this.a);
        }
        if (this.b != null) {
            this.b.booleanValue();
            b += nyu.h(3) + 1;
        }
        if (this.c != null) {
            return b + nyu.g(4, this.c.intValue());
        }
        return b;
    }

    private lwc b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.dr /*10*/:
                    if (this.responseHeader == null) {
                        this.responseHeader = new luq();
                    }
                    nyt.a(this.responseHeader);
                    continue;
                case wi.dH /*18*/:
                    if (this.a == null) {
                        this.a = new ltu();
                    }
                    nyt.a(this.a);
                    continue;
                case wi.dA /*24*/:
                    this.b = Boolean.valueOf(nyt.i());
                    continue;
                case 32:
                    this.c = Integer.valueOf(nyt.l());
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
