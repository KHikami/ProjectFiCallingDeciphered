package defpackage;

public final class lkv extends nyx<lkv> {
    private static volatile lkv[] e;
    public String a;
    public String b;
    public int[] c;
    public int[] d;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static lkv[] d() {
        if (e == null) {
            synchronized (nzc.c) {
                if (e == null) {
                    e = new lkv[0];
                }
            }
        }
        return e;
    }

    public lkv() {
        g();
    }

    private lkv g() {
        this.a = null;
        this.b = null;
        this.c = nzl.a;
        this.d = nzl.a;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        int i = 0;
        if (this.a != null) {
            nyu.a(1, this.a);
        }
        if (this.b != null) {
            nyu.a(2, this.b);
        }
        if (this.c != null && this.c.length > 0) {
            for (int b : this.c) {
                nyu.b(3, b);
            }
        }
        if (this.d != null && this.d.length > 0) {
            while (i < this.d.length) {
                nyu.b(4, this.d[i]);
                i++;
            }
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.b(1, this.a);
        }
        if (this.b != null) {
            b += nyu.b(2, this.b);
        }
        if (this.c != null && this.c.length > 0) {
            b = (b + (this.c.length * 4)) + (this.c.length * 1);
        }
        if (this.d == null || this.d.length <= 0) {
            return b;
        }
        return (b + (this.d.length * 4)) + (this.d.length * 1);
    }

    private lkv b(nyt nyt) {
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
                    this.a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    a = nyt.r();
                    d = nyt.d(a);
                    i = a / 4;
                    a = this.c == null ? 0 : this.c.length;
                    obj = new int[(i + a)];
                    if (a != 0) {
                        System.arraycopy(this.c, 0, obj, 0, a);
                    }
                    while (a < obj.length) {
                        obj[a] = nyt.h();
                        a++;
                    }
                    this.c = obj;
                    nyt.e(d);
                    continue;
                case 29:
                    d = nzl.b(nyt, 29);
                    a = this.c == null ? 0 : this.c.length;
                    obj2 = new int[(d + a)];
                    if (a != 0) {
                        System.arraycopy(this.c, 0, obj2, 0, a);
                    }
                    while (a < obj2.length - 1) {
                        obj2[a] = nyt.h();
                        nyt.a();
                        a++;
                    }
                    obj2[a] = nyt.h();
                    this.c = obj2;
                    continue;
                case 34:
                    a = nyt.r();
                    d = nyt.d(a);
                    i = a / 4;
                    a = this.d == null ? 0 : this.d.length;
                    obj = new int[(i + a)];
                    if (a != 0) {
                        System.arraycopy(this.d, 0, obj, 0, a);
                    }
                    while (a < obj.length) {
                        obj[a] = nyt.h();
                        a++;
                    }
                    this.d = obj;
                    nyt.e(d);
                    continue;
                case 37:
                    d = nzl.b(nyt, 37);
                    a = this.d == null ? 0 : this.d.length;
                    obj2 = new int[(d + a)];
                    if (a != 0) {
                        System.arraycopy(this.d, 0, obj2, 0, a);
                    }
                    while (a < obj2.length - 1) {
                        obj2[a] = nyt.h();
                        nyt.a();
                        a++;
                    }
                    obj2[a] = nyt.h();
                    this.d = obj2;
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
