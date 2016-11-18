package p000;

public final class lnv extends nyx<lnv> {
    private static volatile lnv[] f25827c;
    public ltr f25828a;
    public Integer f25829b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29673b(nyt);
    }

    public static lnv[] m29674d() {
        if (f25827c == null) {
            synchronized (nzc.c) {
                if (f25827c == null) {
                    f25827c = new lnv[0];
                }
            }
        }
        return f25827c;
    }

    public lnv() {
        m29675g();
    }

    private lnv m29675g() {
        this.f25828a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f25828a != null) {
            nyu.b(1, this.f25828a);
        }
        if (this.f25829b != null) {
            nyu.a(2, this.f25829b.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f25828a != null) {
            b += nyu.d(1, this.f25828a);
        }
        if (this.f25829b != null) {
            return b + nyu.f(2, this.f25829b.intValue());
        }
        return b;
    }

    private lnv m29673b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f25828a == null) {
                        this.f25828a = new ltr();
                    }
                    nyt.a(this.f25828a);
                    continue;
                case 16:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f25829b = Integer.valueOf(a);
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
