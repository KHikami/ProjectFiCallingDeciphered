package p000;

public final class mxh extends nyx<mxh> {
    public mxy[] f28678a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m33320b(nyt);
    }

    public mxh() {
        m33321d();
    }

    private mxh m33321d() {
        this.f28678a = mxy.d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f28678a != null && this.f28678a.length > 0) {
            for (nzf nzf : this.f28678a) {
                if (nzf != null) {
                    nyu.b(1, nzf);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f28678a != null && this.f28678a.length > 0) {
            for (nzf nzf : this.f28678a) {
                if (nzf != null) {
                    b += nyu.d(1, nzf);
                }
            }
        }
        return b;
    }

    private mxh m33320b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.b(nyt, 10);
                    if (this.f28678a == null) {
                        a = 0;
                    } else {
                        a = this.f28678a.length;
                    }
                    Object obj = new mxy[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f28678a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new mxy();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new mxy();
                    nyt.a(obj[a]);
                    this.f28678a = obj;
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
