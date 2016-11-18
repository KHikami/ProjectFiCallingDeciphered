package p000;

public final class lyp extends nyx<lyp> {
    public lym f26935a;
    public lyo f26936b;
    public Boolean f26937c;
    public lzj f26938d;
    public lym[] f26939e;
    public lup requestHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31174b(nyt);
    }

    public lyp() {
        m31175d();
    }

    private lyp m31175d() {
        this.requestHeader = null;
        this.f26935a = null;
        this.f26936b = null;
        this.f26937c = null;
        this.f26938d = null;
        this.f26939e = lym.m31158d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.requestHeader != null) {
            nyu.b(1, this.requestHeader);
        }
        if (this.f26935a != null) {
            nyu.b(2, this.f26935a);
        }
        if (this.f26936b != null) {
            nyu.b(3, this.f26936b);
        }
        if (this.f26937c != null) {
            nyu.a(4, this.f26937c.booleanValue());
        }
        if (this.f26938d != null) {
            nyu.b(5, this.f26938d);
        }
        if (this.f26939e != null && this.f26939e.length > 0) {
            for (nzf nzf : this.f26939e) {
                if (nzf != null) {
                    nyu.b(6, nzf);
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
        if (this.f26935a != null) {
            b += nyu.d(2, this.f26935a);
        }
        if (this.f26936b != null) {
            b += nyu.d(3, this.f26936b);
        }
        if (this.f26937c != null) {
            this.f26937c.booleanValue();
            b += nyu.h(4) + 1;
        }
        if (this.f26938d != null) {
            b += nyu.d(5, this.f26938d);
        }
        if (this.f26939e == null || this.f26939e.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f26939e) {
            if (nzf != null) {
                i += nyu.d(6, nzf);
            }
        }
        return i;
    }

    private lyp m31174b(nyt nyt) {
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
                    if (this.f26935a == null) {
                        this.f26935a = new lym();
                    }
                    nyt.a(this.f26935a);
                    continue;
                case wi.dx /*26*/:
                    if (this.f26936b == null) {
                        this.f26936b = new lyo();
                    }
                    nyt.a(this.f26936b);
                    continue;
                case 32:
                    this.f26937c = Boolean.valueOf(nyt.i());
                    continue;
                case 42:
                    if (this.f26938d == null) {
                        this.f26938d = new lzj();
                    }
                    nyt.a(this.f26938d);
                    continue;
                case 50:
                    int b = nzl.b(nyt, 50);
                    if (this.f26939e == null) {
                        a = 0;
                    } else {
                        a = this.f26939e.length;
                    }
                    Object obj = new lym[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f26939e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lym();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lym();
                    nyt.a(obj[a]);
                    this.f26939e = obj;
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
