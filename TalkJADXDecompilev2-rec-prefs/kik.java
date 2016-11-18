package p000;

public final class kik extends nyx<kik> {
    public kip f21848a;
    public nzs f21849b;
    public kim f21850c;
    public Long f21851d;
    public String f21852e;
    public kil f21853f;
    public String f21854g;
    public Boolean f21855h;
    public int f21856i;
    public kio f21857j;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m25975b(nyt);
    }

    public kik() {
        this.f21851d = null;
        this.f21852e = null;
        this.f21854g = null;
        this.f21855h = null;
        this.f21856i = nzf.UNSET_ENUM_VALUE;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f21848a != null) {
            nyu.b(1, this.f21848a);
        }
        if (this.f21849b != null) {
            nyu.b(2, this.f21849b);
        }
        if (this.f21850c != null) {
            nyu.b(3, this.f21850c);
        }
        if (this.f21851d != null) {
            nyu.b(4, this.f21851d.longValue());
        }
        if (this.f21852e != null) {
            nyu.a(5, this.f21852e);
        }
        if (this.f21853f != null) {
            nyu.b(6, this.f21853f);
        }
        if (this.f21854g != null) {
            nyu.a(7, this.f21854g);
        }
        if (this.f21855h != null) {
            nyu.a(8, this.f21855h.booleanValue());
        }
        if (this.f21856i != nzf.UNSET_ENUM_VALUE) {
            nyu.a(9, this.f21856i);
        }
        if (this.f21857j != null) {
            nyu.b(10, this.f21857j);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f21848a != null) {
            b += nyu.d(1, this.f21848a);
        }
        if (this.f21849b != null) {
            b += nyu.d(2, this.f21849b);
        }
        if (this.f21850c != null) {
            b += nyu.d(3, this.f21850c);
        }
        if (this.f21851d != null) {
            b += nyu.f(4, this.f21851d.longValue());
        }
        if (this.f21852e != null) {
            b += nyu.b(5, this.f21852e);
        }
        if (this.f21853f != null) {
            b += nyu.d(6, this.f21853f);
        }
        if (this.f21854g != null) {
            b += nyu.b(7, this.f21854g);
        }
        if (this.f21855h != null) {
            this.f21855h.booleanValue();
            b += nyu.h(8) + 1;
        }
        if (this.f21856i != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(9, this.f21856i);
        }
        if (this.f21857j != null) {
            return b + nyu.d(10, this.f21857j);
        }
        return b;
    }

    private kik m25975b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f21848a == null) {
                        this.f21848a = new kip();
                    }
                    nyt.a(this.f21848a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f21849b == null) {
                        this.f21849b = new nzs();
                    }
                    nyt.a(this.f21849b);
                    continue;
                case wi.dx /*26*/:
                    if (this.f21850c == null) {
                        this.f21850c = new kim();
                    }
                    nyt.a(this.f21850c);
                    continue;
                case 32:
                    this.f21851d = Long.valueOf(nyt.e());
                    continue;
                case 42:
                    this.f21852e = nyt.j();
                    continue;
                case 50:
                    if (this.f21853f == null) {
                        this.f21853f = new kil();
                    }
                    nyt.a(this.f21853f);
                    continue;
                case 58:
                    this.f21854g = nyt.j();
                    continue;
                case 64:
                    this.f21855h = Boolean.valueOf(nyt.i());
                    continue;
                case 72:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.f21856i = a;
                            break;
                        default:
                            continue;
                    }
                case 82:
                    if (this.f21857j == null) {
                        this.f21857j = new kio();
                    }
                    nyt.a(this.f21857j);
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
