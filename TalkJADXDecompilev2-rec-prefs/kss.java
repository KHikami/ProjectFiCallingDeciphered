package p000;

public final class kss extends nyx<kss> {
    public String f23147a;
    public kst[] f23148b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27362b(nyt);
    }

    public kss() {
        m27363d();
    }

    private kss m27363d() {
        this.f23147a = null;
        this.f23148b = kst.m27368d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f23147a != null) {
            nyu.a(1, this.f23147a);
        }
        if (this.f23148b != null && this.f23148b.length > 0) {
            for (nzf nzf : this.f23148b) {
                if (nzf != null) {
                    nyu.b(2, nzf);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f23147a != null) {
            b += nyu.b(1, this.f23147a);
        }
        if (this.f23148b == null || this.f23148b.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f23148b) {
            if (nzf != null) {
                i += nyu.d(2, nzf);
            }
        }
        return i;
    }

    private kss m27362b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f23147a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    int b = nzl.b(nyt, 18);
                    if (this.f23148b == null) {
                        a = 0;
                    } else {
                        a = this.f23148b.length;
                    }
                    Object obj = new kst[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f23148b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kst();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kst();
                    nyt.a(obj[a]);
                    this.f23148b = obj;
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
