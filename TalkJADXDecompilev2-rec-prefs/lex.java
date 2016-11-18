package p000;

public final class lex extends nyx<lex> {
    public String f24873a;
    public String f24874b;
    public String f24875c;
    public String f24876d;
    public String f24877e;
    public String f24878f;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28941b(nyt);
    }

    public lex() {
        this.f24873a = null;
        this.f24874b = null;
        this.f24875c = null;
        this.f24876d = null;
        this.f24877e = null;
        this.f24878f = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f24873a != null) {
            nyu.a(1, this.f24873a);
        }
        if (this.f24874b != null) {
            nyu.a(2, this.f24874b);
        }
        if (this.f24875c != null) {
            nyu.a(3, this.f24875c);
        }
        if (this.f24876d != null) {
            nyu.a(4, this.f24876d);
        }
        if (this.f24877e != null) {
            nyu.a(5, this.f24877e);
        }
        if (this.f24878f != null) {
            nyu.a(6, this.f24878f);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24873a != null) {
            b += nyu.b(1, this.f24873a);
        }
        if (this.f24874b != null) {
            b += nyu.b(2, this.f24874b);
        }
        if (this.f24875c != null) {
            b += nyu.b(3, this.f24875c);
        }
        if (this.f24876d != null) {
            b += nyu.b(4, this.f24876d);
        }
        if (this.f24877e != null) {
            b += nyu.b(5, this.f24877e);
        }
        if (this.f24878f != null) {
            return b + nyu.b(6, this.f24878f);
        }
        return b;
    }

    private lex m28941b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f24873a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f24874b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f24875c = nyt.j();
                    continue;
                case 34:
                    this.f24876d = nyt.j();
                    continue;
                case 42:
                    this.f24877e = nyt.j();
                    continue;
                case 50:
                    this.f24878f = nyt.j();
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
