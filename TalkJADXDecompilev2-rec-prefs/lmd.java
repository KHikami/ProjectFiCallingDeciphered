package p000;

public final class lmd extends nyx<lmd> {
    private static volatile lmd[] f25512l;
    public String f25513a;
    public int[] f25514b;
    public String f25515c;
    public String f25516d;
    public Boolean f25517e;
    public Boolean f25518f;
    public Boolean f25519g;
    public Integer f25520h;
    public Boolean f25521i;
    public Boolean f25522j;
    public Boolean f25523k;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29455b(nyt);
    }

    public static lmd[] m29456d() {
        if (f25512l == null) {
            synchronized (nzc.c) {
                if (f25512l == null) {
                    f25512l = new lmd[0];
                }
            }
        }
        return f25512l;
    }

    public lmd() {
        m29457g();
    }

    private lmd m29457g() {
        this.f25513a = null;
        this.f25514b = nzl.a;
        this.f25515c = null;
        this.f25516d = null;
        this.f25517e = null;
        this.f25518f = null;
        this.f25519g = null;
        this.f25520h = null;
        this.f25521i = null;
        this.f25522j = null;
        this.f25523k = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f25513a != null) {
            nyu.a(1, this.f25513a);
        }
        if (this.f25516d != null) {
            nyu.a(2, this.f25516d);
        }
        if (this.f25517e != null) {
            nyu.a(3, this.f25517e.booleanValue());
        }
        if (this.f25518f != null) {
            nyu.a(4, this.f25518f.booleanValue());
        }
        if (this.f25519g != null) {
            nyu.a(5, this.f25519g.booleanValue());
        }
        if (this.f25520h != null) {
            nyu.a(6, this.f25520h.intValue());
        }
        if (this.f25521i != null) {
            nyu.a(7, this.f25521i.booleanValue());
        }
        if (this.f25514b != null && this.f25514b.length > 0) {
            for (int a : this.f25514b) {
                nyu.a(8, a);
            }
        }
        if (this.f25522j != null) {
            nyu.a(9, this.f25522j.booleanValue());
        }
        if (this.f25515c != null) {
            nyu.a(10, this.f25515c);
        }
        if (this.f25523k != null) {
            nyu.a(11, this.f25523k.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b();
        if (this.f25513a != null) {
            b += nyu.b(1, this.f25513a);
        }
        if (this.f25516d != null) {
            b += nyu.b(2, this.f25516d);
        }
        if (this.f25517e != null) {
            this.f25517e.booleanValue();
            b += nyu.h(3) + 1;
        }
        if (this.f25518f != null) {
            this.f25518f.booleanValue();
            b += nyu.h(4) + 1;
        }
        if (this.f25519g != null) {
            this.f25519g.booleanValue();
            b += nyu.h(5) + 1;
        }
        if (this.f25520h != null) {
            b += nyu.f(6, this.f25520h.intValue());
        }
        if (this.f25521i != null) {
            this.f25521i.booleanValue();
            b += nyu.h(7) + 1;
        }
        if (this.f25514b != null && this.f25514b.length > 0) {
            int i2 = 0;
            while (i < this.f25514b.length) {
                i2 += nyu.g(this.f25514b[i]);
                i++;
            }
            b = (b + i2) + (this.f25514b.length * 1);
        }
        if (this.f25522j != null) {
            this.f25522j.booleanValue();
            b += nyu.h(9) + 1;
        }
        if (this.f25515c != null) {
            b += nyu.b(10, this.f25515c);
        }
        if (this.f25523k == null) {
            return b;
        }
        this.f25523k.booleanValue();
        return b + (nyu.h(11) + 1);
    }

    private lmd m29455b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f25513a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f25516d = nyt.j();
                    continue;
                case wi.dA /*24*/:
                    this.f25517e = Boolean.valueOf(nyt.i());
                    continue;
                case 32:
                    this.f25518f = Boolean.valueOf(nyt.i());
                    continue;
                case 40:
                    this.f25519g = Boolean.valueOf(nyt.i());
                    continue;
                case 48:
                    this.f25520h = Integer.valueOf(nyt.f());
                    continue;
                case 56:
                    this.f25521i = Boolean.valueOf(nyt.i());
                    continue;
                case 64:
                    b = nzl.b(nyt, 64);
                    a = this.f25514b == null ? 0 : this.f25514b.length;
                    Object obj = new int[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f25514b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.f();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.f();
                    this.f25514b = obj;
                    continue;
                case 66:
                    int d = nyt.d(nyt.r());
                    b = nyt.u();
                    a = 0;
                    while (nyt.s() > 0) {
                        nyt.f();
                        a++;
                    }
                    nyt.f(b);
                    b = this.f25514b == null ? 0 : this.f25514b.length;
                    Object obj2 = new int[(a + b)];
                    if (b != 0) {
                        System.arraycopy(this.f25514b, 0, obj2, 0, b);
                    }
                    while (b < obj2.length) {
                        obj2[b] = nyt.f();
                        b++;
                    }
                    this.f25514b = obj2;
                    nyt.e(d);
                    continue;
                case 72:
                    this.f25522j = Boolean.valueOf(nyt.i());
                    continue;
                case 82:
                    this.f25515c = nyt.j();
                    continue;
                case 88:
                    this.f25523k = Boolean.valueOf(nyt.i());
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
