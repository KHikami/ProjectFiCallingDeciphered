package p000;

public final class lbd extends nyx<lbd> {
    public ldm f24460a;
    public lbe f24461b;
    public ldm[] f24462c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28446b(nyt);
    }

    public lbd() {
        m28447d();
    }

    private lbd m28447d() {
        this.f24460a = null;
        this.f24461b = null;
        this.f24462c = ldm.m28752d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f24460a != null) {
            nyu.b(1, this.f24460a);
        }
        if (this.f24461b != null) {
            nyu.b(2, this.f24461b);
        }
        if (this.f24462c != null && this.f24462c.length > 0) {
            for (nzf nzf : this.f24462c) {
                if (nzf != null) {
                    nyu.b(3, nzf);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24460a != null) {
            b += nyu.d(1, this.f24460a);
        }
        if (this.f24461b != null) {
            b += nyu.d(2, this.f24461b);
        }
        if (this.f24462c == null || this.f24462c.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f24462c) {
            if (nzf != null) {
                i += nyu.d(3, nzf);
            }
        }
        return i;
    }

    private lbd m28446b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f24460a == null) {
                        this.f24460a = new ldm();
                    }
                    nyt.a(this.f24460a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f24461b == null) {
                        this.f24461b = new lbe();
                    }
                    nyt.a(this.f24461b);
                    continue;
                case wi.dx /*26*/:
                    int b = nzl.b(nyt, 26);
                    if (this.f24462c == null) {
                        a = 0;
                    } else {
                        a = this.f24462c.length;
                    }
                    Object obj = new ldm[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f24462c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ldm();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new ldm();
                    nyt.a(obj[a]);
                    this.f24462c = obj;
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
