package p000;

public final class nry extends nyx<nry> {
    public String f30627a;
    public String f30628b;
    public String f30629c;
    public Float f30630d;
    public Float f30631e;
    public Integer f30632f;
    public Float f30633g;

    public /* synthetic */ nzf m36321a(nyt nyt) {
        return m36320b(nyt);
    }

    public nry() {
        this.f30627a = null;
        this.f30628b = null;
        this.f30629c = null;
        this.f30630d = null;
        this.f30631e = null;
        this.f30632f = null;
        this.f30633g = null;
        this.cachedSize = -1;
    }

    public void m36322a(nyu nyu) {
        if (this.f30627a != null) {
            nyu.m37170a(1, this.f30627a);
        }
        if (this.f30628b != null) {
            nyu.m37170a(2, this.f30628b);
        }
        if (this.f30629c != null) {
            nyu.m37170a(3, this.f30629c);
        }
        if (this.f30630d != null) {
            nyu.m37167a(4, this.f30630d.floatValue());
        }
        if (this.f30631e != null) {
            nyu.m37167a(5, this.f30631e.floatValue());
        }
        if (this.f30632f != null) {
            nyu.m37168a(6, this.f30632f.intValue());
        }
        if (this.f30633g != null) {
            nyu.m37167a(7, this.f30633g.floatValue());
        }
        super.a(nyu);
    }

    protected int m36323b() {
        int b = super.b();
        if (this.f30627a != null) {
            b += nyu.m37137b(1, this.f30627a);
        }
        if (this.f30628b != null) {
            b += nyu.m37137b(2, this.f30628b);
        }
        if (this.f30629c != null) {
            b += nyu.m37137b(3, this.f30629c);
        }
        if (this.f30630d != null) {
            this.f30630d.floatValue();
            b += nyu.m37154h(4) + 4;
        }
        if (this.f30631e != null) {
            this.f30631e.floatValue();
            b += nyu.m37154h(5) + 4;
        }
        if (this.f30632f != null) {
            b += nyu.m37147f(6, this.f30632f.intValue());
        }
        if (this.f30633g == null) {
            return b;
        }
        this.f30633g.floatValue();
        return b + (nyu.m37154h(7) + 4);
    }

    private nry m36320b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f30627a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    this.f30628b = nyt.m37117j();
                    continue;
                case wi.dx /*26*/:
                    this.f30629c = nyt.m37117j();
                    continue;
                case 37:
                    this.f30630d = Float.valueOf(nyt.m37106c());
                    continue;
                case 45:
                    this.f30631e = Float.valueOf(nyt.m37106c());
                    continue;
                case 48:
                    this.f30632f = Integer.valueOf(nyt.m37112f());
                    continue;
                case 61:
                    this.f30633g = Float.valueOf(nyt.m37106c());
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
