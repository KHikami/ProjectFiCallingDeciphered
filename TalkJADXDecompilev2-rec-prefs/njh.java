package p000;

public final class njh extends nyx<njh> {
    public nkc f29982a;
    public njg f29983b;
    public Boolean f29984c;

    public /* synthetic */ nzf m35218a(nyt nyt) {
        return m35216b(nyt);
    }

    public njh() {
        m35217d();
    }

    private njh m35217d() {
        this.f29982a = null;
        this.f29983b = null;
        this.f29984c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35219a(nyu nyu) {
        if (this.f29982a != null) {
            nyu.m37182b(1, this.f29982a);
        }
        if (this.f29983b != null) {
            nyu.m37182b(2, this.f29983b);
        }
        if (this.f29984c != null) {
            nyu.m37172a(3, this.f29984c.booleanValue());
        }
        super.a(nyu);
    }

    protected int m35220b() {
        int b = super.b();
        if (this.f29982a != null) {
            b += nyu.m37145d(1, this.f29982a);
        }
        if (this.f29983b != null) {
            b += nyu.m37145d(2, this.f29983b);
        }
        if (this.f29984c == null) {
            return b;
        }
        this.f29984c.booleanValue();
        return b + (nyu.m37154h(3) + 1);
    }

    private njh m35216b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f29982a == null) {
                        this.f29982a = new nkc();
                    }
                    nyt.m37101a(this.f29982a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f29983b == null) {
                        this.f29983b = new njg();
                    }
                    nyt.m37101a(this.f29983b);
                    continue;
                case wi.dA /*24*/:
                    this.f29984c = Boolean.valueOf(nyt.m37116i());
                    continue;
                default:
                    if (!super.a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
