package p000;

public final class osa extends nyx<osa> {
    public Integer f34104a;
    public Integer f34105b;
    public Integer f34106c;
    public Integer f34107d;
    public Integer f34108e;

    public /* synthetic */ nzf m39521a(nyt nyt) {
        return m39519b(nyt);
    }

    public osa() {
        m39520d();
    }

    private osa m39520d() {
        this.f34104a = null;
        this.f34105b = null;
        this.f34106c = null;
        this.f34107d = null;
        this.f34108e = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39522a(nyu nyu) {
        if (this.f34104a != null) {
            nyu.m37168a(1, this.f34104a.intValue());
        }
        if (this.f34105b != null) {
            nyu.m37168a(2, this.f34105b.intValue());
        }
        if (this.f34106c != null) {
            nyu.m37168a(3, this.f34106c.intValue());
        }
        if (this.f34107d != null) {
            nyu.m37168a(4, this.f34107d.intValue());
        }
        if (this.f34108e != null) {
            nyu.m37168a(5, this.f34108e.intValue());
        }
        super.a(nyu);
    }

    protected int m39523b() {
        int b = super.b();
        if (this.f34104a != null) {
            b += nyu.m37147f(1, this.f34104a.intValue());
        }
        if (this.f34105b != null) {
            b += nyu.m37147f(2, this.f34105b.intValue());
        }
        if (this.f34106c != null) {
            b += nyu.m37147f(3, this.f34106c.intValue());
        }
        if (this.f34107d != null) {
            b += nyu.m37147f(4, this.f34107d.intValue());
        }
        if (this.f34108e != null) {
            return b + nyu.m37147f(5, this.f34108e.intValue());
        }
        return b;
    }

    private osa m39519b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f34104a = Integer.valueOf(nyt.m37112f());
                    continue;
                case 16:
                    this.f34105b = Integer.valueOf(nyt.m37112f());
                    continue;
                case wi.dA /*24*/:
                    this.f34106c = Integer.valueOf(nyt.m37112f());
                    continue;
                case 32:
                    this.f34107d = Integer.valueOf(nyt.m37112f());
                    continue;
                case 40:
                    this.f34108e = Integer.valueOf(nyt.m37112f());
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
