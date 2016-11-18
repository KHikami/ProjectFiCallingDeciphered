package p000;

public final class lzm extends nyx<lzm> {
    private static volatile lzm[] f27008b;
    public Integer f27009a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31293b(nyt);
    }

    public static lzm[] m31294d() {
        if (f27008b == null) {
            synchronized (nzc.c) {
                if (f27008b == null) {
                    f27008b = new lzm[0];
                }
            }
        }
        return f27008b;
    }

    public lzm() {
        m31295g();
    }

    private lzm m31295g() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f27009a != null) {
            nyu.a(1, this.f27009a.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f27009a != null) {
            return b + nyu.f(1, this.f27009a.intValue());
        }
        return b;
    }

    private lzm m31293b(nyt nyt) {
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
                            this.f27009a = Integer.valueOf(a);
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
