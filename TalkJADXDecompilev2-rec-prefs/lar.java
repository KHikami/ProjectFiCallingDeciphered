package p000;

public final class lar extends nyx<lar> {
    public String f24410a;
    public String f24411b;
    public Long f24412c;
    public las[] f24413d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28396b(nyt);
    }

    public lar() {
        this.f24410a = null;
        this.f24411b = null;
        this.f24412c = null;
        this.f24413d = las.m28401d();
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f24410a != null) {
            nyu.a(1, this.f24410a);
        }
        if (this.f24411b != null) {
            nyu.a(2, this.f24411b);
        }
        if (this.f24412c != null) {
            nyu.b(3, this.f24412c.longValue());
        }
        if (this.f24413d != null && this.f24413d.length > 0) {
            for (nzf nzf : this.f24413d) {
                if (nzf != null) {
                    nyu.b(4, nzf);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24410a != null) {
            b += nyu.b(1, this.f24410a);
        }
        if (this.f24411b != null) {
            b += nyu.b(2, this.f24411b);
        }
        if (this.f24412c != null) {
            b += nyu.f(3, this.f24412c.longValue());
        }
        if (this.f24413d == null || this.f24413d.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f24413d) {
            if (nzf != null) {
                i += nyu.d(4, nzf);
            }
        }
        return i;
    }

    private lar m28396b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f24410a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f24411b = nyt.j();
                    continue;
                case wi.dA /*24*/:
                    this.f24412c = Long.valueOf(nyt.e());
                    continue;
                case 34:
                    int b = nzl.b(nyt, 34);
                    if (this.f24413d == null) {
                        a = 0;
                    } else {
                        a = this.f24413d.length;
                    }
                    Object obj = new las[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f24413d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new las();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new las();
                    nyt.a(obj[a]);
                    this.f24413d = obj;
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
