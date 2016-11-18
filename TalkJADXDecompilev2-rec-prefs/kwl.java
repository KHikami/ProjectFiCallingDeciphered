package p000;

public final class kwl extends nyx<kwl> {
    public kxp[] f23776a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27809b(nyt);
    }

    public kwl() {
        this.f23776a = kxp.m27953d();
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f23776a != null && this.f23776a.length > 0) {
            for (nzf nzf : this.f23776a) {
                if (nzf != null) {
                    nyu.b(1, nzf);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f23776a != null && this.f23776a.length > 0) {
            for (nzf nzf : this.f23776a) {
                if (nzf != null) {
                    b += nyu.d(1, nzf);
                }
            }
        }
        return b;
    }

    private kwl m27809b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.b(nyt, 10);
                    if (this.f23776a == null) {
                        a = 0;
                    } else {
                        a = this.f23776a.length;
                    }
                    Object obj = new kxp[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f23776a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kxp();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kxp();
                    nyt.a(obj[a]);
                    this.f23776a = obj;
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
