package p000;

public final class ndo extends nyx<ndo> {
    public String f29570a;
    public Long f29571b;
    public npi f29572c;

    public /* synthetic */ nzf m34444a(nyt nyt) {
        return m34443b(nyt);
    }

    public ndo() {
        this.f29570a = null;
        this.f29571b = null;
        this.cachedSize = -1;
    }

    public void m34445a(nyu nyu) {
        if (this.f29570a != null) {
            nyu.m37170a(1, this.f29570a);
        }
        if (this.f29571b != null) {
            nyu.m37181b(2, this.f29571b.longValue());
        }
        if (this.f29572c != null) {
            nyu.m37182b(3, this.f29572c);
        }
        super.a(nyu);
    }

    protected int m34446b() {
        int b = super.b();
        if (this.f29570a != null) {
            b += nyu.m37137b(1, this.f29570a);
        }
        if (this.f29571b != null) {
            b += nyu.m37148f(2, this.f29571b.longValue());
        }
        if (this.f29572c != null) {
            return b + nyu.m37145d(3, this.f29572c);
        }
        return b;
    }

    private ndo m34443b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f29570a = nyt.m37117j();
                    continue;
                case 16:
                    this.f29571b = Long.valueOf(nyt.m37110e());
                    continue;
                case wi.dx /*26*/:
                    if (this.f29572c == null) {
                        this.f29572c = new npi();
                    }
                    nyt.m37101a(this.f29572c);
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
