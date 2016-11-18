package p000;

public final class ohg extends nyx<ohg> {
    public Boolean f32851a;
    public Boolean f32852b;
    public Integer f32853c;
    public ohm[] f32854d;
    public ohj f32855e;
    public ohn[] f32856f;
    public Boolean f32857g;
    public Boolean f32858h;
    public Boolean f32859i;
    public int f32860j;

    public /* synthetic */ nzf m38335a(nyt nyt) {
        return m38334b(nyt);
    }

    public ohg() {
        this.f32851a = null;
        this.f32852b = null;
        this.f32853c = null;
        this.f32854d = ohm.m38362d();
        this.f32856f = ohn.m38367d();
        this.f32857g = null;
        this.f32858h = null;
        this.f32859i = null;
        this.f32860j = nzf.UNSET_ENUM_VALUE;
        this.cachedSize = -1;
    }

    public void m38336a(nyu nyu) {
        int i = 0;
        if (this.f32851a != null) {
            nyu.m37172a(1, this.f32851a.booleanValue());
        }
        if (this.f32852b != null) {
            nyu.m37172a(2, this.f32852b.booleanValue());
        }
        nyu.m37168a(3, this.f32853c.intValue());
        if (this.f32854d != null && this.f32854d.length > 0) {
            for (nzf nzf : this.f32854d) {
                if (nzf != null) {
                    nyu.m37182b(4, nzf);
                }
            }
        }
        if (this.f32855e != null) {
            nyu.m37182b(5, this.f32855e);
        }
        if (this.f32856f != null && this.f32856f.length > 0) {
            while (i < this.f32856f.length) {
                nzf nzf2 = this.f32856f[i];
                if (nzf2 != null) {
                    nyu.m37182b(6, nzf2);
                }
                i++;
            }
        }
        if (this.f32857g != null) {
            nyu.m37172a(7, this.f32857g.booleanValue());
        }
        if (this.f32858h != null) {
            nyu.m37172a(8, this.f32858h.booleanValue());
        }
        if (this.f32859i != null) {
            nyu.m37172a(9, this.f32859i.booleanValue());
        }
        if (this.f32860j != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(10, this.f32860j);
        }
        super.a(nyu);
    }

    protected int m38337b() {
        int i = 0;
        int b = super.b();
        if (this.f32851a != null) {
            this.f32851a.booleanValue();
            b += nyu.m37154h(1) + 1;
        }
        if (this.f32852b != null) {
            this.f32852b.booleanValue();
            b += nyu.m37154h(2) + 1;
        }
        b += nyu.m37147f(3, this.f32853c.intValue());
        if (this.f32854d != null && this.f32854d.length > 0) {
            int i2 = b;
            for (nzf nzf : this.f32854d) {
                if (nzf != null) {
                    i2 += nyu.m37145d(4, nzf);
                }
            }
            b = i2;
        }
        if (this.f32855e != null) {
            b += nyu.m37145d(5, this.f32855e);
        }
        if (this.f32856f != null && this.f32856f.length > 0) {
            while (i < this.f32856f.length) {
                nzf nzf2 = this.f32856f[i];
                if (nzf2 != null) {
                    b += nyu.m37145d(6, nzf2);
                }
                i++;
            }
        }
        if (this.f32857g != null) {
            this.f32857g.booleanValue();
            b += nyu.m37154h(7) + 1;
        }
        if (this.f32858h != null) {
            this.f32858h.booleanValue();
            b += nyu.m37154h(8) + 1;
        }
        if (this.f32859i != null) {
            this.f32859i.booleanValue();
            b += nyu.m37154h(9) + 1;
        }
        if (this.f32860j != nzf.UNSET_ENUM_VALUE) {
            return b + nyu.m37147f(10, this.f32860j);
        }
        return b;
    }

    private ohg m38334b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f32851a = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 16:
                    this.f32852b = Boolean.valueOf(nyt.m37116i());
                    continue;
                case wi.dA /*24*/:
                    this.f32853c = Integer.valueOf(nyt.m37112f());
                    continue;
                case 34:
                    b = nzl.m37265b(nyt, 34);
                    if (this.f32854d == null) {
                        a = 0;
                    } else {
                        a = this.f32854d.length;
                    }
                    obj = new ohm[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f32854d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ohm();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new ohm();
                    nyt.m37101a(obj[a]);
                    this.f32854d = obj;
                    continue;
                case 42:
                    if (this.f32855e == null) {
                        this.f32855e = new ohj();
                    }
                    nyt.m37101a(this.f32855e);
                    continue;
                case 50:
                    b = nzl.m37265b(nyt, 50);
                    if (this.f32856f == null) {
                        a = 0;
                    } else {
                        a = this.f32856f.length;
                    }
                    obj = new ohn[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f32856f, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ohn();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new ohn();
                    nyt.m37101a(obj[a]);
                    this.f32856f = obj;
                    continue;
                case 56:
                    this.f32857g = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 64:
                    this.f32858h = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 72:
                    this.f32859i = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 80:
                    a = nyt.m37112f();
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
                            this.f32860j = a;
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
