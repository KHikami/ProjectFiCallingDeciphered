package p000;

public final class ocs extends nyx<ocs> {
    private static volatile ocs[] f32289h;
    public String f32290a;
    public String f32291b;
    public String[] f32292c;
    public int f32293d;
    public String f32294e;
    public String f32295f;
    public String f32296g;

    public /* synthetic */ nzf m37784a(nyt nyt) {
        return m37782b(nyt);
    }

    public static ocs[] m37783d() {
        if (f32289h == null) {
            synchronized (nzc.f31309c) {
                if (f32289h == null) {
                    f32289h = new ocs[0];
                }
            }
        }
        return f32289h;
    }

    public ocs() {
        this.f32290a = null;
        this.f32291b = null;
        this.f32292c = nzl.f31332f;
        this.f32293d = nzf.UNSET_ENUM_VALUE;
        this.f32294e = null;
        this.f32295f = null;
        this.f32296g = null;
        this.cachedSize = -1;
    }

    public void m37785a(nyu nyu) {
        if (this.f32290a != null) {
            nyu.m37170a(1, this.f32290a);
        }
        if (this.f32291b != null) {
            nyu.m37170a(2, this.f32291b);
        }
        if (this.f32292c != null && this.f32292c.length > 0) {
            for (String str : this.f32292c) {
                if (str != null) {
                    nyu.m37170a(3, str);
                }
            }
        }
        if (this.f32293d != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(4, this.f32293d);
        }
        if (this.f32294e != null) {
            nyu.m37170a(5, this.f32294e);
        }
        if (this.f32295f != null) {
            nyu.m37170a(6, this.f32295f);
        }
        if (this.f32296g != null) {
            nyu.m37170a(7, this.f32296g);
        }
        super.a(nyu);
    }

    protected int m37786b() {
        int i = 0;
        int b = super.b();
        if (this.f32290a != null) {
            b += nyu.m37137b(1, this.f32290a);
        }
        if (this.f32291b != null) {
            b += nyu.m37137b(2, this.f32291b);
        }
        if (this.f32292c != null && this.f32292c.length > 0) {
            int i2 = 0;
            int i3 = 0;
            while (i < this.f32292c.length) {
                String str = this.f32292c[i];
                if (str != null) {
                    i3++;
                    i2 += nyu.m37140b(str);
                }
                i++;
            }
            b = (b + i2) + (i3 * 1);
        }
        if (this.f32293d != nzf.UNSET_ENUM_VALUE) {
            b += nyu.m37147f(4, this.f32293d);
        }
        if (this.f32294e != null) {
            b += nyu.m37137b(5, this.f32294e);
        }
        if (this.f32295f != null) {
            b += nyu.m37137b(6, this.f32295f);
        }
        if (this.f32296g != null) {
            return b + nyu.m37137b(7, this.f32296g);
        }
        return b;
    }

    private ocs m37782b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f32290a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    this.f32291b = nyt.m37117j();
                    continue;
                case wi.dx /*26*/:
                    int b = nzl.m37265b(nyt, 26);
                    a = this.f32292c == null ? 0 : this.f32292c.length;
                    Object obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f32292c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.m37117j();
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = nyt.m37117j();
                    this.f32292c = obj;
                    continue;
                case 32:
                    a = nyt.m37112f();
                    switch (a) {
                        case 1:
                        case 3:
                            this.f32293d = a;
                            break;
                        default:
                            continue;
                    }
                case 42:
                    this.f32294e = nyt.m37117j();
                    continue;
                case 50:
                    this.f32295f = nyt.m37117j();
                    continue;
                case 58:
                    this.f32296g = nyt.m37117j();
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
