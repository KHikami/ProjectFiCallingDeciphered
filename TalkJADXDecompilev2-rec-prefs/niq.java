package p000;

public final class niq extends nyx<niq> {
    public String f29903a;
    public nmm[] f29904b;
    public Long f29905c;
    public Long f29906d;
    public niz f29907e;
    public nir[] f29908f;
    public Integer f29909g;
    public int[] f29910h;

    public /* synthetic */ nzf m35131a(nyt nyt) {
        return m35129b(nyt);
    }

    public niq() {
        m35130d();
    }

    private niq m35130d() {
        this.f29903a = null;
        this.f29904b = nmm.m35651d();
        this.f29905c = null;
        this.f29906d = null;
        this.f29907e = null;
        this.f29908f = nir.m35135d();
        this.f29910h = nzl.f31327a;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35132a(nyu nyu) {
        int i = 0;
        if (this.f29903a != null) {
            nyu.m37170a(1, this.f29903a);
        }
        if (this.f29905c != null) {
            nyu.m37181b(2, this.f29905c.longValue());
        }
        if (this.f29906d != null) {
            nyu.m37181b(3, this.f29906d.longValue());
        }
        if (this.f29908f != null && this.f29908f.length > 0) {
            for (nzf nzf : this.f29908f) {
                if (nzf != null) {
                    nyu.m37182b(5, nzf);
                }
            }
        }
        if (this.f29909g != null) {
            nyu.m37168a(6, this.f29909g.intValue());
        }
        if (this.f29904b != null && this.f29904b.length > 0) {
            for (nzf nzf2 : this.f29904b) {
                if (nzf2 != null) {
                    nyu.m37182b(7, nzf2);
                }
            }
        }
        if (this.f29907e != null) {
            nyu.m37182b(9, this.f29907e);
        }
        if (this.f29910h != null && this.f29910h.length > 0) {
            while (i < this.f29910h.length) {
                nyu.m37168a(10, this.f29910h[i]);
                i++;
            }
        }
        super.a(nyu);
    }

    protected int m35133b() {
        int i;
        int i2 = 0;
        int b = super.b();
        if (this.f29903a != null) {
            b += nyu.m37137b(1, this.f29903a);
        }
        if (this.f29905c != null) {
            b += nyu.m37148f(2, this.f29905c.longValue());
        }
        if (this.f29906d != null) {
            b += nyu.m37148f(3, this.f29906d.longValue());
        }
        if (this.f29908f != null && this.f29908f.length > 0) {
            i = b;
            for (nzf nzf : this.f29908f) {
                if (nzf != null) {
                    i += nyu.m37145d(5, nzf);
                }
            }
            b = i;
        }
        if (this.f29909g != null) {
            b += nyu.m37147f(6, this.f29909g.intValue());
        }
        if (this.f29904b != null && this.f29904b.length > 0) {
            i = b;
            for (nzf nzf2 : this.f29904b) {
                if (nzf2 != null) {
                    i += nyu.m37145d(7, nzf2);
                }
            }
            b = i;
        }
        if (this.f29907e != null) {
            b += nyu.m37145d(9, this.f29907e);
        }
        if (this.f29910h == null || this.f29910h.length <= 0) {
            return b;
        }
        i = 0;
        while (i2 < this.f29910h.length) {
            i += nyu.m37150g(this.f29910h[i2]);
            i2++;
        }
        return (b + i) + (this.f29910h.length * 1);
    }

    private niq m35129b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f29903a = nyt.m37117j();
                    continue;
                case 16:
                    this.f29905c = Long.valueOf(nyt.m37110e());
                    continue;
                case wi.dA /*24*/:
                    this.f29906d = Long.valueOf(nyt.m37110e());
                    continue;
                case 42:
                    b = nzl.m37265b(nyt, 42);
                    if (this.f29908f == null) {
                        a = 0;
                    } else {
                        a = this.f29908f.length;
                    }
                    obj = new nir[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f29908f, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nir();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new nir();
                    nyt.m37101a(obj[a]);
                    this.f29908f = obj;
                    continue;
                case 48:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f29909g = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 58:
                    b = nzl.m37265b(nyt, 58);
                    if (this.f29904b == null) {
                        a = 0;
                    } else {
                        a = this.f29904b.length;
                    }
                    obj = new nmm[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f29904b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nmm();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new nmm();
                    nyt.m37101a(obj[a]);
                    this.f29904b = obj;
                    continue;
                case 74:
                    if (this.f29907e == null) {
                        this.f29907e = new niz();
                    }
                    nyt.m37101a(this.f29907e);
                    continue;
                case 80:
                    b = nzl.m37265b(nyt, 80);
                    a = this.f29910h == null ? 0 : this.f29910h.length;
                    obj = new int[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f29910h, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.m37112f();
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = nyt.m37112f();
                    this.f29910h = obj;
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
                    b = this.f29910h == null ? 0 : this.f29910h.length;
                    Object obj2 = new int[(a + b)];
                    if (b != 0) {
                        System.arraycopy(this.f29910h, 0, obj2, 0, b);
                    }
                    while (b < obj2.length) {
                        obj2[b] = nyt.m37112f();
                        b++;
                    }
                    this.f29910h = obj2;
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
