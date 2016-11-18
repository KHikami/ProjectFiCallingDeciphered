package p000;

public final class ksf extends nyx<ksf> {
    private static volatile ksf[] f23012e;
    public String f23013a;
    public ksr[] f23014b;
    public ksu[] f23015c;
    public kuu[] f23016d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27291b(nyt);
    }

    public static ksf[] m27292d() {
        if (f23012e == null) {
            synchronized (nzc.c) {
                if (f23012e == null) {
                    f23012e = new ksf[0];
                }
            }
        }
        return f23012e;
    }

    public ksf() {
        m27293g();
    }

    private ksf m27293g() {
        this.f23013a = null;
        this.f23014b = ksr.m27357d();
        this.f23015c = ksu.m27374d();
        this.f23016d = kuu.m27622d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        if (this.f23013a != null) {
            nyu.a(1, this.f23013a);
        }
        if (this.f23014b != null && this.f23014b.length > 0) {
            for (nzf nzf : this.f23014b) {
                if (nzf != null) {
                    nyu.b(2, nzf);
                }
            }
        }
        if (this.f23015c != null && this.f23015c.length > 0) {
            for (nzf nzf2 : this.f23015c) {
                if (nzf2 != null) {
                    nyu.b(3, nzf2);
                }
            }
        }
        if (this.f23016d != null && this.f23016d.length > 0) {
            while (i < this.f23016d.length) {
                nzf nzf3 = this.f23016d[i];
                if (nzf3 != null) {
                    nyu.b(4, nzf3);
                }
                i++;
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i;
        int i2 = 0;
        int b = super.mo147b();
        if (this.f23013a != null) {
            b += nyu.b(1, this.f23013a);
        }
        if (this.f23014b != null && this.f23014b.length > 0) {
            i = b;
            for (nzf nzf : this.f23014b) {
                if (nzf != null) {
                    i += nyu.d(2, nzf);
                }
            }
            b = i;
        }
        if (this.f23015c != null && this.f23015c.length > 0) {
            i = b;
            for (nzf nzf2 : this.f23015c) {
                if (nzf2 != null) {
                    i += nyu.d(3, nzf2);
                }
            }
            b = i;
        }
        if (this.f23016d != null && this.f23016d.length > 0) {
            while (i2 < this.f23016d.length) {
                nzf nzf3 = this.f23016d[i2];
                if (nzf3 != null) {
                    b += nyu.d(4, nzf3);
                }
                i2++;
            }
        }
        return b;
    }

    private ksf m27291b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f23013a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    b = nzl.b(nyt, 18);
                    if (this.f23014b == null) {
                        a = 0;
                    } else {
                        a = this.f23014b.length;
                    }
                    obj = new ksr[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f23014b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ksr();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new ksr();
                    nyt.a(obj[a]);
                    this.f23014b = obj;
                    continue;
                case wi.dx /*26*/:
                    b = nzl.b(nyt, 26);
                    if (this.f23015c == null) {
                        a = 0;
                    } else {
                        a = this.f23015c.length;
                    }
                    obj = new ksu[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f23015c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ksu();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new ksu();
                    nyt.a(obj[a]);
                    this.f23015c = obj;
                    continue;
                case 34:
                    b = nzl.b(nyt, 34);
                    if (this.f23016d == null) {
                        a = 0;
                    } else {
                        a = this.f23016d.length;
                    }
                    obj = new kuu[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f23016d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kuu();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kuu();
                    nyt.a(obj[a]);
                    this.f23016d = obj;
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
