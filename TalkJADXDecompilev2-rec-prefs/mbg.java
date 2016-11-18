package p000;

public final class mbg extends nyx<mbg> {
    public lzj f27214a;
    public lzn[] f27215b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31562b(nyt);
    }

    public mbg() {
        m31563d();
    }

    private mbg m31563d() {
        this.f27214a = null;
        this.f27215b = lzn.m31300d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f27214a != null) {
            nyu.b(1, this.f27214a);
        }
        if (this.f27215b != null && this.f27215b.length > 0) {
            for (nzf nzf : this.f27215b) {
                if (nzf != null) {
                    nyu.b(2, nzf);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f27214a != null) {
            b += nyu.d(1, this.f27214a);
        }
        if (this.f27215b == null || this.f27215b.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f27215b) {
            if (nzf != null) {
                i += nyu.d(2, nzf);
            }
        }
        return i;
    }

    private mbg m31562b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f27214a == null) {
                        this.f27214a = new lzj();
                    }
                    nyt.a(this.f27214a);
                    continue;
                case wi.dH /*18*/:
                    int b = nzl.b(nyt, 18);
                    if (this.f27215b == null) {
                        a = 0;
                    } else {
                        a = this.f27215b.length;
                    }
                    Object obj = new lzn[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f27215b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lzn();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lzn();
                    nyt.a(obj[a]);
                    this.f27215b = obj;
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
