package p000;

public final class npv extends nyx<npv> {
    public Integer f30459a;
    public npz f30460b;
    public npx f30461c;
    public npy f30462d;
    public npt f30463e;

    public /* synthetic */ nzf m36087a(nyt nyt) {
        return m36085b(nyt);
    }

    public npv() {
        m36086d();
    }

    private npv m36086d() {
        this.f30460b = null;
        this.f30461c = null;
        this.f30462d = null;
        this.f30463e = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m36088a(nyu nyu) {
        if (this.f30459a != null) {
            nyu.m37168a(1, this.f30459a.intValue());
        }
        if (this.f30460b != null) {
            nyu.m37182b(2, this.f30460b);
        }
        if (this.f30461c != null) {
            nyu.m37182b(3, this.f30461c);
        }
        if (this.f30462d != null) {
            nyu.m37182b(4, this.f30462d);
        }
        if (this.f30463e != null) {
            nyu.m37182b(5, this.f30463e);
        }
        super.a(nyu);
    }

    protected int m36089b() {
        int b = super.b();
        if (this.f30459a != null) {
            b += nyu.m37147f(1, this.f30459a.intValue());
        }
        if (this.f30460b != null) {
            b += nyu.m37145d(2, this.f30460b);
        }
        if (this.f30461c != null) {
            b += nyu.m37145d(3, this.f30461c);
        }
        if (this.f30462d != null) {
            b += nyu.m37145d(4, this.f30462d);
        }
        if (this.f30463e != null) {
            return b + nyu.m37145d(5, this.f30463e);
        }
        return b;
    }

    private npv m36085b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            this.f30459a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    if (this.f30460b == null) {
                        this.f30460b = new npz();
                    }
                    nyt.m37101a(this.f30460b);
                    continue;
                case wi.dx /*26*/:
                    if (this.f30461c == null) {
                        this.f30461c = new npx();
                    }
                    nyt.m37101a(this.f30461c);
                    continue;
                case 34:
                    if (this.f30462d == null) {
                        this.f30462d = new npy();
                    }
                    nyt.m37101a(this.f30462d);
                    continue;
                case 42:
                    if (this.f30463e == null) {
                        this.f30463e = new npt();
                    }
                    nyt.m37101a(this.f30463e);
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
