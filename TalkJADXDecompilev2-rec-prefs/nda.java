package p000;

public final class nda extends nyx<nda> {
    public ndc f29542a;
    public ndd f29543b;
    public nde f29544c;
    public ndf f29545d;
    public ndb f29546e;

    public /* synthetic */ nzf m34387a(nyt nyt) {
        return m34386b(nyt);
    }

    public nda() {
        this.cachedSize = -1;
    }

    public void m34388a(nyu nyu) {
        if (this.f29542a != null) {
            nyu.m37182b(1, this.f29542a);
        }
        if (this.f29543b != null) {
            nyu.m37182b(2, this.f29543b);
        }
        if (this.f29544c != null) {
            nyu.m37182b(3, this.f29544c);
        }
        if (this.f29545d != null) {
            nyu.m37182b(4, this.f29545d);
        }
        if (this.f29546e != null) {
            nyu.m37182b(5, this.f29546e);
        }
        super.a(nyu);
    }

    protected int m34389b() {
        int b = super.b();
        if (this.f29542a != null) {
            b += nyu.m37145d(1, this.f29542a);
        }
        if (this.f29543b != null) {
            b += nyu.m37145d(2, this.f29543b);
        }
        if (this.f29544c != null) {
            b += nyu.m37145d(3, this.f29544c);
        }
        if (this.f29545d != null) {
            b += nyu.m37145d(4, this.f29545d);
        }
        if (this.f29546e != null) {
            return b + nyu.m37145d(5, this.f29546e);
        }
        return b;
    }

    private nda m34386b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f29542a == null) {
                        this.f29542a = new ndc();
                    }
                    nyt.m37101a(this.f29542a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f29543b == null) {
                        this.f29543b = new ndd();
                    }
                    nyt.m37101a(this.f29543b);
                    continue;
                case wi.dx /*26*/:
                    if (this.f29544c == null) {
                        this.f29544c = new nde();
                    }
                    nyt.m37101a(this.f29544c);
                    continue;
                case 34:
                    if (this.f29545d == null) {
                        this.f29545d = new ndf();
                    }
                    nyt.m37101a(this.f29545d);
                    continue;
                case 42:
                    if (this.f29546e == null) {
                        this.f29546e = new ndb();
                    }
                    nyt.m37101a(this.f29546e);
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
