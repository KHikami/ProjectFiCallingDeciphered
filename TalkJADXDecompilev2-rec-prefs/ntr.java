package p000;

public final class ntr extends nyx<ntr> {
    public Boolean f30771a;
    public nql f30772b;
    public ntw f30773c;
    public ntq f30774d;
    public npl f30775e;

    public /* synthetic */ nzf m36510a(nyt nyt) {
        return m36509b(nyt);
    }

    public ntr() {
        this.f30771a = null;
        this.cachedSize = -1;
    }

    public void m36511a(nyu nyu) {
        if (this.f30771a != null) {
            nyu.m37172a(1, this.f30771a.booleanValue());
        }
        if (this.f30772b != null) {
            nyu.m37182b(2, this.f30772b);
        }
        if (this.f30773c != null) {
            nyu.m37182b(3, this.f30773c);
        }
        if (this.f30774d != null) {
            nyu.m37182b(4, this.f30774d);
        }
        if (this.f30775e != null) {
            nyu.m37182b(5, this.f30775e);
        }
        super.a(nyu);
    }

    protected int m36512b() {
        int b = super.b();
        if (this.f30771a != null) {
            this.f30771a.booleanValue();
            b += nyu.m37154h(1) + 1;
        }
        if (this.f30772b != null) {
            b += nyu.m37145d(2, this.f30772b);
        }
        if (this.f30773c != null) {
            b += nyu.m37145d(3, this.f30773c);
        }
        if (this.f30774d != null) {
            b += nyu.m37145d(4, this.f30774d);
        }
        if (this.f30775e != null) {
            return b + nyu.m37145d(5, this.f30775e);
        }
        return b;
    }

    private ntr m36509b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30771a = Boolean.valueOf(nyt.m37116i());
                    continue;
                case wi.dH /*18*/:
                    if (this.f30772b == null) {
                        this.f30772b = new nql();
                    }
                    nyt.m37101a(this.f30772b);
                    continue;
                case wi.dx /*26*/:
                    if (this.f30773c == null) {
                        this.f30773c = new ntw();
                    }
                    nyt.m37101a(this.f30773c);
                    continue;
                case 34:
                    if (this.f30774d == null) {
                        this.f30774d = new ntq();
                    }
                    nyt.m37101a(this.f30774d);
                    continue;
                case 42:
                    if (this.f30775e == null) {
                        this.f30775e = new npl();
                    }
                    nyt.m37101a(this.f30775e);
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
