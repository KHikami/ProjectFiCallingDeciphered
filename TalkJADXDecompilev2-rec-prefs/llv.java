package p000;

public final class llv extends nyx<llv> {
    private static volatile llv[] f25408m;
    public Integer f25409a;
    public Long f25410b;
    public Long f25411c;
    public Integer f25412d;
    public Integer f25413e;
    public Integer f25414f;
    public Boolean f25415g;
    public Boolean f25416h;
    public Boolean f25417i;
    public Boolean f25418j;
    public Integer f25419k;
    public Boolean f25420l;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29410b(nyt);
    }

    public static llv[] m29411d() {
        if (f25408m == null) {
            synchronized (nzc.c) {
                if (f25408m == null) {
                    f25408m = new llv[0];
                }
            }
        }
        return f25408m;
    }

    public llv() {
        m29412g();
    }

    private llv m29412g() {
        this.f25410b = null;
        this.f25411c = null;
        this.f25412d = null;
        this.f25413e = null;
        this.f25414f = null;
        this.f25415g = null;
        this.f25416h = null;
        this.f25417i = null;
        this.f25418j = null;
        this.f25419k = null;
        this.f25420l = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        nyu.a(1, this.f25409a.intValue());
        if (this.f25410b != null) {
            nyu.b(2, this.f25410b.longValue());
        }
        if (this.f25413e != null) {
            nyu.a(4, this.f25413e.intValue());
        }
        if (this.f25414f != null) {
            nyu.a(5, this.f25414f.intValue());
        }
        if (this.f25415g != null) {
            nyu.a(6, this.f25415g.booleanValue());
        }
        if (this.f25416h != null) {
            nyu.a(7, this.f25416h.booleanValue());
        }
        if (this.f25417i != null) {
            nyu.a(8, this.f25417i.booleanValue());
        }
        if (this.f25419k != null) {
            nyu.a(11, this.f25419k.intValue());
        }
        if (this.f25412d != null) {
            nyu.a(12, this.f25412d.intValue());
        }
        if (this.f25418j != null) {
            nyu.a(13, this.f25418j.booleanValue());
        }
        if (this.f25411c != null) {
            nyu.b(14, this.f25411c.longValue());
        }
        if (this.f25420l != null) {
            nyu.a(15, this.f25420l.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b() + nyu.f(1, this.f25409a.intValue());
        if (this.f25410b != null) {
            b += nyu.f(2, this.f25410b.longValue());
        }
        if (this.f25413e != null) {
            b += nyu.f(4, this.f25413e.intValue());
        }
        if (this.f25414f != null) {
            b += nyu.f(5, this.f25414f.intValue());
        }
        if (this.f25415g != null) {
            this.f25415g.booleanValue();
            b += nyu.h(6) + 1;
        }
        if (this.f25416h != null) {
            this.f25416h.booleanValue();
            b += nyu.h(7) + 1;
        }
        if (this.f25417i != null) {
            this.f25417i.booleanValue();
            b += nyu.h(8) + 1;
        }
        if (this.f25419k != null) {
            b += nyu.f(11, this.f25419k.intValue());
        }
        if (this.f25412d != null) {
            b += nyu.f(12, this.f25412d.intValue());
        }
        if (this.f25418j != null) {
            this.f25418j.booleanValue();
            b += nyu.h(13) + 1;
        }
        if (this.f25411c != null) {
            b += nyu.f(14, this.f25411c.longValue());
        }
        if (this.f25420l == null) {
            return b;
        }
        this.f25420l.booleanValue();
        return b + (nyu.h(15) + 1);
    }

    private llv m29410b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                        case 6:
                        case 7:
                            this.f25409a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 16:
                    this.f25410b = Long.valueOf(nyt.e());
                    continue;
                case 32:
                    this.f25413e = Integer.valueOf(nyt.f());
                    continue;
                case 40:
                    this.f25414f = Integer.valueOf(nyt.f());
                    continue;
                case 48:
                    this.f25415g = Boolean.valueOf(nyt.i());
                    continue;
                case 56:
                    this.f25416h = Boolean.valueOf(nyt.i());
                    continue;
                case 64:
                    this.f25417i = Boolean.valueOf(nyt.i());
                    continue;
                case 88:
                    this.f25419k = Integer.valueOf(nyt.f());
                    continue;
                case 96:
                    this.f25412d = Integer.valueOf(nyt.f());
                    continue;
                case 104:
                    this.f25418j = Boolean.valueOf(nyt.i());
                    continue;
                case 112:
                    this.f25411c = Long.valueOf(nyt.e());
                    continue;
                case 120:
                    this.f25420l = Boolean.valueOf(nyt.i());
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
