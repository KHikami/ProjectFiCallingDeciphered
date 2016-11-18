package p000;

public final class nbh extends nyx<nbh> {
    private static volatile nbh[] f29428c;
    public nbq f29429a;
    public nbq f29430b;

    public /* synthetic */ nzf m34175a(nyt nyt) {
        return m34173b(nyt);
    }

    public static nbh[] m34174d() {
        if (f29428c == null) {
            synchronized (nzc.f31309c) {
                if (f29428c == null) {
                    f29428c = new nbh[0];
                }
            }
        }
        return f29428c;
    }

    public nbh() {
        this.cachedSize = -1;
    }

    public void m34176a(nyu nyu) {
        if (this.f29429a != null) {
            nyu.m37182b(1, this.f29429a);
        }
        if (this.f29430b != null) {
            nyu.m37182b(2, this.f29430b);
        }
        super.a(nyu);
    }

    protected int m34177b() {
        int b = super.b();
        if (this.f29429a != null) {
            b += nyu.m37145d(1, this.f29429a);
        }
        if (this.f29430b != null) {
            return b + nyu.m37145d(2, this.f29430b);
        }
        return b;
    }

    private nbh m34173b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f29429a == null) {
                        this.f29429a = new nbq();
                    }
                    nyt.m37101a(this.f29429a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f29430b == null) {
                        this.f29430b = new nbq();
                    }
                    nyt.m37101a(this.f29430b);
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
