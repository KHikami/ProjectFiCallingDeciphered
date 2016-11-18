package p000;

public final class nhc extends nyx<nhc> {
    public nhb f29818a;
    public nhd f29819b;
    public nhe f29820c;
    public nhb f29821d;

    public /* synthetic */ nzf m34922a(nyt nyt) {
        return m34920b(nyt);
    }

    public nhc() {
        m34921d();
    }

    private nhc m34921d() {
        this.f29818a = null;
        this.f29819b = null;
        this.f29820c = null;
        this.f29821d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34923a(nyu nyu) {
        if (this.f29818a != null) {
            nyu.m37182b(1, this.f29818a);
        }
        if (this.f29819b != null) {
            nyu.m37182b(2, this.f29819b);
        }
        if (this.f29820c != null) {
            nyu.m37182b(3, this.f29820c);
        }
        if (this.f29821d != null) {
            nyu.m37182b(4, this.f29821d);
        }
        super.a(nyu);
    }

    protected int m34924b() {
        int b = super.b();
        if (this.f29818a != null) {
            b += nyu.m37145d(1, this.f29818a);
        }
        if (this.f29819b != null) {
            b += nyu.m37145d(2, this.f29819b);
        }
        if (this.f29820c != null) {
            b += nyu.m37145d(3, this.f29820c);
        }
        if (this.f29821d != null) {
            return b + nyu.m37145d(4, this.f29821d);
        }
        return b;
    }

    private nhc m34920b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f29818a == null) {
                        this.f29818a = new nhb();
                    }
                    nyt.m37101a(this.f29818a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f29819b == null) {
                        this.f29819b = new nhd();
                    }
                    nyt.m37101a(this.f29819b);
                    continue;
                case wi.dx /*26*/:
                    if (this.f29820c == null) {
                        this.f29820c = new nhe();
                    }
                    nyt.m37101a(this.f29820c);
                    continue;
                case 34:
                    if (this.f29821d == null) {
                        this.f29821d = new nhb();
                    }
                    nyt.m37101a(this.f29821d);
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
