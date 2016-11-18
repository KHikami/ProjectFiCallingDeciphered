package defpackage;

public final class nto extends nyx<nto> {
    public String a;
    public nqi b;
    public int c;
    public nts d;
    public String e;
    public ntp f;
    public odm g;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public nto() {
        this.a = null;
        this.c = nzf.UNSET_ENUM_VALUE;
        this.e = null;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a);
        }
        if (this.b != null) {
            nyu.b(2, this.b);
        }
        if (this.c != nzf.UNSET_ENUM_VALUE) {
            nyu.a(3, this.c);
        }
        if (this.d != null) {
            nyu.b(4, this.d);
        }
        if (this.e != null) {
            nyu.a(5, this.e);
        }
        if (this.f != null) {
            nyu.b(6, this.f);
        }
        if (this.g != null) {
            nyu.b(7, this.g);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.b(1, this.a);
        }
        if (this.b != null) {
            b += nyu.d(2, this.b);
        }
        if (this.c != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(3, this.c);
        }
        if (this.d != null) {
            b += nyu.d(4, this.d);
        }
        if (this.e != null) {
            b += nyu.b(5, this.e);
        }
        if (this.f != null) {
            b += nyu.d(6, this.f);
        }
        if (this.g != null) {
            return b + nyu.d(7, this.g);
        }
        return b;
    }

    private nto b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    if (this.b == null) {
                        this.b = new nqi();
                    }
                    nyt.a(this.b);
                    continue;
                case wi.dA /*24*/:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                            this.c = a;
                            break;
                        default:
                            continue;
                    }
                case 34:
                    if (this.d == null) {
                        this.d = new nts();
                    }
                    nyt.a(this.d);
                    continue;
                case 42:
                    this.e = nyt.j();
                    continue;
                case 50:
                    if (this.f == null) {
                        this.f = new ntp();
                    }
                    nyt.a(this.f);
                    continue;
                case 58:
                    if (this.g == null) {
                        this.g = new odm();
                    }
                    nyt.a(this.g);
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
