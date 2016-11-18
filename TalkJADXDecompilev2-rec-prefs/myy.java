package p000;

public final class myy extends nyx<myy> {
    private static volatile myy[] f29200f;
    public Integer f29201a;
    public mza f29202b;
    public Long f29203c;
    public myz f29204d;
    public Integer f29205e;

    public /* synthetic */ nzf m33886a(nyt nyt) {
        return m33883b(nyt);
    }

    public static myy[] m33884d() {
        if (f29200f == null) {
            synchronized (nzc.f31309c) {
                if (f29200f == null) {
                    f29200f = new myy[0];
                }
            }
        }
        return f29200f;
    }

    public myy() {
        m33885g();
    }

    private myy m33885g() {
        this.f29202b = null;
        this.f29203c = null;
        this.f29204d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m33887a(nyu nyu) {
        if (this.f29201a != null) {
            nyu.m37168a(1, this.f29201a.intValue());
        }
        if (this.f29202b != null) {
            nyu.m37182b(2, this.f29202b);
        }
        if (this.f29203c != null) {
            nyu.m37181b(3, this.f29203c.longValue());
        }
        if (this.f29204d != null) {
            nyu.m37182b(4, this.f29204d);
        }
        if (this.f29205e != null) {
            nyu.m37168a(5, this.f29205e.intValue());
        }
        super.a(nyu);
    }

    protected int m33888b() {
        int b = super.b();
        if (this.f29201a != null) {
            b += nyu.m37147f(1, this.f29201a.intValue());
        }
        if (this.f29202b != null) {
            b += nyu.m37145d(2, this.f29202b);
        }
        if (this.f29203c != null) {
            b += nyu.m37148f(3, this.f29203c.longValue());
        }
        if (this.f29204d != null) {
            b += nyu.m37145d(4, this.f29204d);
        }
        if (this.f29205e != null) {
            return b + nyu.m37147f(5, this.f29205e.intValue());
        }
        return b;
    }

    private myy m33883b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.f29201a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    if (this.f29202b == null) {
                        this.f29202b = new mza();
                    }
                    nyt.m37101a(this.f29202b);
                    continue;
                case wi.dA /*24*/:
                    this.f29203c = Long.valueOf(nyt.m37110e());
                    continue;
                case 34:
                    if (this.f29204d == null) {
                        this.f29204d = new myz();
                    }
                    nyt.m37101a(this.f29204d);
                    continue;
                case 40:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.f29205e = Integer.valueOf(a);
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
