package p000;

public final class ohr extends nyx<ohr> {
    private static volatile ohr[] f32927g;
    public String f32928a;
    public Boolean f32929b;
    public Boolean f32930c;
    public Boolean f32931d;
    public ohs f32932e;
    public ohu f32933f;

    public /* synthetic */ nzf m38388a(nyt nyt) {
        return m38385b(nyt);
    }

    public static ohr[] m38386d() {
        if (f32927g == null) {
            synchronized (nzc.f31309c) {
                if (f32927g == null) {
                    f32927g = new ohr[0];
                }
            }
        }
        return f32927g;
    }

    public ohr() {
        m38387g();
    }

    private ohr m38387g() {
        this.f32928a = null;
        this.f32929b = null;
        this.f32930c = null;
        this.f32931d = null;
        this.f32932e = null;
        this.f32933f = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m38389a(nyu nyu) {
        if (this.f32928a != null) {
            nyu.m37170a(1, this.f32928a);
        }
        if (this.f32929b != null) {
            nyu.m37172a(8, this.f32929b.booleanValue());
        }
        if (this.f32930c != null) {
            nyu.m37172a(10, this.f32930c.booleanValue());
        }
        if (this.f32931d != null) {
            nyu.m37172a(12, this.f32931d.booleanValue());
        }
        if (this.f32932e != null) {
            nyu.m37182b(13, this.f32932e);
        }
        if (this.f32933f != null) {
            nyu.m37182b(101, this.f32933f);
        }
        super.a(nyu);
    }

    protected int m38390b() {
        int b = super.b();
        if (this.f32928a != null) {
            b += nyu.m37137b(1, this.f32928a);
        }
        if (this.f32929b != null) {
            this.f32929b.booleanValue();
            b += nyu.m37154h(8) + 1;
        }
        if (this.f32930c != null) {
            this.f32930c.booleanValue();
            b += nyu.m37154h(10) + 1;
        }
        if (this.f32931d != null) {
            this.f32931d.booleanValue();
            b += nyu.m37154h(12) + 1;
        }
        if (this.f32932e != null) {
            b += nyu.m37145d(13, this.f32932e);
        }
        if (this.f32933f != null) {
            return b + nyu.m37145d(101, this.f32933f);
        }
        return b;
    }

    private ohr m38385b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f32928a = nyt.m37117j();
                    continue;
                case 64:
                    this.f32929b = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 80:
                    this.f32930c = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 96:
                    this.f32931d = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 106:
                    if (this.f32932e == null) {
                        this.f32932e = new ohs();
                    }
                    nyt.m37101a(this.f32932e);
                    continue;
                case 810:
                    if (this.f32933f == null) {
                        this.f32933f = new ohu();
                    }
                    nyt.m37101a(this.f32933f);
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
