package p000;

public final class ltt extends nyx<ltt> {
    public lts[] f26411a;
    public loa[] f26412b;
    public Integer f26413c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30503b(nyt);
    }

    public ltt() {
        m30504d();
    }

    private ltt m30504d() {
        this.f26411a = lts.m30498d();
        this.f26412b = loa.m29701d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        if (this.f26411a != null && this.f26411a.length > 0) {
            for (nzf nzf : this.f26411a) {
                if (nzf != null) {
                    nyu.b(1, nzf);
                }
            }
        }
        if (this.f26412b != null && this.f26412b.length > 0) {
            while (i < this.f26412b.length) {
                nzf nzf2 = this.f26412b[i];
                if (nzf2 != null) {
                    nyu.b(2, nzf2);
                }
                i++;
            }
        }
        if (this.f26413c != null) {
            nyu.a(3, this.f26413c.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b();
        if (this.f26411a != null && this.f26411a.length > 0) {
            int i2 = b;
            for (nzf nzf : this.f26411a) {
                if (nzf != null) {
                    i2 += nyu.d(1, nzf);
                }
            }
            b = i2;
        }
        if (this.f26412b != null && this.f26412b.length > 0) {
            while (i < this.f26412b.length) {
                nzf nzf2 = this.f26412b[i];
                if (nzf2 != null) {
                    b += nyu.d(2, nzf2);
                }
                i++;
            }
        }
        if (this.f26413c != null) {
            return b + nyu.f(3, this.f26413c.intValue());
        }
        return b;
    }

    private ltt m30503b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    b = nzl.b(nyt, 10);
                    if (this.f26411a == null) {
                        a = 0;
                    } else {
                        a = this.f26411a.length;
                    }
                    obj = new lts[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f26411a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lts();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lts();
                    nyt.a(obj[a]);
                    this.f26411a = obj;
                    continue;
                case wi.dH /*18*/:
                    b = nzl.b(nyt, 18);
                    if (this.f26412b == null) {
                        a = 0;
                    } else {
                        a = this.f26412b.length;
                    }
                    obj = new loa[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f26412b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new loa();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new loa();
                    nyt.a(obj[a]);
                    this.f26412b = obj;
                    continue;
                case wi.dA /*24*/:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f26413c = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
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
