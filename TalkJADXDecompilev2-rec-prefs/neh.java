package p000;

public final class neh extends nyx<neh> {
    public Integer f29604a;
    public Integer f29605b;
    public nei f29606c;
    public String f29607d;

    public /* synthetic */ nzf m34542a(nyt nyt) {
        return m34540b(nyt);
    }

    public neh() {
        m34541d();
    }

    private neh m34541d() {
        this.f29606c = null;
        this.f29607d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34543a(nyu nyu) {
        if (this.f29604a != null) {
            nyu.m37168a(1, this.f29604a.intValue());
        }
        if (this.f29606c != null) {
            nyu.m37182b(2, this.f29606c);
        }
        if (this.f29607d != null) {
            nyu.m37170a(3, this.f29607d);
        }
        if (this.f29605b != null) {
            nyu.m37168a(4, this.f29605b.intValue());
        }
        super.a(nyu);
    }

    protected int m34544b() {
        int b = super.b();
        if (this.f29604a != null) {
            b += nyu.m37147f(1, this.f29604a.intValue());
        }
        if (this.f29606c != null) {
            b += nyu.m37145d(2, this.f29606c);
        }
        if (this.f29607d != null) {
            b += nyu.m37137b(3, this.f29607d);
        }
        if (this.f29605b != null) {
            return b + nyu.m37147f(4, this.f29605b.intValue());
        }
        return b;
    }

    private neh m34540b(nyt nyt) {
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
                        case 6:
                            this.f29604a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    if (this.f29606c == null) {
                        this.f29606c = new nei();
                    }
                    nyt.m37101a(this.f29606c);
                    continue;
                case wi.dx /*26*/:
                    this.f29607d = nyt.m37117j();
                    continue;
                case 32:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f29605b = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
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
