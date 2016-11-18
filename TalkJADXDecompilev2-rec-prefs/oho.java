package p000;

public final class oho extends nyx<oho> {
    public String f32896a;
    public int f32897b;
    public ohc f32898c;
    public ohg f32899d;
    public String f32900e;
    public String f32901f;
    public byte[] f32902g;
    public Long f32903h;
    public Long f32904i;
    public nzi f32905j;
    public nzi f32906k;
    public nzi f32907l;
    public Long f32908m;
    public nzi f32909n;
    public Long f32910o;
    public String f32911p;

    public /* synthetic */ nzf m38372a(nyt nyt) {
        return m38371b(nyt);
    }

    public oho() {
        this.f32896a = null;
        this.f32897b = nzf.UNSET_ENUM_VALUE;
        this.f32900e = null;
        this.f32901f = null;
        this.f32902g = null;
        this.f32903h = null;
        this.f32904i = null;
        this.f32908m = null;
        this.f32910o = null;
        this.f32911p = null;
        this.cachedSize = -1;
    }

    public void m38373a(nyu nyu) {
        nyu.m37170a(1, this.f32896a);
        if (this.f32901f != null) {
            nyu.m37170a(3, this.f32901f);
        }
        if (this.f32902g != null) {
            nyu.m37173a(5, this.f32902g);
        }
        if (this.f32900e != null) {
            nyu.m37170a(6, this.f32900e);
        }
        if (this.f32898c != null) {
            nyu.m37182b(7, this.f32898c);
        }
        if (this.f32899d != null) {
            nyu.m37182b(8, this.f32899d);
        }
        if (this.f32903h != null) {
            nyu.m37181b(9, this.f32903h.longValue());
        }
        if (this.f32910o != null) {
            nyu.m37181b(10, this.f32910o.longValue());
        }
        if (this.f32904i != null) {
            nyu.m37181b(11, this.f32904i.longValue());
        }
        if (this.f32911p != null) {
            nyu.m37170a(12, this.f32911p);
        }
        if (this.f32908m != null) {
            nyu.m37181b(13, this.f32908m.longValue());
        }
        if (this.f32897b != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(15, this.f32897b);
        }
        if (this.f32905j != null) {
            nyu.m37182b(18, this.f32905j);
        }
        if (this.f32906k != null) {
            nyu.m37182b(19, this.f32906k);
        }
        if (this.f32907l != null) {
            nyu.m37182b(20, this.f32907l);
        }
        if (this.f32909n != null) {
            nyu.m37182b(21, this.f32909n);
        }
        super.a(nyu);
    }

    protected int m38374b() {
        int b = super.b() + nyu.m37137b(1, this.f32896a);
        if (this.f32901f != null) {
            b += nyu.m37137b(3, this.f32901f);
        }
        if (this.f32902g != null) {
            b += nyu.m37139b(5, this.f32902g);
        }
        if (this.f32900e != null) {
            b += nyu.m37137b(6, this.f32900e);
        }
        if (this.f32898c != null) {
            b += nyu.m37145d(7, this.f32898c);
        }
        if (this.f32899d != null) {
            b += nyu.m37145d(8, this.f32899d);
        }
        if (this.f32903h != null) {
            b += nyu.m37148f(9, this.f32903h.longValue());
        }
        if (this.f32910o != null) {
            b += nyu.m37148f(10, this.f32910o.longValue());
        }
        if (this.f32904i != null) {
            b += nyu.m37148f(11, this.f32904i.longValue());
        }
        if (this.f32911p != null) {
            b += nyu.m37137b(12, this.f32911p);
        }
        if (this.f32908m != null) {
            b += nyu.m37148f(13, this.f32908m.longValue());
        }
        if (this.f32897b != nzf.UNSET_ENUM_VALUE) {
            b += nyu.m37147f(15, this.f32897b);
        }
        if (this.f32905j != null) {
            b += nyu.m37145d(18, this.f32905j);
        }
        if (this.f32906k != null) {
            b += nyu.m37145d(19, this.f32906k);
        }
        if (this.f32907l != null) {
            b += nyu.m37145d(20, this.f32907l);
        }
        if (this.f32909n != null) {
            return b + nyu.m37145d(21, this.f32909n);
        }
        return b;
    }

    private oho m38371b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f32896a = nyt.m37117j();
                    continue;
                case wi.dx /*26*/:
                    this.f32901f = nyt.m37117j();
                    continue;
                case 42:
                    this.f32902g = nyt.m37118k();
                    continue;
                case 50:
                    this.f32900e = nyt.m37117j();
                    continue;
                case 58:
                    if (this.f32898c == null) {
                        this.f32898c = new ohc();
                    }
                    nyt.m37101a(this.f32898c);
                    continue;
                case 66:
                    if (this.f32899d == null) {
                        this.f32899d = new ohg();
                    }
                    nyt.m37101a(this.f32899d);
                    continue;
                case 72:
                    this.f32903h = Long.valueOf(nyt.m37110e());
                    continue;
                case 80:
                    this.f32910o = Long.valueOf(nyt.m37110e());
                    continue;
                case 88:
                    this.f32904i = Long.valueOf(nyt.m37110e());
                    continue;
                case 98:
                    this.f32911p = nyt.m37117j();
                    continue;
                case 104:
                    this.f32908m = Long.valueOf(nyt.m37110e());
                    continue;
                case 120:
                    a = nyt.m37112f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 7:
                        case 8:
                        case 10:
                        case 11:
                            this.f32897b = a;
                            break;
                        default:
                            continue;
                    }
                case 146:
                    if (this.f32905j == null) {
                        this.f32905j = new nzi();
                    }
                    nyt.m37101a(this.f32905j);
                    continue;
                case 154:
                    if (this.f32906k == null) {
                        this.f32906k = new nzi();
                    }
                    nyt.m37101a(this.f32906k);
                    continue;
                case 162:
                    if (this.f32907l == null) {
                        this.f32907l = new nzi();
                    }
                    nyt.m37101a(this.f32907l);
                    continue;
                case 170:
                    if (this.f32909n == null) {
                        this.f32909n = new nzi();
                    }
                    nyt.m37101a(this.f32909n);
                    continue;
                default:
                    if (!super.a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
