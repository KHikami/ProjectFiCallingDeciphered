package p000;

public final class kvf extends nyx<kvf> {
    private static volatile kvf[] f23572f;
    public String f23573a;
    public String f23574b;
    public String f23575c;
    public String f23576d;
    public String f23577e;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27673b(nyt);
    }

    public static kvf[] m27674d() {
        if (f23572f == null) {
            synchronized (nzc.c) {
                if (f23572f == null) {
                    f23572f = new kvf[0];
                }
            }
        }
        return f23572f;
    }

    public kvf() {
        this.f23573a = null;
        this.f23574b = null;
        this.f23575c = null;
        this.f23576d = null;
        this.f23577e = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        nyu.a(1, this.f23573a);
        nyu.a(2, this.f23574b);
        if (this.f23575c != null) {
            nyu.a(3, this.f23575c);
        }
        if (this.f23576d != null) {
            nyu.a(4, this.f23576d);
        }
        if (this.f23577e != null) {
            nyu.a(5, this.f23577e);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = (super.mo147b() + nyu.b(1, this.f23573a)) + nyu.b(2, this.f23574b);
        if (this.f23575c != null) {
            b += nyu.b(3, this.f23575c);
        }
        if (this.f23576d != null) {
            b += nyu.b(4, this.f23576d);
        }
        if (this.f23577e != null) {
            return b + nyu.b(5, this.f23577e);
        }
        return b;
    }

    private kvf m27673b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f23573a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f23574b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f23575c = nyt.j();
                    continue;
                case 34:
                    this.f23576d = nyt.j();
                    continue;
                case 42:
                    this.f23577e = nyt.j();
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
