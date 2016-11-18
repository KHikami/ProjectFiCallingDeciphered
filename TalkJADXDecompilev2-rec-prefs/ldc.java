package p000;

public final class ldc extends nyx<ldc> {
    public String f24648a;
    public Boolean f24649b;
    public String f24650c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28702b(nyt);
    }

    public ldc() {
        this.f24648a = null;
        this.f24649b = null;
        this.f24650c = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f24648a != null) {
            nyu.a(1, this.f24648a);
        }
        if (this.f24649b != null) {
            nyu.a(2, this.f24649b.booleanValue());
        }
        if (this.f24650c != null) {
            nyu.a(3, this.f24650c);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24648a != null) {
            b += nyu.b(1, this.f24648a);
        }
        if (this.f24649b != null) {
            this.f24649b.booleanValue();
            b += nyu.h(2) + 1;
        }
        if (this.f24650c != null) {
            return b + nyu.b(3, this.f24650c);
        }
        return b;
    }

    private ldc m28702b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f24648a = nyt.j();
                    continue;
                case 16:
                    this.f24649b = Boolean.valueOf(nyt.i());
                    continue;
                case wi.dx /*26*/:
                    this.f24650c = nyt.j();
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
