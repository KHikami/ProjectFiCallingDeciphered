package p000;

public final class kwg extends nyx<kwg> {
    public Integer f23753a;
    public kvl[] f23754b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27787b(nyt);
    }

    public kwg() {
        this.f23753a = null;
        this.f23754b = kvl.m27700d();
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f23753a != null) {
            nyu.a(1, this.f23753a.intValue());
        }
        if (this.f23754b != null && this.f23754b.length > 0) {
            for (nzf nzf : this.f23754b) {
                if (nzf != null) {
                    nyu.b(2, nzf);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f23753a != null) {
            b += nyu.f(1, this.f23753a.intValue());
        }
        if (this.f23754b == null || this.f23754b.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f23754b) {
            if (nzf != null) {
                i += nyu.d(2, nzf);
            }
        }
        return i;
    }

    private kwg m27787b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f23753a = Integer.valueOf(nyt.f());
                    continue;
                case wi.dH /*18*/:
                    int b = nzl.b(nyt, 18);
                    if (this.f23754b == null) {
                        a = 0;
                    } else {
                        a = this.f23754b.length;
                    }
                    Object obj = new kvl[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f23754b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kvl();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kvl();
                    nyt.a(obj[a]);
                    this.f23754b = obj;
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
