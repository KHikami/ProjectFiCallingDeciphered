package p000;

public final class mbq extends nyx<mbq> {
    public Long f27252a;
    public String f27253b;
    public lsh f27254c;
    public mbx[] f27255d;
    public Integer f27256e;
    public Boolean f27257f;
    public Integer f27258g;
    public mbv f27259h;
    public String f27260i;
    public String f27261j;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31614b(nyt);
    }

    public mbq() {
        m31615d();
    }

    private mbq m31615d() {
        this.f27252a = null;
        this.f27253b = null;
        this.f27254c = null;
        this.f27255d = mbx.m31650d();
        this.f27257f = null;
        this.f27259h = null;
        this.f27260i = null;
        this.f27261j = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f27253b != null) {
            nyu.a(1, this.f27253b);
        }
        if (this.f27254c != null) {
            nyu.b(2, this.f27254c);
        }
        if (this.f27256e != null) {
            nyu.a(3, this.f27256e.intValue());
        }
        if (this.f27257f != null) {
            nyu.a(4, this.f27257f.booleanValue());
        }
        if (this.f27258g != null) {
            nyu.a(6, this.f27258g.intValue());
        }
        if (this.f27259h != null) {
            nyu.b(7, this.f27259h);
        }
        if (this.f27252a != null) {
            nyu.b(8, this.f27252a.longValue());
        }
        if (this.f27260i != null) {
            nyu.a(9, this.f27260i);
        }
        if (this.f27255d != null && this.f27255d.length > 0) {
            for (nzf nzf : this.f27255d) {
                if (nzf != null) {
                    nyu.b(11, nzf);
                }
            }
        }
        if (this.f27261j != null) {
            nyu.a(99, this.f27261j);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f27253b != null) {
            b += nyu.b(1, this.f27253b);
        }
        if (this.f27254c != null) {
            b += nyu.d(2, this.f27254c);
        }
        if (this.f27256e != null) {
            b += nyu.f(3, this.f27256e.intValue());
        }
        if (this.f27257f != null) {
            this.f27257f.booleanValue();
            b += nyu.h(4) + 1;
        }
        if (this.f27258g != null) {
            b += nyu.f(6, this.f27258g.intValue());
        }
        if (this.f27259h != null) {
            b += nyu.d(7, this.f27259h);
        }
        if (this.f27252a != null) {
            b += nyu.f(8, this.f27252a.longValue());
        }
        if (this.f27260i != null) {
            b += nyu.b(9, this.f27260i);
        }
        if (this.f27255d != null && this.f27255d.length > 0) {
            int i = b;
            for (nzf nzf : this.f27255d) {
                if (nzf != null) {
                    i += nyu.d(11, nzf);
                }
            }
            b = i;
        }
        if (this.f27261j != null) {
            return b + nyu.b(99, this.f27261j);
        }
        return b;
    }

    private mbq m31614b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f27253b = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    if (this.f27254c == null) {
                        this.f27254c = new lsh();
                    }
                    nyt.a(this.f27254c);
                    continue;
                case wi.dA /*24*/:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            this.f27256e = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 32:
                    this.f27257f = Boolean.valueOf(nyt.i());
                    continue;
                case 48:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                            this.f27258g = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 58:
                    if (this.f27259h == null) {
                        this.f27259h = new mbv();
                    }
                    nyt.a(this.f27259h);
                    continue;
                case 64:
                    this.f27252a = Long.valueOf(nyt.e());
                    continue;
                case 74:
                    this.f27260i = nyt.j();
                    continue;
                case 90:
                    int b = nzl.b(nyt, 90);
                    if (this.f27255d == null) {
                        a = 0;
                    } else {
                        a = this.f27255d.length;
                    }
                    Object obj = new mbx[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f27255d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new mbx();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new mbx();
                    nyt.a(obj[a]);
                    this.f27255d = obj;
                    continue;
                case 794:
                    this.f27261j = nyt.j();
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
