package p000;

public final class loj extends nyx<loj> {
    private static volatile loj[] f25875c;
    public Integer f25876a;
    public String f25877b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29749b(nyt);
    }

    public static loj[] m29750d() {
        if (f25875c == null) {
            synchronized (nzc.c) {
                if (f25875c == null) {
                    f25875c = new loj[0];
                }
            }
        }
        return f25875c;
    }

    public loj() {
        m29751g();
    }

    private loj m29751g() {
        this.f25877b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f25876a != null) {
            nyu.a(1, this.f25876a.intValue());
        }
        if (this.f25877b != null) {
            nyu.a(2, this.f25877b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f25876a != null) {
            b += nyu.f(1, this.f25876a.intValue());
        }
        if (this.f25877b != null) {
            return b + nyu.b(2, this.f25877b);
        }
        return b;
    }

    private loj m29749b(nyt nyt) {
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
                            this.f25876a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    this.f25877b = nyt.j();
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
