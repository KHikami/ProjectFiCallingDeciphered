package defpackage;

public final class ggb extends nzf {
    public gga[] a;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public ggb() {
        d();
    }

    private ggb d() {
        this.a = gga.d();
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null && this.a.length > 0) {
            for (nzf nzf : this.a) {
                if (nzf != null) {
                    nyu.b(1, nzf);
                }
            }
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null && this.a.length > 0) {
            for (nzf nzf : this.a) {
                if (nzf != null) {
                    b += nyu.d(1, nzf);
                }
            }
        }
        return b;
    }

    private ggb b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.b(nyt, 10);
                    if (this.a == null) {
                        a = 0;
                    } else {
                        a = this.a.length;
                    }
                    Object obj = new gga[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new gga();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new gga();
                    nyt.a(obj[a]);
                    this.a = obj;
                    continue;
                default:
                    if (!nyt.b(a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
