package p000;

public final class lyw extends nyx<lyw> {
    public lym[] f26960a;
    public lzj f26961b;
    public lzf[] f26962c;
    public luq responseHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31209b(nyt);
    }

    public lyw() {
        m31210d();
    }

    private lyw m31210d() {
        this.responseHeader = null;
        this.f26960a = lym.m31158d();
        this.f26961b = null;
        this.f26962c = lzf.m31255d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        if (this.responseHeader != null) {
            nyu.b(1, this.responseHeader);
        }
        if (this.f26960a != null && this.f26960a.length > 0) {
            for (nzf nzf : this.f26960a) {
                if (nzf != null) {
                    nyu.b(2, nzf);
                }
            }
        }
        if (this.f26961b != null) {
            nyu.b(3, this.f26961b);
        }
        if (this.f26962c != null && this.f26962c.length > 0) {
            while (i < this.f26962c.length) {
                nzf nzf2 = this.f26962c[i];
                if (nzf2 != null) {
                    nyu.b(4, nzf2);
                }
                i++;
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b();
        if (this.responseHeader != null) {
            b += nyu.d(1, this.responseHeader);
        }
        if (this.f26960a != null && this.f26960a.length > 0) {
            int i2 = b;
            for (nzf nzf : this.f26960a) {
                if (nzf != null) {
                    i2 += nyu.d(2, nzf);
                }
            }
            b = i2;
        }
        if (this.f26961b != null) {
            b += nyu.d(3, this.f26961b);
        }
        if (this.f26962c != null && this.f26962c.length > 0) {
            while (i < this.f26962c.length) {
                nzf nzf2 = this.f26962c[i];
                if (nzf2 != null) {
                    b += nyu.d(4, nzf2);
                }
                i++;
            }
        }
        return b;
    }

    private lyw m31209b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
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
                    b = nzl.b(nyt, 18);
                    if (this.f26960a == null) {
                        a = 0;
                    } else {
                        a = this.f26960a.length;
                    }
                    obj = new lym[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f26960a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lym();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lym();
                    nyt.a(obj[a]);
                    this.f26960a = obj;
                    continue;
                case wi.dx /*26*/:
                    if (this.f26961b == null) {
                        this.f26961b = new lzj();
                    }
                    nyt.a(this.f26961b);
                    continue;
                case 34:
                    b = nzl.b(nyt, 34);
                    if (this.f26962c == null) {
                        a = 0;
                    } else {
                        a = this.f26962c.length;
                    }
                    obj = new lzf[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f26962c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lzf();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lzf();
                    nyt.a(obj[a]);
                    this.f26962c = obj;
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
