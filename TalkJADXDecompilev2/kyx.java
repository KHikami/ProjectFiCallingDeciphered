package defpackage;

public final class kyx extends nyx<kyx> {
    public kzh[] a;
    public ldt[] b;
    public String c;
    public kza d;
    public String e;
    public kxu[] f;
    public kyo g;
    public Integer h;
    public ldd i;
    public byte[] j;
    public ldj k;
    public ldd[] l;
    public kze m;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public kyx() {
        d();
    }

    public void a(nyu nyu) {
        int i = 0;
        if (this.a != null && this.a.length > 0) {
            for (nzf nzf : this.a) {
                if (nzf != null) {
                    nyu.b(1, nzf);
                }
            }
        }
        if (this.c != null) {
            nyu.a(2, this.c);
        }
        if (this.d != null) {
            nyu.b(3, this.d);
        }
        if (this.e != null) {
            nyu.a(4, this.e);
        }
        if (this.f != null && this.f.length > 0) {
            for (nzf nzf2 : this.f) {
                if (nzf2 != null) {
                    nyu.b(5, nzf2);
                }
            }
        }
        if (this.g != null) {
            nyu.b(6, this.g);
        }
        if (this.h != null) {
            nyu.a(7, this.h.intValue());
        }
        if (this.b != null && this.b.length > 0) {
            for (nzf nzf22 : this.b) {
                if (nzf22 != null) {
                    nyu.b(8, nzf22);
                }
            }
        }
        if (this.i != null) {
            nyu.b(9, this.i);
        }
        if (this.j != null) {
            nyu.a(10, this.j);
        }
        if (this.k != null) {
            nyu.b(11, this.k);
        }
        if (this.l != null && this.l.length > 0) {
            while (i < this.l.length) {
                nzf nzf3 = this.l[i];
                if (nzf3 != null) {
                    nyu.b(12, nzf3);
                }
                i++;
            }
        }
        if (this.m != null) {
            nyu.b(13, this.m);
        }
        super.a(nyu);
    }

    protected int b() {
        int i;
        int i2 = 0;
        int b = super.b();
        if (this.a != null && this.a.length > 0) {
            i = b;
            for (nzf nzf : this.a) {
                if (nzf != null) {
                    i += nyu.d(1, nzf);
                }
            }
            b = i;
        }
        if (this.c != null) {
            b += nyu.b(2, this.c);
        }
        if (this.d != null) {
            b += nyu.d(3, this.d);
        }
        if (this.e != null) {
            b += nyu.b(4, this.e);
        }
        if (this.f != null && this.f.length > 0) {
            i = b;
            for (nzf nzf2 : this.f) {
                if (nzf2 != null) {
                    i += nyu.d(5, nzf2);
                }
            }
            b = i;
        }
        if (this.g != null) {
            b += nyu.d(6, this.g);
        }
        if (this.h != null) {
            b += nyu.f(7, this.h.intValue());
        }
        if (this.b != null && this.b.length > 0) {
            i = b;
            for (nzf nzf22 : this.b) {
                if (nzf22 != null) {
                    i += nyu.d(8, nzf22);
                }
            }
            b = i;
        }
        if (this.i != null) {
            b += nyu.d(9, this.i);
        }
        if (this.j != null) {
            b += nyu.b(10, this.j);
        }
        if (this.k != null) {
            b += nyu.d(11, this.k);
        }
        if (this.l != null && this.l.length > 0) {
            while (i2 < this.l.length) {
                nzf nzf3 = this.l[i2];
                if (nzf3 != null) {
                    b += nyu.d(12, nzf3);
                }
                i2++;
            }
        }
        if (this.m != null) {
            return b + nyu.d(13, this.m);
        }
        return b;
    }

    private kyx b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    b = nzl.b(nyt, 10);
                    if (this.a == null) {
                        a = 0;
                    } else {
                        a = this.a.length;
                    }
                    obj = new kzh[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kzh();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kzh();
                    nyt.a(obj[a]);
                    this.a = obj;
                    continue;
                case wi.dH /*18*/:
                    this.c = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    if (this.d == null) {
                        this.d = new kza();
                    }
                    nyt.a(this.d);
                    continue;
                case 34:
                    this.e = nyt.j();
                    continue;
                case 42:
                    b = nzl.b(nyt, 42);
                    if (this.f == null) {
                        a = 0;
                    } else {
                        a = this.f.length;
                    }
                    obj = new kxu[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kxu();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kxu();
                    nyt.a(obj[a]);
                    this.f = obj;
                    continue;
                case 50:
                    if (this.g == null) {
                        this.g = new kyo();
                    }
                    nyt.a(this.g);
                    continue;
                case 56:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            this.h = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 66:
                    b = nzl.b(nyt, 66);
                    if (this.b == null) {
                        a = 0;
                    } else {
                        a = this.b.length;
                    }
                    obj = new ldt[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ldt();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new ldt();
                    nyt.a(obj[a]);
                    this.b = obj;
                    continue;
                case 74:
                    if (this.i == null) {
                        this.i = new ldd();
                    }
                    nyt.a(this.i);
                    continue;
                case 82:
                    this.j = nyt.k();
                    continue;
                case 90:
                    if (this.k == null) {
                        this.k = new ldj();
                    }
                    nyt.a(this.k);
                    continue;
                case 98:
                    b = nzl.b(nyt, 98);
                    if (this.l == null) {
                        a = 0;
                    } else {
                        a = this.l.length;
                    }
                    obj = new ldd[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.l, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ldd();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new ldd();
                    nyt.a(obj[a]);
                    this.l = obj;
                    continue;
                case 106:
                    if (this.m == null) {
                        this.m = new kze();
                    }
                    nyt.a(this.m);
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

    private kyx d() {
        this.a = kzh.c;
        this.b = ldt.d();
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = kxu.d();
        this.g = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = ldd.d();
        this.m = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }
}
