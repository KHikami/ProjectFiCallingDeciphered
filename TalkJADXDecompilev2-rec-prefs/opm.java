package p000;

public final class opm extends nyx<opm> {
    private static volatile opm[] f33566c;
    public oqu f33567a;
    public oqu f33568b;

    public /* synthetic */ nzf m39061a(nyt nyt) {
        return m39058b(nyt);
    }

    public static opm[] m39059d() {
        if (f33566c == null) {
            synchronized (nzc.f31309c) {
                if (f33566c == null) {
                    f33566c = new opm[0];
                }
            }
        }
        return f33566c;
    }

    public opm() {
        m39060g();
    }

    private opm m39060g() {
        this.f33567a = null;
        this.f33568b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39062a(nyu nyu) {
        if (this.f33567a != null) {
            nyu.m37182b(1, this.f33567a);
        }
        if (this.f33568b != null) {
            nyu.m37182b(2, this.f33568b);
        }
        super.a(nyu);
    }

    protected int m39063b() {
        int b = super.b();
        if (this.f33567a != null) {
            b += nyu.m37145d(1, this.f33567a);
        }
        if (this.f33568b != null) {
            return b + nyu.m37145d(2, this.f33568b);
        }
        return b;
    }

    private opm m39058b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f33567a == null) {
                        this.f33567a = new oqu();
                    }
                    nyt.m37101a(this.f33567a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f33568b == null) {
                        this.f33568b = new oqu();
                    }
                    nyt.m37101a(this.f33568b);
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
