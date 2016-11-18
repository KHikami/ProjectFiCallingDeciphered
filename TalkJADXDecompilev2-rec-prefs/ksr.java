package p000;

public final class ksr extends nyx<ksr> {
    private static volatile ksr[] f23129r;
    public String f23130a;
    public ksu f23131b;
    public kuu f23132c;
    public Integer f23133d;
    public ksp f23134e;
    public ksq f23135f;
    public ksu f23136g;
    public kuu f23137h;
    public String[] f23138i;
    public ksu[] f23139j;
    public kuu[] f23140k;
    public Boolean f23141l;
    public Boolean f23142m;
    public Boolean f23143n;
    public Integer f23144o;
    public ksy f23145p;
    public String f23146q;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27356b(nyt);
    }

    public static ksr[] m27357d() {
        if (f23129r == null) {
            synchronized (nzc.c) {
                if (f23129r == null) {
                    f23129r = new ksr[0];
                }
            }
        }
        return f23129r;
    }

    public ksr() {
        m27358g();
    }

    private ksr m27358g() {
        this.f23130a = null;
        this.f23131b = null;
        this.f23132c = null;
        this.f23134e = null;
        this.f23135f = null;
        this.f23136g = null;
        this.f23137h = null;
        this.f23138i = nzl.f;
        this.f23139j = ksu.m27374d();
        this.f23140k = kuu.m27622d();
        this.f23141l = null;
        this.f23142m = null;
        this.f23143n = null;
        this.f23145p = null;
        this.f23146q = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        nyu.a(1, this.f23130a);
        if (this.f23131b != null) {
            nyu.b(2, this.f23131b);
        }
        if (this.f23133d != null) {
            nyu.a(3, this.f23133d.intValue());
        }
        if (this.f23134e != null) {
            nyu.b(4, this.f23134e);
        }
        if (this.f23136g != null) {
            nyu.b(5, this.f23136g);
        }
        if (this.f23138i != null && this.f23138i.length > 0) {
            for (String str : this.f23138i) {
                if (str != null) {
                    nyu.a(6, str);
                }
            }
        }
        if (this.f23139j != null && this.f23139j.length > 0) {
            for (nzf nzf : this.f23139j) {
                if (nzf != null) {
                    nyu.b(7, nzf);
                }
            }
        }
        if (this.f23141l != null) {
            nyu.a(8, this.f23141l.booleanValue());
        }
        if (this.f23142m != null) {
            nyu.a(9, this.f23142m.booleanValue());
        }
        if (this.f23144o != null) {
            nyu.a(10, this.f23144o.intValue());
        }
        if (this.f23145p != null) {
            nyu.b(11, this.f23145p);
        }
        if (this.f23135f != null) {
            nyu.b(12, this.f23135f);
        }
        if (this.f23143n != null) {
            nyu.a(13, this.f23143n.booleanValue());
        }
        if (this.f23146q != null) {
            nyu.a(14, this.f23146q);
        }
        if (this.f23132c != null) {
            nyu.b(15, this.f23132c);
        }
        if (this.f23137h != null) {
            nyu.b(16, this.f23137h);
        }
        if (this.f23140k != null && this.f23140k.length > 0) {
            while (i < this.f23140k.length) {
                nzf nzf2 = this.f23140k[i];
                if (nzf2 != null) {
                    nyu.b(17, nzf2);
                }
                i++;
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i;
        int i2 = 0;
        int b = super.mo147b() + nyu.b(1, this.f23130a);
        if (this.f23131b != null) {
            b += nyu.d(2, this.f23131b);
        }
        if (this.f23133d != null) {
            b += nyu.f(3, this.f23133d.intValue());
        }
        if (this.f23134e != null) {
            b += nyu.d(4, this.f23134e);
        }
        if (this.f23136g != null) {
            b += nyu.d(5, this.f23136g);
        }
        if (this.f23138i != null && this.f23138i.length > 0) {
            int i3 = 0;
            int i4 = 0;
            for (String str : this.f23138i) {
                if (str != null) {
                    i4++;
                    i3 += nyu.b(str);
                }
            }
            b = (b + i3) + (i4 * 1);
        }
        if (this.f23139j != null && this.f23139j.length > 0) {
            i = b;
            for (nzf nzf : this.f23139j) {
                if (nzf != null) {
                    i += nyu.d(7, nzf);
                }
            }
            b = i;
        }
        if (this.f23141l != null) {
            this.f23141l.booleanValue();
            b += nyu.h(8) + 1;
        }
        if (this.f23142m != null) {
            this.f23142m.booleanValue();
            b += nyu.h(9) + 1;
        }
        if (this.f23144o != null) {
            b += nyu.f(10, this.f23144o.intValue());
        }
        if (this.f23145p != null) {
            b += nyu.d(11, this.f23145p);
        }
        if (this.f23135f != null) {
            b += nyu.d(12, this.f23135f);
        }
        if (this.f23143n != null) {
            this.f23143n.booleanValue();
            b += nyu.h(13) + 1;
        }
        if (this.f23146q != null) {
            b += nyu.b(14, this.f23146q);
        }
        if (this.f23132c != null) {
            b += nyu.d(15, this.f23132c);
        }
        if (this.f23137h != null) {
            b += nyu.d(16, this.f23137h);
        }
        if (this.f23140k != null && this.f23140k.length > 0) {
            while (i2 < this.f23140k.length) {
                nzf nzf2 = this.f23140k[i2];
                if (nzf2 != null) {
                    b += nyu.d(17, nzf2);
                }
                i2++;
            }
        }
        return b;
    }

    private ksr m27356b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f23130a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    if (this.f23131b == null) {
                        this.f23131b = new ksu();
                    }
                    nyt.a(this.f23131b);
                    continue;
                case wi.dA /*24*/:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                            this.f23133d = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 34:
                    if (this.f23134e == null) {
                        this.f23134e = new ksp();
                    }
                    nyt.a(this.f23134e);
                    continue;
                case 42:
                    if (this.f23136g == null) {
                        this.f23136g = new ksu();
                    }
                    nyt.a(this.f23136g);
                    continue;
                case 50:
                    b = nzl.b(nyt, 50);
                    a = this.f23138i == null ? 0 : this.f23138i.length;
                    obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f23138i, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.f23138i = obj;
                    continue;
                case 58:
                    b = nzl.b(nyt, 58);
                    if (this.f23139j == null) {
                        a = 0;
                    } else {
                        a = this.f23139j.length;
                    }
                    obj = new ksu[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f23139j, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ksu();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new ksu();
                    nyt.a(obj[a]);
                    this.f23139j = obj;
                    continue;
                case 64:
                    this.f23141l = Boolean.valueOf(nyt.i());
                    continue;
                case 72:
                    this.f23142m = Boolean.valueOf(nyt.i());
                    continue;
                case 80:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                            this.f23144o = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 90:
                    if (this.f23145p == null) {
                        this.f23145p = new ksy();
                    }
                    nyt.a(this.f23145p);
                    continue;
                case 98:
                    if (this.f23135f == null) {
                        this.f23135f = new ksq();
                    }
                    nyt.a(this.f23135f);
                    continue;
                case 104:
                    this.f23143n = Boolean.valueOf(nyt.i());
                    continue;
                case 114:
                    this.f23146q = nyt.j();
                    continue;
                case 122:
                    if (this.f23132c == null) {
                        this.f23132c = new kuu();
                    }
                    nyt.a(this.f23132c);
                    continue;
                case 130:
                    if (this.f23137h == null) {
                        this.f23137h = new kuu();
                    }
                    nyt.a(this.f23137h);
                    continue;
                case 138:
                    b = nzl.b(nyt, 138);
                    if (this.f23140k == null) {
                        a = 0;
                    } else {
                        a = this.f23140k.length;
                    }
                    obj = new kuu[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f23140k, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kuu();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kuu();
                    nyt.a(obj[a]);
                    this.f23140k = obj;
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
