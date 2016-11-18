package p000;

public final class oni extends nyx<oni> {
    public int f33303a;
    public int f33304b;
    public Long f33305c;
    public ooo[] f33306d;
    public ooj[] f33307e;
    public oon f33308f;

    public /* synthetic */ nzf m38799a(nyt nyt) {
        return m38798b(nyt);
    }

    public oni() {
        this.f33303a = nzf.UNSET_ENUM_VALUE;
        this.f33304b = nzf.UNSET_ENUM_VALUE;
        this.f33305c = null;
        this.f33306d = ooo.m38932d();
        this.f33307e = ooj.m38910d();
        this.cachedSize = -1;
    }

    public void m38800a(nyu nyu) {
        int i = 0;
        if (this.f33303a != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(1, this.f33303a);
        }
        if (this.f33304b != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(2, this.f33304b);
        }
        if (this.f33305c != null) {
            nyu.m37181b(3, this.f33305c.longValue());
        }
        if (this.f33306d != null && this.f33306d.length > 0) {
            for (nzf nzf : this.f33306d) {
                if (nzf != null) {
                    nyu.m37182b(4, nzf);
                }
            }
        }
        if (this.f33307e != null && this.f33307e.length > 0) {
            while (i < this.f33307e.length) {
                nzf nzf2 = this.f33307e[i];
                if (nzf2 != null) {
                    nyu.m37182b(5, nzf2);
                }
                i++;
            }
        }
        if (this.f33308f != null) {
            nyu.m37182b(6, this.f33308f);
        }
        super.a(nyu);
    }

    protected int m38801b() {
        int i = 0;
        int b = super.b();
        if (this.f33303a != nzf.UNSET_ENUM_VALUE) {
            b += nyu.m37147f(1, this.f33303a);
        }
        if (this.f33304b != nzf.UNSET_ENUM_VALUE) {
            b += nyu.m37147f(2, this.f33304b);
        }
        if (this.f33305c != null) {
            b += nyu.m37148f(3, this.f33305c.longValue());
        }
        if (this.f33306d != null && this.f33306d.length > 0) {
            int i2 = b;
            for (nzf nzf : this.f33306d) {
                if (nzf != null) {
                    i2 += nyu.m37145d(4, nzf);
                }
            }
            b = i2;
        }
        if (this.f33307e != null && this.f33307e.length > 0) {
            while (i < this.f33307e.length) {
                nzf nzf2 = this.f33307e[i];
                if (nzf2 != null) {
                    b += nyu.m37145d(5, nzf2);
                }
                i++;
            }
        }
        if (this.f33308f != null) {
            return b + nyu.m37145d(6, this.f33308f);
        }
        return b;
    }

    private oni m38798b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f33303a = a;
                            break;
                        default:
                            continue;
                    }
                case 16:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f33304b = a;
                            break;
                        default:
                            continue;
                    }
                case wi.dA /*24*/:
                    this.f33305c = Long.valueOf(nyt.m37110e());
                    continue;
                case 34:
                    b = nzl.m37265b(nyt, 34);
                    if (this.f33306d == null) {
                        a = 0;
                    } else {
                        a = this.f33306d.length;
                    }
                    obj = new ooo[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f33306d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ooo();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new ooo();
                    nyt.m37101a(obj[a]);
                    this.f33306d = obj;
                    continue;
                case 42:
                    b = nzl.m37265b(nyt, 42);
                    if (this.f33307e == null) {
                        a = 0;
                    } else {
                        a = this.f33307e.length;
                    }
                    obj = new ooj[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f33307e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ooj();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new ooj();
                    nyt.m37101a(obj[a]);
                    this.f33307e = obj;
                    continue;
                case 50:
                    if (this.f33308f == null) {
                        this.f33308f = new oon();
                    }
                    nyt.m37101a(this.f33308f);
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
