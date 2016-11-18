package p000;

public final class ltn extends nyx<ltn> {
    public Integer f26390a;
    public String f26391b;
    public String f26392c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30471b(nyt);
    }

    public ltn() {
        m30472d();
    }

    private ltn m30472d() {
        this.f26391b = null;
        this.f26392c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26390a != null) {
            nyu.a(1, this.f26390a.intValue());
        }
        if (this.f26391b != null) {
            nyu.a(2, this.f26391b);
        }
        if (this.f26392c != null) {
            nyu.a(3, this.f26392c);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26390a != null) {
            b += nyu.f(1, this.f26390a.intValue());
        }
        if (this.f26391b != null) {
            b += nyu.b(2, this.f26391b);
        }
        if (this.f26392c != null) {
            return b + nyu.b(3, this.f26392c);
        }
        return b;
    }

    private ltn m30471b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                            this.f26390a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    this.f26391b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f26392c = nyt.j();
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
