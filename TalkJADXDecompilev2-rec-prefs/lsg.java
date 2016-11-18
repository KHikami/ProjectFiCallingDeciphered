package p000;

public final class lsg extends nyx<lsg> {
    private static volatile lsg[] f26307g;
    public lsh f26308a;
    public String f26309b;
    public Integer f26310c;
    public String f26311d;
    public String f26312e;
    public byte[] f26313f;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30296b(nyt);
    }

    public static lsg[] m30297d() {
        if (f26307g == null) {
            synchronized (nzc.c) {
                if (f26307g == null) {
                    f26307g = new lsg[0];
                }
            }
        }
        return f26307g;
    }

    public lsg() {
        m30298g();
    }

    private lsg m30298g() {
        this.f26308a = null;
        this.f26309b = null;
        this.f26311d = null;
        this.f26312e = null;
        this.f26313f = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26308a != null) {
            nyu.b(1, this.f26308a);
        }
        if (this.f26311d != null) {
            nyu.a(2, this.f26311d);
        }
        if (this.f26312e != null) {
            nyu.a(3, this.f26312e);
        }
        if (this.f26313f != null) {
            nyu.a(4, this.f26313f);
        }
        if (this.f26309b != null) {
            nyu.a(5, this.f26309b);
        }
        if (this.f26310c != null) {
            nyu.a(6, this.f26310c.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26308a != null) {
            b += nyu.d(1, this.f26308a);
        }
        if (this.f26311d != null) {
            b += nyu.b(2, this.f26311d);
        }
        if (this.f26312e != null) {
            b += nyu.b(3, this.f26312e);
        }
        if (this.f26313f != null) {
            b += nyu.b(4, this.f26313f);
        }
        if (this.f26309b != null) {
            b += nyu.b(5, this.f26309b);
        }
        if (this.f26310c != null) {
            return b + nyu.f(6, this.f26310c.intValue());
        }
        return b;
    }

    private lsg m30296b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f26308a == null) {
                        this.f26308a = new lsh();
                    }
                    nyt.a(this.f26308a);
                    continue;
                case wi.dH /*18*/:
                    this.f26311d = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f26312e = nyt.j();
                    continue;
                case 34:
                    this.f26313f = nyt.k();
                    continue;
                case 42:
                    this.f26309b = nyt.j();
                    continue;
                case 48:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            this.f26310c = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
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
