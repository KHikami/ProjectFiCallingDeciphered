package p000;

public final class lzt extends nyx<lzt> {
    private static volatile lzt[] f27038h;
    public Integer f27039a;
    public maq f27040b;
    public lzr[] f27041c;
    public lzu[] f27042d;
    public lzx[] f27043e;
    public lzw[] f27044f;
    public lzq f27045g;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31332b(nyt);
    }

    public static lzt[] m31333d() {
        if (f27038h == null) {
            synchronized (nzc.c) {
                if (f27038h == null) {
                    f27038h = new lzt[0];
                }
            }
        }
        return f27038h;
    }

    public lzt() {
        m31334g();
    }

    private lzt m31334g() {
        this.f27040b = null;
        this.f27041c = lzr.m31321d();
        this.f27042d = lzu.m31339d();
        this.f27043e = lzx.m31357d();
        this.f27044f = lzw.m31351d();
        this.f27045g = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        if (this.f27039a != null) {
            nyu.a(1, this.f27039a.intValue());
        }
        if (this.f27040b != null) {
            nyu.b(2, this.f27040b);
        }
        if (this.f27041c != null && this.f27041c.length > 0) {
            for (nzf nzf : this.f27041c) {
                if (nzf != null) {
                    nyu.b(3, nzf);
                }
            }
        }
        if (this.f27042d != null && this.f27042d.length > 0) {
            for (nzf nzf2 : this.f27042d) {
                if (nzf2 != null) {
                    nyu.b(4, nzf2);
                }
            }
        }
        if (this.f27043e != null && this.f27043e.length > 0) {
            for (nzf nzf22 : this.f27043e) {
                if (nzf22 != null) {
                    nyu.b(5, nzf22);
                }
            }
        }
        if (this.f27044f != null && this.f27044f.length > 0) {
            while (i < this.f27044f.length) {
                nzf nzf3 = this.f27044f[i];
                if (nzf3 != null) {
                    nyu.b(6, nzf3);
                }
                i++;
            }
        }
        if (this.f27045g != null) {
            nyu.b(7, this.f27045g);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i;
        int i2 = 0;
        int b = super.mo147b();
        if (this.f27039a != null) {
            b += nyu.f(1, this.f27039a.intValue());
        }
        if (this.f27040b != null) {
            b += nyu.d(2, this.f27040b);
        }
        if (this.f27041c != null && this.f27041c.length > 0) {
            i = b;
            for (nzf nzf : this.f27041c) {
                if (nzf != null) {
                    i += nyu.d(3, nzf);
                }
            }
            b = i;
        }
        if (this.f27042d != null && this.f27042d.length > 0) {
            i = b;
            for (nzf nzf2 : this.f27042d) {
                if (nzf2 != null) {
                    i += nyu.d(4, nzf2);
                }
            }
            b = i;
        }
        if (this.f27043e != null && this.f27043e.length > 0) {
            i = b;
            for (nzf nzf22 : this.f27043e) {
                if (nzf22 != null) {
                    i += nyu.d(5, nzf22);
                }
            }
            b = i;
        }
        if (this.f27044f != null && this.f27044f.length > 0) {
            while (i2 < this.f27044f.length) {
                nzf nzf3 = this.f27044f[i2];
                if (nzf3 != null) {
                    b += nyu.d(6, nzf3);
                }
                i2++;
            }
        }
        if (this.f27045g != null) {
            return b + nyu.d(7, this.f27045g);
        }
        return b;
    }

    private lzt m31332b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            this.f27039a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    if (this.f27040b == null) {
                        this.f27040b = new maq();
                    }
                    nyt.a(this.f27040b);
                    continue;
                case wi.dx /*26*/:
                    b = nzl.b(nyt, 26);
                    if (this.f27041c == null) {
                        a = 0;
                    } else {
                        a = this.f27041c.length;
                    }
                    obj = new lzr[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f27041c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lzr();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lzr();
                    nyt.a(obj[a]);
                    this.f27041c = obj;
                    continue;
                case 34:
                    b = nzl.b(nyt, 34);
                    if (this.f27042d == null) {
                        a = 0;
                    } else {
                        a = this.f27042d.length;
                    }
                    obj = new lzu[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f27042d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lzu();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lzu();
                    nyt.a(obj[a]);
                    this.f27042d = obj;
                    continue;
                case 42:
                    b = nzl.b(nyt, 42);
                    if (this.f27043e == null) {
                        a = 0;
                    } else {
                        a = this.f27043e.length;
                    }
                    obj = new lzx[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f27043e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lzx();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lzx();
                    nyt.a(obj[a]);
                    this.f27043e = obj;
                    continue;
                case 50:
                    b = nzl.b(nyt, 50);
                    if (this.f27044f == null) {
                        a = 0;
                    } else {
                        a = this.f27044f.length;
                    }
                    obj = new lzw[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f27044f, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lzw();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lzw();
                    nyt.a(obj[a]);
                    this.f27044f = obj;
                    continue;
                case 58:
                    if (this.f27045g == null) {
                        this.f27045g = new lzq();
                    }
                    nyt.a(this.f27045g);
                    continue;
                default:
                    if (!super.m1039a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
