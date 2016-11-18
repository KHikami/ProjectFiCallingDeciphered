package p000;

public final class mwo extends nyx<mwo> {
    public mwp[] f28608a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m33231b(nyt);
    }

    public mwo() {
        this.f28608a = mwp.m33236d();
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f28608a != null && this.f28608a.length > 0) {
            for (nzf nzf : this.f28608a) {
                if (nzf != null) {
                    nyu.b(1, nzf);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f28608a != null && this.f28608a.length > 0) {
            for (nzf nzf : this.f28608a) {
                if (nzf != null) {
                    b += nyu.d(1, nzf);
                }
            }
        }
        return b;
    }

    private mwo m33231b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.b(nyt, 10);
                    if (this.f28608a == null) {
                        a = 0;
                    } else {
                        a = this.f28608a.length;
                    }
                    Object obj = new mwp[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f28608a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new mwp();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new mwp();
                    nyt.a(obj[a]);
                    this.f28608a = obj;
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
