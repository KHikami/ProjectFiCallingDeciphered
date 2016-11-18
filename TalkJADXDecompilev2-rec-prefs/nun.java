package p000;

public final class nun extends nyx<nun> {
    public String f30901a;
    public Float f30902b;
    public Float f30903c;
    public String f30904d;
    public Integer f30905e;
    public Integer f30906f;
    public String f30907g;

    public /* synthetic */ nzf m36616a(nyt nyt) {
        return m36614b(nyt);
    }

    public nun() {
        m36615d();
    }

    private nun m36615d() {
        this.f30901a = null;
        this.f30902b = null;
        this.f30903c = null;
        this.f30904d = null;
        this.f30905e = null;
        this.f30906f = null;
        this.f30907g = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m36617a(nyu nyu) {
        if (this.f30901a != null) {
            nyu.m37170a(1, this.f30901a);
        }
        if (this.f30902b != null) {
            nyu.m37167a(2, this.f30902b.floatValue());
        }
        if (this.f30903c != null) {
            nyu.m37167a(3, this.f30903c.floatValue());
        }
        if (this.f30904d != null) {
            nyu.m37170a(4, this.f30904d);
        }
        if (this.f30905e != null) {
            nyu.m37168a(5, this.f30905e.intValue());
        }
        if (this.f30906f != null) {
            nyu.m37168a(6, this.f30906f.intValue());
        }
        if (this.f30907g != null) {
            nyu.m37170a(7, this.f30907g);
        }
        super.a(nyu);
    }

    protected int m36618b() {
        int b = super.b();
        if (this.f30901a != null) {
            b += nyu.m37137b(1, this.f30901a);
        }
        if (this.f30902b != null) {
            this.f30902b.floatValue();
            b += nyu.m37154h(2) + 4;
        }
        if (this.f30903c != null) {
            this.f30903c.floatValue();
            b += nyu.m37154h(3) + 4;
        }
        if (this.f30904d != null) {
            b += nyu.m37137b(4, this.f30904d);
        }
        if (this.f30905e != null) {
            b += nyu.m37147f(5, this.f30905e.intValue());
        }
        if (this.f30906f != null) {
            b += nyu.m37147f(6, this.f30906f.intValue());
        }
        if (this.f30907g != null) {
            return b + nyu.m37137b(7, this.f30907g);
        }
        return b;
    }

    private nun m36614b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f30901a = nyt.m37117j();
                    continue;
                case 21:
                    this.f30902b = Float.valueOf(nyt.m37106c());
                    continue;
                case 29:
                    this.f30903c = Float.valueOf(nyt.m37106c());
                    continue;
                case 34:
                    this.f30904d = nyt.m37117j();
                    continue;
                case 40:
                    this.f30905e = Integer.valueOf(nyt.m37112f());
                    continue;
                case 48:
                    this.f30906f = Integer.valueOf(nyt.m37112f());
                    continue;
                case 58:
                    this.f30907g = nyt.m37117j();
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
