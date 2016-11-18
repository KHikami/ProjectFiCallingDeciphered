package p000;

public final class kuv extends nyx<kuv> {
    private static volatile kuv[] f23508l;
    public String f23509a;
    public String f23510b;
    public String[] f23511c;
    public String f23512d;
    public ksl f23513e;
    public String f23514f;
    public ksu f23515g;
    public kuu f23516h;
    public Boolean f23517i;
    public kuv[] f23518j;
    public Integer f23519k;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27627b(nyt);
    }

    public static kuv[] m27628d() {
        if (f23508l == null) {
            synchronized (nzc.c) {
                if (f23508l == null) {
                    f23508l = new kuv[0];
                }
            }
        }
        return f23508l;
    }

    public kuv() {
        m27629g();
    }

    private kuv m27629g() {
        this.f23509a = null;
        this.f23510b = null;
        this.f23511c = nzl.f;
        this.f23512d = null;
        this.f23513e = null;
        this.f23514f = null;
        this.f23515g = null;
        this.f23516h = null;
        this.f23517i = null;
        this.f23518j = kuv.m27628d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        if (this.f23509a != null) {
            nyu.a(1, this.f23509a);
        }
        if (this.f23510b != null) {
            nyu.a(2, this.f23510b);
        }
        if (this.f23511c != null && this.f23511c.length > 0) {
            for (String str : this.f23511c) {
                if (str != null) {
                    nyu.a(3, str);
                }
            }
        }
        if (this.f23512d != null) {
            nyu.a(4, this.f23512d);
        }
        if (this.f23513e != null) {
            nyu.b(5, this.f23513e);
        }
        if (this.f23514f != null) {
            nyu.a(6, this.f23514f);
        }
        if (this.f23517i != null) {
            nyu.a(7, this.f23517i.booleanValue());
        }
        if (this.f23518j != null && this.f23518j.length > 0) {
            while (i < this.f23518j.length) {
                nzf nzf = this.f23518j[i];
                if (nzf != null) {
                    nyu.b(8, nzf);
                }
                i++;
            }
        }
        if (this.f23519k != null) {
            nyu.a(9, this.f23519k.intValue());
        }
        if (this.f23515g != null) {
            nyu.b(10, this.f23515g);
        }
        if (this.f23516h != null) {
            nyu.b(11, this.f23516h);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b();
        if (this.f23509a != null) {
            b += nyu.b(1, this.f23509a);
        }
        if (this.f23510b != null) {
            b += nyu.b(2, this.f23510b);
        }
        if (this.f23511c != null && this.f23511c.length > 0) {
            int i2 = 0;
            int i3 = 0;
            for (String str : this.f23511c) {
                if (str != null) {
                    i3++;
                    i2 += nyu.b(str);
                }
            }
            b = (b + i2) + (i3 * 1);
        }
        if (this.f23512d != null) {
            b += nyu.b(4, this.f23512d);
        }
        if (this.f23513e != null) {
            b += nyu.d(5, this.f23513e);
        }
        if (this.f23514f != null) {
            b += nyu.b(6, this.f23514f);
        }
        if (this.f23517i != null) {
            this.f23517i.booleanValue();
            b += nyu.h(7) + 1;
        }
        if (this.f23518j != null && this.f23518j.length > 0) {
            while (i < this.f23518j.length) {
                nzf nzf = this.f23518j[i];
                if (nzf != null) {
                    b += nyu.d(8, nzf);
                }
                i++;
            }
        }
        if (this.f23519k != null) {
            b += nyu.f(9, this.f23519k.intValue());
        }
        if (this.f23515g != null) {
            b += nyu.d(10, this.f23515g);
        }
        if (this.f23516h != null) {
            return b + nyu.d(11, this.f23516h);
        }
        return b;
    }

    private kuv m27627b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f23509a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f23510b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    b = nzl.b(nyt, 26);
                    a = this.f23511c == null ? 0 : this.f23511c.length;
                    obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f23511c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.f23511c = obj;
                    continue;
                case 34:
                    this.f23512d = nyt.j();
                    continue;
                case 42:
                    if (this.f23513e == null) {
                        this.f23513e = new ksl();
                    }
                    nyt.a(this.f23513e);
                    continue;
                case 50:
                    this.f23514f = nyt.j();
                    continue;
                case 56:
                    this.f23517i = Boolean.valueOf(nyt.i());
                    continue;
                case 66:
                    b = nzl.b(nyt, 66);
                    if (this.f23518j == null) {
                        a = 0;
                    } else {
                        a = this.f23518j.length;
                    }
                    obj = new kuv[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f23518j, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kuv();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kuv();
                    nyt.a(obj[a]);
                    this.f23518j = obj;
                    continue;
                case 72:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 100:
                        case 101:
                        case 110:
                            this.f23519k = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 82:
                    if (this.f23515g == null) {
                        this.f23515g = new ksu();
                    }
                    nyt.a(this.f23515g);
                    continue;
                case 90:
                    if (this.f23516h == null) {
                        this.f23516h = new kuu();
                    }
                    nyt.a(this.f23516h);
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
