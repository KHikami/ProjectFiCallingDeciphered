package p000;

public final class nac extends nyx<nac> {
    public Double f29325a;
    public Double f29326b;
    public Double f29327c;
    public nab[] f29328d;

    public /* synthetic */ nzf m34016a(nyt nyt) {
        return m34015b(nyt);
    }

    public nac() {
        this.f29325a = null;
        this.f29326b = null;
        this.f29327c = null;
        this.f29328d = nab.m34011d();
        this.cachedSize = -1;
    }

    public void m34017a(nyu nyu) {
        if (this.f29325a != null) {
            nyu.m37166a(1, this.f29325a.doubleValue());
        }
        if (this.f29326b != null) {
            nyu.m37166a(2, this.f29326b.doubleValue());
        }
        if (this.f29327c != null) {
            nyu.m37166a(3, this.f29327c.doubleValue());
        }
        if (this.f29328d != null && this.f29328d.length > 0) {
            for (nzf nzf : this.f29328d) {
                if (nzf != null) {
                    nyu.m37182b(4, nzf);
                }
            }
        }
        super.a(nyu);
    }

    protected int m34018b() {
        int b = super.b();
        if (this.f29325a != null) {
            this.f29325a.doubleValue();
            b += nyu.m37154h(1) + 8;
        }
        if (this.f29326b != null) {
            this.f29326b.doubleValue();
            b += nyu.m37154h(2) + 8;
        }
        if (this.f29327c != null) {
            this.f29327c.doubleValue();
            b += nyu.m37154h(3) + 8;
        }
        if (this.f29328d == null || this.f29328d.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f29328d) {
            if (nzf != null) {
                i += nyu.m37145d(4, nzf);
            }
        }
        return i;
    }

    private nac m34015b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 9:
                    this.f29325a = Double.valueOf(nyt.m37104b());
                    continue;
                case wi.dK /*17*/:
                    this.f29326b = Double.valueOf(nyt.m37104b());
                    continue;
                case wi.dz /*25*/:
                    this.f29327c = Double.valueOf(nyt.m37104b());
                    continue;
                case 34:
                    int b = nzl.m37265b(nyt, 34);
                    if (this.f29328d == null) {
                        a = 0;
                    } else {
                        a = this.f29328d.length;
                    }
                    Object obj = new nab[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f29328d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nab();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new nab();
                    nyt.m37101a(obj[a]);
                    this.f29328d = obj;
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
