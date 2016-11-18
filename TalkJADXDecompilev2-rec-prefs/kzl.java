package p000;

public final class kzl extends nyx<kzl> {
    public kwz[] f24250a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28241b(nyt);
    }

    public kzl() {
        this.f24250a = kwz.m27876d();
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f24250a != null && this.f24250a.length > 0) {
            for (nzf nzf : this.f24250a) {
                if (nzf != null) {
                    nyu.b(1, nzf);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24250a != null && this.f24250a.length > 0) {
            for (nzf nzf : this.f24250a) {
                if (nzf != null) {
                    b += nyu.d(1, nzf);
                }
            }
        }
        return b;
    }

    private kzl m28241b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.b(nyt, 10);
                    if (this.f24250a == null) {
                        a = 0;
                    } else {
                        a = this.f24250a.length;
                    }
                    Object obj = new kwz[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f24250a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kwz();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kwz();
                    nyt.a(obj[a]);
                    this.f24250a = obj;
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
