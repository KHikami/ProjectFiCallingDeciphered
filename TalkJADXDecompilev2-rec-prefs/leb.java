package p000;

public final class leb extends nyx<leb> {
    private static volatile leb[] f24778k;
    public String f24779a;
    public String f24780b;
    public String f24781c;
    public String f24782d;
    public String f24783e;
    public String f24784f;
    public String f24785g;
    public String f24786h;
    public Integer f24787i;
    public String f24788j;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28827b(nyt);
    }

    public static leb[] m28828d() {
        if (f24778k == null) {
            synchronized (nzc.c) {
                if (f24778k == null) {
                    f24778k = new leb[0];
                }
            }
        }
        return f24778k;
    }

    public leb() {
        m28829g();
    }

    private leb m28829g() {
        this.f24779a = null;
        this.f24780b = null;
        this.f24781c = null;
        this.f24782d = null;
        this.f24783e = null;
        this.f24784f = null;
        this.f24785g = null;
        this.f24786h = null;
        this.f24787i = null;
        this.f24788j = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f24779a != null) {
            nyu.a(1, this.f24779a);
        }
        if (this.f24780b != null) {
            nyu.a(2, this.f24780b);
        }
        if (this.f24781c != null) {
            nyu.a(3, this.f24781c);
        }
        if (this.f24782d != null) {
            nyu.a(4, this.f24782d);
        }
        if (this.f24783e != null) {
            nyu.a(5, this.f24783e);
        }
        if (this.f24784f != null) {
            nyu.a(6, this.f24784f);
        }
        if (this.f24785g != null) {
            nyu.a(7, this.f24785g);
        }
        if (this.f24786h != null) {
            nyu.a(8, this.f24786h);
        }
        if (this.f24787i != null) {
            nyu.a(9, this.f24787i.intValue());
        }
        if (this.f24788j != null) {
            nyu.a(10, this.f24788j);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24779a != null) {
            b += nyu.b(1, this.f24779a);
        }
        if (this.f24780b != null) {
            b += nyu.b(2, this.f24780b);
        }
        if (this.f24781c != null) {
            b += nyu.b(3, this.f24781c);
        }
        if (this.f24782d != null) {
            b += nyu.b(4, this.f24782d);
        }
        if (this.f24783e != null) {
            b += nyu.b(5, this.f24783e);
        }
        if (this.f24784f != null) {
            b += nyu.b(6, this.f24784f);
        }
        if (this.f24785g != null) {
            b += nyu.b(7, this.f24785g);
        }
        if (this.f24786h != null) {
            b += nyu.b(8, this.f24786h);
        }
        if (this.f24787i != null) {
            b += nyu.f(9, this.f24787i.intValue());
        }
        if (this.f24788j != null) {
            return b + nyu.b(10, this.f24788j);
        }
        return b;
    }

    private leb m28827b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f24779a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f24780b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f24781c = nyt.j();
                    continue;
                case 34:
                    this.f24782d = nyt.j();
                    continue;
                case 42:
                    this.f24783e = nyt.j();
                    continue;
                case 50:
                    this.f24784f = nyt.j();
                    continue;
                case 58:
                    this.f24785g = nyt.j();
                    continue;
                case 66:
                    this.f24786h = nyt.j();
                    continue;
                case 72:
                    this.f24787i = Integer.valueOf(nyt.f());
                    continue;
                case 82:
                    this.f24788j = nyt.j();
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
