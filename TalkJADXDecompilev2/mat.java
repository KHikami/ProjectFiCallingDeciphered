package defpackage;

public final class mat extends nyx<mat> {
    public Boolean a;
    public Boolean b;
    public mau c;
    public Integer d;
    public int[] e;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public mat() {
        d();
    }

    private mat d() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = nzl.a;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a.booleanValue());
        }
        if (this.b != null) {
            nyu.a(2, this.b.booleanValue());
        }
        if (this.c != null) {
            nyu.b(3, this.c);
        }
        if (this.d != null) {
            nyu.c(4, this.d.intValue());
        }
        if (this.e != null && this.e.length > 0) {
            for (int a : this.e) {
                nyu.a(5, a);
            }
        }
        super.a(nyu);
    }

    protected int b() {
        int i = 0;
        int b = super.b();
        if (this.a != null) {
            this.a.booleanValue();
            b += nyu.h(1) + 1;
        }
        if (this.b != null) {
            this.b.booleanValue();
            b += nyu.h(2) + 1;
        }
        if (this.c != null) {
            b += nyu.d(3, this.c);
        }
        if (this.d != null) {
            b += nyu.g(4, this.d.intValue());
        }
        if (this.e == null || this.e.length <= 0) {
            return b;
        }
        int i2 = 0;
        while (i < this.e.length) {
            i2 += nyu.g(this.e[i]);
            i++;
        }
        return (b + i2) + (this.e.length * 1);
    }

    private mat b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.a = Boolean.valueOf(nyt.i());
                    continue;
                case 16:
                    this.b = Boolean.valueOf(nyt.i());
                    continue;
                case wi.dx /*26*/:
                    if (this.c == null) {
                        this.c = new mau();
                    }
                    nyt.a(this.c);
                    continue;
                case 32:
                    this.d = Integer.valueOf(nyt.l());
                    continue;
                case 40:
                    b = nzl.b(nyt, 40);
                    a = this.e == null ? 0 : this.e.length;
                    Object obj = new int[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.f();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.f();
                    this.e = obj;
                    continue;
                case 42:
                    int d = nyt.d(nyt.r());
                    b = nyt.u();
                    a = 0;
                    while (nyt.s() > 0) {
                        nyt.f();
                        a++;
                    }
                    nyt.f(b);
                    b = this.e == null ? 0 : this.e.length;
                    Object obj2 = new int[(a + b)];
                    if (b != 0) {
                        System.arraycopy(this.e, 0, obj2, 0, b);
                    }
                    while (b < obj2.length) {
                        obj2[b] = nyt.f();
                        b++;
                    }
                    this.e = obj2;
                    nyt.e(d);
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
