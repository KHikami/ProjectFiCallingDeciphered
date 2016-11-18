package p000;

public final class lul extends nyx<lul> {
    public lqg f26495a;
    public lom f26496b;
    public Long f26497c;
    public String f26498d;
    public luq responseHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30612b(nyt);
    }

    public lul() {
        m30613d();
    }

    private lul m30613d() {
        this.responseHeader = null;
        this.f26495a = null;
        this.f26496b = null;
        this.f26497c = null;
        this.f26498d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.responseHeader != null) {
            nyu.b(1, this.responseHeader);
        }
        if (this.f26497c != null) {
            nyu.a(2, this.f26497c.longValue());
        }
        if (this.f26498d != null) {
            nyu.a(3, this.f26498d);
        }
        if (this.f26495a != null) {
            nyu.b(4, this.f26495a);
        }
        if (this.f26496b != null) {
            nyu.b(5, this.f26496b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.responseHeader != null) {
            b += nyu.d(1, this.responseHeader);
        }
        if (this.f26497c != null) {
            b += nyu.e(2, this.f26497c.longValue());
        }
        if (this.f26498d != null) {
            b += nyu.b(3, this.f26498d);
        }
        if (this.f26495a != null) {
            b += nyu.d(4, this.f26495a);
        }
        if (this.f26496b != null) {
            return b + nyu.d(5, this.f26496b);
        }
        return b;
    }

    private lul m30612b(nyt nyt) {
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
                case 16:
                    this.f26497c = Long.valueOf(nyt.d());
                    continue;
                case wi.dx /*26*/:
                    this.f26498d = nyt.j();
                    continue;
                case 34:
                    if (this.f26495a == null) {
                        this.f26495a = new lqg();
                    }
                    nyt.a(this.f26495a);
                    continue;
                case 42:
                    if (this.f26496b == null) {
                        this.f26496b = new lom();
                    }
                    nyt.a(this.f26496b);
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
