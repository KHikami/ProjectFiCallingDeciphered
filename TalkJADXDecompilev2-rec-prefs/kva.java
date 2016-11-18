package p000;

public final class kva extends nyx<kva> {
    public String f23537a;
    public Integer f23538b;
    public String f23539c;
    public kuy f23540d;
    public String f23541e;
    public String f23542f;
    public Double f23543g;
    public kvb f23544h;
    public String f23545i;
    public String f23546j;
    public String f23547k;
    public kux[] f23548l;
    public Boolean f23549m;
    public Boolean f23550n;
    public String f23551o;
    public String f23552p;
    public String f23553q;
    public Integer f23554r;
    public Integer f23555s;
    public kuz[] f23556t;
    public Boolean f23557u;
    public String f23558v;
    public Boolean f23559w;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27652b(nyt);
    }

    public kva() {
        m27653d();
    }

    private kva m27653d() {
        this.f23537a = null;
        this.f23539c = null;
        this.f23540d = null;
        this.f23541e = null;
        this.f23542f = null;
        this.f23543g = null;
        this.f23544h = null;
        this.f23545i = null;
        this.f23546j = null;
        this.f23547k = null;
        this.f23548l = kux.m27636d();
        this.f23549m = null;
        this.f23550n = null;
        this.f23551o = null;
        this.f23552p = null;
        this.f23553q = null;
        this.f23554r = null;
        this.f23555s = null;
        this.f23556t = kuz.m27647d();
        this.f23557u = null;
        this.f23558v = null;
        this.f23559w = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        if (this.f23537a != null) {
            nyu.a(1, this.f23537a);
        }
        if (this.f23538b != null) {
            nyu.a(2, this.f23538b.intValue());
        }
        if (this.f23539c != null) {
            nyu.a(3, this.f23539c);
        }
        if (this.f23540d != null) {
            nyu.b(4, this.f23540d);
        }
        if (this.f23541e != null) {
            nyu.a(5, this.f23541e);
        }
        if (this.f23542f != null) {
            nyu.a(6, this.f23542f);
        }
        if (this.f23543g != null) {
            nyu.a(7, this.f23543g.doubleValue());
        }
        if (this.f23544h != null) {
            nyu.b(8, this.f23544h);
        }
        if (this.f23545i != null) {
            nyu.a(10, this.f23545i);
        }
        if (this.f23546j != null) {
            nyu.a(11, this.f23546j);
        }
        if (this.f23547k != null) {
            nyu.a(12, this.f23547k);
        }
        if (this.f23548l != null && this.f23548l.length > 0) {
            for (nzf nzf : this.f23548l) {
                if (nzf != null) {
                    nyu.b(13, nzf);
                }
            }
        }
        if (this.f23549m != null) {
            nyu.a(14, this.f23549m.booleanValue());
        }
        if (this.f23551o != null) {
            nyu.a(15, this.f23551o);
        }
        if (this.f23552p != null) {
            nyu.a(16, this.f23552p);
        }
        if (this.f23554r != null) {
            nyu.a(17, this.f23554r.intValue());
        }
        if (this.f23556t != null && this.f23556t.length > 0) {
            while (i < this.f23556t.length) {
                nzf nzf2 = this.f23556t[i];
                if (nzf2 != null) {
                    nyu.b(18, nzf2);
                }
                i++;
            }
        }
        if (this.f23557u != null) {
            nyu.a(19, this.f23557u.booleanValue());
        }
        if (this.f23555s != null) {
            nyu.a(20, this.f23555s.intValue());
        }
        if (this.f23550n != null) {
            nyu.a(21, this.f23550n.booleanValue());
        }
        if (this.f23553q != null) {
            nyu.a(22, this.f23553q);
        }
        if (this.f23558v != null) {
            nyu.a(23, this.f23558v);
        }
        if (this.f23559w != null) {
            nyu.a(24, this.f23559w.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b();
        if (this.f23537a != null) {
            b += nyu.b(1, this.f23537a);
        }
        if (this.f23538b != null) {
            b += nyu.f(2, this.f23538b.intValue());
        }
        if (this.f23539c != null) {
            b += nyu.b(3, this.f23539c);
        }
        if (this.f23540d != null) {
            b += nyu.d(4, this.f23540d);
        }
        if (this.f23541e != null) {
            b += nyu.b(5, this.f23541e);
        }
        if (this.f23542f != null) {
            b += nyu.b(6, this.f23542f);
        }
        if (this.f23543g != null) {
            this.f23543g.doubleValue();
            b += nyu.h(7) + 8;
        }
        if (this.f23544h != null) {
            b += nyu.d(8, this.f23544h);
        }
        if (this.f23545i != null) {
            b += nyu.b(10, this.f23545i);
        }
        if (this.f23546j != null) {
            b += nyu.b(11, this.f23546j);
        }
        if (this.f23547k != null) {
            b += nyu.b(12, this.f23547k);
        }
        if (this.f23548l != null && this.f23548l.length > 0) {
            int i2 = b;
            for (nzf nzf : this.f23548l) {
                if (nzf != null) {
                    i2 += nyu.d(13, nzf);
                }
            }
            b = i2;
        }
        if (this.f23549m != null) {
            this.f23549m.booleanValue();
            b += nyu.h(14) + 1;
        }
        if (this.f23551o != null) {
            b += nyu.b(15, this.f23551o);
        }
        if (this.f23552p != null) {
            b += nyu.b(16, this.f23552p);
        }
        if (this.f23554r != null) {
            b += nyu.f(17, this.f23554r.intValue());
        }
        if (this.f23556t != null && this.f23556t.length > 0) {
            while (i < this.f23556t.length) {
                nzf nzf2 = this.f23556t[i];
                if (nzf2 != null) {
                    b += nyu.d(18, nzf2);
                }
                i++;
            }
        }
        if (this.f23557u != null) {
            this.f23557u.booleanValue();
            b += nyu.h(19) + 1;
        }
        if (this.f23555s != null) {
            b += nyu.f(20, this.f23555s.intValue());
        }
        if (this.f23550n != null) {
            this.f23550n.booleanValue();
            b += nyu.h(21) + 1;
        }
        if (this.f23553q != null) {
            b += nyu.b(22, this.f23553q);
        }
        if (this.f23558v != null) {
            b += nyu.b(23, this.f23558v);
        }
        if (this.f23559w == null) {
            return b;
        }
        this.f23559w.booleanValue();
        return b + (nyu.h(24) + 1);
    }

    private kva m27652b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f23537a = nyt.j();
                    continue;
                case 16:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                            this.f23538b = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dx /*26*/:
                    this.f23539c = nyt.j();
                    continue;
                case 34:
                    if (this.f23540d == null) {
                        this.f23540d = new kuy();
                    }
                    nyt.a(this.f23540d);
                    continue;
                case 42:
                    this.f23541e = nyt.j();
                    continue;
                case 50:
                    this.f23542f = nyt.j();
                    continue;
                case 57:
                    this.f23543g = Double.valueOf(nyt.b());
                    continue;
                case 66:
                    if (this.f23544h == null) {
                        this.f23544h = new kvb();
                    }
                    nyt.a(this.f23544h);
                    continue;
                case 82:
                    this.f23545i = nyt.j();
                    continue;
                case 90:
                    this.f23546j = nyt.j();
                    continue;
                case 98:
                    this.f23547k = nyt.j();
                    continue;
                case 106:
                    b = nzl.b(nyt, 106);
                    if (this.f23548l == null) {
                        a = 0;
                    } else {
                        a = this.f23548l.length;
                    }
                    obj = new kux[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f23548l, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kux();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kux();
                    nyt.a(obj[a]);
                    this.f23548l = obj;
                    continue;
                case 112:
                    this.f23549m = Boolean.valueOf(nyt.i());
                    continue;
                case 122:
                    this.f23551o = nyt.j();
                    continue;
                case 130:
                    this.f23552p = nyt.j();
                    continue;
                case 136:
                    this.f23554r = Integer.valueOf(nyt.f());
                    continue;
                case 146:
                    b = nzl.b(nyt, 146);
                    if (this.f23556t == null) {
                        a = 0;
                    } else {
                        a = this.f23556t.length;
                    }
                    obj = new kuz[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f23556t, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kuz();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kuz();
                    nyt.a(obj[a]);
                    this.f23556t = obj;
                    continue;
                case 152:
                    this.f23557u = Boolean.valueOf(nyt.i());
                    continue;
                case 160:
                    this.f23555s = Integer.valueOf(nyt.f());
                    continue;
                case 168:
                    this.f23550n = Boolean.valueOf(nyt.i());
                    continue;
                case 178:
                    this.f23553q = nyt.j();
                    continue;
                case 186:
                    this.f23558v = nyt.j();
                    continue;
                case 192:
                    this.f23559w = Boolean.valueOf(nyt.i());
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
