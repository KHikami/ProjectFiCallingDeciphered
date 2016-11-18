package defpackage;

public final class ocs extends nyx<ocs> {
    private static volatile ocs[] h;
    public String a;
    public String b;
    public String[] c;
    public int d;
    public String e;
    public String f;
    public String g;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static ocs[] d() {
        if (h == null) {
            synchronized (nzc.c) {
                if (h == null) {
                    h = new ocs[0];
                }
            }
        }
        return h;
    }

    public ocs() {
        this.a = null;
        this.b = null;
        this.c = nzl.f;
        this.d = nzf.UNSET_ENUM_VALUE;
        this.e = null;
        this.f = null;
        this.g = null;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a);
        }
        if (this.b != null) {
            nyu.a(2, this.b);
        }
        if (this.c != null && this.c.length > 0) {
            for (String str : this.c) {
                if (str != null) {
                    nyu.a(3, str);
                }
            }
        }
        if (this.d != nzf.UNSET_ENUM_VALUE) {
            nyu.a(4, this.d);
        }
        if (this.e != null) {
            nyu.a(5, this.e);
        }
        if (this.f != null) {
            nyu.a(6, this.f);
        }
        if (this.g != null) {
            nyu.a(7, this.g);
        }
        super.a(nyu);
    }

    protected int b() {
        int i = 0;
        int b = super.b();
        if (this.a != null) {
            b += nyu.b(1, this.a);
        }
        if (this.b != null) {
            b += nyu.b(2, this.b);
        }
        if (this.c != null && this.c.length > 0) {
            int i2 = 0;
            int i3 = 0;
            while (i < this.c.length) {
                String str = this.c[i];
                if (str != null) {
                    i3++;
                    i2 += nyu.b(str);
                }
                i++;
            }
            b = (b + i2) + (i3 * 1);
        }
        if (this.d != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(4, this.d);
        }
        if (this.e != null) {
            b += nyu.b(5, this.e);
        }
        if (this.f != null) {
            b += nyu.b(6, this.f);
        }
        if (this.g != null) {
            return b + nyu.b(7, this.g);
        }
        return b;
    }

    private ocs b(nyt nyt) {
        while (true) {
            int a = nyt.a();
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
                    int b = nzl.b(nyt, 26);
                    a = this.c == null ? 0 : this.c.length;
                    Object obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.c = obj;
                    continue;
                case 32:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 3:
                            this.d = a;
                            break;
                        default:
                            continue;
                    }
                case 42:
                    this.e = nyt.j();
                    continue;
                case 50:
                    this.f = nyt.j();
                    continue;
                case 58:
                    this.g = nyt.j();
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
