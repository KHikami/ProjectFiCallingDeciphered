package p000;

public final class lys extends nyx<lys> {
    public lym f26947a;
    public lzj f26948b;
    public lym[] f26949c;
    public luq responseHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31189b(nyt);
    }

    public lys() {
        m31190d();
    }

    private lys m31190d() {
        this.responseHeader = null;
        this.f26947a = null;
        this.f26948b = null;
        this.f26949c = lym.m31158d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.responseHeader != null) {
            nyu.b(1, this.responseHeader);
        }
        if (this.f26947a != null) {
            nyu.b(2, this.f26947a);
        }
        if (this.f26948b != null) {
            nyu.b(3, this.f26948b);
        }
        if (this.f26949c != null && this.f26949c.length > 0) {
            for (nzf nzf : this.f26949c) {
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
        if (this.f26947a != null) {
            b += nyu.d(2, this.f26947a);
        }
        if (this.f26948b != null) {
            b += nyu.d(3, this.f26948b);
        }
        if (this.f26949c == null || this.f26949c.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f26949c) {
            if (nzf != null) {
                i += nyu.d(4, nzf);
            }
        }
        return i;
    }

    private lys m31189b(nyt nyt) {
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
                    if (this.f26947a == null) {
                        this.f26947a = new lym();
                    }
                    nyt.a(this.f26947a);
                    continue;
                case wi.dx /*26*/:
                    if (this.f26948b == null) {
                        this.f26948b = new lzj();
                    }
                    nyt.a(this.f26948b);
                    continue;
                case 34:
                    int b = nzl.b(nyt, 34);
                    if (this.f26949c == null) {
                        a = 0;
                    } else {
                        a = this.f26949c.length;
                    }
                    Object obj = new lym[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f26949c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lym();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lym();
                    nyt.a(obj[a]);
                    this.f26949c = obj;
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
