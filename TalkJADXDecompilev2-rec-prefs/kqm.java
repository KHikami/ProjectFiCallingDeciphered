package p000;

public final class kqm extends nyx<kqm> {
    public kqd f22774a;
    public kql[] f22775b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27070b(nyt);
    }

    public kqm() {
        m27071d();
    }

    private kqm m27071d() {
        this.f22774a = null;
        this.f22775b = kql.m27065d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22774a != null) {
            nyu.b(1, this.f22774a);
        }
        if (this.f22775b != null && this.f22775b.length > 0) {
            for (nzf nzf : this.f22775b) {
                if (nzf != null) {
                    nyu.b(2, nzf);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22774a != null) {
            b += nyu.d(1, this.f22774a);
        }
        if (this.f22775b == null || this.f22775b.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f22775b) {
            if (nzf != null) {
                i += nyu.d(2, nzf);
            }
        }
        return i;
    }

    private kqm m27070b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f22774a == null) {
                        this.f22774a = new kqd();
                    }
                    nyt.a(this.f22774a);
                    continue;
                case wi.dH /*18*/:
                    int b = nzl.b(nyt, 18);
                    if (this.f22775b == null) {
                        a = 0;
                    } else {
                        a = this.f22775b.length;
                    }
                    Object obj = new kql[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f22775b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kql();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kql();
                    nyt.a(obj[a]);
                    this.f22775b = obj;
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
