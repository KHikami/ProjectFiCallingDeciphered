package p000;

public final class mak extends nyx<mak> {
    public mab f27113a;
    public lzj f27114b;
    public mab[] f27115c;
    public luq responseHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31434b(nyt);
    }

    public mak() {
        m31435d();
    }

    private mak m31435d() {
        this.responseHeader = null;
        this.f27113a = null;
        this.f27114b = null;
        this.f27115c = mab.m31388d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.responseHeader != null) {
            nyu.b(1, this.responseHeader);
        }
        if (this.f27113a != null) {
            nyu.b(2, this.f27113a);
        }
        if (this.f27114b != null) {
            nyu.b(3, this.f27114b);
        }
        if (this.f27115c != null && this.f27115c.length > 0) {
            for (nzf nzf : this.f27115c) {
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
        if (this.f27113a != null) {
            b += nyu.d(2, this.f27113a);
        }
        if (this.f27114b != null) {
            b += nyu.d(3, this.f27114b);
        }
        if (this.f27115c == null || this.f27115c.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f27115c) {
            if (nzf != null) {
                i += nyu.d(4, nzf);
            }
        }
        return i;
    }

    private mak m31434b(nyt nyt) {
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
                    if (this.f27113a == null) {
                        this.f27113a = new mab();
                    }
                    nyt.a(this.f27113a);
                    continue;
                case wi.dx /*26*/:
                    if (this.f27114b == null) {
                        this.f27114b = new lzj();
                    }
                    nyt.a(this.f27114b);
                    continue;
                case 34:
                    int b = nzl.b(nyt, 34);
                    if (this.f27115c == null) {
                        a = 0;
                    } else {
                        a = this.f27115c.length;
                    }
                    Object obj = new mab[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f27115c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new mab();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new mab();
                    nyt.a(obj[a]);
                    this.f27115c = obj;
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
