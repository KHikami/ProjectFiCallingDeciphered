package defpackage;

public final class ntt extends nyx<ntt> {
    private static volatile ntt[] e;
    public int a;
    public Integer b;
    public Integer c;
    public String d;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static ntt[] d() {
        if (e == null) {
            synchronized (nzc.c) {
                if (e == null) {
                    e = new ntt[0];
                }
            }
        }
        return e;
    }

    public ntt() {
        this.a = nzf.UNSET_ENUM_VALUE;
        this.b = null;
        this.c = null;
        this.d = null;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        if (this.a != nzf.UNSET_ENUM_VALUE) {
            nyu.a(1, this.a);
        }
        if (this.d != null) {
            nyu.a(2, this.d);
        }
        if (this.b != null) {
            nyu.a(3, this.b.intValue());
        }
        if (this.c != null) {
            nyu.a(4, this.c.intValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(1, this.a);
        }
        if (this.d != null) {
            b += nyu.b(2, this.d);
        }
        if (this.b != null) {
            b += nyu.f(3, this.b.intValue());
        }
        if (this.c != null) {
            return b + nyu.f(4, this.c.intValue());
        }
        return b;
    }

    private ntt b(nyt nyt) {
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
                case wi.dH /*18*/:
                    this.d = nyt.j();
                    continue;
                case wi.dA /*24*/:
                    this.b = Integer.valueOf(nyt.f());
                    continue;
                case 32:
                    this.c = Integer.valueOf(nyt.f());
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
