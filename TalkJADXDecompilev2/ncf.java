package defpackage;

public final class ncf extends nyx<ncf> {
    private static volatile ncf[] d;
    public int a;
    public Boolean b;
    public Boolean c;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static ncf[] d() {
        if (d == null) {
            synchronized (nzc.c) {
                if (d == null) {
                    d = new ncf[0];
                }
            }
        }
        return d;
    }

    public ncf() {
        this.a = nzf.UNSET_ENUM_VALUE;
        this.b = null;
        this.c = null;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        if (this.a != nzf.UNSET_ENUM_VALUE) {
            nyu.a(1, this.a);
        }
        if (this.c != null) {
            nyu.a(2, this.c.booleanValue());
        }
        if (this.b != null) {
            nyu.a(3, this.b.booleanValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(1, this.a);
        }
        if (this.c != null) {
            this.c.booleanValue();
            b += nyu.h(2) + 1;
        }
        if (this.b == null) {
            return b;
        }
        this.b.booleanValue();
        return b + (nyu.h(3) + 1);
    }

    private ncf b(nyt nyt) {
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
                        case 20:
                        case 21:
                        case 22:
                        case wi.do /*23*/:
                        case wi.dA /*24*/:
                        case wi.dz /*25*/:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                            this.a = a;
                            break;
                        default:
                            continue;
                    }
                case 16:
                    this.c = Boolean.valueOf(nyt.i());
                    continue;
                case wi.dA /*24*/:
                    this.b = Boolean.valueOf(nyt.i());
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
