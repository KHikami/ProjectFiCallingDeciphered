package defpackage;

public final class odb extends nyx<odb> {
    private static volatile odb[] f;
    public float[] a;
    public float[] b;
    public float[] c;
    public Integer d;
    public Integer e;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static odb[] d() {
        if (f == null) {
            synchronized (nzc.c) {
                if (f == null) {
                    f = new odb[0];
                }
            }
        }
        return f;
    }

    public odb() {
        this.a = nzl.c;
        this.b = nzl.c;
        this.c = nzl.c;
        this.d = null;
        this.e = null;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        int i = 0;
        if (this.a != null && this.a.length > 0) {
            for (float a : this.a) {
                nyu.a(1, a);
            }
        }
        if (this.b != null && this.b.length > 0) {
            for (float a2 : this.b) {
                nyu.a(2, a2);
            }
        }
        if (this.c != null && this.c.length > 0) {
            while (i < this.c.length) {
                nyu.a(3, this.c[i]);
                i++;
            }
        }
        if (this.d != null) {
            nyu.a(4, this.d.intValue());
        }
        if (this.e != null) {
            nyu.a(5, this.e.intValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null && this.a.length > 0) {
            b = (b + (this.a.length * 4)) + (this.a.length * 1);
        }
        if (this.b != null && this.b.length > 0) {
            b = (b + (this.b.length * 4)) + (this.b.length * 1);
        }
        if (this.c != null && this.c.length > 0) {
            b = (b + (this.c.length * 4)) + (this.c.length * 1);
        }
        if (this.d != null) {
            b += nyu.f(4, this.d.intValue());
        }
        if (this.e != null) {
            return b + nyu.f(5, this.e.intValue());
        }
        return b;
    }

    private odb b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int d;
            int i;
            Object obj;
            Object obj2;
            switch (a) {
                case 0:
                    break;
                case 10:
                    a = nyt.r();
                    d = nyt.d(a);
                    i = a / 4;
                    a = this.a == null ? 0 : this.a.length;
                    obj = new float[(i + a)];
                    if (a != 0) {
                        System.arraycopy(this.a, 0, obj, 0, a);
                    }
                    while (a < obj.length) {
                        obj[a] = nyt.c();
                        a++;
                    }
                    this.a = obj;
                    nyt.e(d);
                    continue;
                case 13:
                    d = nzl.b(nyt, 13);
                    a = this.a == null ? 0 : this.a.length;
                    obj2 = new float[(d + a)];
                    if (a != 0) {
                        System.arraycopy(this.a, 0, obj2, 0, a);
                    }
                    while (a < obj2.length - 1) {
                        obj2[a] = nyt.c();
                        nyt.a();
                        a++;
                    }
                    obj2[a] = nyt.c();
                    this.a = obj2;
                    continue;
                case wi.dH /*18*/:
                    a = nyt.r();
                    d = nyt.d(a);
                    i = a / 4;
                    a = this.b == null ? 0 : this.b.length;
                    obj = new float[(i + a)];
                    if (a != 0) {
                        System.arraycopy(this.b, 0, obj, 0, a);
                    }
                    while (a < obj.length) {
                        obj[a] = nyt.c();
                        a++;
                    }
                    this.b = obj;
                    nyt.e(d);
                    continue;
                case 21:
                    d = nzl.b(nyt, 21);
                    a = this.b == null ? 0 : this.b.length;
                    obj2 = new float[(d + a)];
                    if (a != 0) {
                        System.arraycopy(this.b, 0, obj2, 0, a);
                    }
                    while (a < obj2.length - 1) {
                        obj2[a] = nyt.c();
                        nyt.a();
                        a++;
                    }
                    obj2[a] = nyt.c();
                    this.b = obj2;
                    continue;
                case wi.dx /*26*/:
                    a = nyt.r();
                    d = nyt.d(a);
                    i = a / 4;
                    a = this.c == null ? 0 : this.c.length;
                    obj = new float[(i + a)];
                    if (a != 0) {
                        System.arraycopy(this.c, 0, obj, 0, a);
                    }
                    while (a < obj.length) {
                        obj[a] = nyt.c();
                        a++;
                    }
                    this.c = obj;
                    nyt.e(d);
                    continue;
                case 29:
                    d = nzl.b(nyt, 29);
                    a = this.c == null ? 0 : this.c.length;
                    obj2 = new float[(d + a)];
                    if (a != 0) {
                        System.arraycopy(this.c, 0, obj2, 0, a);
                    }
                    while (a < obj2.length - 1) {
                        obj2[a] = nyt.c();
                        nyt.a();
                        a++;
                    }
                    obj2[a] = nyt.c();
                    this.c = obj2;
                    continue;
                case 32:
                    this.d = Integer.valueOf(nyt.f());
                    continue;
                case 40:
                    this.e = Integer.valueOf(nyt.f());
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
