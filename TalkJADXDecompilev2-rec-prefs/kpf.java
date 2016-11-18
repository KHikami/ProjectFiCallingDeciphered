package p000;

public final class kpf extends nyx<kpf> {
    public kqe f22628a;
    public kqg f22629b;
    public kpj f22630c;
    public kqx f22631d;
    public kqx f22632e;
    public String f22633f;
    public Boolean f22634g;
    public kpx f22635h;
    public kqq f22636i;
    public kqo f22637j;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26894b(nyt);
    }

    public kpf() {
        m26895d();
    }

    private kpf m26895d() {
        this.f22628a = null;
        this.f22629b = null;
        this.f22630c = null;
        this.f22631d = null;
        this.f22632e = null;
        this.f22633f = null;
        this.f22634g = null;
        this.f22635h = null;
        this.f22636i = null;
        this.f22637j = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22629b != null) {
            nyu.b(1, this.f22629b);
        }
        if (this.f22630c != null) {
            nyu.b(2, this.f22630c);
        }
        if (this.f22631d != null) {
            nyu.b(3, this.f22631d);
        }
        if (this.f22632e != null) {
            nyu.b(4, this.f22632e);
        }
        if (this.f22633f != null) {
            nyu.a(5, this.f22633f);
        }
        if (this.f22635h != null) {
            nyu.b(6, this.f22635h);
        }
        if (this.f22636i != null) {
            nyu.b(7, this.f22636i);
        }
        if (this.f22637j != null) {
            nyu.b(8, this.f22637j);
        }
        if (this.f22628a != null) {
            nyu.b(9, this.f22628a);
        }
        if (this.f22634g != null) {
            nyu.a(10, this.f22634g.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22629b != null) {
            b += nyu.d(1, this.f22629b);
        }
        if (this.f22630c != null) {
            b += nyu.d(2, this.f22630c);
        }
        if (this.f22631d != null) {
            b += nyu.d(3, this.f22631d);
        }
        if (this.f22632e != null) {
            b += nyu.d(4, this.f22632e);
        }
        if (this.f22633f != null) {
            b += nyu.b(5, this.f22633f);
        }
        if (this.f22635h != null) {
            b += nyu.d(6, this.f22635h);
        }
        if (this.f22636i != null) {
            b += nyu.d(7, this.f22636i);
        }
        if (this.f22637j != null) {
            b += nyu.d(8, this.f22637j);
        }
        if (this.f22628a != null) {
            b += nyu.d(9, this.f22628a);
        }
        if (this.f22634g == null) {
            return b;
        }
        this.f22634g.booleanValue();
        return b + (nyu.h(10) + 1);
    }

    private kpf m26894b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f22629b == null) {
                        this.f22629b = new kqg();
                    }
                    nyt.a(this.f22629b);
                    continue;
                case wi.dH /*18*/:
                    if (this.f22630c == null) {
                        this.f22630c = new kpj();
                    }
                    nyt.a(this.f22630c);
                    continue;
                case wi.dx /*26*/:
                    if (this.f22631d == null) {
                        this.f22631d = new kqx();
                    }
                    nyt.a(this.f22631d);
                    continue;
                case 34:
                    if (this.f22632e == null) {
                        this.f22632e = new kqx();
                    }
                    nyt.a(this.f22632e);
                    continue;
                case 42:
                    this.f22633f = nyt.j();
                    continue;
                case 50:
                    if (this.f22635h == null) {
                        this.f22635h = new kpx();
                    }
                    nyt.a(this.f22635h);
                    continue;
                case 58:
                    if (this.f22636i == null) {
                        this.f22636i = new kqq();
                    }
                    nyt.a(this.f22636i);
                    continue;
                case 66:
                    if (this.f22637j == null) {
                        this.f22637j = new kqo();
                    }
                    nyt.a(this.f22637j);
                    continue;
                case 74:
                    if (this.f22628a == null) {
                        this.f22628a = new kqe();
                    }
                    nyt.a(this.f22628a);
                    continue;
                case 80:
                    this.f22634g = Boolean.valueOf(nyt.i());
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
