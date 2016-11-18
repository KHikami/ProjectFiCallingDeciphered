package p000;

public final class luj extends nyx<luj> {
    public lqg f26487a;
    public lom f26488b;
    public Long f26489c;
    public String f26490d;
    public luq responseHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30602b(nyt);
    }

    public luj() {
        m30603d();
    }

    private luj m30603d() {
        this.responseHeader = null;
        this.f26487a = null;
        this.f26488b = null;
        this.f26489c = null;
        this.f26490d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.responseHeader != null) {
            nyu.b(1, this.responseHeader);
        }
        if (this.f26489c != null) {
            nyu.a(2, this.f26489c.longValue());
        }
        if (this.f26490d != null) {
            nyu.a(3, this.f26490d);
        }
        if (this.f26487a != null) {
            nyu.b(4, this.f26487a);
        }
        if (this.f26488b != null) {
            nyu.b(5, this.f26488b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.responseHeader != null) {
            b += nyu.d(1, this.responseHeader);
        }
        if (this.f26489c != null) {
            b += nyu.e(2, this.f26489c.longValue());
        }
        if (this.f26490d != null) {
            b += nyu.b(3, this.f26490d);
        }
        if (this.f26487a != null) {
            b += nyu.d(4, this.f26487a);
        }
        if (this.f26488b != null) {
            return b + nyu.d(5, this.f26488b);
        }
        return b;
    }

    private luj m30602b(nyt nyt) {
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
                    this.f26489c = Long.valueOf(nyt.d());
                    continue;
                case wi.dx /*26*/:
                    this.f26490d = nyt.j();
                    continue;
                case 34:
                    if (this.f26487a == null) {
                        this.f26487a = new lqg();
                    }
                    nyt.a(this.f26487a);
                    continue;
                case 42:
                    if (this.f26488b == null) {
                        this.f26488b = new lom();
                    }
                    nyt.a(this.f26488b);
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
