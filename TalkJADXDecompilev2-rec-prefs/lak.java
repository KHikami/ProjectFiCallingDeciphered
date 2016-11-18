package p000;

public final class lak extends nyx<lak> {
    public Integer f24358a;
    public Long f24359b;
    public Long f24360c;
    public oap[] f24361d;
    public Integer f24362e;
    public oax[] f24363f;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28362b(nyt);
    }

    public lak() {
        m28363d();
    }

    private lak m28363d() {
        this.f24359b = null;
        this.f24360c = null;
        this.f24361d = oap.b;
        this.f24362e = null;
        this.f24363f = oax.d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        if (this.f24358a != null) {
            nyu.a(1, this.f24358a.intValue());
        }
        if (this.f24359b != null) {
            nyu.b(2, this.f24359b.longValue());
        }
        if (this.f24360c != null) {
            nyu.b(3, this.f24360c.longValue());
        }
        if (this.f24361d != null && this.f24361d.length > 0) {
            for (nzf nzf : this.f24361d) {
                if (nzf != null) {
                    nyu.b(4, nzf);
                }
            }
        }
        if (this.f24362e != null) {
            nyu.a(5, this.f24362e.intValue());
        }
        if (this.f24363f != null && this.f24363f.length > 0) {
            while (i < this.f24363f.length) {
                nzf nzf2 = this.f24363f[i];
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
        if (this.f24358a != null) {
            b += nyu.f(1, this.f24358a.intValue());
        }
        if (this.f24359b != null) {
            b += nyu.f(2, this.f24359b.longValue());
        }
        if (this.f24360c != null) {
            b += nyu.f(3, this.f24360c.longValue());
        }
        if (this.f24361d != null && this.f24361d.length > 0) {
            int i2 = b;
            for (nzf nzf : this.f24361d) {
                if (nzf != null) {
                    i2 += nyu.d(4, nzf);
                }
            }
            b = i2;
        }
        if (this.f24362e != null) {
            b += nyu.f(5, this.f24362e.intValue());
        }
        if (this.f24363f != null && this.f24363f.length > 0) {
            while (i < this.f24363f.length) {
                nzf nzf2 = this.f24363f[i];
                if (nzf2 != null) {
                    b += nyu.d(6, nzf2);
                }
                i++;
            }
        }
        return b;
    }

    private lak m28362b(nyt nyt) {
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
                            this.f24358a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 16:
                    this.f24359b = Long.valueOf(nyt.e());
                    continue;
                case wi.dA /*24*/:
                    this.f24360c = Long.valueOf(nyt.e());
                    continue;
                case 34:
                    b = nzl.b(nyt, 34);
                    if (this.f24361d == null) {
                        a = 0;
                    } else {
                        a = this.f24361d.length;
                    }
                    obj = new oap[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f24361d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new oap();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new oap();
                    nyt.a(obj[a]);
                    this.f24361d = obj;
                    continue;
                case 40:
                    this.f24362e = Integer.valueOf(nyt.f());
                    continue;
                case 50:
                    b = nzl.b(nyt, 50);
                    if (this.f24363f == null) {
                        a = 0;
                    } else {
                        a = this.f24363f.length;
                    }
                    obj = new oax[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f24363f, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new oax();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new oax();
                    nyt.a(obj[a]);
                    this.f24363f = obj;
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
