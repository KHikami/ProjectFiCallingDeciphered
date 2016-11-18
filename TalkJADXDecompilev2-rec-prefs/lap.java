package p000;

public final class lap extends nyx<lap> {
    public String f24403a;
    public String f24404b;
    public Long f24405c;
    public laq[] f24406d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28385b(nyt);
    }

    public lap() {
        m28386d();
    }

    private lap m28386d() {
        this.f24403a = null;
        this.f24404b = null;
        this.f24405c = null;
        this.f24406d = laq.m28391d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f24403a != null) {
            nyu.a(1, this.f24403a);
        }
        if (this.f24404b != null) {
            nyu.a(2, this.f24404b);
        }
        if (this.f24405c != null) {
            nyu.b(3, this.f24405c.longValue());
        }
        if (this.f24406d != null && this.f24406d.length > 0) {
            for (nzf nzf : this.f24406d) {
                if (nzf != null) {
                    nyu.b(4, nzf);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24403a != null) {
            b += nyu.b(1, this.f24403a);
        }
        if (this.f24404b != null) {
            b += nyu.b(2, this.f24404b);
        }
        if (this.f24405c != null) {
            b += nyu.f(3, this.f24405c.longValue());
        }
        if (this.f24406d == null || this.f24406d.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f24406d) {
            if (nzf != null) {
                i += nyu.d(4, nzf);
            }
        }
        return i;
    }

    private lap m28385b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f24403a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f24404b = nyt.j();
                    continue;
                case wi.dA /*24*/:
                    this.f24405c = Long.valueOf(nyt.e());
                    continue;
                case 34:
                    int b = nzl.b(nyt, 34);
                    if (this.f24406d == null) {
                        a = 0;
                    } else {
                        a = this.f24406d.length;
                    }
                    Object obj = new laq[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f24406d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new laq();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new laq();
                    nyt.a(obj[a]);
                    this.f24406d = obj;
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
