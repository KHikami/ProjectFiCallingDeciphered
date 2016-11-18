package defpackage;

public final class ntu extends nyx<ntu> {
    private static volatile ntu[] d;
    public int a;
    public int b;
    public int c;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static ntu[] d() {
        if (d == null) {
            synchronized (nzc.c) {
                if (d == null) {
                    d = new ntu[0];
                }
            }
        }
        return d;
    }

    public ntu() {
        this.a = nzf.UNSET_ENUM_VALUE;
        this.b = nzf.UNSET_ENUM_VALUE;
        this.c = nzf.UNSET_ENUM_VALUE;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        if (this.a != nzf.UNSET_ENUM_VALUE) {
            nyu.a(1, this.a);
        }
        if (this.b != nzf.UNSET_ENUM_VALUE) {
            nyu.a(2, this.b);
        }
        if (this.c != nzf.UNSET_ENUM_VALUE) {
            nyu.a(3, this.c);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(1, this.a);
        }
        if (this.b != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(2, this.b);
        }
        if (this.c != nzf.UNSET_ENUM_VALUE) {
            return b + nyu.f(3, this.c);
        }
        return b;
    }

    private ntu b(nyt nyt) {
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
                            this.a = a;
                            break;
                        default:
                            continue;
                    }
                case 16:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.b = a;
                            break;
                        default:
                            continue;
                    }
                case wi.dA /*24*/:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.c = a;
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
