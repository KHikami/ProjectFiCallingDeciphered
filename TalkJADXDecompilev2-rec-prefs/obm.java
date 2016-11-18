package p000;

public final class obm extends nyx<obm> {
    public Long f31996a;
    public String f31997b;
    public String f31998c;
    public String f31999d;
    public String[] f32000e;
    public byte[] f32001f;

    public /* synthetic */ nzf m37641a(nyt nyt) {
        return m37640b(nyt);
    }

    public obm() {
        this.f31996a = null;
        this.f31997b = null;
        this.f31998c = null;
        this.f31999d = null;
        this.f32000e = nzl.f31332f;
        this.f32001f = null;
        this.cachedSize = -1;
    }

    public void m37642a(nyu nyu) {
        if (this.f31996a != null) {
            nyu.m37169a(1, this.f31996a.longValue());
        }
        if (this.f31997b != null) {
            nyu.m37170a(2, this.f31997b);
        }
        if (this.f31998c != null) {
            nyu.m37170a(3, this.f31998c);
        }
        if (this.f31999d != null) {
            nyu.m37170a(4, this.f31999d);
        }
        if (this.f32000e != null && this.f32000e.length > 0) {
            for (String str : this.f32000e) {
                if (str != null) {
                    nyu.m37170a(5, str);
                }
            }
        }
        if (this.f32001f != null) {
            nyu.m37173a(8, this.f32001f);
        }
        super.a(nyu);
    }

    protected int m37643b() {
        int i = 0;
        int b = super.b();
        if (this.f31996a != null) {
            b += nyu.m37146e(1, this.f31996a.longValue());
        }
        if (this.f31997b != null) {
            b += nyu.m37137b(2, this.f31997b);
        }
        if (this.f31998c != null) {
            b += nyu.m37137b(3, this.f31998c);
        }
        if (this.f31999d != null) {
            b += nyu.m37137b(4, this.f31999d);
        }
        if (this.f32000e != null && this.f32000e.length > 0) {
            int i2 = 0;
            int i3 = 0;
            while (i < this.f32000e.length) {
                String str = this.f32000e[i];
                if (str != null) {
                    i3++;
                    i2 += nyu.m37140b(str);
                }
                i++;
            }
            b = (b + i2) + (i3 * 1);
        }
        if (this.f32001f != null) {
            return b + nyu.m37139b(8, this.f32001f);
        }
        return b;
    }

    private obm m37640b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f31996a = Long.valueOf(nyt.m37109d());
                    continue;
                case wi.dH /*18*/:
                    this.f31997b = nyt.m37117j();
                    continue;
                case wi.dx /*26*/:
                    this.f31998c = nyt.m37117j();
                    continue;
                case 34:
                    this.f31999d = nyt.m37117j();
                    continue;
                case 42:
                    int b = nzl.m37265b(nyt, 42);
                    a = this.f32000e == null ? 0 : this.f32000e.length;
                    Object obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f32000e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.m37117j();
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = nyt.m37117j();
                    this.f32000e = obj;
                    continue;
                case 66:
                    this.f32001f = nyt.m37118k();
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
