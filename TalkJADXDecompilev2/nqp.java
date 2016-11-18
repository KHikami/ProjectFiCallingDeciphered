package defpackage;

public final class nqp extends nyx<nqp> {
    public int a;
    public mzw b;
    public int c;
    public nqq d;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public nqp() {
        this.a = nzf.UNSET_ENUM_VALUE;
        this.c = nzf.UNSET_ENUM_VALUE;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        if (this.a != nzf.UNSET_ENUM_VALUE) {
            nyu.a(1, this.a);
        }
        if (this.b != null) {
            nyu.b(2, this.b);
        }
        if (this.c != nzf.UNSET_ENUM_VALUE) {
            nyu.a(4, this.c);
        }
        if (this.d != null) {
            nyu.b(5, this.d);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(1, this.a);
        }
        if (this.b != null) {
            b += nyu.d(2, this.b);
        }
        if (this.c != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(4, this.c);
        }
        if (this.d != null) {
            return b + nyu.d(5, this.d);
        }
        return b;
    }

    private nqp b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
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
                        case wi.dH /*18*/:
                        case wi.dL /*19*/:
                            this.a = a;
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    if (this.b == null) {
                        this.b = new mzw();
                    }
                    nyt.a(this.b);
                    continue;
                case 32:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.c = a;
                            break;
                        default:
                            continue;
                    }
                case 42:
                    if (this.d == null) {
                        this.d = new nqq();
                    }
                    nyt.a(this.d);
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
