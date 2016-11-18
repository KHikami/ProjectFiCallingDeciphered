package p000;

public final class kul extends nyx<kul> {
    private static volatile kul[] f23451k;
    public String f23452a;
    public String f23453b;
    public String f23454c;
    public String f23455d;
    public String f23456e;
    public String f23457f;
    public String f23458g;
    public String f23459h;
    public Integer f23460i;
    public kum f23461j;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27578b(nyt);
    }

    public static kul[] m27579d() {
        if (f23451k == null) {
            synchronized (nzc.c) {
                if (f23451k == null) {
                    f23451k = new kul[0];
                }
            }
        }
        return f23451k;
    }

    public kul() {
        this.f23452a = null;
        this.f23453b = null;
        this.f23454c = null;
        this.f23455d = null;
        this.f23456e = null;
        this.f23457f = null;
        this.f23458g = null;
        this.f23459h = null;
        this.f23460i = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        nyu.a(1, this.f23453b);
        if (this.f23454c != null) {
            nyu.a(2, this.f23454c);
        }
        if (this.f23455d != null) {
            nyu.a(3, this.f23455d);
        }
        if (this.f23456e != null) {
            nyu.a(4, this.f23456e);
        }
        if (this.f23457f != null) {
            nyu.a(5, this.f23457f);
        }
        if (this.f23459h != null) {
            nyu.a(6, this.f23459h);
        }
        if (this.f23460i != null) {
            nyu.a(7, this.f23460i.intValue());
        }
        if (this.f23458g != null) {
            nyu.a(8, this.f23458g);
        }
        if (this.f23452a != null) {
            nyu.a(9, this.f23452a);
        }
        if (this.f23461j != null) {
            nyu.b(10, this.f23461j);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b() + nyu.b(1, this.f23453b);
        if (this.f23454c != null) {
            b += nyu.b(2, this.f23454c);
        }
        if (this.f23455d != null) {
            b += nyu.b(3, this.f23455d);
        }
        if (this.f23456e != null) {
            b += nyu.b(4, this.f23456e);
        }
        if (this.f23457f != null) {
            b += nyu.b(5, this.f23457f);
        }
        if (this.f23459h != null) {
            b += nyu.b(6, this.f23459h);
        }
        if (this.f23460i != null) {
            b += nyu.f(7, this.f23460i.intValue());
        }
        if (this.f23458g != null) {
            b += nyu.b(8, this.f23458g);
        }
        if (this.f23452a != null) {
            b += nyu.b(9, this.f23452a);
        }
        if (this.f23461j != null) {
            return b + nyu.d(10, this.f23461j);
        }
        return b;
    }

    private kul m27578b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f23453b = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f23454c = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f23455d = nyt.j();
                    continue;
                case 34:
                    this.f23456e = nyt.j();
                    continue;
                case 42:
                    this.f23457f = nyt.j();
                    continue;
                case 50:
                    this.f23459h = nyt.j();
                    continue;
                case 56:
                    this.f23460i = Integer.valueOf(nyt.f());
                    continue;
                case 66:
                    this.f23458g = nyt.j();
                    continue;
                case 74:
                    this.f23452a = nyt.j();
                    continue;
                case 82:
                    if (this.f23461j == null) {
                        this.f23461j = new kum();
                    }
                    nyt.a(this.f23461j);
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
