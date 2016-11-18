package defpackage;

public final class pbt extends nyx<pbt> {
    private static volatile pbt[] d;
    public Integer a;
    public Integer b;
    public int c;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static pbt[] d() {
        if (d == null) {
            synchronized (nzc.c) {
                if (d == null) {
                    d = new pbt[0];
                }
            }
        }
        return d;
    }

    public pbt() {
        this.a = null;
        this.b = null;
        this.c = nzf.UNSET_ENUM_VALUE;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a.intValue());
        }
        if (this.b != null) {
            nyu.a(2, this.b.intValue());
        }
        if (this.c != nzf.UNSET_ENUM_VALUE) {
            nyu.a(3, this.c);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.f(1, this.a.intValue());
        }
        if (this.b != null) {
            b += nyu.f(2, this.b.intValue());
        }
        if (this.c != nzf.UNSET_ENUM_VALUE) {
            return b + nyu.f(3, this.c);
        }
        return b;
    }

    private pbt b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.a = Integer.valueOf(nyt.f());
                    continue;
                case 16:
                    this.b = Integer.valueOf(nyt.f());
                    continue;
                case wi.dA /*24*/:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
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
