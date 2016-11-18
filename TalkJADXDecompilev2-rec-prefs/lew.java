package p000;

public final class lew extends nyx<lew> {
    public lev[] f24872a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28937b(nyt);
    }

    public lew() {
        this.f24872a = lev.m28933d();
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f24872a != null && this.f24872a.length > 0) {
            for (nzf nzf : this.f24872a) {
                if (nzf != null) {
                    nyu.b(1, nzf);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24872a != null && this.f24872a.length > 0) {
            for (nzf nzf : this.f24872a) {
                if (nzf != null) {
                    b += nyu.d(1, nzf);
                }
            }
        }
        return b;
    }

    private lew m28937b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.b(nyt, 10);
                    if (this.f24872a == null) {
                        a = 0;
                    } else {
                        a = this.f24872a.length;
                    }
                    Object obj = new lev[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f24872a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lev();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lev();
                    nyt.a(obj[a]);
                    this.f24872a = obj;
                    continue;
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
