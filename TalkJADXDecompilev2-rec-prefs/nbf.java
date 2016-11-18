package p000;

public final class nbf extends nyx<nbf> {
    public nbm[] f29422a;
    public nbh[] f29423b;
    public nbl[] f29424c;

    public /* synthetic */ nzf m34165a(nyt nyt) {
        return m34164b(nyt);
    }

    public nbf() {
        this.f29422a = nbm.m34196d();
        this.f29423b = nbh.m34174d();
        this.f29424c = nbl.m34191d();
        this.cachedSize = -1;
    }

    public void m34166a(nyu nyu) {
        int i = 0;
        if (this.f29422a != null && this.f29422a.length > 0) {
            for (nzf nzf : this.f29422a) {
                if (nzf != null) {
                    nyu.m37182b(1, nzf);
                }
            }
        }
        if (this.f29423b != null && this.f29423b.length > 0) {
            for (nzf nzf2 : this.f29423b) {
                if (nzf2 != null) {
                    nyu.m37182b(2, nzf2);
                }
            }
        }
        if (this.f29424c != null && this.f29424c.length > 0) {
            while (i < this.f29424c.length) {
                nzf nzf3 = this.f29424c[i];
                if (nzf3 != null) {
                    nyu.m37182b(3, nzf3);
                }
                i++;
            }
        }
        super.a(nyu);
    }

    protected int m34167b() {
        int i;
        int i2 = 0;
        int b = super.b();
        if (this.f29422a != null && this.f29422a.length > 0) {
            i = b;
            for (nzf nzf : this.f29422a) {
                if (nzf != null) {
                    i += nyu.m37145d(1, nzf);
                }
            }
            b = i;
        }
        if (this.f29423b != null && this.f29423b.length > 0) {
            i = b;
            for (nzf nzf2 : this.f29423b) {
                if (nzf2 != null) {
                    i += nyu.m37145d(2, nzf2);
                }
            }
            b = i;
        }
        if (this.f29424c != null && this.f29424c.length > 0) {
            while (i2 < this.f29424c.length) {
                nzf nzf3 = this.f29424c[i2];
                if (nzf3 != null) {
                    b += nyu.m37145d(3, nzf3);
                }
                i2++;
            }
        }
        return b;
    }

    private nbf m34164b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    b = nzl.m37265b(nyt, 10);
                    if (this.f29422a == null) {
                        a = 0;
                    } else {
                        a = this.f29422a.length;
                    }
                    obj = new nbm[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f29422a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nbm();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new nbm();
                    nyt.m37101a(obj[a]);
                    this.f29422a = obj;
                    continue;
                case wi.dH /*18*/:
                    b = nzl.m37265b(nyt, 18);
                    if (this.f29423b == null) {
                        a = 0;
                    } else {
                        a = this.f29423b.length;
                    }
                    obj = new nbh[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f29423b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nbh();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new nbh();
                    nyt.m37101a(obj[a]);
                    this.f29423b = obj;
                    continue;
                case wi.dx /*26*/:
                    b = nzl.m37265b(nyt, 26);
                    if (this.f29424c == null) {
                        a = 0;
                    } else {
                        a = this.f29424c.length;
                    }
                    obj = new nbl[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f29424c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nbl();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new nbl();
                    nyt.m37101a(obj[a]);
                    this.f29424c = obj;
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
