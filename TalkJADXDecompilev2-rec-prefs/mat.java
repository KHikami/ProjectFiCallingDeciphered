package p000;

public final class mat extends nyx<mat> {
    public Boolean f27150a;
    public Boolean f27151b;
    public mau f27152c;
    public Integer f27153d;
    public int[] f27154e;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31482b(nyt);
    }

    public mat() {
        m31483d();
    }

    private mat m31483d() {
        this.f27150a = null;
        this.f27151b = null;
        this.f27152c = null;
        this.f27153d = null;
        this.f27154e = nzl.a;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f27150a != null) {
            nyu.a(1, this.f27150a.booleanValue());
        }
        if (this.f27151b != null) {
            nyu.a(2, this.f27151b.booleanValue());
        }
        if (this.f27152c != null) {
            nyu.b(3, this.f27152c);
        }
        if (this.f27153d != null) {
            nyu.c(4, this.f27153d.intValue());
        }
        if (this.f27154e != null && this.f27154e.length > 0) {
            for (int a : this.f27154e) {
                nyu.a(5, a);
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b();
        if (this.f27150a != null) {
            this.f27150a.booleanValue();
            b += nyu.h(1) + 1;
        }
        if (this.f27151b != null) {
            this.f27151b.booleanValue();
            b += nyu.h(2) + 1;
        }
        if (this.f27152c != null) {
            b += nyu.d(3, this.f27152c);
        }
        if (this.f27153d != null) {
            b += nyu.g(4, this.f27153d.intValue());
        }
        if (this.f27154e == null || this.f27154e.length <= 0) {
            return b;
        }
        int i2 = 0;
        while (i < this.f27154e.length) {
            i2 += nyu.g(this.f27154e[i]);
            i++;
        }
        return (b + i2) + (this.f27154e.length * 1);
    }

    private mat m31482b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f27150a = Boolean.valueOf(nyt.i());
                    continue;
                case 16:
                    this.f27151b = Boolean.valueOf(nyt.i());
                    continue;
                case wi.dx /*26*/:
                    if (this.f27152c == null) {
                        this.f27152c = new mau();
                    }
                    nyt.a(this.f27152c);
                    continue;
                case 32:
                    this.f27153d = Integer.valueOf(nyt.l());
                    continue;
                case 40:
                    b = nzl.b(nyt, 40);
                    a = this.f27154e == null ? 0 : this.f27154e.length;
                    Object obj = new int[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f27154e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.f();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.f();
                    this.f27154e = obj;
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
                    b = this.f27154e == null ? 0 : this.f27154e.length;
                    Object obj2 = new int[(a + b)];
                    if (b != 0) {
                        System.arraycopy(this.f27154e, 0, obj2, 0, b);
                    }
                    while (b < obj2.length) {
                        obj2[b] = nyt.f();
                        b++;
                    }
                    this.f27154e = obj2;
                    nyt.e(d);
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
