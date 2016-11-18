package defpackage;

public final class osv extends nyx<osv> {
    private static volatile osv[] f;
    public String[] a;
    public String b;
    public osu[] c;
    public Boolean d;
    public Boolean e;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static osv[] d() {
        if (f == null) {
            synchronized (nzc.c) {
                if (f == null) {
                    f = new osv[0];
                }
            }
        }
        return f;
    }

    public osv() {
        g();
    }

    private osv g() {
        this.a = nzl.f;
        this.b = null;
        this.c = osu.d();
        this.d = null;
        this.e = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        int i = 0;
        if (this.a != null && this.a.length > 0) {
            for (String str : this.a) {
                if (str != null) {
                    nyu.a(1, str);
                }
            }
        }
        if (this.b != null) {
            nyu.a(2, this.b);
        }
        if (this.c != null && this.c.length > 0) {
            while (i < this.c.length) {
                nzf nzf = this.c[i];
                if (nzf != null) {
                    nyu.b(3, nzf);
                }
                i++;
            }
        }
        if (this.d != null) {
            nyu.a(4, this.d.booleanValue());
        }
        if (this.e != null) {
            nyu.a(5, this.e.booleanValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int i;
        int i2 = 0;
        int b = super.b();
        if (this.a == null || this.a.length <= 0) {
            i = b;
        } else {
            int i3 = 0;
            int i4 = 0;
            for (String str : this.a) {
                if (str != null) {
                    i4++;
                    i3 += nyu.b(str);
                }
            }
            i = (b + i3) + (i4 * 1);
        }
        if (this.b != null) {
            i += nyu.b(2, this.b);
        }
        if (this.c != null && this.c.length > 0) {
            while (i2 < this.c.length) {
                nzf nzf = this.c[i2];
                if (nzf != null) {
                    i += nyu.d(3, nzf);
                }
                i2++;
            }
        }
        if (this.d != null) {
            this.d.booleanValue();
            i += nyu.h(4) + 1;
        }
        if (this.e == null) {
            return i;
        }
        this.e.booleanValue();
        return i + (nyu.h(5) + 1);
    }

    private osv b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    b = nzl.b(nyt, 10);
                    a = this.a == null ? 0 : this.a.length;
                    obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.a = obj;
                    continue;
                case wi.dH /*18*/:
                    this.b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    b = nzl.b(nyt, 26);
                    if (this.c == null) {
                        a = 0;
                    } else {
                        a = this.c.length;
                    }
                    obj = new osu[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new osu();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new osu();
                    nyt.a(obj[a]);
                    this.c = obj;
                    continue;
                case 32:
                    this.d = Boolean.valueOf(nyt.i());
                    continue;
                case 40:
                    this.e = Boolean.valueOf(nyt.i());
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
