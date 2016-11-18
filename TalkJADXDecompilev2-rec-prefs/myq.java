package p000;

public final class myq extends nyx<myq> {
    public mzi f29167a;
    public mys f29168b;
    public mzk f29169c;

    public /* synthetic */ nzf m33845a(nyt nyt) {
        return m33844b(nyt);
    }

    public myq() {
        this.cachedSize = -1;
    }

    public void m33846a(nyu nyu) {
        if (this.f29167a != null) {
            nyu.m37182b(1, this.f29167a);
        }
        if (this.f29168b != null) {
            nyu.m37182b(2, this.f29168b);
        }
        if (this.f29169c != null) {
            nyu.m37182b(3, this.f29169c);
        }
        super.a(nyu);
    }

    protected int m33847b() {
        int b = super.b();
        if (this.f29167a != null) {
            b += nyu.m37145d(1, this.f29167a);
        }
        if (this.f29168b != null) {
            b += nyu.m37145d(2, this.f29168b);
        }
        if (this.f29169c != null) {
            return b + nyu.m37145d(3, this.f29169c);
        }
        return b;
    }

    private myq m33844b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f29167a == null) {
                        this.f29167a = new mzi();
                    }
                    nyt.m37101a(this.f29167a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f29168b == null) {
                        this.f29168b = new mys();
                    }
                    nyt.m37101a(this.f29168b);
                    continue;
                case wi.dx /*26*/:
                    if (this.f29169c == null) {
                        this.f29169c = new mzk();
                    }
                    nyt.m37101a(this.f29169c);
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
