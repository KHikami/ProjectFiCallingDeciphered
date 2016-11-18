package defpackage;

public final class nac extends nyx<nac> {
    public Double a;
    public Double b;
    public Double c;
    public nab[] d;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public nac() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = nab.d();
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a.doubleValue());
        }
        if (this.b != null) {
            nyu.a(2, this.b.doubleValue());
        }
        if (this.c != null) {
            nyu.a(3, this.c.doubleValue());
        }
        if (this.d != null && this.d.length > 0) {
            for (nzf nzf : this.d) {
                if (nzf != null) {
                    nyu.b(4, nzf);
                }
            }
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            this.a.doubleValue();
            b += nyu.h(1) + 8;
        }
        if (this.b != null) {
            this.b.doubleValue();
            b += nyu.h(2) + 8;
        }
        if (this.c != null) {
            this.c.doubleValue();
            b += nyu.h(3) + 8;
        }
        if (this.d == null || this.d.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.d) {
            if (nzf != null) {
                i += nyu.d(4, nzf);
            }
        }
        return i;
    }

    private nac b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 9:
                    this.a = Double.valueOf(nyt.b());
                    continue;
                case wi.dK /*17*/:
                    this.b = Double.valueOf(nyt.b());
                    continue;
                case wi.dz /*25*/:
                    this.c = Double.valueOf(nyt.b());
                    continue;
                case 34:
                    int b = nzl.b(nyt, 34);
                    if (this.d == null) {
                        a = 0;
                    } else {
                        a = this.d.length;
                    }
                    Object obj = new nab[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nab();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new nab();
                    nyt.a(obj[a]);
                    this.d = obj;
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
