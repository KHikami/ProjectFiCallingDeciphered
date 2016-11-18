package p000;

public final class kiy extends nyx<kiy> {
    public Long f21895a;
    public String f21896b;
    public String f21897c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26035b(nyt);
    }

    public kiy() {
        m26036d();
    }

    private kiy m26036d() {
        this.f21895a = null;
        this.f21896b = null;
        this.f21897c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f21895a != null) {
            nyu.b(2, this.f21895a.longValue());
        }
        if (this.f21896b != null) {
            nyu.a(3, this.f21896b);
        }
        if (this.f21897c != null) {
            nyu.a(4, this.f21897c);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f21895a != null) {
            b += nyu.f(2, this.f21895a.longValue());
        }
        if (this.f21896b != null) {
            b += nyu.b(3, this.f21896b);
        }
        if (this.f21897c != null) {
            return b + nyu.b(4, this.f21897c);
        }
        return b;
    }

    private kiy m26035b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 16:
                    this.f21895a = Long.valueOf(nyt.e());
                    continue;
                case wi.dx /*26*/:
                    this.f21896b = nyt.j();
                    continue;
                case 34:
                    this.f21897c = nyt.j();
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
