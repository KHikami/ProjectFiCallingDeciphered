package defpackage;

public final class ohg extends nyx<ohg> {
    public Boolean a;
    public Boolean b;
    public Integer c;
    public ohm[] d;
    public ohj e;
    public ohn[] f;
    public Boolean g;
    public Boolean h;
    public Boolean i;
    public int j;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public ohg() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = ohm.d();
        this.f = ohn.d();
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = nzf.UNSET_ENUM_VALUE;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        int i = 0;
        if (this.a != null) {
            nyu.a(1, this.a.booleanValue());
        }
        if (this.b != null) {
            nyu.a(2, this.b.booleanValue());
        }
        nyu.a(3, this.c.intValue());
        if (this.d != null && this.d.length > 0) {
            for (nzf nzf : this.d) {
                if (nzf != null) {
                    nyu.b(4, nzf);
                }
            }
        }
        if (this.e != null) {
            nyu.b(5, this.e);
        }
        if (this.f != null && this.f.length > 0) {
            while (i < this.f.length) {
                nzf nzf2 = this.f[i];
                if (nzf2 != null) {
                    nyu.b(6, nzf2);
                }
                i++;
            }
        }
        if (this.g != null) {
            nyu.a(7, this.g.booleanValue());
        }
        if (this.h != null) {
            nyu.a(8, this.h.booleanValue());
        }
        if (this.i != null) {
            nyu.a(9, this.i.booleanValue());
        }
        if (this.j != nzf.UNSET_ENUM_VALUE) {
            nyu.a(10, this.j);
        }
        super.a(nyu);
    }

    protected int b() {
        int i = 0;
        int b = super.b();
        if (this.a != null) {
            this.a.booleanValue();
            b += nyu.h(1) + 1;
        }
        if (this.b != null) {
            this.b.booleanValue();
            b += nyu.h(2) + 1;
        }
        b += nyu.f(3, this.c.intValue());
        if (this.d != null && this.d.length > 0) {
            int i2 = b;
            for (nzf nzf : this.d) {
                if (nzf != null) {
                    i2 += nyu.d(4, nzf);
                }
            }
            b = i2;
        }
        if (this.e != null) {
            b += nyu.d(5, this.e);
        }
        if (this.f != null && this.f.length > 0) {
            while (i < this.f.length) {
                nzf nzf2 = this.f[i];
                if (nzf2 != null) {
                    b += nyu.d(6, nzf2);
                }
                i++;
            }
        }
        if (this.g != null) {
            this.g.booleanValue();
            b += nyu.h(7) + 1;
        }
        if (this.h != null) {
            this.h.booleanValue();
            b += nyu.h(8) + 1;
        }
        if (this.i != null) {
            this.i.booleanValue();
            b += nyu.h(9) + 1;
        }
        if (this.j != nzf.UNSET_ENUM_VALUE) {
            return b + nyu.f(10, this.j);
        }
        return b;
    }

    private ohg b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.a = Boolean.valueOf(nyt.i());
                    continue;
                case 16:
                    this.b = Boolean.valueOf(nyt.i());
                    continue;
                case wi.dA /*24*/:
                    this.c = Integer.valueOf(nyt.f());
                    continue;
                case 34:
                    b = nzl.b(nyt, 34);
                    if (this.d == null) {
                        a = 0;
                    } else {
                        a = this.d.length;
                    }
                    obj = new ohm[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ohm();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new ohm();
                    nyt.a(obj[a]);
                    this.d = obj;
                    continue;
                case 42:
                    if (this.e == null) {
                        this.e = new ohj();
                    }
                    nyt.a(this.e);
                    continue;
                case 50:
                    b = nzl.b(nyt, 50);
                    if (this.f == null) {
                        a = 0;
                    } else {
                        a = this.f.length;
                    }
                    obj = new ohn[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ohn();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new ohn();
                    nyt.a(obj[a]);
                    this.f = obj;
                    continue;
                case 56:
                    this.g = Boolean.valueOf(nyt.i());
                    continue;
                case 64:
                    this.h = Boolean.valueOf(nyt.i());
                    continue;
                case 72:
                    this.i = Boolean.valueOf(nyt.i());
                    continue;
                case 80:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                            this.j = a;
                            break;
                        default:
                            continue;
                    }
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
