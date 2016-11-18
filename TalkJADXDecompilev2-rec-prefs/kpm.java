package p000;

public final class kpm extends nyx<kpm> {
    private static volatile kpm[] f22657n;
    public kqd f22658a;
    public kqd f22659b;
    public Integer f22660c;
    public Double f22661d;
    public Double f22662e;
    public Long f22663f;
    public Integer f22664g;
    public String f22665h;
    public String f22666i;
    public String f22667j;
    public String f22668k;
    public Long f22669l;
    public kpl[] f22670m;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26930b(nyt);
    }

    public static kpm[] m26931d() {
        if (f22657n == null) {
            synchronized (nzc.c) {
                if (f22657n == null) {
                    f22657n = new kpm[0];
                }
            }
        }
        return f22657n;
    }

    public kpm() {
        m26932g();
    }

    private kpm m26932g() {
        this.f22658a = null;
        this.f22659b = null;
        this.f22661d = null;
        this.f22662e = null;
        this.f22663f = null;
        this.f22664g = null;
        this.f22665h = null;
        this.f22666i = null;
        this.f22667j = null;
        this.f22668k = null;
        this.f22669l = null;
        this.f22670m = kpl.m26925d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22660c != null) {
            nyu.a(2, this.f22660c.intValue());
        }
        if (this.f22661d != null) {
            nyu.a(3, this.f22661d.doubleValue());
        }
        if (this.f22662e != null) {
            nyu.a(4, this.f22662e.doubleValue());
        }
        if (this.f22663f != null) {
            nyu.b(5, this.f22663f.longValue());
        }
        if (this.f22664g != null) {
            nyu.a(6, this.f22664g.intValue());
        }
        if (this.f22665h != null) {
            nyu.a(7, this.f22665h);
        }
        if (this.f22666i != null) {
            nyu.a(8, this.f22666i);
        }
        if (this.f22667j != null) {
            nyu.a(9, this.f22667j);
        }
        if (this.f22668k != null) {
            nyu.a(10, this.f22668k);
        }
        if (this.f22669l != null) {
            nyu.b(11, this.f22669l.longValue());
        }
        if (this.f22658a != null) {
            nyu.b(12, this.f22658a);
        }
        if (this.f22659b != null) {
            nyu.b(13, this.f22659b);
        }
        if (this.f22670m != null && this.f22670m.length > 0) {
            for (nzf nzf : this.f22670m) {
                if (nzf != null) {
                    nyu.b(14, nzf);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22660c != null) {
            b += nyu.f(2, this.f22660c.intValue());
        }
        if (this.f22661d != null) {
            this.f22661d.doubleValue();
            b += nyu.h(3) + 8;
        }
        if (this.f22662e != null) {
            this.f22662e.doubleValue();
            b += nyu.h(4) + 8;
        }
        if (this.f22663f != null) {
            b += nyu.f(5, this.f22663f.longValue());
        }
        if (this.f22664g != null) {
            b += nyu.f(6, this.f22664g.intValue());
        }
        if (this.f22665h != null) {
            b += nyu.b(7, this.f22665h);
        }
        if (this.f22666i != null) {
            b += nyu.b(8, this.f22666i);
        }
        if (this.f22667j != null) {
            b += nyu.b(9, this.f22667j);
        }
        if (this.f22668k != null) {
            b += nyu.b(10, this.f22668k);
        }
        if (this.f22669l != null) {
            b += nyu.f(11, this.f22669l.longValue());
        }
        if (this.f22658a != null) {
            b += nyu.d(12, this.f22658a);
        }
        if (this.f22659b != null) {
            b += nyu.d(13, this.f22659b);
        }
        if (this.f22670m == null || this.f22670m.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f22670m) {
            if (nzf != null) {
                i += nyu.d(14, nzf);
            }
        }
        return i;
    }

    private kpm m26930b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 16:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                            this.f22660c = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dz /*25*/:
                    this.f22661d = Double.valueOf(nyt.b());
                    continue;
                case 33:
                    this.f22662e = Double.valueOf(nyt.b());
                    continue;
                case 40:
                    this.f22663f = Long.valueOf(nyt.e());
                    continue;
                case 48:
                    this.f22664g = Integer.valueOf(nyt.f());
                    continue;
                case 58:
                    this.f22665h = nyt.j();
                    continue;
                case 66:
                    this.f22666i = nyt.j();
                    continue;
                case 74:
                    this.f22667j = nyt.j();
                    continue;
                case 82:
                    this.f22668k = nyt.j();
                    continue;
                case 88:
                    this.f22669l = Long.valueOf(nyt.e());
                    continue;
                case 98:
                    if (this.f22658a == null) {
                        this.f22658a = new kqd();
                    }
                    nyt.a(this.f22658a);
                    continue;
                case 106:
                    if (this.f22659b == null) {
                        this.f22659b = new kqd();
                    }
                    nyt.a(this.f22659b);
                    continue;
                case 114:
                    int b = nzl.b(nyt, 114);
                    if (this.f22670m == null) {
                        a = 0;
                    } else {
                        a = this.f22670m.length;
                    }
                    Object obj = new kpl[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f22670m, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kpl();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kpl();
                    nyt.a(obj[a]);
                    this.f22670m = obj;
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
