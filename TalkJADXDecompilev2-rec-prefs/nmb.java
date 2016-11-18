package p000;

public final class nmb extends nyx<nmb> {
    public Boolean f30199a;
    public ngw f30200b;
    public ngv f30201c;
    public ntg f30202d;
    public Boolean f30203e;
    public Boolean f30204f;

    public /* synthetic */ nzf m35595a(nyt nyt) {
        return m35593b(nyt);
    }

    public nmb() {
        m35594d();
    }

    private nmb m35594d() {
        this.f30199a = null;
        this.f30200b = null;
        this.f30201c = null;
        this.f30202d = null;
        this.f30203e = null;
        this.f30204f = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35596a(nyu nyu) {
        if (this.f30199a != null) {
            nyu.m37172a(1, this.f30199a.booleanValue());
        }
        if (this.f30200b != null) {
            nyu.m37182b(2, this.f30200b);
        }
        if (this.f30201c != null) {
            nyu.m37182b(4, this.f30201c);
        }
        if (this.f30202d != null) {
            nyu.m37182b(5, this.f30202d);
        }
        if (this.f30203e != null) {
            nyu.m37172a(6, this.f30203e.booleanValue());
        }
        if (this.f30204f != null) {
            nyu.m37172a(7, this.f30204f.booleanValue());
        }
        super.a(nyu);
    }

    protected int m35597b() {
        int b = super.b();
        if (this.f30199a != null) {
            this.f30199a.booleanValue();
            b += nyu.m37154h(1) + 1;
        }
        if (this.f30200b != null) {
            b += nyu.m37145d(2, this.f30200b);
        }
        if (this.f30201c != null) {
            b += nyu.m37145d(4, this.f30201c);
        }
        if (this.f30202d != null) {
            b += nyu.m37145d(5, this.f30202d);
        }
        if (this.f30203e != null) {
            this.f30203e.booleanValue();
            b += nyu.m37154h(6) + 1;
        }
        if (this.f30204f == null) {
            return b;
        }
        this.f30204f.booleanValue();
        return b + (nyu.m37154h(7) + 1);
    }

    private nmb m35593b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30199a = Boolean.valueOf(nyt.m37116i());
                    continue;
                case wi.dH /*18*/:
                    if (this.f30200b == null) {
                        this.f30200b = new ngw();
                    }
                    nyt.m37101a(this.f30200b);
                    continue;
                case 34:
                    if (this.f30201c == null) {
                        this.f30201c = new ngv();
                    }
                    nyt.m37101a(this.f30201c);
                    continue;
                case 42:
                    if (this.f30202d == null) {
                        this.f30202d = new ntg();
                    }
                    nyt.m37101a(this.f30202d);
                    continue;
                case 48:
                    this.f30203e = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 56:
                    this.f30204f = Boolean.valueOf(nyt.m37116i());
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
