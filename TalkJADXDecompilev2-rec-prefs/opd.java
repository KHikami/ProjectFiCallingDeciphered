package p000;

public final class opd extends nyx<opd> {
    private static volatile opd[] f33524k;
    public String f33525a;
    public String[] f33526b;
    public oqu f33527c;
    public Integer f33528d;
    public String f33529e;
    public Double f33530f;
    public Double f33531g;
    public Integer f33532h;
    public Integer f33533i;
    public Float f33534j;

    public /* synthetic */ nzf m39014a(nyt nyt) {
        return m39011b(nyt);
    }

    public static opd[] m39012d() {
        if (f33524k == null) {
            synchronized (nzc.f31309c) {
                if (f33524k == null) {
                    f33524k = new opd[0];
                }
            }
        }
        return f33524k;
    }

    public opd() {
        m39013g();
    }

    private opd m39013g() {
        this.f33525a = null;
        this.f33526b = nzl.f31332f;
        this.f33527c = null;
        this.f33529e = null;
        this.f33530f = null;
        this.f33531g = null;
        this.f33532h = null;
        this.f33533i = null;
        this.f33534j = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39015a(nyu nyu) {
        if (this.f33525a != null) {
            nyu.m37170a(1, this.f33525a);
        }
        if (this.f33527c != null) {
            nyu.m37182b(2, this.f33527c);
        }
        if (this.f33528d != null) {
            nyu.m37168a(3, this.f33528d.intValue());
        }
        if (this.f33529e != null) {
            nyu.m37170a(4, this.f33529e);
        }
        if (this.f33530f != null) {
            nyu.m37166a(5, this.f33530f.doubleValue());
        }
        if (this.f33526b != null && this.f33526b.length > 0) {
            for (String str : this.f33526b) {
                if (str != null) {
                    nyu.m37170a(6, str);
                }
            }
        }
        if (this.f33531g != null) {
            nyu.m37166a(7, this.f33531g.doubleValue());
        }
        if (this.f33532h != null) {
            nyu.m37180b(8, this.f33532h.intValue());
        }
        if (this.f33533i != null) {
            nyu.m37180b(9, this.f33533i.intValue());
        }
        if (this.f33534j != null) {
            nyu.m37167a(10, this.f33534j.floatValue());
        }
        super.a(nyu);
    }

    protected int m39016b() {
        int i = 0;
        int b = super.b();
        if (this.f33525a != null) {
            b += nyu.m37137b(1, this.f33525a);
        }
        if (this.f33527c != null) {
            b += nyu.m37145d(2, this.f33527c);
        }
        if (this.f33528d != null) {
            b += nyu.m37147f(3, this.f33528d.intValue());
        }
        if (this.f33529e != null) {
            b += nyu.m37137b(4, this.f33529e);
        }
        if (this.f33530f != null) {
            this.f33530f.doubleValue();
            b += nyu.m37154h(5) + 8;
        }
        if (this.f33526b != null && this.f33526b.length > 0) {
            int i2 = 0;
            int i3 = 0;
            while (i < this.f33526b.length) {
                String str = this.f33526b[i];
                if (str != null) {
                    i3++;
                    i2 += nyu.m37140b(str);
                }
                i++;
            }
            b = (b + i2) + (i3 * 1);
        }
        if (this.f33531g != null) {
            this.f33531g.doubleValue();
            b += nyu.m37154h(7) + 8;
        }
        if (this.f33532h != null) {
            this.f33532h.intValue();
            b += nyu.m37154h(8) + 4;
        }
        if (this.f33533i != null) {
            this.f33533i.intValue();
            b += nyu.m37154h(9) + 4;
        }
        if (this.f33534j == null) {
            return b;
        }
        this.f33534j.floatValue();
        return b + (nyu.m37154h(10) + 4);
    }

    private opd m39011b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f33525a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    if (this.f33527c == null) {
                        this.f33527c = new oqu();
                    }
                    nyt.m37101a(this.f33527c);
                    continue;
                case wi.dA /*24*/:
                    a = nyt.m37112f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                            this.f33528d = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 34:
                    this.f33529e = nyt.m37117j();
                    continue;
                case 41:
                    this.f33530f = Double.valueOf(nyt.m37104b());
                    continue;
                case 50:
                    int b = nzl.m37265b(nyt, 50);
                    a = this.f33526b == null ? 0 : this.f33526b.length;
                    Object obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f33526b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.m37117j();
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = nyt.m37117j();
                    this.f33526b = obj;
                    continue;
                case 57:
                    this.f33531g = Double.valueOf(nyt.m37104b());
                    continue;
                case 69:
                    this.f33532h = Integer.valueOf(nyt.m37115h());
                    continue;
                case 77:
                    this.f33533i = Integer.valueOf(nyt.m37115h());
                    continue;
                case 85:
                    this.f33534j = Float.valueOf(nyt.m37106c());
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
