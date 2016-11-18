package p000;

public final class kln extends nyx<kln> {
    private static volatile kln[] f22268g;
    public klk f22269a;
    public String f22270b;
    public Boolean f22271c;
    public String f22272d;
    public String[] f22273e;
    public String f22274f;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26411b(nyt);
    }

    public static kln[] m26412d() {
        if (f22268g == null) {
            synchronized (nzc.c) {
                if (f22268g == null) {
                    f22268g = new kln[0];
                }
            }
        }
        return f22268g;
    }

    public kln() {
        m26413g();
    }

    private kln m26413g() {
        this.f22269a = null;
        this.f22270b = null;
        this.f22271c = null;
        this.f22272d = null;
        this.f22273e = nzl.f;
        this.f22274f = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22269a != null) {
            nyu.b(1, this.f22269a);
        }
        if (this.f22270b != null) {
            nyu.a(2, this.f22270b);
        }
        if (this.f22271c != null) {
            nyu.a(3, this.f22271c.booleanValue());
        }
        if (this.f22272d != null) {
            nyu.a(4, this.f22272d);
        }
        if (this.f22273e != null && this.f22273e.length > 0) {
            for (String str : this.f22273e) {
                if (str != null) {
                    nyu.a(5, str);
                }
            }
        }
        if (this.f22274f != null) {
            nyu.a(6, this.f22274f);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b();
        if (this.f22269a != null) {
            b += nyu.d(1, this.f22269a);
        }
        if (this.f22270b != null) {
            b += nyu.b(2, this.f22270b);
        }
        if (this.f22271c != null) {
            this.f22271c.booleanValue();
            b += nyu.h(3) + 1;
        }
        if (this.f22272d != null) {
            b += nyu.b(4, this.f22272d);
        }
        if (this.f22273e != null && this.f22273e.length > 0) {
            int i2 = 0;
            int i3 = 0;
            while (i < this.f22273e.length) {
                String str = this.f22273e[i];
                if (str != null) {
                    i3++;
                    i2 += nyu.b(str);
                }
                i++;
            }
            b = (b + i2) + (i3 * 1);
        }
        if (this.f22274f != null) {
            return b + nyu.b(6, this.f22274f);
        }
        return b;
    }

    private kln m26411b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f22269a == null) {
                        this.f22269a = new klk();
                    }
                    nyt.a(this.f22269a);
                    continue;
                case wi.dH /*18*/:
                    this.f22270b = nyt.j();
                    continue;
                case wi.dA /*24*/:
                    this.f22271c = Boolean.valueOf(nyt.i());
                    continue;
                case 34:
                    this.f22272d = nyt.j();
                    continue;
                case 42:
                    int b = nzl.b(nyt, 42);
                    a = this.f22273e == null ? 0 : this.f22273e.length;
                    Object obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f22273e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.f22273e = obj;
                    continue;
                case 50:
                    this.f22274f = nyt.j();
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
