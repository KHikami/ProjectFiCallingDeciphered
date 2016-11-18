package p000;

public final class orn extends nyx<orn> {
    public Integer f34035a;
    public Integer f34036b;
    public oqr f34037c;
    public String f34038d;
    public Integer f34039e;
    public Long f34040f;
    public String f34041g;
    public String f34042h;
    public String[] f34043i;
    public Boolean f34044j;
    public String f34045k;
    public Integer f34046l;
    public String f34047m;
    public String f34048n;
    public String f34049o;
    public Boolean f34050p;
    public Boolean f34051q;

    public /* synthetic */ nzf m39451a(nyt nyt) {
        return m39449b(nyt);
    }

    public orn() {
        m39450d();
    }

    private orn m39450d() {
        this.f34035a = null;
        this.f34036b = null;
        this.f34037c = null;
        this.f34038d = null;
        this.f34039e = null;
        this.f34040f = null;
        this.f34041g = null;
        this.f34042h = null;
        this.f34043i = nzl.f31332f;
        this.f34044j = null;
        this.f34045k = null;
        this.f34047m = null;
        this.f34048n = null;
        this.f34049o = null;
        this.f34050p = null;
        this.f34051q = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39452a(nyu nyu) {
        if (this.f34035a != null) {
            nyu.m37191d(1, this.f34035a.intValue());
        }
        if (this.f34036b != null) {
            nyu.m37191d(2, this.f34036b.intValue());
        }
        if (this.f34038d != null) {
            nyu.m37170a(3, this.f34038d);
        }
        if (this.f34039e != null) {
            nyu.m37195e(4, this.f34039e.intValue());
        }
        if (this.f34040f != null) {
            nyu.m37192d(5, this.f34040f.longValue());
        }
        if (this.f34044j != null) {
            nyu.m37172a(6, this.f34044j.booleanValue());
        }
        if (this.f34041g != null) {
            nyu.m37170a(7, this.f34041g);
        }
        if (this.f34045k != null) {
            nyu.m37170a(8, this.f34045k);
        }
        if (this.f34046l != null) {
            nyu.m37168a(9, this.f34046l.intValue());
        }
        if (this.f34047m != null) {
            nyu.m37170a(10, this.f34047m);
        }
        if (this.f34037c != null) {
            nyu.m37182b(11, this.f34037c);
        }
        if (this.f34048n != null) {
            nyu.m37170a(12, this.f34048n);
        }
        if (this.f34042h != null) {
            nyu.m37170a(13, this.f34042h);
        }
        if (this.f34049o != null) {
            nyu.m37170a(14, this.f34049o);
        }
        if (this.f34043i != null && this.f34043i.length > 0) {
            for (String str : this.f34043i) {
                if (str != null) {
                    nyu.m37170a(16, str);
                }
            }
        }
        if (this.f34050p != null) {
            nyu.m37172a(17, this.f34050p.booleanValue());
        }
        if (this.f34051q != null) {
            nyu.m37172a(18, this.f34051q.booleanValue());
        }
        super.a(nyu);
    }

    protected int m39453b() {
        int i = 0;
        int b = super.b();
        if (this.f34035a != null) {
            this.f34035a.intValue();
            b += nyu.m37154h(1) + 4;
        }
        if (this.f34036b != null) {
            this.f34036b.intValue();
            b += nyu.m37154h(2) + 4;
        }
        if (this.f34038d != null) {
            b += nyu.m37137b(3, this.f34038d);
        }
        if (this.f34039e != null) {
            b += nyu.m37155h(4, this.f34039e.intValue());
        }
        if (this.f34040f != null) {
            b += nyu.m37152g(5, this.f34040f.longValue());
        }
        if (this.f34044j != null) {
            this.f34044j.booleanValue();
            b += nyu.m37154h(6) + 1;
        }
        if (this.f34041g != null) {
            b += nyu.m37137b(7, this.f34041g);
        }
        if (this.f34045k != null) {
            b += nyu.m37137b(8, this.f34045k);
        }
        if (this.f34046l != null) {
            b += nyu.m37147f(9, this.f34046l.intValue());
        }
        if (this.f34047m != null) {
            b += nyu.m37137b(10, this.f34047m);
        }
        if (this.f34037c != null) {
            b += nyu.m37145d(11, this.f34037c);
        }
        if (this.f34048n != null) {
            b += nyu.m37137b(12, this.f34048n);
        }
        if (this.f34042h != null) {
            b += nyu.m37137b(13, this.f34042h);
        }
        if (this.f34049o != null) {
            b += nyu.m37137b(14, this.f34049o);
        }
        if (this.f34043i != null && this.f34043i.length > 0) {
            int i2 = 0;
            int i3 = 0;
            while (i < this.f34043i.length) {
                String str = this.f34043i[i];
                if (str != null) {
                    i3++;
                    i2 += nyu.m37140b(str);
                }
                i++;
            }
            b = (b + i2) + (i3 * 2);
        }
        if (this.f34050p != null) {
            this.f34050p.booleanValue();
            b += nyu.m37154h(17) + 1;
        }
        if (this.f34051q == null) {
            return b;
        }
        this.f34051q.booleanValue();
        return b + (nyu.m37154h(18) + 1);
    }

    private orn m39449b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 13:
                    this.f34035a = Integer.valueOf(nyt.m37121n());
                    continue;
                case 21:
                    this.f34036b = Integer.valueOf(nyt.m37121n());
                    continue;
                case wi.dx /*26*/:
                    this.f34038d = nyt.m37117j();
                    continue;
                case 32:
                    this.f34039e = Integer.valueOf(nyt.m37123p());
                    continue;
                case 40:
                    this.f34040f = Long.valueOf(nyt.m37124q());
                    continue;
                case 48:
                    this.f34044j = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 58:
                    this.f34041g = nyt.m37117j();
                    continue;
                case 66:
                    this.f34045k = nyt.m37117j();
                    continue;
                case 72:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f34046l = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 82:
                    this.f34047m = nyt.m37117j();
                    continue;
                case 90:
                    if (this.f34037c == null) {
                        this.f34037c = new oqr();
                    }
                    nyt.m37101a(this.f34037c);
                    continue;
                case 98:
                    this.f34048n = nyt.m37117j();
                    continue;
                case 106:
                    this.f34042h = nyt.m37117j();
                    continue;
                case 114:
                    this.f34049o = nyt.m37117j();
                    continue;
                case 130:
                    int b = nzl.m37265b(nyt, 130);
                    a = this.f34043i == null ? 0 : this.f34043i.length;
                    Object obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f34043i, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.m37117j();
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = nyt.m37117j();
                    this.f34043i = obj;
                    continue;
                case 136:
                    this.f34050p = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 144:
                    this.f34051q = Boolean.valueOf(nyt.m37116i());
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
