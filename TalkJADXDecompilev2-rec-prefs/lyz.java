package p000;

public final class lyz extends nyx<lyz> {
    public String f26967a;
    public lzj f26968b;
    public String[] f26969c;
    public lup requestHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31224b(nyt);
    }

    public lyz() {
        m31225d();
    }

    private lyz m31225d() {
        this.requestHeader = null;
        this.f26967a = null;
        this.f26968b = null;
        this.f26969c = nzl.f;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.requestHeader != null) {
            nyu.b(1, this.requestHeader);
        }
        if (this.f26967a != null) {
            nyu.a(2, this.f26967a);
        }
        if (this.f26968b != null) {
            nyu.b(3, this.f26968b);
        }
        if (this.f26969c != null && this.f26969c.length > 0) {
            for (String str : this.f26969c) {
                if (str != null) {
                    nyu.a(4, str);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b();
        if (this.requestHeader != null) {
            b += nyu.d(1, this.requestHeader);
        }
        if (this.f26967a != null) {
            b += nyu.b(2, this.f26967a);
        }
        if (this.f26968b != null) {
            b += nyu.d(3, this.f26968b);
        }
        if (this.f26969c == null || this.f26969c.length <= 0) {
            return b;
        }
        int i2 = 0;
        int i3 = 0;
        while (i < this.f26969c.length) {
            String str = this.f26969c[i];
            if (str != null) {
                i3++;
                i2 += nyu.b(str);
            }
            i++;
        }
        return (b + i2) + (i3 * 1);
    }

    private lyz m31224b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.requestHeader == null) {
                        this.requestHeader = new lup();
                    }
                    nyt.a(this.requestHeader);
                    continue;
                case wi.dH /*18*/:
                    this.f26967a = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    if (this.f26968b == null) {
                        this.f26968b = new lzj();
                    }
                    nyt.a(this.f26968b);
                    continue;
                case 34:
                    int b = nzl.b(nyt, 34);
                    a = this.f26969c == null ? 0 : this.f26969c.length;
                    Object obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f26969c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.f26969c = obj;
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
