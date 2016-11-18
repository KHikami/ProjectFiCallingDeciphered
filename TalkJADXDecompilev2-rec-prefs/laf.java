package p000;

public final class laf extends nyx<laf> {
    public int f24344a;
    public Long f24345b;
    public Long f24346c;
    public oao[] f24347d;
    public Integer f24348e;
    public oal[] f24349f;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28340b(nyt);
    }

    public laf() {
        this.f24344a = nzf.UNSET_ENUM_VALUE;
        this.f24345b = null;
        this.f24346c = null;
        this.f24347d = oao.b;
        this.f24348e = null;
        this.f24349f = oal.d();
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        if (this.f24344a != nzf.UNSET_ENUM_VALUE) {
            nyu.a(1, this.f24344a);
        }
        if (this.f24345b != null) {
            nyu.b(2, this.f24345b.longValue());
        }
        if (this.f24346c != null) {
            nyu.b(3, this.f24346c.longValue());
        }
        if (this.f24347d != null && this.f24347d.length > 0) {
            for (nzf nzf : this.f24347d) {
                if (nzf != null) {
                    nyu.b(4, nzf);
                }
            }
        }
        if (this.f24348e != null) {
            nyu.a(5, this.f24348e.intValue());
        }
        if (this.f24349f != null && this.f24349f.length > 0) {
            while (i < this.f24349f.length) {
                nzf nzf2 = this.f24349f[i];
                if (nzf2 != null) {
                    nyu.b(6, nzf2);
                }
                i++;
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b();
        if (this.f24344a != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(1, this.f24344a);
        }
        if (this.f24345b != null) {
            b += nyu.f(2, this.f24345b.longValue());
        }
        if (this.f24346c != null) {
            b += nyu.f(3, this.f24346c.longValue());
        }
        if (this.f24347d != null && this.f24347d.length > 0) {
            int i2 = b;
            for (nzf nzf : this.f24347d) {
                if (nzf != null) {
                    i2 += nyu.d(4, nzf);
                }
            }
            b = i2;
        }
        if (this.f24348e != null) {
            b += nyu.f(5, this.f24348e.intValue());
        }
        if (this.f24349f != null && this.f24349f.length > 0) {
            while (i < this.f24349f.length) {
                nzf nzf2 = this.f24349f[i];
                if (nzf2 != null) {
                    b += nyu.d(6, nzf2);
                }
                i++;
            }
        }
        return b;
    }

    private laf m28340b(nyt nyt) {
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
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                            this.f24344a = a;
                            break;
                        default:
                            continue;
                    }
                case 16:
                    this.f24345b = Long.valueOf(nyt.e());
                    continue;
                case wi.dA /*24*/:
                    this.f24346c = Long.valueOf(nyt.e());
                    continue;
                case 34:
                    b = nzl.b(nyt, 34);
                    if (this.f24347d == null) {
                        a = 0;
                    } else {
                        a = this.f24347d.length;
                    }
                    obj = new oao[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f24347d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new oao();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new oao();
                    nyt.a(obj[a]);
                    this.f24347d = obj;
                    continue;
                case 40:
                    this.f24348e = Integer.valueOf(nyt.f());
                    continue;
                case 50:
                    b = nzl.b(nyt, 50);
                    if (this.f24349f == null) {
                        a = 0;
                    } else {
                        a = this.f24349f.length;
                    }
                    obj = new oal[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f24349f, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new oal();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new oal();
                    nyt.a(obj[a]);
                    this.f24349f = obj;
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
