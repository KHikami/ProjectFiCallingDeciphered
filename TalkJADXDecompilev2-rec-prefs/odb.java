package p000;

public final class odb extends nyx<odb> {
    private static volatile odb[] f32353f;
    public float[] f32354a;
    public float[] f32355b;
    public float[] f32356c;
    public Integer f32357d;
    public Integer f32358e;

    public /* synthetic */ nzf m37822a(nyt nyt) {
        return m37820b(nyt);
    }

    public static odb[] m37821d() {
        if (f32353f == null) {
            synchronized (nzc.f31309c) {
                if (f32353f == null) {
                    f32353f = new odb[0];
                }
            }
        }
        return f32353f;
    }

    public odb() {
        this.f32354a = nzl.f31329c;
        this.f32355b = nzl.f31329c;
        this.f32356c = nzl.f31329c;
        this.f32357d = null;
        this.f32358e = null;
        this.cachedSize = -1;
    }

    public void m37823a(nyu nyu) {
        int i = 0;
        if (this.f32354a != null && this.f32354a.length > 0) {
            for (float a : this.f32354a) {
                nyu.m37167a(1, a);
            }
        }
        if (this.f32355b != null && this.f32355b.length > 0) {
            for (float a2 : this.f32355b) {
                nyu.m37167a(2, a2);
            }
        }
        if (this.f32356c != null && this.f32356c.length > 0) {
            while (i < this.f32356c.length) {
                nyu.m37167a(3, this.f32356c[i]);
                i++;
            }
        }
        if (this.f32357d != null) {
            nyu.m37168a(4, this.f32357d.intValue());
        }
        if (this.f32358e != null) {
            nyu.m37168a(5, this.f32358e.intValue());
        }
        super.a(nyu);
    }

    protected int m37824b() {
        int b = super.b();
        if (this.f32354a != null && this.f32354a.length > 0) {
            b = (b + (this.f32354a.length * 4)) + (this.f32354a.length * 1);
        }
        if (this.f32355b != null && this.f32355b.length > 0) {
            b = (b + (this.f32355b.length * 4)) + (this.f32355b.length * 1);
        }
        if (this.f32356c != null && this.f32356c.length > 0) {
            b = (b + (this.f32356c.length * 4)) + (this.f32356c.length * 1);
        }
        if (this.f32357d != null) {
            b += nyu.m37147f(4, this.f32357d.intValue());
        }
        if (this.f32358e != null) {
            return b + nyu.m37147f(5, this.f32358e.intValue());
        }
        return b;
    }

    private odb m37820b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            int d;
            int i;
            Object obj;
            Object obj2;
            switch (a) {
                case 0:
                    break;
                case 10:
                    a = nyt.m37125r();
                    d = nyt.m37108d(a);
                    i = a / 4;
                    a = this.f32354a == null ? 0 : this.f32354a.length;
                    obj = new float[(i + a)];
                    if (a != 0) {
                        System.arraycopy(this.f32354a, 0, obj, 0, a);
                    }
                    while (a < obj.length) {
                        obj[a] = nyt.m37106c();
                        a++;
                    }
                    this.f32354a = obj;
                    nyt.m37111e(d);
                    continue;
                case 13:
                    d = nzl.m37265b(nyt, 13);
                    a = this.f32354a == null ? 0 : this.f32354a.length;
                    obj2 = new float[(d + a)];
                    if (a != 0) {
                        System.arraycopy(this.f32354a, 0, obj2, 0, a);
                    }
                    while (a < obj2.length - 1) {
                        obj2[a] = nyt.m37106c();
                        nyt.m37099a();
                        a++;
                    }
                    obj2[a] = nyt.m37106c();
                    this.f32354a = obj2;
                    continue;
                case wi.dH /*18*/:
                    a = nyt.m37125r();
                    d = nyt.m37108d(a);
                    i = a / 4;
                    a = this.f32355b == null ? 0 : this.f32355b.length;
                    obj = new float[(i + a)];
                    if (a != 0) {
                        System.arraycopy(this.f32355b, 0, obj, 0, a);
                    }
                    while (a < obj.length) {
                        obj[a] = nyt.m37106c();
                        a++;
                    }
                    this.f32355b = obj;
                    nyt.m37111e(d);
                    continue;
                case 21:
                    d = nzl.m37265b(nyt, 21);
                    a = this.f32355b == null ? 0 : this.f32355b.length;
                    obj2 = new float[(d + a)];
                    if (a != 0) {
                        System.arraycopy(this.f32355b, 0, obj2, 0, a);
                    }
                    while (a < obj2.length - 1) {
                        obj2[a] = nyt.m37106c();
                        nyt.m37099a();
                        a++;
                    }
                    obj2[a] = nyt.m37106c();
                    this.f32355b = obj2;
                    continue;
                case wi.dx /*26*/:
                    a = nyt.m37125r();
                    d = nyt.m37108d(a);
                    i = a / 4;
                    a = this.f32356c == null ? 0 : this.f32356c.length;
                    obj = new float[(i + a)];
                    if (a != 0) {
                        System.arraycopy(this.f32356c, 0, obj, 0, a);
                    }
                    while (a < obj.length) {
                        obj[a] = nyt.m37106c();
                        a++;
                    }
                    this.f32356c = obj;
                    nyt.m37111e(d);
                    continue;
                case 29:
                    d = nzl.m37265b(nyt, 29);
                    a = this.f32356c == null ? 0 : this.f32356c.length;
                    obj2 = new float[(d + a)];
                    if (a != 0) {
                        System.arraycopy(this.f32356c, 0, obj2, 0, a);
                    }
                    while (a < obj2.length - 1) {
                        obj2[a] = nyt.m37106c();
                        nyt.m37099a();
                        a++;
                    }
                    obj2[a] = nyt.m37106c();
                    this.f32356c = obj2;
                    continue;
                case 32:
                    this.f32357d = Integer.valueOf(nyt.m37112f());
                    continue;
                case 40:
                    this.f32358e = Integer.valueOf(nyt.m37112f());
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
