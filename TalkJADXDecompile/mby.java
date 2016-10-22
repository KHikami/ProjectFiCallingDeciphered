public final class mby extends nyx<mby> {
    public mbz a;
    public lor b;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public mby() {
        d();
    }

    private mby d() {
        this.a = null;
        this.b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.b(1, this.a);
        }
        if (this.b != null) {
            nyu.b(4, this.b);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.d(1, this.a);
        }
        if (this.b != null) {
            return b + nyu.d(4, this.b);
        }
        return b;
    }

    private mby b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.dr /*10*/:
                    if (this.a == null) {
                        this.a = new mbz();
                    }
                    nyt.a(this.a);
                    continue;
                case 34:
                    if (this.b == null) {
                        this.b = new lor();
                    }
                    nyt.a(this.b);
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
