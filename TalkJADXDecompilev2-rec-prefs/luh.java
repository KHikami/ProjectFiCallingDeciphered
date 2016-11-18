package p000;

public final class luh extends nyx<luh> {
    public Integer f26477a;
    public String f26478b;
    public String f26479c;
    public String f26480d;
    public String f26481e;
    public Integer f26482f;
    public luq responseHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30592b(nyt);
    }

    public luh() {
        m30593d();
    }

    private luh m30593d() {
        this.responseHeader = null;
        this.f26478b = null;
        this.f26479c = null;
        this.f26480d = null;
        this.f26481e = null;
        this.f26482f = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.responseHeader != null) {
            nyu.b(1, this.responseHeader);
        }
        if (this.f26477a != null) {
            nyu.a(2, this.f26477a.intValue());
        }
        if (this.f26478b != null) {
            nyu.a(3, this.f26478b);
        }
        if (this.f26480d != null) {
            nyu.a(5, this.f26480d);
        }
        if (this.f26482f != null) {
            nyu.a(6, this.f26482f.intValue());
        }
        if (this.f26481e != null) {
            nyu.a(7, this.f26481e);
        }
        if (this.f26479c != null) {
            nyu.a(8, this.f26479c);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.responseHeader != null) {
            b += nyu.d(1, this.responseHeader);
        }
        if (this.f26477a != null) {
            b += nyu.f(2, this.f26477a.intValue());
        }
        if (this.f26478b != null) {
            b += nyu.b(3, this.f26478b);
        }
        if (this.f26480d != null) {
            b += nyu.b(5, this.f26480d);
        }
        if (this.f26482f != null) {
            b += nyu.f(6, this.f26482f.intValue());
        }
        if (this.f26481e != null) {
            b += nyu.b(7, this.f26481e);
        }
        if (this.f26479c != null) {
            return b + nyu.b(8, this.f26479c);
        }
        return b;
    }

    private luh m30592b(nyt nyt) {
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
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                            this.f26477a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dx /*26*/:
                    this.f26478b = nyt.j();
                    continue;
                case 42:
                    this.f26480d = nyt.j();
                    continue;
                case 48:
                    this.f26482f = Integer.valueOf(nyt.f());
                    continue;
                case 58:
                    this.f26481e = nyt.j();
                    continue;
                case 66:
                    this.f26479c = nyt.j();
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
