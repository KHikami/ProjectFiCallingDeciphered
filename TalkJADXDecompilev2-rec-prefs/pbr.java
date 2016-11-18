package p000;

public final class pbr extends nyx<pbr> {
    public String f34968a;
    public String f34969b;
    public String f34970c;

    public /* synthetic */ nzf m40224a(nyt nyt) {
        return m40223b(nyt);
    }

    public pbr() {
        this.f34968a = null;
        this.f34969b = null;
        this.f34970c = null;
        this.cachedSize = -1;
    }

    public void m40225a(nyu nyu) {
        if (this.f34968a != null) {
            nyu.m37170a(1, this.f34968a);
        }
        if (this.f34969b != null) {
            nyu.m37170a(2, this.f34969b);
        }
        if (this.f34970c != null) {
            nyu.m37170a(3, this.f34970c);
        }
        super.a(nyu);
    }

    protected int m40226b() {
        int b = super.b();
        if (this.f34968a != null) {
            b += nyu.m37137b(1, this.f34968a);
        }
        if (this.f34969b != null) {
            b += nyu.m37137b(2, this.f34969b);
        }
        if (this.f34970c != null) {
            return b + nyu.m37137b(3, this.f34970c);
        }
        return b;
    }

    private pbr m40223b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f34968a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    this.f34969b = nyt.m37117j();
                    continue;
                case wi.dx /*26*/:
                    this.f34970c = nyt.m37117j();
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
