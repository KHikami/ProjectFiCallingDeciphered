package p000;

public final class lsm extends nyx<lsm> {
    private static volatile lsm[] f26329c;
    public ltr f26330a;
    public lqe f26331b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30329b(nyt);
    }

    public static lsm[] m30330d() {
        if (f26329c == null) {
            synchronized (nzc.c) {
                if (f26329c == null) {
                    f26329c = new lsm[0];
                }
            }
        }
        return f26329c;
    }

    public lsm() {
        m30331g();
    }

    private lsm m30331g() {
        this.f26330a = null;
        this.f26331b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26330a != null) {
            nyu.b(1, this.f26330a);
        }
        if (this.f26331b != null) {
            nyu.b(2, this.f26331b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26330a != null) {
            b += nyu.d(1, this.f26330a);
        }
        if (this.f26331b != null) {
            return b + nyu.d(2, this.f26331b);
        }
        return b;
    }

    private lsm m30329b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f26330a == null) {
                        this.f26330a = new ltr();
                    }
                    nyt.a(this.f26330a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f26331b == null) {
                        this.f26331b = new lqe();
                    }
                    nyt.a(this.f26331b);
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
