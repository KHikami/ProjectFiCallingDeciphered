package p000;

public final class lxs extends nyx<lxs> {
    public lxh f26804a;
    public lzj f26805b;
    public lxh[] f26806c;
    public luq responseHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31048b(nyt);
    }

    public lxs() {
        m31049d();
    }

    private lxs m31049d() {
        this.responseHeader = null;
        this.f26804a = null;
        this.f26805b = null;
        this.f26806c = lxh.m30993d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.responseHeader != null) {
            nyu.b(1, this.responseHeader);
        }
        if (this.f26804a != null) {
            nyu.b(2, this.f26804a);
        }
        if (this.f26805b != null) {
            nyu.b(3, this.f26805b);
        }
        if (this.f26806c != null && this.f26806c.length > 0) {
            for (nzf nzf : this.f26806c) {
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
        if (this.f26804a != null) {
            b += nyu.d(2, this.f26804a);
        }
        if (this.f26805b != null) {
            b += nyu.d(3, this.f26805b);
        }
        if (this.f26806c == null || this.f26806c.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f26806c) {
            if (nzf != null) {
                i += nyu.d(4, nzf);
            }
        }
        return i;
    }

    private lxs m31048b(nyt nyt) {
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
                    if (this.f26804a == null) {
                        this.f26804a = new lxh();
                    }
                    nyt.a(this.f26804a);
                    continue;
                case wi.dx /*26*/:
                    if (this.f26805b == null) {
                        this.f26805b = new lzj();
                    }
                    nyt.a(this.f26805b);
                    continue;
                case 34:
                    int b = nzl.b(nyt, 34);
                    if (this.f26806c == null) {
                        a = 0;
                    } else {
                        a = this.f26806c.length;
                    }
                    Object obj = new lxh[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f26806c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lxh();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lxh();
                    nyt.a(obj[a]);
                    this.f26806c = obj;
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
