package p000;

public final class lyb extends nyx<lyb> {
    public lya f26848a;
    public lzj f26849b;
    public lya[] f26850c;
    public lup requestHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31101b(nyt);
    }

    public lyb() {
        m31102d();
    }

    private lyb m31102d() {
        this.requestHeader = null;
        this.f26848a = null;
        this.f26849b = null;
        this.f26850c = lya.m31096d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.requestHeader != null) {
            nyu.b(1, this.requestHeader);
        }
        if (this.f26848a != null) {
            nyu.b(2, this.f26848a);
        }
        if (this.f26849b != null) {
            nyu.b(3, this.f26849b);
        }
        if (this.f26850c != null && this.f26850c.length > 0) {
            for (nzf nzf : this.f26850c) {
                if (nzf != null) {
                    nyu.b(4, nzf);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.requestHeader != null) {
            b += nyu.d(1, this.requestHeader);
        }
        if (this.f26848a != null) {
            b += nyu.d(2, this.f26848a);
        }
        if (this.f26849b != null) {
            b += nyu.d(3, this.f26849b);
        }
        if (this.f26850c == null || this.f26850c.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f26850c) {
            if (nzf != null) {
                i += nyu.d(4, nzf);
            }
        }
        return i;
    }

    private lyb m31101b(nyt nyt) {
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
                    if (this.f26848a == null) {
                        this.f26848a = new lya();
                    }
                    nyt.a(this.f26848a);
                    continue;
                case wi.dx /*26*/:
                    if (this.f26849b == null) {
                        this.f26849b = new lzj();
                    }
                    nyt.a(this.f26849b);
                    continue;
                case 34:
                    int b = nzl.b(nyt, 34);
                    if (this.f26850c == null) {
                        a = 0;
                    } else {
                        a = this.f26850c.length;
                    }
                    Object obj = new lya[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f26850c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lya();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lya();
                    nyt.a(obj[a]);
                    this.f26850c = obj;
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
