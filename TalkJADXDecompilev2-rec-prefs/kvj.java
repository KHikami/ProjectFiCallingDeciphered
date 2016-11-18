package p000;

public final class kvj extends nyx<kvj> {
    private static volatile kvj[] f23608D;
    public ofx f23609A;
    public kwf f23610B;
    public kxo f23611C;
    public String f23612a;
    public String f23613b;
    public kzl f23614c;
    public String f23615d;
    public kxq f23616e;
    public Long f23617f;
    public String f23618g;
    public String f23619h;
    public kvp f23620i;
    public String f23621j;
    public String f23622k;
    public Boolean f23623l;
    public Boolean f23624m;
    public String f23625n;
    public Boolean f23626o;
    public Boolean f23627p;
    public Long f23628q;
    public kvg f23629r;
    public String f23630s;
    public Boolean f23631t;
    public String f23632u;
    public kwm f23633v;
    public int f23634w;
    public Boolean f23635x;
    public kwh f23636y;
    public int f23637z;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27690b(nyt);
    }

    public static kvj[] m27691d() {
        if (f23608D == null) {
            synchronized (nzc.c) {
                if (f23608D == null) {
                    f23608D = new kvj[0];
                }
            }
        }
        return f23608D;
    }

    public kvj() {
        this.f23612a = null;
        this.f23613b = null;
        this.f23615d = null;
        this.f23617f = null;
        this.f23618g = null;
        this.f23619h = null;
        this.f23621j = null;
        this.f23622k = null;
        this.f23623l = null;
        this.f23624m = null;
        this.f23625n = null;
        this.f23626o = null;
        this.f23627p = null;
        this.f23628q = null;
        this.f23630s = null;
        this.f23631t = null;
        this.f23632u = null;
        this.f23634w = nzf.UNSET_ENUM_VALUE;
        this.f23635x = null;
        this.f23637z = nzf.UNSET_ENUM_VALUE;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        nyu.a(2, this.f23612a);
        nyu.a(3, this.f23613b);
        nyu.b(4, this.f23617f.longValue());
        nyu.a(5, this.f23618g);
        if (this.f23619h != null) {
            nyu.a(6, this.f23619h);
        }
        nyu.a(7, this.f23621j);
        nyu.a(8, this.f23622k);
        nyu.a(9, this.f23623l.booleanValue());
        nyu.a(10, this.f23624m.booleanValue());
        if (this.f23625n != null) {
            nyu.a(11, this.f23625n);
        }
        nyu.a(12, this.f23626o.booleanValue());
        if (this.f23627p != null) {
            nyu.a(13, this.f23627p.booleanValue());
        }
        if (this.f23628q != null) {
            nyu.b(15, this.f23628q.longValue());
        }
        if (this.f23629r != null) {
            nyu.b(16, this.f23629r);
        }
        if (this.f23630s != null) {
            nyu.a(17, this.f23630s);
        }
        if (this.f23631t != null) {
            nyu.a(18, this.f23631t.booleanValue());
        }
        if (this.f23614c != null) {
            nyu.b(19, this.f23614c);
        }
        if (this.f23620i != null) {
            nyu.b(20, this.f23620i);
        }
        if (this.f23632u != null) {
            nyu.a(21, this.f23632u);
        }
        if (this.f23633v != null) {
            nyu.b(22, this.f23633v);
        }
        if (this.f23634w != nzf.UNSET_ENUM_VALUE) {
            nyu.a(23, this.f23634w);
        }
        if (this.f23635x != null) {
            nyu.a(24, this.f23635x.booleanValue());
        }
        if (this.f23615d != null) {
            nyu.a(25, this.f23615d);
        }
        if (this.f23636y != null) {
            nyu.b(26, this.f23636y);
        }
        if (this.f23616e != null) {
            nyu.b(27, this.f23616e);
        }
        if (this.f23609A != null) {
            nyu.b(28, this.f23609A);
        }
        if (this.f23610B != null) {
            nyu.b(29, this.f23610B);
        }
        if (this.f23637z != nzf.UNSET_ENUM_VALUE) {
            nyu.a(30, this.f23637z);
        }
        if (this.f23611C != null) {
            nyu.b(31, this.f23611C);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = (((super.mo147b() + nyu.b(2, this.f23612a)) + nyu.b(3, this.f23613b)) + nyu.f(4, this.f23617f.longValue())) + nyu.b(5, this.f23618g);
        if (this.f23619h != null) {
            b += nyu.b(6, this.f23619h);
        }
        b = (b + nyu.b(7, this.f23621j)) + nyu.b(8, this.f23622k);
        this.f23623l.booleanValue();
        b += nyu.h(9) + 1;
        this.f23624m.booleanValue();
        b += nyu.h(10) + 1;
        if (this.f23625n != null) {
            b += nyu.b(11, this.f23625n);
        }
        this.f23626o.booleanValue();
        b += nyu.h(12) + 1;
        if (this.f23627p != null) {
            this.f23627p.booleanValue();
            b += nyu.h(13) + 1;
        }
        if (this.f23628q != null) {
            b += nyu.f(15, this.f23628q.longValue());
        }
        if (this.f23629r != null) {
            b += nyu.d(16, this.f23629r);
        }
        if (this.f23630s != null) {
            b += nyu.b(17, this.f23630s);
        }
        if (this.f23631t != null) {
            this.f23631t.booleanValue();
            b += nyu.h(18) + 1;
        }
        if (this.f23614c != null) {
            b += nyu.d(19, this.f23614c);
        }
        if (this.f23620i != null) {
            b += nyu.d(20, this.f23620i);
        }
        if (this.f23632u != null) {
            b += nyu.b(21, this.f23632u);
        }
        if (this.f23633v != null) {
            b += nyu.d(22, this.f23633v);
        }
        if (this.f23634w != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(23, this.f23634w);
        }
        if (this.f23635x != null) {
            this.f23635x.booleanValue();
            b += nyu.h(24) + 1;
        }
        if (this.f23615d != null) {
            b += nyu.b(25, this.f23615d);
        }
        if (this.f23636y != null) {
            b += nyu.d(26, this.f23636y);
        }
        if (this.f23616e != null) {
            b += nyu.d(27, this.f23616e);
        }
        if (this.f23609A != null) {
            b += nyu.d(28, this.f23609A);
        }
        if (this.f23610B != null) {
            b += nyu.d(29, this.f23610B);
        }
        if (this.f23637z != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(30, this.f23637z);
        }
        if (this.f23611C != null) {
            return b + nyu.d(31, this.f23611C);
        }
        return b;
    }

    private kvj m27690b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case wi.dH /*18*/:
                    this.f23612a = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f23613b = nyt.j();
                    continue;
                case 32:
                    this.f23617f = Long.valueOf(nyt.e());
                    continue;
                case 42:
                    this.f23618g = nyt.j();
                    continue;
                case 50:
                    this.f23619h = nyt.j();
                    continue;
                case 58:
                    this.f23621j = nyt.j();
                    continue;
                case 66:
                    this.f23622k = nyt.j();
                    continue;
                case 72:
                    this.f23623l = Boolean.valueOf(nyt.i());
                    continue;
                case 80:
                    this.f23624m = Boolean.valueOf(nyt.i());
                    continue;
                case 90:
                    this.f23625n = nyt.j();
                    continue;
                case 96:
                    this.f23626o = Boolean.valueOf(nyt.i());
                    continue;
                case 104:
                    this.f23627p = Boolean.valueOf(nyt.i());
                    continue;
                case 120:
                    this.f23628q = Long.valueOf(nyt.e());
                    continue;
                case 130:
                    if (this.f23629r == null) {
                        this.f23629r = new kvg();
                    }
                    nyt.a(this.f23629r);
                    continue;
                case 138:
                    this.f23630s = nyt.j();
                    continue;
                case 144:
                    this.f23631t = Boolean.valueOf(nyt.i());
                    continue;
                case 154:
                    if (this.f23614c == null) {
                        this.f23614c = new kzl();
                    }
                    nyt.a(this.f23614c);
                    continue;
                case 162:
                    if (this.f23620i == null) {
                        this.f23620i = new kvp();
                    }
                    nyt.a(this.f23620i);
                    continue;
                case 170:
                    this.f23632u = nyt.j();
                    continue;
                case 178:
                    if (this.f23633v == null) {
                        this.f23633v = new kwm();
                    }
                    nyt.a(this.f23633v);
                    continue;
                case 184:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.f23634w = a;
                            break;
                        default:
                            continue;
                    }
                case 192:
                    this.f23635x = Boolean.valueOf(nyt.i());
                    continue;
                case 202:
                    this.f23615d = nyt.j();
                    continue;
                case 210:
                    if (this.f23636y == null) {
                        this.f23636y = new kwh();
                    }
                    nyt.a(this.f23636y);
                    continue;
                case 218:
                    if (this.f23616e == null) {
                        this.f23616e = new kxq();
                    }
                    nyt.a(this.f23616e);
                    continue;
                case 226:
                    if (this.f23609A == null) {
                        this.f23609A = new ofx();
                    }
                    nyt.a(this.f23609A);
                    continue;
                case 234:
                    if (this.f23610B == null) {
                        this.f23610B = new kwf();
                    }
                    nyt.a(this.f23610B);
                    continue;
                case 240:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f23637z = a;
                            break;
                        default:
                            continue;
                    }
                case 250:
                    if (this.f23611C == null) {
                        this.f23611C = new kxo();
                    }
                    nyt.a(this.f23611C);
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
