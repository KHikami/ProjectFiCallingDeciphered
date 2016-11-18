package p000;

public final class lzy extends nyx<lzy> {
    private static volatile lzy[] f27068g;
    public String f27069a;
    public lzt[] f27070b;
    public lzt[] f27071c;
    public mas[] f27072d;
    public String[] f27073e;
    public Integer f27074f;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31362b(nyt);
    }

    public static lzy[] m31363d() {
        if (f27068g == null) {
            synchronized (nzc.c) {
                if (f27068g == null) {
                    f27068g = new lzy[0];
                }
            }
        }
        return f27068g;
    }

    public lzy() {
        m31364g();
    }

    private lzy m31364g() {
        this.f27069a = null;
        this.f27070b = lzt.m31333d();
        this.f27071c = lzt.m31333d();
        this.f27072d = mas.m31477d();
        this.f27073e = nzl.f;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        if (this.f27069a != null) {
            nyu.a(1, this.f27069a);
        }
        if (this.f27070b != null && this.f27070b.length > 0) {
            for (nzf nzf : this.f27070b) {
                if (nzf != null) {
                    nyu.b(3, nzf);
                }
            }
        }
        if (this.f27071c != null && this.f27071c.length > 0) {
            for (nzf nzf2 : this.f27071c) {
                if (nzf2 != null) {
                    nyu.b(4, nzf2);
                }
            }
        }
        if (this.f27072d != null && this.f27072d.length > 0) {
            for (nzf nzf22 : this.f27072d) {
                if (nzf22 != null) {
                    nyu.b(5, nzf22);
                }
            }
        }
        if (this.f27073e != null && this.f27073e.length > 0) {
            while (i < this.f27073e.length) {
                String str = this.f27073e[i];
                if (str != null) {
                    nyu.a(6, str);
                }
                i++;
            }
        }
        if (this.f27074f != null) {
            nyu.a(7, this.f27074f.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i;
        int i2 = 0;
        int b = super.mo147b();
        if (this.f27069a != null) {
            b += nyu.b(1, this.f27069a);
        }
        if (this.f27070b != null && this.f27070b.length > 0) {
            i = b;
            for (nzf nzf : this.f27070b) {
                if (nzf != null) {
                    i += nyu.d(3, nzf);
                }
            }
            b = i;
        }
        if (this.f27071c != null && this.f27071c.length > 0) {
            i = b;
            for (nzf nzf2 : this.f27071c) {
                if (nzf2 != null) {
                    i += nyu.d(4, nzf2);
                }
            }
            b = i;
        }
        if (this.f27072d != null && this.f27072d.length > 0) {
            i = b;
            for (nzf nzf22 : this.f27072d) {
                if (nzf22 != null) {
                    i += nyu.d(5, nzf22);
                }
            }
            b = i;
        }
        if (this.f27073e != null && this.f27073e.length > 0) {
            i = 0;
            int i3 = 0;
            while (i2 < this.f27073e.length) {
                String str = this.f27073e[i2];
                if (str != null) {
                    i3++;
                    i += nyu.b(str);
                }
                i2++;
            }
            b = (b + i) + (i3 * 1);
        }
        if (this.f27074f != null) {
            return b + nyu.f(7, this.f27074f.intValue());
        }
        return b;
    }

    private lzy m31362b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f27069a = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    b = nzl.b(nyt, 26);
                    if (this.f27070b == null) {
                        a = 0;
                    } else {
                        a = this.f27070b.length;
                    }
                    obj = new lzt[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f27070b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lzt();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lzt();
                    nyt.a(obj[a]);
                    this.f27070b = obj;
                    continue;
                case 34:
                    b = nzl.b(nyt, 34);
                    if (this.f27071c == null) {
                        a = 0;
                    } else {
                        a = this.f27071c.length;
                    }
                    obj = new lzt[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f27071c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lzt();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lzt();
                    nyt.a(obj[a]);
                    this.f27071c = obj;
                    continue;
                case 42:
                    b = nzl.b(nyt, 42);
                    if (this.f27072d == null) {
                        a = 0;
                    } else {
                        a = this.f27072d.length;
                    }
                    obj = new mas[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f27072d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new mas();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new mas();
                    nyt.a(obj[a]);
                    this.f27072d = obj;
                    continue;
                case 50:
                    b = nzl.b(nyt, 50);
                    a = this.f27073e == null ? 0 : this.f27073e.length;
                    obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f27073e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.f27073e = obj;
                    continue;
                case 56:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                            this.f27074f = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
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
