package p000;

public final class nby extends nyx<nby> {
    private static volatile nby[] f29469c;
    public String f29470a;
    public nbz f29471b;

    public /* synthetic */ nzf m34250a(nyt nyt) {
        return m34248b(nyt);
    }

    public static nby[] m34249d() {
        if (f29469c == null) {
            synchronized (nzc.f31309c) {
                if (f29469c == null) {
                    f29469c = new nby[0];
                }
            }
        }
        return f29469c;
    }

    public nby() {
        this.f29470a = null;
        this.cachedSize = -1;
    }

    public void m34251a(nyu nyu) {
        if (this.f29470a != null) {
            nyu.m37170a(1, this.f29470a);
        }
        if (this.f29471b != null) {
            nyu.m37182b(2, this.f29471b);
        }
        super.a(nyu);
    }

    protected int m34252b() {
        int b = super.b();
        if (this.f29470a != null) {
            b += nyu.m37137b(1, this.f29470a);
        }
        if (this.f29471b != null) {
            return b + nyu.m37145d(2, this.f29471b);
        }
        return b;
    }

    private nby m34248b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f29470a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    if (this.f29471b == null) {
                        this.f29471b = new nbz();
                    }
                    nyt.m37101a(this.f29471b);
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
