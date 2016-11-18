package p000;

public final class lty extends nyx<lty> {
    private static volatile lty[] f26429d;
    public ltr f26430a;
    public ltv f26431b;
    public ltw f26432c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30526b(nyt);
    }

    public static lty[] m30527d() {
        if (f26429d == null) {
            synchronized (nzc.c) {
                if (f26429d == null) {
                    f26429d = new lty[0];
                }
            }
        }
        return f26429d;
    }

    public lty() {
        m30528g();
    }

    private lty m30528g() {
        this.f26430a = null;
        this.f26431b = null;
        this.f26432c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26430a != null) {
            nyu.b(1, this.f26430a);
        }
        if (this.f26431b != null) {
            nyu.b(2, this.f26431b);
        }
        if (this.f26432c != null) {
            nyu.b(3, this.f26432c);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26430a != null) {
            b += nyu.d(1, this.f26430a);
        }
        if (this.f26431b != null) {
            b += nyu.d(2, this.f26431b);
        }
        if (this.f26432c != null) {
            return b + nyu.d(3, this.f26432c);
        }
        return b;
    }

    private lty m30526b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f26430a == null) {
                        this.f26430a = new ltr();
                    }
                    nyt.a(this.f26430a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f26431b == null) {
                        this.f26431b = new ltv();
                    }
                    nyt.a(this.f26431b);
                    continue;
                case wi.dx /*26*/:
                    if (this.f26432c == null) {
                        this.f26432c = new ltw();
                    }
                    nyt.a(this.f26432c);
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
