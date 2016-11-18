package p000;

public final class nsk extends nyx<nsk> {
    public Boolean f30706a;
    public nql f30707b;
    public npl f30708c;
    public ntf f30709d;
    public Boolean f30710e;
    public Boolean f30711f;

    public /* synthetic */ nzf m36371a(nyt nyt) {
        return m36370b(nyt);
    }

    public nsk() {
        this.f30706a = null;
        this.f30710e = null;
        this.f30711f = null;
        this.cachedSize = -1;
    }

    public void m36372a(nyu nyu) {
        if (this.f30706a != null) {
            nyu.m37172a(1, this.f30706a.booleanValue());
        }
        if (this.f30707b != null) {
            nyu.m37182b(2, this.f30707b);
        }
        if (this.f30708c != null) {
            nyu.m37182b(4, this.f30708c);
        }
        if (this.f30709d != null) {
            nyu.m37182b(5, this.f30709d);
        }
        if (this.f30710e != null) {
            nyu.m37172a(6, this.f30710e.booleanValue());
        }
        if (this.f30711f != null) {
            nyu.m37172a(7, this.f30711f.booleanValue());
        }
        super.a(nyu);
    }

    protected int m36373b() {
        int b = super.b();
        if (this.f30706a != null) {
            this.f30706a.booleanValue();
            b += nyu.m37154h(1) + 1;
        }
        if (this.f30707b != null) {
            b += nyu.m37145d(2, this.f30707b);
        }
        if (this.f30708c != null) {
            b += nyu.m37145d(4, this.f30708c);
        }
        if (this.f30709d != null) {
            b += nyu.m37145d(5, this.f30709d);
        }
        if (this.f30710e != null) {
            this.f30710e.booleanValue();
            b += nyu.m37154h(6) + 1;
        }
        if (this.f30711f == null) {
            return b;
        }
        this.f30711f.booleanValue();
        return b + (nyu.m37154h(7) + 1);
    }

    private nsk m36370b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30706a = Boolean.valueOf(nyt.m37116i());
                    continue;
                case wi.dH /*18*/:
                    if (this.f30707b == null) {
                        this.f30707b = new nql();
                    }
                    nyt.m37101a(this.f30707b);
                    continue;
                case 34:
                    if (this.f30708c == null) {
                        this.f30708c = new npl();
                    }
                    nyt.m37101a(this.f30708c);
                    continue;
                case 42:
                    if (this.f30709d == null) {
                        this.f30709d = new ntf();
                    }
                    nyt.m37101a(this.f30709d);
                    continue;
                case 48:
                    this.f30710e = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 56:
                    this.f30711f = Boolean.valueOf(nyt.m37116i());
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
