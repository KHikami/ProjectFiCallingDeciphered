package p000;

public final class nau extends nyx<nau> {
    public String f29393a;
    public Integer f29394b;

    public /* synthetic */ nzf m34109a(nyt nyt) {
        return m34107b(nyt);
    }

    public nau() {
        m34108d();
    }

    private nau m34108d() {
        this.f29393a = null;
        this.f29394b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34110a(nyu nyu) {
        if (this.f29393a != null) {
            nyu.m37170a(1, this.f29393a);
        }
        if (this.f29394b != null) {
            nyu.m37168a(2, this.f29394b.intValue());
        }
        super.a(nyu);
    }

    protected int m34111b() {
        int b = super.b();
        if (this.f29393a != null) {
            b += nyu.m37137b(1, this.f29393a);
        }
        if (this.f29394b != null) {
            return b + nyu.m37147f(2, this.f29394b.intValue());
        }
        return b;
    }

    private nau m34107b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f29393a = nyt.m37117j();
                    continue;
                case 16:
                    this.f29394b = Integer.valueOf(nyt.m37112f());
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
