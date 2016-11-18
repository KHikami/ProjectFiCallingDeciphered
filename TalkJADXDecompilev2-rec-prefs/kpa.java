package p000;

public final class kpa extends nyx<kpa> {
    public kqd f22606a;
    public kri[] f22607b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26868b(nyt);
    }

    public kpa() {
        m26869d();
    }

    private kpa m26869d() {
        this.f22606a = null;
        this.f22607b = kri.m27189d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22606a != null) {
            nyu.b(1, this.f22606a);
        }
        if (this.f22607b != null && this.f22607b.length > 0) {
            for (nzf nzf : this.f22607b) {
                if (nzf != null) {
                    nyu.b(2, nzf);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22606a != null) {
            b += nyu.d(1, this.f22606a);
        }
        if (this.f22607b == null || this.f22607b.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f22607b) {
            if (nzf != null) {
                i += nyu.d(2, nzf);
            }
        }
        return i;
    }

    private kpa m26868b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f22606a == null) {
                        this.f22606a = new kqd();
                    }
                    nyt.a(this.f22606a);
                    continue;
                case wi.dH /*18*/:
                    int b = nzl.b(nyt, 18);
                    if (this.f22607b == null) {
                        a = 0;
                    } else {
                        a = this.f22607b.length;
                    }
                    Object obj = new kri[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f22607b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kri();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kri();
                    nyt.a(obj[a]);
                    this.f22607b = obj;
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
