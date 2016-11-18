package p000;

public final class kuk extends nyx<kuk> {
    private static volatile kuk[] f23445f;
    public String f23446a;
    public String f23447b;
    public Boolean f23448c;
    public Boolean f23449d;
    public Boolean f23450e;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27573b(nyt);
    }

    public static kuk[] m27574d() {
        if (f23445f == null) {
            synchronized (nzc.c) {
                if (f23445f == null) {
                    f23445f = new kuk[0];
                }
            }
        }
        return f23445f;
    }

    public kuk() {
        this.f23446a = null;
        this.f23447b = null;
        this.f23448c = null;
        this.f23449d = null;
        this.f23450e = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        nyu.a(1, this.f23446a);
        nyu.a(2, this.f23447b);
        if (this.f23448c != null) {
            nyu.a(3, this.f23448c.booleanValue());
        }
        if (this.f23449d != null) {
            nyu.a(4, this.f23449d.booleanValue());
        }
        if (this.f23450e != null) {
            nyu.a(5, this.f23450e.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = (super.mo147b() + nyu.b(1, this.f23446a)) + nyu.b(2, this.f23447b);
        if (this.f23448c != null) {
            this.f23448c.booleanValue();
            b += nyu.h(3) + 1;
        }
        if (this.f23449d != null) {
            this.f23449d.booleanValue();
            b += nyu.h(4) + 1;
        }
        if (this.f23450e == null) {
            return b;
        }
        this.f23450e.booleanValue();
        return b + (nyu.h(5) + 1);
    }

    private kuk m27573b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f23446a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f23447b = nyt.j();
                    continue;
                case wi.dA /*24*/:
                    this.f23448c = Boolean.valueOf(nyt.i());
                    continue;
                case 32:
                    this.f23449d = Boolean.valueOf(nyt.i());
                    continue;
                case 40:
                    this.f23450e = Boolean.valueOf(nyt.i());
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
