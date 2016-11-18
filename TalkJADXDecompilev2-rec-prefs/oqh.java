package p000;

public final class oqh extends nyx<oqh> {
    public String f33740a;
    public String f33741b;
    public String f33742c;
    public String f33743d;
    public Long f33744e;
    public String f33745f;
    public String f33746g;

    public /* synthetic */ nzf m39171a(nyt nyt) {
        return m39169b(nyt);
    }

    public oqh() {
        m39170d();
    }

    private oqh m39170d() {
        this.f33740a = null;
        this.f33741b = null;
        this.f33742c = null;
        this.f33743d = null;
        this.f33744e = null;
        this.f33745f = null;
        this.f33746g = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39172a(nyu nyu) {
        if (this.f33740a != null) {
            nyu.m37170a(1, this.f33740a);
        }
        if (this.f33741b != null) {
            nyu.m37170a(2, this.f33741b);
        }
        if (this.f33742c != null) {
            nyu.m37170a(3, this.f33742c);
        }
        if (this.f33744e != null) {
            nyu.m37181b(4, this.f33744e.longValue());
        }
        if (this.f33743d != null) {
            nyu.m37170a(5, this.f33743d);
        }
        if (this.f33745f != null) {
            nyu.m37170a(6, this.f33745f);
        }
        if (this.f33746g != null) {
            nyu.m37170a(7, this.f33746g);
        }
        super.a(nyu);
    }

    protected int m39173b() {
        int b = super.b();
        if (this.f33740a != null) {
            b += nyu.m37137b(1, this.f33740a);
        }
        if (this.f33741b != null) {
            b += nyu.m37137b(2, this.f33741b);
        }
        if (this.f33742c != null) {
            b += nyu.m37137b(3, this.f33742c);
        }
        if (this.f33744e != null) {
            b += nyu.m37148f(4, this.f33744e.longValue());
        }
        if (this.f33743d != null) {
            b += nyu.m37137b(5, this.f33743d);
        }
        if (this.f33745f != null) {
            b += nyu.m37137b(6, this.f33745f);
        }
        if (this.f33746g != null) {
            return b + nyu.m37137b(7, this.f33746g);
        }
        return b;
    }

    private oqh m39169b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f33740a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    this.f33741b = nyt.m37117j();
                    continue;
                case wi.dx /*26*/:
                    this.f33742c = nyt.m37117j();
                    continue;
                case 32:
                    this.f33744e = Long.valueOf(nyt.m37110e());
                    continue;
                case 42:
                    this.f33743d = nyt.m37117j();
                    continue;
                case 50:
                    this.f33745f = nyt.m37117j();
                    continue;
                case 58:
                    this.f33746g = nyt.m37117j();
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
