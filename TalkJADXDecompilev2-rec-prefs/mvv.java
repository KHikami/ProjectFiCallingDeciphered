package p000;

public final class mvv extends nyx<mvv> {
    public String f28522a;
    public String f28523b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m33140b(nyt);
    }

    public mvv() {
        m33141d();
    }

    private mvv m33141d() {
        this.f28522a = "";
        this.f28523b = "";
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (!(this.f28522a == null || this.f28522a.equals(""))) {
            nyu.a(1, this.f28522a);
        }
        if (!(this.f28523b == null || this.f28523b.equals(""))) {
            nyu.a(2, this.f28523b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (!(this.f28522a == null || this.f28522a.equals(""))) {
            b += nyu.b(1, this.f28522a);
        }
        if (this.f28523b == null || this.f28523b.equals("")) {
            return b;
        }
        return b + nyu.b(2, this.f28523b);
    }

    private mvv m33140b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f28522a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f28523b = nyt.j();
                    continue;
                default:
                    if (!super.m1039a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
