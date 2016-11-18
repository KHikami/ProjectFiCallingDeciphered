package defpackage;

public final class myu extends nyx<myu> {
    private static volatile myu[] h;
    public String a;
    public naq b;
    public String[] c;
    public String d;
    public myl[] e;
    public nbu f;
    public myt[] g;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static myu[] d() {
        if (h == null) {
            synchronized (nzc.c) {
                if (h == null) {
                    h = new myu[0];
                }
            }
        }
        return h;
    }

    public myu() {
        g();
    }

    private myu g() {
        this.a = null;
        this.b = null;
        this.c = nzl.f;
        this.d = null;
        this.e = myl.d();
        this.f = null;
        this.g = myt.d();
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
            nyu.b(2, this.b);
        }
        if (this.c != null && this.c.length > 0) {
            for (String str : this.c) {
                if (str != null) {
                    nyu.a(3, str);
                }
            }
        }
        if (this.d != null) {
            nyu.a(4, this.d);
        }
        if (this.e != null && this.e.length > 0) {
            for (nzf nzf : this.e) {
                if (nzf != null) {
                    nyu.b(5, nzf);
                }
            }
        }
        if (this.f != null) {
            nyu.b(6, this.f);
        }
        if (this.g != null && this.g.length > 0) {
            while (i < this.g.length) {
                nzf nzf2 = this.g[i];
                if (nzf2 != null) {
                    nyu.b(7, nzf2);
                }
                i++;
            }
        }
        super.a(nyu);
    }

    protected int b() {
        int i;
        int i2 = 0;
        int b = super.b();
        if (this.a != null) {
            b += nyu.b(1, this.a);
        }
        if (this.b != null) {
            b += nyu.d(2, this.b);
        }
        if (this.c != null && this.c.length > 0) {
            int i3 = 0;
            int i4 = 0;
            for (String str : this.c) {
                if (str != null) {
                    i4++;
                    i3 += nyu.b(str);
                }
            }
            b = (b + i3) + (i4 * 1);
        }
        if (this.d != null) {
            b += nyu.b(4, this.d);
        }
        if (this.e != null && this.e.length > 0) {
            i = b;
            for (nzf nzf : this.e) {
                if (nzf != null) {
                    i += nyu.d(5, nzf);
                }
            }
            b = i;
        }
        if (this.f != null) {
            b += nyu.d(6, this.f);
        }
        if (this.g != null && this.g.length > 0) {
            while (i2 < this.g.length) {
                nzf nzf2 = this.g[i2];
                if (nzf2 != null) {
                    b += nyu.d(7, nzf2);
                }
                i2++;
            }
        }
        return b;
    }

    private myu b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    if (this.b == null) {
                        this.b = new naq();
                    }
                    nyt.a(this.b);
                    continue;
                case wi.dx /*26*/:
                    b = nzl.b(nyt, 26);
                    a = this.c == null ? 0 : this.c.length;
                    obj = new String[(b + a)];
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
                case 34:
                    this.d = nyt.j();
                    continue;
                case 42:
                    b = nzl.b(nyt, 42);
                    if (this.e == null) {
                        a = 0;
                    } else {
                        a = this.e.length;
                    }
                    obj = new myl[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new myl();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new myl();
                    nyt.a(obj[a]);
                    this.e = obj;
                    continue;
                case 50:
                    if (this.f == null) {
                        this.f = new nbu();
                    }
                    nyt.a(this.f);
                    continue;
                case 58:
                    b = nzl.b(nyt, 58);
                    if (this.g == null) {
                        a = 0;
                    } else {
                        a = this.g.length;
                    }
                    obj = new myt[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.g, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new myt();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new myt();
                    nyt.a(obj[a]);
                    this.g = obj;
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
