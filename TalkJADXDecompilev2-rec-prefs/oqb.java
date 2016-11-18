package p000;

public final class oqb extends nyx<oqb> {
    public String f33699a;
    public String f33700b;
    public String f33701c;
    public Boolean f33702d;
    public String f33703e;

    public /* synthetic */ nzf m39140a(nyt nyt) {
        return m39138b(nyt);
    }

    public oqb() {
        m39139d();
    }

    private oqb m39139d() {
        this.f33699a = null;
        this.f33700b = null;
        this.f33701c = null;
        this.f33702d = null;
        this.f33703e = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39141a(nyu nyu) {
        if (this.f33699a != null) {
            nyu.m37170a(1, this.f33699a);
        }
        if (this.f33700b != null) {
            nyu.m37170a(2, this.f33700b);
        }
        if (this.f33701c != null) {
            nyu.m37170a(3, this.f33701c);
        }
        if (this.f33702d != null) {
            nyu.m37172a(5, this.f33702d.booleanValue());
        }
        if (this.f33703e != null) {
            nyu.m37170a(8, this.f33703e);
        }
        super.a(nyu);
    }

    protected int m39142b() {
        int b = super.b();
        if (this.f33699a != null) {
            b += nyu.m37137b(1, this.f33699a);
        }
        if (this.f33700b != null) {
            b += nyu.m37137b(2, this.f33700b);
        }
        if (this.f33701c != null) {
            b += nyu.m37137b(3, this.f33701c);
        }
        if (this.f33702d != null) {
            this.f33702d.booleanValue();
            b += nyu.m37154h(5) + 1;
        }
        if (this.f33703e != null) {
            return b + nyu.m37137b(8, this.f33703e);
        }
        return b;
    }

    private oqb m39138b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f33699a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    this.f33700b = nyt.m37117j();
                    continue;
                case wi.dx /*26*/:
                    this.f33701c = nyt.m37117j();
                    continue;
                case 40:
                    this.f33702d = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 66:
                    this.f33703e = nyt.m37117j();
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
