package p000;

public final class ogg extends nyx<ogg> {
    private static volatile ogg[] f32709e;
    public Integer f32710a;
    public Double f32711b;
    public Double f32712c;
    public Integer f32713d;

    public /* synthetic */ nzf m38178a(nyt nyt) {
        return m38175b(nyt);
    }

    public static ogg[] m38176d() {
        if (f32709e == null) {
            synchronized (nzc.f31309c) {
                if (f32709e == null) {
                    f32709e = new ogg[0];
                }
            }
        }
        return f32709e;
    }

    public ogg() {
        m38177g();
    }

    private ogg m38177g() {
        this.f32711b = null;
        this.f32712c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m38179a(nyu nyu) {
        if (this.f32711b != null) {
            nyu.m37166a(1, this.f32711b.doubleValue());
        }
        if (this.f32712c != null) {
            nyu.m37166a(2, this.f32712c.doubleValue());
        }
        if (this.f32713d != null) {
            nyu.m37168a(3, this.f32713d.intValue());
        }
        if (this.f32710a != null) {
            nyu.m37168a(4, this.f32710a.intValue());
        }
        super.a(nyu);
    }

    protected int m38180b() {
        int b = super.b();
        if (this.f32711b != null) {
            this.f32711b.doubleValue();
            b += nyu.m37154h(1) + 8;
        }
        if (this.f32712c != null) {
            this.f32712c.doubleValue();
            b += nyu.m37154h(2) + 8;
        }
        if (this.f32713d != null) {
            b += nyu.m37147f(3, this.f32713d.intValue());
        }
        if (this.f32710a != null) {
            return b + nyu.m37147f(4, this.f32710a.intValue());
        }
        return b;
    }

    private ogg m38175b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 9:
                    this.f32711b = Double.valueOf(nyt.m37104b());
                    continue;
                case wi.dK /*17*/:
                    this.f32712c = Double.valueOf(nyt.m37104b());
                    continue;
                case wi.dA /*24*/:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                            this.f32713d = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 32:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f32710a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
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
