package p000;

public final class oqz extends nyx<oqz> {
    private static volatile oqz[] f33833n;
    public Integer f33834a;
    public ora f33835b;
    public String f33836c;
    public String f33837d;
    public String f33838e;
    public String f33839f;
    public Integer f33840g;
    public String f33841h;
    public Integer f33842i;
    public orb f33843j;
    public ora[] f33844k;
    public oqr f33845l;
    public String f33846m;

    public /* synthetic */ nzf m39271a(nyt nyt) {
        return m39268b(nyt);
    }

    public static oqz[] m39269d() {
        if (f33833n == null) {
            synchronized (nzc.f31309c) {
                if (f33833n == null) {
                    f33833n = new oqz[0];
                }
            }
        }
        return f33833n;
    }

    public oqz() {
        m39270g();
    }

    private oqz m39270g() {
        this.f33835b = null;
        this.f33836c = null;
        this.f33837d = null;
        this.f33838e = null;
        this.f33839f = null;
        this.f33840g = null;
        this.f33841h = null;
        this.f33842i = null;
        this.f33843j = null;
        this.f33844k = ora.m39277d();
        this.f33845l = null;
        this.f33846m = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39272a(nyu nyu) {
        if (this.f33834a != null) {
            nyu.m37168a(1, this.f33834a.intValue());
        }
        if (this.f33835b != null) {
            nyu.m37182b(2, this.f33835b);
        }
        if (this.f33836c != null) {
            nyu.m37170a(3, this.f33836c);
        }
        if (this.f33837d != null) {
            nyu.m37170a(4, this.f33837d);
        }
        if (this.f33839f != null) {
            nyu.m37170a(5, this.f33839f);
        }
        if (this.f33841h != null) {
            nyu.m37170a(6, this.f33841h);
        }
        if (this.f33842i != null) {
            nyu.m37168a(7, this.f33842i.intValue());
        }
        if (this.f33843j != null) {
            nyu.m37182b(8, this.f33843j);
        }
        if (this.f33840g != null) {
            nyu.m37168a(9, this.f33840g.intValue());
        }
        if (this.f33844k != null && this.f33844k.length > 0) {
            for (nzf nzf : this.f33844k) {
                if (nzf != null) {
                    nyu.m37182b(10, nzf);
                }
            }
        }
        if (this.f33845l != null) {
            nyu.m37182b(11, this.f33845l);
        }
        if (this.f33838e != null) {
            nyu.m37170a(12, this.f33838e);
        }
        if (this.f33846m != null) {
            nyu.m37170a(13, this.f33846m);
        }
        super.a(nyu);
    }

    protected int m39273b() {
        int b = super.b();
        if (this.f33834a != null) {
            b += nyu.m37147f(1, this.f33834a.intValue());
        }
        if (this.f33835b != null) {
            b += nyu.m37145d(2, this.f33835b);
        }
        if (this.f33836c != null) {
            b += nyu.m37137b(3, this.f33836c);
        }
        if (this.f33837d != null) {
            b += nyu.m37137b(4, this.f33837d);
        }
        if (this.f33839f != null) {
            b += nyu.m37137b(5, this.f33839f);
        }
        if (this.f33841h != null) {
            b += nyu.m37137b(6, this.f33841h);
        }
        if (this.f33842i != null) {
            b += nyu.m37147f(7, this.f33842i.intValue());
        }
        if (this.f33843j != null) {
            b += nyu.m37145d(8, this.f33843j);
        }
        if (this.f33840g != null) {
            b += nyu.m37147f(9, this.f33840g.intValue());
        }
        if (this.f33844k != null && this.f33844k.length > 0) {
            int i = b;
            for (nzf nzf : this.f33844k) {
                if (nzf != null) {
                    i += nyu.m37145d(10, nzf);
                }
            }
            b = i;
        }
        if (this.f33845l != null) {
            b += nyu.m37145d(11, this.f33845l);
        }
        if (this.f33838e != null) {
            b += nyu.m37137b(12, this.f33838e);
        }
        if (this.f33846m != null) {
            return b + nyu.m37137b(13, this.f33846m);
        }
        return b;
    }

    private oqz m39268b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                            this.f33834a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    if (this.f33835b == null) {
                        this.f33835b = new ora();
                    }
                    nyt.m37101a(this.f33835b);
                    continue;
                case wi.dx /*26*/:
                    this.f33836c = nyt.m37117j();
                    continue;
                case 34:
                    this.f33837d = nyt.m37117j();
                    continue;
                case 42:
                    this.f33839f = nyt.m37117j();
                    continue;
                case 50:
                    this.f33841h = nyt.m37117j();
                    continue;
                case 56:
                    this.f33842i = Integer.valueOf(nyt.m37112f());
                    continue;
                case 66:
                    if (this.f33843j == null) {
                        this.f33843j = new orb();
                    }
                    nyt.m37101a(this.f33843j);
                    continue;
                case 72:
                    this.f33840g = Integer.valueOf(nyt.m37112f());
                    continue;
                case 82:
                    int b = nzl.m37265b(nyt, 82);
                    if (this.f33844k == null) {
                        a = 0;
                    } else {
                        a = this.f33844k.length;
                    }
                    Object obj = new ora[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f33844k, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ora();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new ora();
                    nyt.m37101a(obj[a]);
                    this.f33844k = obj;
                    continue;
                case 90:
                    if (this.f33845l == null) {
                        this.f33845l = new oqr();
                    }
                    nyt.m37101a(this.f33845l);
                    continue;
                case 98:
                    this.f33838e = nyt.m37117j();
                    continue;
                case 106:
                    this.f33846m = nyt.m37117j();
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
