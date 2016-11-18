package defpackage;

public final class luh extends nyx<luh> {
    public Integer a;
    public String b;
    public String c;
    public String d;
    public String e;
    public Integer f;
    public luq responseHeader;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public luh() {
        d();
    }

    private luh d() {
        this.responseHeader = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.responseHeader != null) {
            nyu.b(1, this.responseHeader);
        }
        if (this.a != null) {
            nyu.a(2, this.a.intValue());
        }
        if (this.b != null) {
            nyu.a(3, this.b);
        }
        if (this.d != null) {
            nyu.a(5, this.d);
        }
        if (this.f != null) {
            nyu.a(6, this.f.intValue());
        }
        if (this.e != null) {
            nyu.a(7, this.e);
        }
        if (this.c != null) {
            nyu.a(8, this.c);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.responseHeader != null) {
            b += nyu.d(1, this.responseHeader);
        }
        if (this.a != null) {
            b += nyu.f(2, this.a.intValue());
        }
        if (this.b != null) {
            b += nyu.b(3, this.b);
        }
        if (this.d != null) {
            b += nyu.b(5, this.d);
        }
        if (this.f != null) {
            b += nyu.f(6, this.f.intValue());
        }
        if (this.e != null) {
            b += nyu.b(7, this.e);
        }
        if (this.c != null) {
            return b + nyu.b(8, this.c);
        }
        return b;
    }

    private luh b(nyt nyt) {
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
                            this.a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dx /*26*/:
                    this.b = nyt.j();
                    continue;
                case 42:
                    this.d = nyt.j();
                    continue;
                case 48:
                    this.f = Integer.valueOf(nyt.f());
                    continue;
                case 58:
                    this.e = nyt.j();
                    continue;
                case 66:
                    this.c = nyt.j();
                    continue;
                default:
                    if (!super.a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
