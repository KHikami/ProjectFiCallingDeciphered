package p000;

public final class kms extends nyx<kms> {
    public oct f22391a;
    public ocw f22392b;
    public String f22393c;
    public oxy f22394d;
    public kgy f22395e;
    public kgz f22396f;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26581b(nyt);
    }

    public kms() {
        this.f22393c = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f22391a != null) {
            nyu.b(1, this.f22391a);
        }
        if (this.f22392b != null) {
            nyu.b(2, this.f22392b);
        }
        if (this.f22393c != null) {
            nyu.a(3, this.f22393c);
        }
        if (this.f22394d != null) {
            nyu.b(4, this.f22394d);
        }
        if (this.f22395e != null) {
            nyu.b(5, this.f22395e);
        }
        if (this.f22396f != null) {
            nyu.b(6, this.f22396f);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22391a != null) {
            b += nyu.d(1, this.f22391a);
        }
        if (this.f22392b != null) {
            b += nyu.d(2, this.f22392b);
        }
        if (this.f22393c != null) {
            b += nyu.b(3, this.f22393c);
        }
        if (this.f22394d != null) {
            b += nyu.d(4, this.f22394d);
        }
        if (this.f22395e != null) {
            b += nyu.d(5, this.f22395e);
        }
        if (this.f22396f != null) {
            return b + nyu.d(6, this.f22396f);
        }
        return b;
    }

    private kms m26581b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f22391a == null) {
                        this.f22391a = new oct();
                    }
                    nyt.a(this.f22391a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f22392b == null) {
                        this.f22392b = new ocw();
                    }
                    nyt.a(this.f22392b);
                    continue;
                case wi.dx /*26*/:
                    this.f22393c = nyt.j();
                    continue;
                case 34:
                    if (this.f22394d == null) {
                        this.f22394d = new oxy();
                    }
                    nyt.a(this.f22394d);
                    continue;
                case 42:
                    if (this.f22395e == null) {
                        this.f22395e = new kgy();
                    }
                    nyt.a(this.f22395e);
                    continue;
                case 50:
                    if (this.f22396f == null) {
                        this.f22396f = new kgz();
                    }
                    nyt.a(this.f22396f);
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
