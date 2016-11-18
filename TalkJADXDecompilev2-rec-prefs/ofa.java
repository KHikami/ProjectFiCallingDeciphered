package p000;

public final class ofa extends nyx<ofa> {
    private static volatile ofa[] f32557d;
    public String f32558a;
    public String[] f32559b;
    public oez[] f32560c;

    public /* synthetic */ nzf m38031a(nyt nyt) {
        return m38029b(nyt);
    }

    public static ofa[] m38030d() {
        if (f32557d == null) {
            synchronized (nzc.f31309c) {
                if (f32557d == null) {
                    f32557d = new ofa[0];
                }
            }
        }
        return f32557d;
    }

    public ofa() {
        this.f32558a = null;
        this.f32559b = nzl.f31332f;
        this.f32560c = oez.m38019d();
        this.cachedSize = -1;
    }

    public void m38032a(nyu nyu) {
        int i = 0;
        nyu.m37170a(1, this.f32558a);
        if (this.f32559b != null && this.f32559b.length > 0) {
            for (String str : this.f32559b) {
                if (str != null) {
                    nyu.m37170a(2, str);
                }
            }
        }
        if (this.f32560c != null && this.f32560c.length > 0) {
            while (i < this.f32560c.length) {
                nzf nzf = this.f32560c[i];
                if (nzf != null) {
                    nyu.m37182b(3, nzf);
                }
                i++;
            }
        }
        super.a(nyu);
    }

    protected int m38033b() {
        int i;
        int i2 = 0;
        int b = super.b() + nyu.m37137b(1, this.f32558a);
        if (this.f32559b == null || this.f32559b.length <= 0) {
            i = b;
        } else {
            int i3 = 0;
            int i4 = 0;
            for (String str : this.f32559b) {
                if (str != null) {
                    i4++;
                    i3 += nyu.m37140b(str);
                }
            }
            i = (b + i3) + (i4 * 1);
        }
        if (this.f32560c != null && this.f32560c.length > 0) {
            while (i2 < this.f32560c.length) {
                nzf nzf = this.f32560c[i2];
                if (nzf != null) {
                    i += nyu.m37145d(3, nzf);
                }
                i2++;
            }
        }
        return i;
    }

    private ofa m38029b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f32558a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    b = nzl.m37265b(nyt, 18);
                    a = this.f32559b == null ? 0 : this.f32559b.length;
                    obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f32559b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.m37117j();
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = nyt.m37117j();
                    this.f32559b = obj;
                    continue;
                case wi.dx /*26*/:
                    b = nzl.m37265b(nyt, 26);
                    if (this.f32560c == null) {
                        a = 0;
                    } else {
                        a = this.f32560c.length;
                    }
                    obj = new oez[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f32560c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new oez();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new oez();
                    nyt.m37101a(obj[a]);
                    this.f32560c = obj;
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
