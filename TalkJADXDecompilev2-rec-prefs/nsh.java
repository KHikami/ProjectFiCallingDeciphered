package p000;

public final class nsh extends nyx<nsh> {
    public Long f30699a;
    public Long f30700b;
    public nos f30701c;

    public /* synthetic */ nzf m36359a(nyt nyt) {
        return m36358b(nyt);
    }

    public nsh() {
        this.f30699a = null;
        this.f30700b = null;
        this.cachedSize = -1;
    }

    public void m36360a(nyu nyu) {
        if (this.f30699a != null) {
            nyu.m37181b(1, this.f30699a.longValue());
        }
        if (this.f30700b != null) {
            nyu.m37181b(2, this.f30700b.longValue());
        }
        if (this.f30701c != null) {
            nyu.m37182b(3, this.f30701c);
        }
        super.a(nyu);
    }

    protected int m36361b() {
        int b = super.b();
        if (this.f30699a != null) {
            b += nyu.m37148f(1, this.f30699a.longValue());
        }
        if (this.f30700b != null) {
            b += nyu.m37148f(2, this.f30700b.longValue());
        }
        if (this.f30701c != null) {
            return b + nyu.m37145d(3, this.f30701c);
        }
        return b;
    }

    private nsh m36358b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30699a = Long.valueOf(nyt.m37110e());
                    continue;
                case 16:
                    this.f30700b = Long.valueOf(nyt.m37110e());
                    continue;
                case wi.dx /*26*/:
                    if (this.f30701c == null) {
                        this.f30701c = new nos();
                    }
                    nyt.m37101a(this.f30701c);
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
