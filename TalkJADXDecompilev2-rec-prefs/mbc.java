package p000;

public final class mbc extends nyx<mbc> {
    public mbd[] f27201a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31540b(nyt);
    }

    public mbc() {
        m31541d();
    }

    private mbc m31541d() {
        this.f27201a = mbd.m31546d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f27201a != null && this.f27201a.length > 0) {
            for (nzf nzf : this.f27201a) {
                if (nzf != null) {
                    nyu.b(1, nzf);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f27201a != null && this.f27201a.length > 0) {
            for (nzf nzf : this.f27201a) {
                if (nzf != null) {
                    b += nyu.d(1, nzf);
                }
            }
        }
        return b;
    }

    private mbc m31540b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.b(nyt, 10);
                    if (this.f27201a == null) {
                        a = 0;
                    } else {
                        a = this.f27201a.length;
                    }
                    Object obj = new mbd[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f27201a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new mbd();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new mbd();
                    nyt.a(obj[a]);
                    this.f27201a = obj;
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
