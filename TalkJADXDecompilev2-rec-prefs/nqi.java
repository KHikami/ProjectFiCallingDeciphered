package p000;

public final class nqi extends nyx<nqi> {
    public String f30491a;
    public nta[] f30492b;
    public Long f30493c;
    public Long f30494d;
    public nrz f30495e;
    public nqj[] f30496f;
    public int f30497g;
    public int[] f30498h;

    public /* synthetic */ nzf m36147a(nyt nyt) {
        return m36146b(nyt);
    }

    public nqi() {
        this.f30491a = null;
        this.f30492b = nta.m36436d();
        this.f30493c = null;
        this.f30494d = null;
        this.f30496f = nqj.m36151d();
        this.f30497g = nzf.UNSET_ENUM_VALUE;
        this.f30498h = nzl.f31327a;
        this.cachedSize = -1;
    }

    public void m36148a(nyu nyu) {
        int i = 0;
        if (this.f30491a != null) {
            nyu.m37170a(1, this.f30491a);
        }
        if (this.f30493c != null) {
            nyu.m37181b(2, this.f30493c.longValue());
        }
        if (this.f30494d != null) {
            nyu.m37181b(3, this.f30494d.longValue());
        }
        if (this.f30496f != null && this.f30496f.length > 0) {
            for (nzf nzf : this.f30496f) {
                if (nzf != null) {
                    nyu.m37182b(5, nzf);
                }
            }
        }
        if (this.f30497g != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(6, this.f30497g);
        }
        if (this.f30492b != null && this.f30492b.length > 0) {
            for (nzf nzf2 : this.f30492b) {
                if (nzf2 != null) {
                    nyu.m37182b(7, nzf2);
                }
            }
        }
        if (this.f30495e != null) {
            nyu.m37182b(9, this.f30495e);
        }
        if (this.f30498h != null && this.f30498h.length > 0) {
            while (i < this.f30498h.length) {
                nyu.m37168a(10, this.f30498h[i]);
                i++;
            }
        }
        super.a(nyu);
    }

    protected int m36149b() {
        int i;
        int i2 = 0;
        int b = super.b();
        if (this.f30491a != null) {
            b += nyu.m37137b(1, this.f30491a);
        }
        if (this.f30493c != null) {
            b += nyu.m37148f(2, this.f30493c.longValue());
        }
        if (this.f30494d != null) {
            b += nyu.m37148f(3, this.f30494d.longValue());
        }
        if (this.f30496f != null && this.f30496f.length > 0) {
            i = b;
            for (nzf nzf : this.f30496f) {
                if (nzf != null) {
                    i += nyu.m37145d(5, nzf);
                }
            }
            b = i;
        }
        if (this.f30497g != nzf.UNSET_ENUM_VALUE) {
            b += nyu.m37147f(6, this.f30497g);
        }
        if (this.f30492b != null && this.f30492b.length > 0) {
            i = b;
            for (nzf nzf2 : this.f30492b) {
                if (nzf2 != null) {
                    i += nyu.m37145d(7, nzf2);
                }
            }
            b = i;
        }
        if (this.f30495e != null) {
            b += nyu.m37145d(9, this.f30495e);
        }
        if (this.f30498h == null || this.f30498h.length <= 0) {
            return b;
        }
        i = 0;
        while (i2 < this.f30498h.length) {
            i += nyu.m37150g(this.f30498h[i2]);
            i2++;
        }
        return (b + i) + (this.f30498h.length * 1);
    }

    private nqi m36146b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f30491a = nyt.m37117j();
                    continue;
                case 16:
                    this.f30493c = Long.valueOf(nyt.m37110e());
                    continue;
                case wi.dA /*24*/:
                    this.f30494d = Long.valueOf(nyt.m37110e());
                    continue;
                case 42:
                    b = nzl.m37265b(nyt, 42);
                    if (this.f30496f == null) {
                        a = 0;
                    } else {
                        a = this.f30496f.length;
                    }
                    obj = new nqj[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f30496f, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nqj();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new nqj();
                    nyt.m37101a(obj[a]);
                    this.f30496f = obj;
                    continue;
                case 48:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f30497g = a;
                            break;
                        default:
                            continue;
                    }
                case 58:
                    b = nzl.m37265b(nyt, 58);
                    if (this.f30492b == null) {
                        a = 0;
                    } else {
                        a = this.f30492b.length;
                    }
                    obj = new nta[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f30492b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nta();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new nta();
                    nyt.m37101a(obj[a]);
                    this.f30492b = obj;
                    continue;
                case 74:
                    if (this.f30495e == null) {
                        this.f30495e = new nrz();
                    }
                    nyt.m37101a(this.f30495e);
                    continue;
                case 80:
                    b = nzl.m37265b(nyt, 80);
                    a = this.f30498h == null ? 0 : this.f30498h.length;
                    obj = new int[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f30498h, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.m37112f();
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = nyt.m37112f();
                    this.f30498h = obj;
                    continue;
                case 82:
                    int d = nyt.m37108d(nyt.m37125r());
                    b = nyt.m37128u();
                    a = 0;
                    while (nyt.m37126s() > 0) {
                        nyt.m37112f();
                        a++;
                    }
                    nyt.m37113f(b);
                    b = this.f30498h == null ? 0 : this.f30498h.length;
                    Object obj2 = new int[(a + b)];
                    if (b != 0) {
                        System.arraycopy(this.f30498h, 0, obj2, 0, b);
                    }
                    while (b < obj2.length) {
                        obj2[b] = nyt.m37112f();
                        b++;
                    }
                    this.f30498h = obj2;
                    nyt.m37111e(d);
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
