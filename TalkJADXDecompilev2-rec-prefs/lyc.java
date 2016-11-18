package p000;

public final class lyc extends nyx<lyc> {
    public lya f26851a;
    public lzj f26852b;
    public lya[] f26853c;
    public luq responseHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31106b(nyt);
    }

    public lyc() {
        m31107d();
    }

    private lyc m31107d() {
        this.responseHeader = null;
        this.f26851a = null;
        this.f26852b = null;
        this.f26853c = lya.m31096d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.responseHeader != null) {
            nyu.b(1, this.responseHeader);
        }
        if (this.f26851a != null) {
            nyu.b(2, this.f26851a);
        }
        if (this.f26852b != null) {
            nyu.b(3, this.f26852b);
        }
        if (this.f26853c != null && this.f26853c.length > 0) {
            for (nzf nzf : this.f26853c) {
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
        if (this.f26851a != null) {
            b += nyu.d(2, this.f26851a);
        }
        if (this.f26852b != null) {
            b += nyu.d(3, this.f26852b);
        }
        if (this.f26853c == null || this.f26853c.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f26853c) {
            if (nzf != null) {
                i += nyu.d(4, nzf);
            }
        }
        return i;
    }

    private lyc m31106b(nyt nyt) {
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
                    if (this.f26851a == null) {
                        this.f26851a = new lya();
                    }
                    nyt.a(this.f26851a);
                    continue;
                case wi.dx /*26*/:
                    if (this.f26852b == null) {
                        this.f26852b = new lzj();
                    }
                    nyt.a(this.f26852b);
                    continue;
                case 34:
                    int b = nzl.b(nyt, 34);
                    if (this.f26853c == null) {
                        a = 0;
                    } else {
                        a = this.f26853c.length;
                    }
                    Object obj = new lya[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f26853c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lya();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lya();
                    nyt.a(obj[a]);
                    this.f26853c = obj;
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
