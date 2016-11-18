package p000;

public final class nqe extends nyx<nqe> {
    public nst f30479a;
    public String f30480b;
    public nco f30481c;
    public nco[] f30482d;
    public nco[] f30483e;

    public /* synthetic */ nzf m36130a(nyt nyt) {
        return m36129b(nyt);
    }

    public nqe() {
        this.f30480b = null;
        this.f30482d = nco.m34330d();
        this.f30483e = nco.m34330d();
        this.cachedSize = -1;
    }

    public void m36131a(nyu nyu) {
        int i = 0;
        if (this.f30479a != null) {
            nyu.m37182b(1, this.f30479a);
        }
        if (this.f30480b != null) {
            nyu.m37170a(2, this.f30480b);
        }
        if (this.f30481c != null) {
            nyu.m37182b(3, this.f30481c);
        }
        if (this.f30482d != null && this.f30482d.length > 0) {
            for (nzf nzf : this.f30482d) {
                if (nzf != null) {
                    nyu.m37182b(5, nzf);
                }
            }
        }
        if (this.f30483e != null && this.f30483e.length > 0) {
            while (i < this.f30483e.length) {
                nzf nzf2 = this.f30483e[i];
                if (nzf2 != null) {
                    nyu.m37182b(6, nzf2);
                }
                i++;
            }
        }
        super.a(nyu);
    }

    protected int m36132b() {
        int i = 0;
        int b = super.b();
        if (this.f30479a != null) {
            b += nyu.m37145d(1, this.f30479a);
        }
        if (this.f30480b != null) {
            b += nyu.m37137b(2, this.f30480b);
        }
        if (this.f30481c != null) {
            b += nyu.m37145d(3, this.f30481c);
        }
        if (this.f30482d != null && this.f30482d.length > 0) {
            int i2 = b;
            for (nzf nzf : this.f30482d) {
                if (nzf != null) {
                    i2 += nyu.m37145d(5, nzf);
                }
            }
            b = i2;
        }
        if (this.f30483e != null && this.f30483e.length > 0) {
            while (i < this.f30483e.length) {
                nzf nzf2 = this.f30483e[i];
                if (nzf2 != null) {
                    b += nyu.m37145d(6, nzf2);
                }
                i++;
            }
        }
        return b;
    }

    private nqe m36129b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f30479a == null) {
                        this.f30479a = new nst();
                    }
                    nyt.m37101a(this.f30479a);
                    continue;
                case wi.dH /*18*/:
                    this.f30480b = nyt.m37117j();
                    continue;
                case wi.dx /*26*/:
                    if (this.f30481c == null) {
                        this.f30481c = new nco();
                    }
                    nyt.m37101a(this.f30481c);
                    continue;
                case 42:
                    b = nzl.m37265b(nyt, 42);
                    if (this.f30482d == null) {
                        a = 0;
                    } else {
                        a = this.f30482d.length;
                    }
                    obj = new nco[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f30482d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nco();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new nco();
                    nyt.m37101a(obj[a]);
                    this.f30482d = obj;
                    continue;
                case 50:
                    b = nzl.m37265b(nyt, 50);
                    if (this.f30483e == null) {
                        a = 0;
                    } else {
                        a = this.f30483e.length;
                    }
                    obj = new nco[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f30483e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nco();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new nco();
                    nyt.m37101a(obj[a]);
                    this.f30483e = obj;
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
