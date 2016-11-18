package p000;

public final class lrx extends nyx<lrx> {
    public lor f26287a;
    public String f26288b;
    public lwl f26289c;
    public lvz f26290d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30248b(nyt);
    }

    public lrx() {
        m30249d();
    }

    private lrx m30249d() {
        this.f26287a = null;
        this.f26288b = null;
        this.f26289c = null;
        this.f26290d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26287a != null) {
            nyu.b(1, this.f26287a);
        }
        if (this.f26288b != null) {
            nyu.a(2, this.f26288b);
        }
        if (this.f26289c != null) {
            nyu.b(3, this.f26289c);
        }
        if (this.f26290d != null) {
            nyu.b(4, this.f26290d);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26287a != null) {
            b += nyu.d(1, this.f26287a);
        }
        if (this.f26288b != null) {
            b += nyu.b(2, this.f26288b);
        }
        if (this.f26289c != null) {
            b += nyu.d(3, this.f26289c);
        }
        if (this.f26290d != null) {
            return b + nyu.d(4, this.f26290d);
        }
        return b;
    }

    private lrx m30248b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f26287a == null) {
                        this.f26287a = new lor();
                    }
                    nyt.a(this.f26287a);
                    continue;
                case wi.dH /*18*/:
                    this.f26288b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    if (this.f26289c == null) {
                        this.f26289c = new lwl();
                    }
                    nyt.a(this.f26289c);
                    continue;
                case 34:
                    if (this.f26290d == null) {
                        this.f26290d = new lvz();
                    }
                    nyt.a(this.f26290d);
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
