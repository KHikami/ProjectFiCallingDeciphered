package p000;

public final class ohz extends nyx<ohz> {
    public oia f32948a;
    public ohu f32949b;
    public Long f32950c;
    public Boolean f32951d;

    public /* synthetic */ nzf m38431a(nyt nyt) {
        return m38429b(nyt);
    }

    public ohz() {
        m38430d();
    }

    private ohz m38430d() {
        this.f32948a = null;
        this.f32949b = null;
        this.f32950c = null;
        this.f32951d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m38432a(nyu nyu) {
        if (this.f32948a != null) {
            nyu.m37182b(1, this.f32948a);
        }
        if (this.f32949b != null) {
            nyu.m37182b(2, this.f32949b);
        }
        if (this.f32950c != null) {
            nyu.m37169a(3, this.f32950c.longValue());
        }
        if (this.f32951d != null) {
            nyu.m37172a(4, this.f32951d.booleanValue());
        }
        super.a(nyu);
    }

    protected int m38433b() {
        int b = super.b();
        if (this.f32948a != null) {
            b += nyu.m37145d(1, this.f32948a);
        }
        if (this.f32949b != null) {
            b += nyu.m37145d(2, this.f32949b);
        }
        if (this.f32950c != null) {
            b += nyu.m37146e(3, this.f32950c.longValue());
        }
        if (this.f32951d == null) {
            return b;
        }
        this.f32951d.booleanValue();
        return b + (nyu.m37154h(4) + 1);
    }

    private ohz m38429b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f32948a == null) {
                        this.f32948a = new oia();
                    }
                    nyt.m37101a(this.f32948a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f32949b == null) {
                        this.f32949b = new ohu();
                    }
                    nyt.m37101a(this.f32949b);
                    continue;
                case wi.dA /*24*/:
                    this.f32950c = Long.valueOf(nyt.m37109d());
                    continue;
                case 32:
                    this.f32951d = Boolean.valueOf(nyt.m37116i());
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
