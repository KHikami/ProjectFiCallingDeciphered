package p000;

public final class ock extends nyx<ock> {
    private static volatile ock[] f32256l;
    public Long f32257a;
    public int f32258b;
    public String f32259c;
    public byte[] f32260d;
    public byte[] f32261e;
    public ocv f32262f;
    public ocj f32263g;
    public byte[] f32264h;
    public Integer f32265i;
    public byte[] f32266j;
    public byte[] f32267k;

    public /* synthetic */ nzf m37751a(nyt nyt) {
        return m37749b(nyt);
    }

    public static ock[] m37750d() {
        if (f32256l == null) {
            synchronized (nzc.f31309c) {
                if (f32256l == null) {
                    f32256l = new ock[0];
                }
            }
        }
        return f32256l;
    }

    public ock() {
        this.f32257a = null;
        this.f32258b = nzf.UNSET_ENUM_VALUE;
        this.f32259c = null;
        this.f32260d = null;
        this.f32261e = null;
        this.f32264h = null;
        this.f32265i = null;
        this.f32266j = null;
        this.f32267k = null;
        this.cachedSize = -1;
    }

    public void m37752a(nyu nyu) {
        if (this.f32257a != null) {
            nyu.m37181b(1, this.f32257a.longValue());
        }
        if (this.f32258b != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(2, this.f32258b);
        }
        if (this.f32259c != null) {
            nyu.m37170a(3, this.f32259c);
        }
        if (this.f32260d != null) {
            nyu.m37173a(4, this.f32260d);
        }
        if (this.f32261e != null) {
            nyu.m37173a(5, this.f32261e);
        }
        if (this.f32262f != null) {
            nyu.m37182b(6, this.f32262f);
        }
        if (this.f32263g != null) {
            nyu.m37182b(7, this.f32263g);
        }
        if (this.f32264h != null) {
            nyu.m37173a(8, this.f32264h);
        }
        if (this.f32265i != null) {
            nyu.m37180b(9, this.f32265i.intValue());
        }
        if (this.f32266j != null) {
            nyu.m37173a(10, this.f32266j);
        }
        if (this.f32267k != null) {
            nyu.m37173a(11, this.f32267k);
        }
        super.a(nyu);
    }

    protected int m37753b() {
        int b = super.b();
        if (this.f32257a != null) {
            b += nyu.m37148f(1, this.f32257a.longValue());
        }
        if (this.f32258b != nzf.UNSET_ENUM_VALUE) {
            b += nyu.m37147f(2, this.f32258b);
        }
        if (this.f32259c != null) {
            b += nyu.m37137b(3, this.f32259c);
        }
        if (this.f32260d != null) {
            b += nyu.m37139b(4, this.f32260d);
        }
        if (this.f32261e != null) {
            b += nyu.m37139b(5, this.f32261e);
        }
        if (this.f32262f != null) {
            b += nyu.m37145d(6, this.f32262f);
        }
        if (this.f32263g != null) {
            b += nyu.m37145d(7, this.f32263g);
        }
        if (this.f32264h != null) {
            b += nyu.m37139b(8, this.f32264h);
        }
        if (this.f32265i != null) {
            this.f32265i.intValue();
            b += nyu.m37154h(9) + 4;
        }
        if (this.f32266j != null) {
            b += nyu.m37139b(10, this.f32266j);
        }
        if (this.f32267k != null) {
            return b + nyu.m37139b(11, this.f32267k);
        }
        return b;
    }

    private ock m37749b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f32257a = Long.valueOf(nyt.m37110e());
                    continue;
                case 16:
                    a = nyt.m37112f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                            this.f32258b = a;
                            break;
                        default:
                            continue;
                    }
                case wi.dx /*26*/:
                    this.f32259c = nyt.m37117j();
                    continue;
                case 34:
                    this.f32260d = nyt.m37118k();
                    continue;
                case 42:
                    this.f32261e = nyt.m37118k();
                    continue;
                case 50:
                    if (this.f32262f == null) {
                        this.f32262f = new ocv();
                    }
                    nyt.m37101a(this.f32262f);
                    continue;
                case 58:
                    if (this.f32263g == null) {
                        this.f32263g = new ocj();
                    }
                    nyt.m37101a(this.f32263g);
                    continue;
                case 66:
                    this.f32264h = nyt.m37118k();
                    continue;
                case 77:
                    this.f32265i = Integer.valueOf(nyt.m37115h());
                    continue;
                case 82:
                    this.f32266j = nyt.m37118k();
                    continue;
                case 90:
                    this.f32267k = nyt.m37118k();
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
