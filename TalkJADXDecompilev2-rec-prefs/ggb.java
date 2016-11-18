package p000;

public final class ggb extends nzf {
    public gga[] f15218a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m17603b(nyt);
    }

    public ggb() {
        m17604d();
    }

    private ggb m17604d() {
        this.f15218a = gga.m17598d();
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f15218a != null && this.f15218a.length > 0) {
            for (nzf nzf : this.f15218a) {
                if (nzf != null) {
                    nyu.b(1, nzf);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f15218a != null && this.f15218a.length > 0) {
            for (nzf nzf : this.f15218a) {
                if (nzf != null) {
                    b += nyu.d(1, nzf);
                }
            }
        }
        return b;
    }

    private ggb m17603b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.b(nyt, 10);
                    if (this.f15218a == null) {
                        a = 0;
                    } else {
                        a = this.f15218a.length;
                    }
                    Object obj = new gga[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f15218a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new gga();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new gga();
                    nyt.a(obj[a]);
                    this.f15218a = obj;
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
