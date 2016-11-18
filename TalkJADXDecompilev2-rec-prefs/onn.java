package p000;

public final class onn extends nyx<onn> {
    public Float f33316a;
    public Integer f33317b;
    public Integer f33318c;

    public /* synthetic */ nzf m38820a(nyt nyt) {
        return m38819b(nyt);
    }

    public onn() {
        this.f33316a = null;
        this.f33317b = null;
        this.f33318c = null;
        this.cachedSize = -1;
    }

    public void m38821a(nyu nyu) {
        if (this.f33316a != null) {
            nyu.m37167a(1, this.f33316a.floatValue());
        }
        if (this.f33317b != null) {
            nyu.m37168a(2, this.f33317b.intValue());
        }
        if (this.f33318c != null) {
            nyu.m37168a(3, this.f33318c.intValue());
        }
        super.a(nyu);
    }

    protected int m38822b() {
        int b = super.b();
        if (this.f33316a != null) {
            this.f33316a.floatValue();
            b += nyu.m37154h(1) + 4;
        }
        if (this.f33317b != null) {
            b += nyu.m37147f(2, this.f33317b.intValue());
        }
        if (this.f33318c != null) {
            return b + nyu.m37147f(3, this.f33318c.intValue());
        }
        return b;
    }

    private onn m38819b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 13:
                    this.f33316a = Float.valueOf(nyt.m37106c());
                    continue;
                case 16:
                    this.f33317b = Integer.valueOf(nyt.m37112f());
                    continue;
                case wi.dA /*24*/:
                    this.f33318c = Integer.valueOf(nyt.m37112f());
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
