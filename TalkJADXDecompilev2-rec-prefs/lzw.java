package p000;

public final class lzw extends nyx<lzw> {
    private static volatile lzw[] f27061c;
    public Integer f27062a;
    public mat f27063b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31350b(nyt);
    }

    public static lzw[] m31351d() {
        if (f27061c == null) {
            synchronized (nzc.c) {
                if (f27061c == null) {
                    f27061c = new lzw[0];
                }
            }
        }
        return f27061c;
    }

    public lzw() {
        m31352g();
    }

    private lzw m31352g() {
        this.f27063b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f27062a != null) {
            nyu.a(1, this.f27062a.intValue());
        }
        if (this.f27063b != null) {
            nyu.b(2, this.f27063b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f27062a != null) {
            b += nyu.f(1, this.f27062a.intValue());
        }
        if (this.f27063b != null) {
            return b + nyu.d(2, this.f27063b);
        }
        return b;
    }

    private lzw m31350b(nyt nyt) {
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
                            this.f27062a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    if (this.f27063b == null) {
                        this.f27063b = new mat();
                    }
                    nyt.a(this.f27063b);
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
