package p000;

public final class nbu extends nyx<nbu> {
    public nbv[] f29461a;

    public /* synthetic */ nzf m34230a(nyt nyt) {
        return m34228b(nyt);
    }

    public nbu() {
        m34229d();
    }

    private nbu m34229d() {
        this.f29461a = nbv.m34234d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34231a(nyu nyu) {
        if (this.f29461a != null && this.f29461a.length > 0) {
            for (nzf nzf : this.f29461a) {
                if (nzf != null) {
                    nyu.m37182b(1, nzf);
                }
            }
        }
        super.a(nyu);
    }

    protected int m34232b() {
        int b = super.b();
        if (this.f29461a != null && this.f29461a.length > 0) {
            for (nzf nzf : this.f29461a) {
                if (nzf != null) {
                    b += nyu.m37145d(1, nzf);
                }
            }
        }
        return b;
    }

    private nbu m34228b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.m37265b(nyt, 10);
                    if (this.f29461a == null) {
                        a = 0;
                    } else {
                        a = this.f29461a.length;
                    }
                    Object obj = new nbv[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f29461a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nbv();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new nbv();
                    nyt.m37101a(obj[a]);
                    this.f29461a = obj;
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
