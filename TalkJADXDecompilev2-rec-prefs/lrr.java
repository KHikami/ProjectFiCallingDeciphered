package p000;

public final class lrr extends nyx<lrr> {
    private static volatile lrr[] f26268d;
    public lqc f26269a;
    public lor f26270b;
    public Integer f26271c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30216b(nyt);
    }

    public static lrr[] m30217d() {
        if (f26268d == null) {
            synchronized (nzc.c) {
                if (f26268d == null) {
                    f26268d = new lrr[0];
                }
            }
        }
        return f26268d;
    }

    public lrr() {
        m30218g();
    }

    private lrr m30218g() {
        this.f26269a = null;
        this.f26270b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26269a != null) {
            nyu.b(1, this.f26269a);
        }
        if (this.f26271c != null) {
            nyu.a(2, this.f26271c.intValue());
        }
        if (this.f26270b != null) {
            nyu.b(3, this.f26270b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26269a != null) {
            b += nyu.d(1, this.f26269a);
        }
        if (this.f26271c != null) {
            b += nyu.f(2, this.f26271c.intValue());
        }
        if (this.f26270b != null) {
            return b + nyu.d(3, this.f26270b);
        }
        return b;
    }

    private lrr m30216b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f26269a == null) {
                        this.f26269a = new lqc();
                    }
                    nyt.a(this.f26269a);
                    continue;
                case 16:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.f26271c = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dx /*26*/:
                    if (this.f26270b == null) {
                        this.f26270b = new lor();
                    }
                    nyt.a(this.f26270b);
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
