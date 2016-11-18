package p000;

public final class nlk extends nyx<nlk> {
    public njy f30117a;
    public Integer f30118b;
    public Long f30119c;
    public nio f30120d;

    public /* synthetic */ nzf m35506a(nyt nyt) {
        return m35504b(nyt);
    }

    public nlk() {
        m35505d();
    }

    private nlk m35505d() {
        this.f30117a = null;
        this.f30119c = null;
        this.f30120d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35507a(nyu nyu) {
        if (this.f30117a != null) {
            nyu.m37182b(1, this.f30117a);
        }
        if (this.f30118b != null) {
            nyu.m37168a(2, this.f30118b.intValue());
        }
        if (this.f30119c != null) {
            nyu.m37181b(3, this.f30119c.longValue());
        }
        if (this.f30120d != null) {
            nyu.m37182b(4, this.f30120d);
        }
        super.a(nyu);
    }

    protected int m35508b() {
        int b = super.b();
        if (this.f30117a != null) {
            b += nyu.m37145d(1, this.f30117a);
        }
        if (this.f30118b != null) {
            b += nyu.m37147f(2, this.f30118b.intValue());
        }
        if (this.f30119c != null) {
            b += nyu.m37148f(3, this.f30119c.longValue());
        }
        if (this.f30120d != null) {
            return b + nyu.m37145d(4, this.f30120d);
        }
        return b;
    }

    private nlk m35504b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f30117a == null) {
                        this.f30117a = new njy();
                    }
                    nyt.m37101a(this.f30117a);
                    continue;
                case 16:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            this.f30118b = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dA /*24*/:
                    this.f30119c = Long.valueOf(nyt.m37110e());
                    continue;
                case 34:
                    if (this.f30120d == null) {
                        this.f30120d = new nio();
                    }
                    nyt.m37101a(this.f30120d);
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
