package p000;

public final class mcq extends nyx<mcq> {
    public String f27353a;
    public mcp[] f27354b;
    public Integer f27355c;
    public Integer f27356d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31748b(nyt);
    }

    public mcq() {
        m31749d();
    }

    private mcq m31749d() {
        this.f27353a = null;
        this.f27354b = mcp.m31743d();
        this.f27355c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f27353a != null) {
            nyu.a(1, this.f27353a);
        }
        if (this.f27354b != null && this.f27354b.length > 0) {
            for (nzf nzf : this.f27354b) {
                if (nzf != null) {
                    nyu.b(2, nzf);
                }
            }
        }
        if (this.f27355c != null) {
            nyu.c(3, this.f27355c.intValue());
        }
        if (this.f27356d != null) {
            nyu.a(4, this.f27356d.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f27353a != null) {
            b += nyu.b(1, this.f27353a);
        }
        if (this.f27354b != null && this.f27354b.length > 0) {
            int i = b;
            for (nzf nzf : this.f27354b) {
                if (nzf != null) {
                    i += nyu.d(2, nzf);
                }
            }
            b = i;
        }
        if (this.f27355c != null) {
            b += nyu.g(3, this.f27355c.intValue());
        }
        if (this.f27356d != null) {
            return b + nyu.f(4, this.f27356d.intValue());
        }
        return b;
    }

    private mcq m31748b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f27353a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    int b = nzl.b(nyt, 18);
                    if (this.f27354b == null) {
                        a = 0;
                    } else {
                        a = this.f27354b.length;
                    }
                    Object obj = new mcp[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f27354b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new mcp();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new mcp();
                    nyt.a(obj[a]);
                    this.f27354b = obj;
                    continue;
                case wi.dA /*24*/:
                    this.f27355c = Integer.valueOf(nyt.l());
                    continue;
                case 32:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.f27356d = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
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
