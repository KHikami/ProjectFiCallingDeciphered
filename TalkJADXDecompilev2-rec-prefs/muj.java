package p000;

public final class muj extends nyx<muj> {
    public static final nyy<ozo, muj> f28362a = nyy.a(11, muj.class, 120006674);
    private static final muj[] f28363f = new muj[0];
    public Double f28364b;
    public Double f28365c;
    public String f28366d;
    public Integer f28367e;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m32951b(nyt);
    }

    public muj() {
        m32952d();
    }

    private muj m32952d() {
        this.f28364b = null;
        this.f28365c = null;
        this.f28366d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f28364b != null) {
            nyu.a(1, this.f28364b.doubleValue());
        }
        if (this.f28365c != null) {
            nyu.a(2, this.f28365c.doubleValue());
        }
        if (this.f28366d != null) {
            nyu.a(3, this.f28366d);
        }
        if (this.f28367e != null) {
            nyu.a(4, this.f28367e.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f28364b != null) {
            this.f28364b.doubleValue();
            b += nyu.h(1) + 8;
        }
        if (this.f28365c != null) {
            this.f28365c.doubleValue();
            b += nyu.h(2) + 8;
        }
        if (this.f28366d != null) {
            b += nyu.b(3, this.f28366d);
        }
        if (this.f28367e != null) {
            return b + nyu.f(4, this.f28367e.intValue());
        }
        return b;
    }

    private muj m32951b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 9:
                    this.f28364b = Double.valueOf(nyt.b());
                    continue;
                case wi.dK /*17*/:
                    this.f28365c = Double.valueOf(nyt.b());
                    continue;
                case wi.dx /*26*/:
                    this.f28366d = nyt.j();
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
                            this.f28367e = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
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
