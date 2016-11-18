package p000;

public final class npo extends nyx<npo> {
    public nps f30442a;
    public npq f30443b;
    public npr f30444c;
    public npm f30445d;

    public /* synthetic */ nzf m36053a(nyt nyt) {
        return m36051b(nyt);
    }

    public npo() {
        m36052d();
    }

    private npo m36052d() {
        this.f30442a = null;
        this.f30443b = null;
        this.f30444c = null;
        this.f30445d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m36054a(nyu nyu) {
        if (this.f30442a != null) {
            nyu.m37182b(1, this.f30442a);
        }
        if (this.f30443b != null) {
            nyu.m37182b(2, this.f30443b);
        }
        if (this.f30444c != null) {
            nyu.m37182b(3, this.f30444c);
        }
        if (this.f30445d != null) {
            nyu.m37182b(4, this.f30445d);
        }
        super.a(nyu);
    }

    protected int m36055b() {
        int b = super.b();
        if (this.f30442a != null) {
            b += nyu.m37145d(1, this.f30442a);
        }
        if (this.f30443b != null) {
            b += nyu.m37145d(2, this.f30443b);
        }
        if (this.f30444c != null) {
            b += nyu.m37145d(3, this.f30444c);
        }
        if (this.f30445d != null) {
            return b + nyu.m37145d(4, this.f30445d);
        }
        return b;
    }

    private npo m36051b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f30442a == null) {
                        this.f30442a = new nps();
                    }
                    nyt.m37101a(this.f30442a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f30443b == null) {
                        this.f30443b = new npq();
                    }
                    nyt.m37101a(this.f30443b);
                    continue;
                case wi.dx /*26*/:
                    if (this.f30444c == null) {
                        this.f30444c = new npr();
                    }
                    nyt.m37101a(this.f30444c);
                    continue;
                case 34:
                    if (this.f30445d == null) {
                        this.f30445d = new npm();
                    }
                    nyt.m37101a(this.f30445d);
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
