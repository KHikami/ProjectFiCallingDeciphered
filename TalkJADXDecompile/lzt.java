public final class lzt extends nyx<lzt> {
    private static volatile lzt[] h;
    public Integer a;
    public maq b;
    public lzr[] c;
    public lzu[] d;
    public lzx[] e;
    public lzw[] f;
    public lzq g;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static lzt[] d() {
        if (h == null) {
            synchronized (nzc.c) {
                if (h == null) {
                    h = new lzt[0];
                }
            }
        }
        return h;
    }

    public lzt() {
        g();
    }

    private lzt g() {
        this.b = null;
        this.c = lzr.d();
        this.d = lzu.d();
        this.e = lzx.d();
        this.f = lzw.d();
        this.g = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        int i = 0;
        if (this.a != null) {
            nyu.a(1, this.a.intValue());
        }
        if (this.b != null) {
            nyu.b(2, this.b);
        }
        if (this.c != null && this.c.length > 0) {
            for (nzf nzf : this.c) {
                if (nzf != null) {
                    nyu.b(3, nzf);
                }
            }
        }
        if (this.d != null && this.d.length > 0) {
            for (nzf nzf2 : this.d) {
                if (nzf2 != null) {
                    nyu.b(4, nzf2);
                }
            }
        }
        if (this.e != null && this.e.length > 0) {
            for (nzf nzf22 : this.e) {
                if (nzf22 != null) {
                    nyu.b(5, nzf22);
                }
            }
        }
        if (this.f != null && this.f.length > 0) {
            while (i < this.f.length) {
                nzf nzf3 = this.f[i];
                if (nzf3 != null) {
                    nyu.b(6, nzf3);
                }
                i++;
            }
        }
        if (this.g != null) {
            nyu.b(7, this.g);
        }
        super.a(nyu);
    }

    protected int b() {
        int i;
        int i2 = 0;
        int b = super.b();
        if (this.a != null) {
            b += nyu.f(1, this.a.intValue());
        }
        if (this.b != null) {
            b += nyu.d(2, this.b);
        }
        if (this.c != null && this.c.length > 0) {
            i = b;
            for (nzf nzf : this.c) {
                if (nzf != null) {
                    i += nyu.d(3, nzf);
                }
            }
            b = i;
        }
        if (this.d != null && this.d.length > 0) {
            i = b;
            for (nzf nzf2 : this.d) {
                if (nzf2 != null) {
                    i += nyu.d(4, nzf2);
                }
            }
            b = i;
        }
        if (this.e != null && this.e.length > 0) {
            i = b;
            for (nzf nzf22 : this.e) {
                if (nzf22 != null) {
                    i += nyu.d(5, nzf22);
                }
            }
            b = i;
        }
        if (this.f != null && this.f.length > 0) {
            while (i2 < this.f.length) {
                nzf nzf3 = this.f[i2];
                if (nzf3 != null) {
                    b += nyu.d(6, nzf3);
                }
                i2++;
            }
        }
        if (this.g != null) {
            return b + nyu.d(7, this.g);
        }
        return b;
    }

    private lzt b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.m /*8*/:
                    a = nyt.f();
                    switch (a) {
                        case wi.j /*1*/:
                        case wi.l /*2*/:
                        case wi.z /*3*/:
                        case wi.h /*4*/:
                            this.a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    if (this.b == null) {
                        this.b = new maq();
                    }
                    nyt.a(this.b);
                    continue;
                case wi.dx /*26*/:
                    b = nzl.b(nyt, 26);
                    if (this.c == null) {
                        a = 0;
                    } else {
                        a = this.c.length;
                    }
                    obj = new lzr[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lzr();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lzr();
                    nyt.a(obj[a]);
                    this.c = obj;
                    continue;
                case 34:
                    b = nzl.b(nyt, 34);
                    if (this.d == null) {
                        a = 0;
                    } else {
                        a = this.d.length;
                    }
                    obj = new lzu[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lzu();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lzu();
                    nyt.a(obj[a]);
                    this.d = obj;
                    continue;
                case 42:
                    b = nzl.b(nyt, 42);
                    if (this.e == null) {
                        a = 0;
                    } else {
                        a = this.e.length;
                    }
                    obj = new lzx[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lzx();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lzx();
                    nyt.a(obj[a]);
                    this.e = obj;
                    continue;
                case 50:
                    b = nzl.b(nyt, 50);
                    if (this.f == null) {
                        a = 0;
                    } else {
                        a = this.f.length;
                    }
                    obj = new lzw[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lzw();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lzw();
                    nyt.a(obj[a]);
                    this.f = obj;
                    continue;
                case 58:
                    if (this.g == null) {
                        this.g = new lzq();
                    }
                    nyt.a(this.g);
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
