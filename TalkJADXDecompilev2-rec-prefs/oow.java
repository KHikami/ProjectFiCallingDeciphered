package p000;

public final class oow extends nyx<oow> {
    public oqv[] f33500a;
    public Integer f33501b;
    public Integer f33502c;

    public /* synthetic */ nzf m38975a(nyt nyt) {
        return m38973b(nyt);
    }

    public oow() {
        m38974d();
    }

    private oow m38974d() {
        this.f33500a = oqv.m39246d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m38976a(nyu nyu) {
        if (this.f33500a != null && this.f33500a.length > 0) {
            for (nzf nzf : this.f33500a) {
                if (nzf != null) {
                    nyu.m37182b(1, nzf);
                }
            }
        }
        if (this.f33501b != null) {
            nyu.m37168a(2, this.f33501b.intValue());
        }
        if (this.f33502c != null) {
            nyu.m37168a(3, this.f33502c.intValue());
        }
        super.a(nyu);
    }

    protected int m38977b() {
        int b = super.b();
        if (this.f33500a != null && this.f33500a.length > 0) {
            for (nzf nzf : this.f33500a) {
                if (nzf != null) {
                    b += nyu.m37145d(1, nzf);
                }
            }
        }
        if (this.f33501b != null) {
            b += nyu.m37147f(2, this.f33501b.intValue());
        }
        if (this.f33502c != null) {
            return b + nyu.m37147f(3, this.f33502c.intValue());
        }
        return b;
    }

    private oow m38973b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.m37265b(nyt, 10);
                    if (this.f33500a == null) {
                        a = 0;
                    } else {
                        a = this.f33500a.length;
                    }
                    Object obj = new oqv[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f33500a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new oqv();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new oqv();
                    nyt.m37101a(obj[a]);
                    this.f33500a = obj;
                    continue;
                case 16:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                            this.f33501b = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dA /*24*/:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                            this.f33502c = Integer.valueOf(a);
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
