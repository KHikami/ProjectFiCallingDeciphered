package p000;

public final class lnl extends nyx<lnl> {
    public String f25783a;
    public double f25784b;
    public boolean f25785c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29622b(nyt);
    }

    public lnl() {
        m29623d();
    }

    private lnl m29623d() {
        this.f25783a = "";
        this.f25784b = 0.0d;
        this.f25785c = false;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (!(this.f25783a == null || this.f25783a.equals(""))) {
            nyu.a(1, this.f25783a);
        }
        if (Double.doubleToLongBits(this.f25784b) != Double.doubleToLongBits(0.0d)) {
            nyu.a(2, this.f25784b);
        }
        if (this.f25785c) {
            nyu.a(3, this.f25785c);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (!(this.f25783a == null || this.f25783a.equals(""))) {
            b += nyu.b(1, this.f25783a);
        }
        if (Double.doubleToLongBits(this.f25784b) != Double.doubleToLongBits(0.0d)) {
            double d = this.f25784b;
            b += nyu.h(2) + 8;
        }
        if (!this.f25785c) {
            return b;
        }
        boolean z = this.f25785c;
        return b + (nyu.h(3) + 1);
    }

    private lnl m29622b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f25783a = nyt.j();
                    continue;
                case wi.dK /*17*/:
                    this.f25784b = nyt.b();
                    continue;
                case wi.dA /*24*/:
                    this.f25785c = nyt.i();
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
