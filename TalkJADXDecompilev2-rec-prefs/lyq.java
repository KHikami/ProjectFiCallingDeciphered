package p000;

public final class lyq extends nyx<lyq> {
    public lym f26940a;
    public lzj f26941b;
    public Integer f26942c;
    public lym[] f26943d;
    public luq responseHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31179b(nyt);
    }

    public lyq() {
        m31180d();
    }

    private lyq m31180d() {
        this.responseHeader = null;
        this.f26940a = null;
        this.f26941b = null;
        this.f26943d = lym.m31158d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.responseHeader != null) {
            nyu.b(1, this.responseHeader);
        }
        if (this.f26940a != null) {
            nyu.b(2, this.f26940a);
        }
        if (this.f26941b != null) {
            nyu.b(3, this.f26941b);
        }
        if (this.f26942c != null) {
            nyu.a(4, this.f26942c.intValue());
        }
        if (this.f26943d != null && this.f26943d.length > 0) {
            for (nzf nzf : this.f26943d) {
                if (nzf != null) {
                    nyu.b(5, nzf);
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
        if (this.f26940a != null) {
            b += nyu.d(2, this.f26940a);
        }
        if (this.f26941b != null) {
            b += nyu.d(3, this.f26941b);
        }
        if (this.f26942c != null) {
            b += nyu.f(4, this.f26942c.intValue());
        }
        if (this.f26943d == null || this.f26943d.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f26943d) {
            if (nzf != null) {
                i += nyu.d(5, nzf);
            }
        }
        return i;
    }

    private lyq m31179b(nyt nyt) {
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
                    if (this.f26940a == null) {
                        this.f26940a = new lym();
                    }
                    nyt.a(this.f26940a);
                    continue;
                case wi.dx /*26*/:
                    if (this.f26941b == null) {
                        this.f26941b = new lzj();
                    }
                    nyt.a(this.f26941b);
                    continue;
                case 32:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case wi.dK /*17*/:
                            this.f26942c = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 42:
                    int b = nzl.b(nyt, 42);
                    if (this.f26943d == null) {
                        a = 0;
                    } else {
                        a = this.f26943d.length;
                    }
                    Object obj = new lym[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f26943d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lym();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lym();
                    nyt.a(obj[a]);
                    this.f26943d = obj;
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
