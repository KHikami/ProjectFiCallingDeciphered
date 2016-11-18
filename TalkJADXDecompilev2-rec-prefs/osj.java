package p000;

public final class osj extends nyx<osj> {
    public String f34148a;
    public Integer f34149b;
    public String f34150c;
    public String f34151d;

    public /* synthetic */ nzf m39569a(nyt nyt) {
        return m39567b(nyt);
    }

    public osj() {
        m39568d();
    }

    private osj m39568d() {
        this.f34148a = null;
        this.f34149b = null;
        this.f34150c = null;
        this.f34151d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39570a(nyu nyu) {
        if (this.f34148a != null) {
            nyu.m37170a(1, this.f34148a);
        }
        if (this.f34149b != null) {
            nyu.m37168a(2, this.f34149b.intValue());
        }
        if (this.f34150c != null) {
            nyu.m37170a(3, this.f34150c);
        }
        if (this.f34151d != null) {
            nyu.m37170a(4, this.f34151d);
        }
        super.a(nyu);
    }

    protected int m39571b() {
        int b = super.b();
        if (this.f34148a != null) {
            b += nyu.m37137b(1, this.f34148a);
        }
        if (this.f34149b != null) {
            b += nyu.m37147f(2, this.f34149b.intValue());
        }
        if (this.f34150c != null) {
            b += nyu.m37137b(3, this.f34150c);
        }
        if (this.f34151d != null) {
            return b + nyu.m37137b(4, this.f34151d);
        }
        return b;
    }

    private osj m39567b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f34148a = nyt.m37117j();
                    continue;
                case 16:
                    this.f34149b = Integer.valueOf(nyt.m37112f());
                    continue;
                case wi.dx /*26*/:
                    this.f34150c = nyt.m37117j();
                    continue;
                case 34:
                    this.f34151d = nyt.m37117j();
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
