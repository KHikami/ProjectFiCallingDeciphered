package p000;

public final class ogk extends nyx<ogk> {
    public Integer f32724a;
    public Integer f32725b;

    public /* synthetic */ nzf m38197a(nyt nyt) {
        return m38195b(nyt);
    }

    public ogk() {
        m38196d();
    }

    private ogk m38196d() {
        this.f32724a = null;
        this.f32725b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m38198a(nyu nyu) {
        if (this.f32724a != null) {
            nyu.m37168a(1, this.f32724a.intValue());
        }
        if (this.f32725b != null) {
            nyu.m37168a(2, this.f32725b.intValue());
        }
        super.a(nyu);
    }

    protected int m38199b() {
        int b = super.b();
        if (this.f32724a != null) {
            b += nyu.m37147f(1, this.f32724a.intValue());
        }
        if (this.f32725b != null) {
            return b + nyu.m37147f(2, this.f32725b.intValue());
        }
        return b;
    }

    private ogk m38195b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f32724a = Integer.valueOf(nyt.m37112f());
                    continue;
                case 16:
                    this.f32725b = Integer.valueOf(nyt.m37112f());
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
