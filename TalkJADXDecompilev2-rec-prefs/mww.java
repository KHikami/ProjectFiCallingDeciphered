package p000;

public final class mww extends nyx<mww> {
    public mwx[] f28633a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m33266b(nyt);
    }

    public mww() {
        this.f28633a = mwx.m33271d();
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f28633a != null && this.f28633a.length > 0) {
            for (nzf nzf : this.f28633a) {
                if (nzf != null) {
                    nyu.b(1, nzf);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f28633a != null && this.f28633a.length > 0) {
            for (nzf nzf : this.f28633a) {
                if (nzf != null) {
                    b += nyu.d(1, nzf);
                }
            }
        }
        return b;
    }

    private mww m33266b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.b(nyt, 10);
                    if (this.f28633a == null) {
                        a = 0;
                    } else {
                        a = this.f28633a.length;
                    }
                    Object obj = new mwx[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f28633a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new mwx();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new mwx();
                    nyt.a(obj[a]);
                    this.f28633a = obj;
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
