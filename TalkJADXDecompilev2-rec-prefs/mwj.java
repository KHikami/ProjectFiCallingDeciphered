package p000;

public final class mwj extends nyx<mwj> {
    public mwl[] f28592a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m33209b(nyt);
    }

    public mwj() {
        this.f28592a = mwl.m33218d();
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f28592a != null && this.f28592a.length > 0) {
            for (nzf nzf : this.f28592a) {
                if (nzf != null) {
                    nyu.b(1, nzf);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f28592a != null && this.f28592a.length > 0) {
            for (nzf nzf : this.f28592a) {
                if (nzf != null) {
                    b += nyu.d(1, nzf);
                }
            }
        }
        return b;
    }

    private mwj m33209b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.b(nyt, 10);
                    if (this.f28592a == null) {
                        a = 0;
                    } else {
                        a = this.f28592a.length;
                    }
                    Object obj = new mwl[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f28592a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new mwl();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new mwl();
                    nyt.a(obj[a]);
                    this.f28592a = obj;
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
