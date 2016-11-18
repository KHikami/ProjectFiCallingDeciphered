package defpackage;

public final class kln extends nyx<kln> {
    private static volatile kln[] g;
    public klk a;
    public String b;
    public Boolean c;
    public String d;
    public String[] e;
    public String f;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static kln[] d() {
        if (g == null) {
            synchronized (nzc.c) {
                if (g == null) {
                    g = new kln[0];
                }
            }
        }
        return g;
    }

    public kln() {
        g();
    }

    private kln g() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = nzl.f;
        this.f = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.b(1, this.a);
        }
        if (this.b != null) {
            nyu.a(2, this.b);
        }
        if (this.c != null) {
            nyu.a(3, this.c.booleanValue());
        }
        if (this.d != null) {
            nyu.a(4, this.d);
        }
        if (this.e != null && this.e.length > 0) {
            for (String str : this.e) {
                if (str != null) {
                    nyu.a(5, str);
                }
            }
        }
        if (this.f != null) {
            nyu.a(6, this.f);
        }
        super.a(nyu);
    }

    protected int b() {
        int i = 0;
        int b = super.b();
        if (this.a != null) {
            b += nyu.d(1, this.a);
        }
        if (this.b != null) {
            b += nyu.b(2, this.b);
        }
        if (this.c != null) {
            this.c.booleanValue();
            b += nyu.h(3) + 1;
        }
        if (this.d != null) {
            b += nyu.b(4, this.d);
        }
        if (this.e != null && this.e.length > 0) {
            int i2 = 0;
            int i3 = 0;
            while (i < this.e.length) {
                String str = this.e[i];
                if (str != null) {
                    i3++;
                    i2 += nyu.b(str);
                }
                i++;
            }
            b = (b + i2) + (i3 * 1);
        }
        if (this.f != null) {
            return b + nyu.b(6, this.f);
        }
        return b;
    }

    private kln b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.a == null) {
                        this.a = new klk();
                    }
                    nyt.a(this.a);
                    continue;
                case wi.dH /*18*/:
                    this.b = nyt.j();
                    continue;
                case wi.dA /*24*/:
                    this.c = Boolean.valueOf(nyt.i());
                    continue;
                case 34:
                    this.d = nyt.j();
                    continue;
                case 42:
                    int b = nzl.b(nyt, 42);
                    a = this.e == null ? 0 : this.e.length;
                    Object obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.e = obj;
                    continue;
                case 50:
                    this.f = nyt.j();
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
