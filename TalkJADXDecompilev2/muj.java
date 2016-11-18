package defpackage;

public final class muj extends nyx<muj> {
    public static final nyy<ozo, muj> a = nyy.a(11, muj.class, 120006674);
    private static final muj[] f = new muj[0];
    public Double b;
    public Double c;
    public String d;
    public Integer e;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public muj() {
        d();
    }

    private muj d() {
        this.b = null;
        this.c = null;
        this.d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.b != null) {
            nyu.a(1, this.b.doubleValue());
        }
        if (this.c != null) {
            nyu.a(2, this.c.doubleValue());
        }
        if (this.d != null) {
            nyu.a(3, this.d);
        }
        if (this.e != null) {
            nyu.a(4, this.e.intValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.b != null) {
            this.b.doubleValue();
            b += nyu.h(1) + 8;
        }
        if (this.c != null) {
            this.c.doubleValue();
            b += nyu.h(2) + 8;
        }
        if (this.d != null) {
            b += nyu.b(3, this.d);
        }
        if (this.e != null) {
            return b + nyu.f(4, this.e.intValue());
        }
        return b;
    }

    private muj b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 9:
                    this.b = Double.valueOf(nyt.b());
                    continue;
                case wi.dK /*17*/:
                    this.c = Double.valueOf(nyt.b());
                    continue;
                case wi.dx /*26*/:
                    this.d = nyt.j();
                    continue;
                case 32:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 4:
                        case 5:
                        case 6:
                        case wi.dK /*17*/:
                        case wi.dH /*18*/:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 65:
                        case 66:
                        case 67:
                        case 68:
                        case 81:
                        case 82:
                        case 83:
                        case 97:
                        case 98:
                        case 99:
                        case 100:
                            this.e = Integer.valueOf(a);
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
