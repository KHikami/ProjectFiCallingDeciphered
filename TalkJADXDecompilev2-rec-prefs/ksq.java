package p000;

public final class ksq extends nyx<ksq> {
    public Double f23125a;
    public Double f23126b;
    public Double f23127c;
    public Double f23128d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27351b(nyt);
    }

    public ksq() {
        m27352d();
    }

    private ksq m27352d() {
        this.f23125a = null;
        this.f23126b = null;
        this.f23127c = null;
        this.f23128d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        nyu.a(1, this.f23125a.doubleValue());
        nyu.a(2, this.f23126b.doubleValue());
        nyu.a(3, this.f23127c.doubleValue());
        nyu.a(4, this.f23128d.doubleValue());
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        this.f23125a.doubleValue();
        b += nyu.h(1) + 8;
        this.f23126b.doubleValue();
        b += nyu.h(2) + 8;
        this.f23127c.doubleValue();
        b += nyu.h(3) + 8;
        this.f23128d.doubleValue();
        return b + (nyu.h(4) + 8);
    }

    private ksq m27351b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 9:
                    this.f23125a = Double.valueOf(nyt.b());
                    continue;
                case wi.dK /*17*/:
                    this.f23126b = Double.valueOf(nyt.b());
                    continue;
                case wi.dz /*25*/:
                    this.f23127c = Double.valueOf(nyt.b());
                    continue;
                case 33:
                    this.f23128d = Double.valueOf(nyt.b());
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
