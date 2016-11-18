package p000;

public final class nlt extends nyx<nlt> {
    public Long f30179a;
    public Long f30180b;
    public nld f30181c;

    public /* synthetic */ nzf m35553a(nyt nyt) {
        return m35551b(nyt);
    }

    public nlt() {
        m35552d();
    }

    private nlt m35552d() {
        this.f30179a = null;
        this.f30180b = null;
        this.f30181c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35554a(nyu nyu) {
        if (this.f30179a != null) {
            nyu.m37181b(1, this.f30179a.longValue());
        }
        if (this.f30180b != null) {
            nyu.m37181b(2, this.f30180b.longValue());
        }
        if (this.f30181c != null) {
            nyu.m37182b(3, this.f30181c);
        }
        super.a(nyu);
    }

    protected int m35555b() {
        int b = super.b();
        if (this.f30179a != null) {
            b += nyu.m37148f(1, this.f30179a.longValue());
        }
        if (this.f30180b != null) {
            b += nyu.m37148f(2, this.f30180b.longValue());
        }
        if (this.f30181c != null) {
            return b + nyu.m37145d(3, this.f30181c);
        }
        return b;
    }

    private nlt m35551b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30179a = Long.valueOf(nyt.m37110e());
                    continue;
                case 16:
                    this.f30180b = Long.valueOf(nyt.m37110e());
                    continue;
                case wi.dx /*26*/:
                    if (this.f30181c == null) {
                        this.f30181c = new nld();
                    }
                    nyt.m37101a(this.f30181c);
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
