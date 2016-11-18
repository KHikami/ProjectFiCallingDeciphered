package p000;

public final class lzf extends nyx<lzf> {
    private static volatile lzf[] f26989c;
    public String f26990a;
    public Integer f26991b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31254b(nyt);
    }

    public static lzf[] m31255d() {
        if (f26989c == null) {
            synchronized (nzc.c) {
                if (f26989c == null) {
                    f26989c = new lzf[0];
                }
            }
        }
        return f26989c;
    }

    public lzf() {
        m31256g();
    }

    private lzf m31256g() {
        this.f26990a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26990a != null) {
            nyu.a(1, this.f26990a);
        }
        if (this.f26991b != null) {
            nyu.a(2, this.f26991b.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26990a != null) {
            b += nyu.b(1, this.f26990a);
        }
        if (this.f26991b != null) {
            return b + nyu.f(2, this.f26991b.intValue());
        }
        return b;
    }

    private lzf m31254b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f26990a = nyt.j();
                    continue;
                case 16:
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
                            this.f26991b = Integer.valueOf(a);
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
