package p000;

public final class lca extends nyx<lca> {
    public String f24544a;
    public ldm[] f24545b;
    public ofb f24546c;
    public Long f24547d;
    public String f24548e;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28560b(nyt);
    }

    public lca() {
        m28561d();
    }

    private lca m28561d() {
        this.f24544a = null;
        this.f24545b = ldm.m28752d();
        this.f24546c = null;
        this.f24547d = null;
        this.f24548e = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f24544a != null) {
            nyu.a(1, this.f24544a);
        }
        if (this.f24545b != null && this.f24545b.length > 0) {
            for (nzf nzf : this.f24545b) {
                if (nzf != null) {
                    nyu.b(2, nzf);
                }
            }
        }
        if (this.f24546c != null) {
            nyu.b(3, this.f24546c);
        }
        if (this.f24547d != null) {
            nyu.b(4, this.f24547d.longValue());
        }
        if (this.f24548e != null) {
            nyu.a(5, this.f24548e);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24544a != null) {
            b += nyu.b(1, this.f24544a);
        }
        if (this.f24545b != null && this.f24545b.length > 0) {
            int i = b;
            for (nzf nzf : this.f24545b) {
                if (nzf != null) {
                    i += nyu.d(2, nzf);
                }
            }
            b = i;
        }
        if (this.f24546c != null) {
            b += nyu.d(3, this.f24546c);
        }
        if (this.f24547d != null) {
            b += nyu.f(4, this.f24547d.longValue());
        }
        if (this.f24548e != null) {
            return b + nyu.b(5, this.f24548e);
        }
        return b;
    }

    private lca m28560b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f24544a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    int b = nzl.b(nyt, 18);
                    if (this.f24545b == null) {
                        a = 0;
                    } else {
                        a = this.f24545b.length;
                    }
                    Object obj = new ldm[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f24545b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ldm();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new ldm();
                    nyt.a(obj[a]);
                    this.f24545b = obj;
                    continue;
                case wi.dx /*26*/:
                    if (this.f24546c == null) {
                        this.f24546c = new ofb();
                    }
                    nyt.a(this.f24546c);
                    continue;
                case 32:
                    this.f24547d = Long.valueOf(nyt.e());
                    continue;
                case 42:
                    this.f24548e = nyt.j();
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
