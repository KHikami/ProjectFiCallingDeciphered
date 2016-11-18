package p000;

public final class ozl extends nyx<ozl> {
    public Float f34686a;
    public Integer f34687b;
    public Integer f34688c;
    public Integer f34689d;
    public Integer f34690e;

    public /* synthetic */ nzf m40028a(nyt nyt) {
        return m40026b(nyt);
    }

    public ozl() {
        m40027d();
    }

    private ozl m40027d() {
        this.f34686a = null;
        this.f34687b = null;
        this.f34688c = null;
        this.f34689d = null;
        this.f34690e = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m40029a(nyu nyu) {
        if (this.f34686a != null) {
            nyu.m37167a(1, this.f34686a.floatValue());
        }
        if (this.f34687b != null) {
            nyu.m37168a(2, this.f34687b.intValue());
        }
        if (this.f34688c != null) {
            nyu.m37168a(3, this.f34688c.intValue());
        }
        if (this.f34689d != null) {
            nyu.m37168a(4, this.f34689d.intValue());
        }
        if (this.f34690e != null) {
            nyu.m37168a(5, this.f34690e.intValue());
        }
        super.a(nyu);
    }

    protected int m40030b() {
        int b = super.b();
        if (this.f34686a != null) {
            this.f34686a.floatValue();
            b += nyu.m37154h(1) + 4;
        }
        if (this.f34687b != null) {
            b += nyu.m37147f(2, this.f34687b.intValue());
        }
        if (this.f34688c != null) {
            b += nyu.m37147f(3, this.f34688c.intValue());
        }
        if (this.f34689d != null) {
            b += nyu.m37147f(4, this.f34689d.intValue());
        }
        if (this.f34690e != null) {
            return b + nyu.m37147f(5, this.f34690e.intValue());
        }
        return b;
    }

    private ozl m40026b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 13:
                    this.f34686a = Float.valueOf(nyt.m37106c());
                    continue;
                case 16:
                    this.f34687b = Integer.valueOf(nyt.m37112f());
                    continue;
                case wi.dA /*24*/:
                    this.f34688c = Integer.valueOf(nyt.m37112f());
                    continue;
                case 32:
                    this.f34689d = Integer.valueOf(nyt.m37112f());
                    continue;
                case 40:
                    this.f34690e = Integer.valueOf(nyt.m37112f());
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
