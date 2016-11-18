package p000;

public final class odi extends nyx<odi> {
    public Integer f32415a;
    public Integer f32416b;

    public /* synthetic */ nzf m37854a(nyt nyt) {
        return m37853b(nyt);
    }

    public odi() {
        this.f32415a = null;
        this.f32416b = null;
        this.cachedSize = -1;
    }

    public void m37855a(nyu nyu) {
        if (this.f32415a != null) {
            nyu.m37168a(1, this.f32415a.intValue());
        }
        if (this.f32416b != null) {
            nyu.m37168a(2, this.f32416b.intValue());
        }
        super.a(nyu);
    }

    protected int m37856b() {
        int b = super.b();
        if (this.f32415a != null) {
            b += nyu.m37147f(1, this.f32415a.intValue());
        }
        if (this.f32416b != null) {
            return b + nyu.m37147f(2, this.f32416b.intValue());
        }
        return b;
    }

    private odi m37853b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f32415a = Integer.valueOf(nyt.m37112f());
                    continue;
                case 16:
                    this.f32416b = Integer.valueOf(nyt.m37112f());
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
