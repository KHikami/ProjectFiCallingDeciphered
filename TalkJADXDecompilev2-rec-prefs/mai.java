package p000;

public final class mai extends nyx<mai> {
    public mab f27107a;
    public lzj f27108b;
    public mab[] f27109c;
    public luq responseHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31424b(nyt);
    }

    public mai() {
        m31425d();
    }

    private mai m31425d() {
        this.responseHeader = null;
        this.f27107a = null;
        this.f27108b = null;
        this.f27109c = mab.m31388d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.responseHeader != null) {
            nyu.b(1, this.responseHeader);
        }
        if (this.f27107a != null) {
            nyu.b(2, this.f27107a);
        }
        if (this.f27108b != null) {
            nyu.b(3, this.f27108b);
        }
        if (this.f27109c != null && this.f27109c.length > 0) {
            for (nzf nzf : this.f27109c) {
                if (nzf != null) {
                    nyu.b(4, nzf);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.responseHeader != null) {
            b += nyu.d(1, this.responseHeader);
        }
        if (this.f27107a != null) {
            b += nyu.d(2, this.f27107a);
        }
        if (this.f27108b != null) {
            b += nyu.d(3, this.f27108b);
        }
        if (this.f27109c == null || this.f27109c.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f27109c) {
            if (nzf != null) {
                i += nyu.d(4, nzf);
            }
        }
        return i;
    }

    private mai m31424b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.responseHeader == null) {
                        this.responseHeader = new luq();
                    }
                    nyt.a(this.responseHeader);
                    continue;
                case wi.dH /*18*/:
                    if (this.f27107a == null) {
                        this.f27107a = new mab();
                    }
                    nyt.a(this.f27107a);
                    continue;
                case wi.dx /*26*/:
                    if (this.f27108b == null) {
                        this.f27108b = new lzj();
                    }
                    nyt.a(this.f27108b);
                    continue;
                case 34:
                    int b = nzl.b(nyt, 34);
                    if (this.f27109c == null) {
                        a = 0;
                    } else {
                        a = this.f27109c.length;
                    }
                    Object obj = new mab[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f27109c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new mab();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new mab();
                    nyt.a(obj[a]);
                    this.f27109c = obj;
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
