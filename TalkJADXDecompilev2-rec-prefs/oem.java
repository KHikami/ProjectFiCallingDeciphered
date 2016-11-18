package p000;

public final class oem extends nyx<oem> {
    public Float f32465a;
    public Integer f32466b;
    public Integer f32467c;
    public Integer f32468d;
    public Integer f32469e;

    public /* synthetic */ nzf m37963a(nyt nyt) {
        return m37962b(nyt);
    }

    public oem() {
        this.f32465a = null;
        this.f32466b = null;
        this.f32467c = null;
        this.f32468d = null;
        this.f32469e = null;
        this.cachedSize = -1;
    }

    public void m37964a(nyu nyu) {
        if (this.f32465a != null) {
            nyu.m37167a(1, this.f32465a.floatValue());
        }
        if (this.f32466b != null) {
            nyu.m37168a(2, this.f32466b.intValue());
        }
        if (this.f32467c != null) {
            nyu.m37168a(3, this.f32467c.intValue());
        }
        if (this.f32468d != null) {
            nyu.m37168a(4, this.f32468d.intValue());
        }
        if (this.f32469e != null) {
            nyu.m37168a(5, this.f32469e.intValue());
        }
        super.a(nyu);
    }

    protected int m37965b() {
        int b = super.b();
        if (this.f32465a != null) {
            this.f32465a.floatValue();
            b += nyu.m37154h(1) + 4;
        }
        if (this.f32466b != null) {
            b += nyu.m37147f(2, this.f32466b.intValue());
        }
        if (this.f32467c != null) {
            b += nyu.m37147f(3, this.f32467c.intValue());
        }
        if (this.f32468d != null) {
            b += nyu.m37147f(4, this.f32468d.intValue());
        }
        if (this.f32469e != null) {
            return b + nyu.m37147f(5, this.f32469e.intValue());
        }
        return b;
    }

    private oem m37962b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 13:
                    this.f32465a = Float.valueOf(nyt.m37106c());
                    continue;
                case 16:
                    this.f32466b = Integer.valueOf(nyt.m37112f());
                    continue;
                case wi.dA /*24*/:
                    this.f32467c = Integer.valueOf(nyt.m37112f());
                    continue;
                case 32:
                    this.f32468d = Integer.valueOf(nyt.m37112f());
                    continue;
                case 40:
                    this.f32469e = Integer.valueOf(nyt.m37112f());
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
