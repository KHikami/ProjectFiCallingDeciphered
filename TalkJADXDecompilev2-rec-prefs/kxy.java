package p000;

public final class kxy extends nyx<kxy> {
    public ofv f23970a;
    public String f23971b;
    public String f23972c;
    public String f23973d;
    public Integer f23974e;
    public String f23975f;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27998b(nyt);
    }

    public kxy() {
        m27999d();
    }

    private kxy m27999d() {
        this.f23970a = null;
        this.f23971b = null;
        this.f23972c = null;
        this.f23973d = null;
        this.f23974e = null;
        this.f23975f = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f23970a != null) {
            nyu.b(1, this.f23970a);
        }
        if (this.f23971b != null) {
            nyu.a(2, this.f23971b);
        }
        if (this.f23972c != null) {
            nyu.a(3, this.f23972c);
        }
        if (this.f23973d != null) {
            nyu.a(4, this.f23973d);
        }
        if (this.f23974e != null) {
            nyu.a(5, this.f23974e.intValue());
        }
        if (this.f23975f != null) {
            nyu.a(6, this.f23975f);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f23970a != null) {
            b += nyu.d(1, this.f23970a);
        }
        if (this.f23971b != null) {
            b += nyu.b(2, this.f23971b);
        }
        if (this.f23972c != null) {
            b += nyu.b(3, this.f23972c);
        }
        if (this.f23973d != null) {
            b += nyu.b(4, this.f23973d);
        }
        if (this.f23974e != null) {
            b += nyu.f(5, this.f23974e.intValue());
        }
        if (this.f23975f != null) {
            return b + nyu.b(6, this.f23975f);
        }
        return b;
    }

    private kxy m27998b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f23970a == null) {
                        this.f23970a = new ofv();
                    }
                    nyt.a(this.f23970a);
                    continue;
                case wi.dH /*18*/:
                    this.f23971b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f23972c = nyt.j();
                    continue;
                case 34:
                    this.f23973d = nyt.j();
                    continue;
                case 40:
                    this.f23974e = Integer.valueOf(nyt.f());
                    continue;
                case 50:
                    this.f23975f = nyt.j();
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
