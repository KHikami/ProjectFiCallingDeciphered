package defpackage;

public final class lli extends nyx<lli> {
    public String a;
    public String b;
    public Boolean c;
    public String d;
    public String e;
    public String f;
    public Integer g;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public lli() {
        d();
    }

    private lli d() {
        this.a = null;
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
        if (this.a != null) {
            nyu.a(1, this.a);
        }
        if (this.b != null) {
            nyu.a(2, this.b);
        }
        if (this.c != null) {
            nyu.a(3, this.c.booleanValue());
        }
        if (this.d != null) {
            nyu.a(4, this.d);
        }
        if (this.e != null) {
            nyu.a(5, this.e);
        }
        if (this.f != null) {
            nyu.a(6, this.f);
        }
        if (this.g != null) {
            nyu.a(7, this.g.intValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.b(1, this.a);
        }
        if (this.b != null) {
            b += nyu.b(2, this.b);
        }
        if (this.c != null) {
            this.c.booleanValue();
            b += nyu.h(3) + 1;
        }
        if (this.d != null) {
            b += nyu.b(4, this.d);
        }
        if (this.e != null) {
            b += nyu.b(5, this.e);
        }
        if (this.f != null) {
            b += nyu.b(6, this.f);
        }
        if (this.g != null) {
            return b + nyu.f(7, this.g.intValue());
        }
        return b;
    }

    private lli b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.b = nyt.j();
                    continue;
                case wi.dA /*24*/:
                    this.c = Boolean.valueOf(nyt.i());
                    continue;
                case 34:
                    this.d = nyt.j();
                    continue;
                case 42:
                    this.e = nyt.j();
                    continue;
                case 50:
                    this.f = nyt.j();
                    continue;
                case 56:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.g = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
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
