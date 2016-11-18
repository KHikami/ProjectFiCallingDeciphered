package p000;

public final class kxd extends nyx<kxd> {
    public String f23829a;
    public Integer f23830b;
    public kxe f23831c;
    public String f23832d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27896b(nyt);
    }

    public kxd() {
        m27897d();
    }

    private kxd m27897d() {
        this.f23829a = null;
        this.f23831c = null;
        this.f23832d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f23829a != null) {
            nyu.a(1, this.f23829a);
        }
        if (this.f23830b != null) {
            nyu.a(2, this.f23830b.intValue());
        }
        if (this.f23831c != null) {
            nyu.b(3, this.f23831c);
        }
        if (this.f23832d != null) {
            nyu.a(4, this.f23832d);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f23829a != null) {
            b += nyu.b(1, this.f23829a);
        }
        if (this.f23830b != null) {
            b += nyu.f(2, this.f23830b.intValue());
        }
        if (this.f23831c != null) {
            b += nyu.d(3, this.f23831c);
        }
        if (this.f23832d != null) {
            return b + nyu.b(4, this.f23832d);
        }
        return b;
    }

    private kxd m27896b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f23829a = nyt.j();
                    continue;
                case 16:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                            this.f23830b = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dx /*26*/:
                    if (this.f23831c == null) {
                        this.f23831c = new kxe();
                    }
                    nyt.a(this.f23831c);
                    continue;
                case 34:
                    this.f23832d = nyt.j();
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
