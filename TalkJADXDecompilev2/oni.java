package defpackage;

public final class oni extends nyx<oni> {
    public int a;
    public int b;
    public Long c;
    public ooo[] d;
    public ooj[] e;
    public oon f;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public oni() {
        this.a = nzf.UNSET_ENUM_VALUE;
        this.b = nzf.UNSET_ENUM_VALUE;
        this.c = null;
        this.d = ooo.d();
        this.e = ooj.d();
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        int i = 0;
        if (this.a != nzf.UNSET_ENUM_VALUE) {
            nyu.a(1, this.a);
        }
        if (this.b != nzf.UNSET_ENUM_VALUE) {
            nyu.a(2, this.b);
        }
        if (this.c != null) {
            nyu.b(3, this.c.longValue());
        }
        if (this.d != null && this.d.length > 0) {
            for (nzf nzf : this.d) {
                if (nzf != null) {
                    nyu.b(4, nzf);
                }
            }
        }
        if (this.e != null && this.e.length > 0) {
            while (i < this.e.length) {
                nzf nzf2 = this.e[i];
                if (nzf2 != null) {
                    nyu.b(5, nzf2);
                }
                i++;
            }
        }
        if (this.f != null) {
            nyu.b(6, this.f);
        }
        super.a(nyu);
    }

    protected int b() {
        int i = 0;
        int b = super.b();
        if (this.a != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(1, this.a);
        }
        if (this.b != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(2, this.b);
        }
        if (this.c != null) {
            b += nyu.f(3, this.c.longValue());
        }
        if (this.d != null && this.d.length > 0) {
            int i2 = b;
            for (nzf nzf : this.d) {
                if (nzf != null) {
                    i2 += nyu.d(4, nzf);
                }
            }
            b = i2;
        }
        if (this.e != null && this.e.length > 0) {
            while (i < this.e.length) {
                nzf nzf2 = this.e[i];
                if (nzf2 != null) {
                    b += nyu.d(5, nzf2);
                }
                i++;
            }
        }
        if (this.f != null) {
            return b + nyu.d(6, this.f);
        }
        return b;
    }

    private oni b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.a = a;
                            break;
                        default:
                            continue;
                    }
                case 16:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.b = a;
                            break;
                        default:
                            continue;
                    }
                case wi.dA /*24*/:
                    this.c = Long.valueOf(nyt.e());
                    continue;
                case 34:
                    b = nzl.b(nyt, 34);
                    if (this.d == null) {
                        a = 0;
                    } else {
                        a = this.d.length;
                    }
                    obj = new ooo[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ooo();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new ooo();
                    nyt.a(obj[a]);
                    this.d = obj;
                    continue;
                case 42:
                    b = nzl.b(nyt, 42);
                    if (this.e == null) {
                        a = 0;
                    } else {
                        a = this.e.length;
                    }
                    obj = new ooj[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ooj();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new ooj();
                    nyt.a(obj[a]);
                    this.e = obj;
                    continue;
                case 50:
                    if (this.f == null) {
                        this.f = new oon();
                    }
                    nyt.a(this.f);
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
