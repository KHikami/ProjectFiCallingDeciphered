package p000;

public final class mzb extends nyx<mzb> {
    public myu[] f29211a;
    public myu[] f29212b;

    public /* synthetic */ nzf m33903a(nyt nyt) {
        return m33901b(nyt);
    }

    public mzb() {
        m33902d();
    }

    private mzb m33902d() {
        this.f29211a = myu.m33864d();
        this.f29212b = myu.m33864d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m33904a(nyu nyu) {
        int i = 0;
        if (this.f29211a != null && this.f29211a.length > 0) {
            for (nzf nzf : this.f29211a) {
                if (nzf != null) {
                    nyu.m37182b(1, nzf);
                }
            }
        }
        if (this.f29212b != null && this.f29212b.length > 0) {
            while (i < this.f29212b.length) {
                nzf nzf2 = this.f29212b[i];
                if (nzf2 != null) {
                    nyu.m37182b(2, nzf2);
                }
                i++;
            }
        }
        super.a(nyu);
    }

    protected int m33905b() {
        int i = 0;
        int b = super.b();
        if (this.f29211a != null && this.f29211a.length > 0) {
            int i2 = b;
            for (nzf nzf : this.f29211a) {
                if (nzf != null) {
                    i2 += nyu.m37145d(1, nzf);
                }
            }
            b = i2;
        }
        if (this.f29212b != null && this.f29212b.length > 0) {
            while (i < this.f29212b.length) {
                nzf nzf2 = this.f29212b[i];
                if (nzf2 != null) {
                    b += nyu.m37145d(2, nzf2);
                }
                i++;
            }
        }
        return b;
    }

    private mzb m33901b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    b = nzl.m37265b(nyt, 10);
                    if (this.f29211a == null) {
                        a = 0;
                    } else {
                        a = this.f29211a.length;
                    }
                    obj = new myu[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f29211a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new myu();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new myu();
                    nyt.m37101a(obj[a]);
                    this.f29211a = obj;
                    continue;
                case wi.dH /*18*/:
                    b = nzl.m37265b(nyt, 18);
                    if (this.f29212b == null) {
                        a = 0;
                    } else {
                        a = this.f29212b.length;
                    }
                    obj = new myu[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f29212b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new myu();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new myu();
                    nyt.m37101a(obj[a]);
                    this.f29212b = obj;
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
