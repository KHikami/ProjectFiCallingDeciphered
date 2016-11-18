package defpackage;

public final class nvg extends nyx<nvg> {
    private static volatile nvg[] d;
    public byte[] a;
    public Integer b;
    public int c;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static nvg[] d() {
        if (d == null) {
            synchronized (nzc.c) {
                if (d == null) {
                    d = new nvg[0];
                }
            }
        }
        return d;
    }

    public nvg() {
        this.a = null;
        this.b = null;
        this.c = nzf.UNSET_ENUM_VALUE;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a);
        }
        if (this.b != null) {
            nyu.c(2, this.b.intValue());
        }
        if (this.c != nzf.UNSET_ENUM_VALUE) {
            nyu.a(3, this.c);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.b(1, this.a);
        }
        if (this.b != null) {
            b += nyu.g(2, this.b.intValue());
        }
        if (this.c != nzf.UNSET_ENUM_VALUE) {
            return b + nyu.f(3, this.c);
        }
        return b;
    }

    private nvg b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.a = nyt.k();
                    continue;
                case 16:
                    this.b = Integer.valueOf(nyt.l());
                    continue;
                case wi.dA /*24*/:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
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
