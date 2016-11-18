package p000;

public final class loi extends nyx<loi> {
    private static volatile loi[] f25872c;
    public Integer f25873a;
    public Boolean f25874b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29743b(nyt);
    }

    public static loi[] m29744d() {
        if (f25872c == null) {
            synchronized (nzc.c) {
                if (f25872c == null) {
                    f25872c = new loi[0];
                }
            }
        }
        return f25872c;
    }

    public loi() {
        m29745g();
    }

    private loi m29745g() {
        this.f25874b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f25873a != null) {
            nyu.a(1, this.f25873a.intValue());
        }
        if (this.f25874b != null) {
            nyu.a(2, this.f25874b.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f25873a != null) {
            b += nyu.f(1, this.f25873a.intValue());
        }
        if (this.f25874b == null) {
            return b;
        }
        this.f25874b.booleanValue();
        return b + (nyu.h(2) + 1);
    }

    private loi m29743b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.f();
                    switch (a) {
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
                        case wi.dL /*19*/:
                        case 20:
                        case 21:
                        case 22:
                        case wi.f29038do /*23*/:
                        case wi.dA /*24*/:
                        case wi.dz /*25*/:
                        case wi.dx /*26*/:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                            this.f25873a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 16:
                    this.f25874b = Boolean.valueOf(nyt.i());
                    continue;
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
