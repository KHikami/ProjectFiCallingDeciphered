package p000;

public final class nui extends nyx<nui> {
    public String f30835a;
    public Float f30836b;
    public Float f30837c;
    public String f30838d;
    public Integer f30839e;
    public Integer f30840f;
    public String f30841g;

    public /* synthetic */ nzf m36593a(nyt nyt) {
        return m36592b(nyt);
    }

    public nui() {
        this.f30835a = null;
        this.f30836b = null;
        this.f30837c = null;
        this.f30838d = null;
        this.f30839e = null;
        this.f30840f = null;
        this.f30841g = null;
        this.cachedSize = -1;
    }

    public void m36594a(nyu nyu) {
        if (this.f30835a != null) {
            nyu.m37170a(1, this.f30835a);
        }
        if (this.f30836b != null) {
            nyu.m37167a(2, this.f30836b.floatValue());
        }
        if (this.f30837c != null) {
            nyu.m37167a(3, this.f30837c.floatValue());
        }
        if (this.f30838d != null) {
            nyu.m37170a(4, this.f30838d);
        }
        if (this.f30839e != null) {
            nyu.m37168a(5, this.f30839e.intValue());
        }
        if (this.f30840f != null) {
            nyu.m37168a(6, this.f30840f.intValue());
        }
        if (this.f30841g != null) {
            nyu.m37170a(7, this.f30841g);
        }
        super.a(nyu);
    }

    protected int m36595b() {
        int b = super.b();
        if (this.f30835a != null) {
            b += nyu.m37137b(1, this.f30835a);
        }
        if (this.f30836b != null) {
            this.f30836b.floatValue();
            b += nyu.m37154h(2) + 4;
        }
        if (this.f30837c != null) {
            this.f30837c.floatValue();
            b += nyu.m37154h(3) + 4;
        }
        if (this.f30838d != null) {
            b += nyu.m37137b(4, this.f30838d);
        }
        if (this.f30839e != null) {
            b += nyu.m37147f(5, this.f30839e.intValue());
        }
        if (this.f30840f != null) {
            b += nyu.m37147f(6, this.f30840f.intValue());
        }
        if (this.f30841g != null) {
            return b + nyu.m37137b(7, this.f30841g);
        }
        return b;
    }

    private nui m36592b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f30835a = nyt.m37117j();
                    continue;
                case 21:
                    this.f30836b = Float.valueOf(nyt.m37106c());
                    continue;
                case 29:
                    this.f30837c = Float.valueOf(nyt.m37106c());
                    continue;
                case 34:
                    this.f30838d = nyt.m37117j();
                    continue;
                case 40:
                    this.f30839e = Integer.valueOf(nyt.m37112f());
                    continue;
                case 48:
                    this.f30840f = Integer.valueOf(nyt.m37112f());
                    continue;
                case 58:
                    this.f30841g = nyt.m37117j();
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
