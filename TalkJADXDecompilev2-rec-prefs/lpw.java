package p000;

public final class lpw extends nyx<lpw> {
    public Boolean f26032a;
    public Boolean f26033b;
    public Boolean f26034c;
    public Boolean f26035d;
    public String f26036e;
    public Boolean f26037f;
    public Integer f26038g;
    public byte[] f26039h;
    public Integer f26040i;
    public Integer f26041j;
    public Integer f26042k;
    public Boolean f26043l;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29966b(nyt);
    }

    public lpw() {
        m29967d();
    }

    private lpw m29967d() {
        this.f26032a = null;
        this.f26033b = null;
        this.f26034c = null;
        this.f26035d = null;
        this.f26036e = null;
        this.f26037f = null;
        this.f26039h = null;
        this.f26043l = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26032a != null) {
            nyu.a(1, this.f26032a.booleanValue());
        }
        if (this.f26033b != null) {
            nyu.a(2, this.f26033b.booleanValue());
        }
        if (this.f26034c != null) {
            nyu.a(3, this.f26034c.booleanValue());
        }
        if (this.f26035d != null) {
            nyu.a(4, this.f26035d.booleanValue());
        }
        if (this.f26036e != null) {
            nyu.a(5, this.f26036e);
        }
        if (this.f26037f != null) {
            nyu.a(6, this.f26037f.booleanValue());
        }
        if (this.f26038g != null) {
            nyu.a(7, this.f26038g.intValue());
        }
        if (this.f26039h != null) {
            nyu.a(8, this.f26039h);
        }
        if (this.f26040i != null) {
            nyu.a(9, this.f26040i.intValue());
        }
        if (this.f26041j != null) {
            nyu.a(10, this.f26041j.intValue());
        }
        if (this.f26042k != null) {
            nyu.a(11, this.f26042k.intValue());
        }
        if (this.f26043l != null) {
            nyu.a(12, this.f26043l.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26032a != null) {
            this.f26032a.booleanValue();
            b += nyu.h(1) + 1;
        }
        if (this.f26033b != null) {
            this.f26033b.booleanValue();
            b += nyu.h(2) + 1;
        }
        if (this.f26034c != null) {
            this.f26034c.booleanValue();
            b += nyu.h(3) + 1;
        }
        if (this.f26035d != null) {
            this.f26035d.booleanValue();
            b += nyu.h(4) + 1;
        }
        if (this.f26036e != null) {
            b += nyu.b(5, this.f26036e);
        }
        if (this.f26037f != null) {
            this.f26037f.booleanValue();
            b += nyu.h(6) + 1;
        }
        if (this.f26038g != null) {
            b += nyu.f(7, this.f26038g.intValue());
        }
        if (this.f26039h != null) {
            b += nyu.b(8, this.f26039h);
        }
        if (this.f26040i != null) {
            b += nyu.f(9, this.f26040i.intValue());
        }
        if (this.f26041j != null) {
            b += nyu.f(10, this.f26041j.intValue());
        }
        if (this.f26042k != null) {
            b += nyu.f(11, this.f26042k.intValue());
        }
        if (this.f26043l == null) {
            return b;
        }
        this.f26043l.booleanValue();
        return b + (nyu.h(12) + 1);
    }

    private lpw m29966b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f26032a = Boolean.valueOf(nyt.i());
                    continue;
                case 16:
                    this.f26033b = Boolean.valueOf(nyt.i());
                    continue;
                case wi.dA /*24*/:
                    this.f26034c = Boolean.valueOf(nyt.i());
                    continue;
                case 32:
                    this.f26035d = Boolean.valueOf(nyt.i());
                    continue;
                case 42:
                    this.f26036e = nyt.j();
                    continue;
                case 48:
                    this.f26037f = Boolean.valueOf(nyt.i());
                    continue;
                case 56:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.f26038g = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 66:
                    this.f26039h = nyt.k();
                    continue;
                case 72:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f26040i = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 80:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f26041j = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 88:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f26042k = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 96:
                    this.f26043l = Boolean.valueOf(nyt.i());
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
