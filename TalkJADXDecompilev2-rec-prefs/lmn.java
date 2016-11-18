package p000;

public final class lmn extends nyx<lmn> {
    public lmo[] f25588a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29509b(nyt);
    }

    public lmn() {
        this.f25588a = lmo.m29514d();
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f25588a != null && this.f25588a.length > 0) {
            for (nzf nzf : this.f25588a) {
                if (nzf != null) {
                    nyu.b(1, nzf);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f25588a != null && this.f25588a.length > 0) {
            for (nzf nzf : this.f25588a) {
                if (nzf != null) {
                    b += nyu.d(1, nzf);
                }
            }
        }
        return b;
    }

    private lmn m29509b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.b(nyt, 10);
                    if (this.f25588a == null) {
                        a = 0;
                    } else {
                        a = this.f25588a.length;
                    }
                    Object obj = new lmo[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f25588a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lmo();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lmo();
                    nyt.a(obj[a]);
                    this.f25588a = obj;
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
