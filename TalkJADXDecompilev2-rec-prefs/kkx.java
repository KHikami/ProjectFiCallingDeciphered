package p000;

public final class kkx extends nyx<kkx> {
    private static volatile kkx[] f22101d;
    public klk f22102a;
    public String f22103b;
    public Boolean f22104c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26319b(nyt);
    }

    public static kkx[] m26320d() {
        if (f22101d == null) {
            synchronized (nzc.c) {
                if (f22101d == null) {
                    f22101d = new kkx[0];
                }
            }
        }
        return f22101d;
    }

    public kkx() {
        m26321g();
    }

    private kkx m26321g() {
        this.f22102a = null;
        this.f22103b = null;
        this.f22104c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22102a != null) {
            nyu.b(1, this.f22102a);
        }
        if (this.f22103b != null) {
            nyu.a(2, this.f22103b);
        }
        if (this.f22104c != null) {
            nyu.a(3, this.f22104c.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22102a != null) {
            b += nyu.d(1, this.f22102a);
        }
        if (this.f22103b != null) {
            b += nyu.b(2, this.f22103b);
        }
        if (this.f22104c == null) {
            return b;
        }
        this.f22104c.booleanValue();
        return b + (nyu.h(3) + 1);
    }

    private kkx m26319b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f22102a == null) {
                        this.f22102a = new klk();
                    }
                    nyt.a(this.f22102a);
                    continue;
                case wi.dH /*18*/:
                    this.f22103b = nyt.j();
                    continue;
                case wi.dA /*24*/:
                    this.f22104c = Boolean.valueOf(nyt.i());
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
