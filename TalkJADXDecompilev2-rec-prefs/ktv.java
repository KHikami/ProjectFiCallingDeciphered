package p000;

public final class ktv extends nyx<ktv> {
    private static volatile ktv[] f23303e;
    public String f23304a;
    public kuh[] f23305b;
    public kul[] f23306c;
    public kti[] f23307d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27506b(nyt);
    }

    public static ktv[] m27507d() {
        if (f23303e == null) {
            synchronized (nzc.c) {
                if (f23303e == null) {
                    f23303e = new ktv[0];
                }
            }
        }
        return f23303e;
    }

    public ktv() {
        this.f23304a = null;
        this.f23305b = kuh.m27561d();
        this.f23306c = kul.m27579d();
        this.f23307d = kti.m27445d();
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        if (this.f23304a != null) {
            nyu.a(1, this.f23304a);
        }
        if (this.f23305b != null && this.f23305b.length > 0) {
            for (nzf nzf : this.f23305b) {
                if (nzf != null) {
                    nyu.b(2, nzf);
                }
            }
        }
        if (this.f23306c != null && this.f23306c.length > 0) {
            for (nzf nzf2 : this.f23306c) {
                if (nzf2 != null) {
                    nyu.b(3, nzf2);
                }
            }
        }
        if (this.f23307d != null && this.f23307d.length > 0) {
            while (i < this.f23307d.length) {
                nzf nzf3 = this.f23307d[i];
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
        if (this.f23304a != null) {
            b += nyu.b(1, this.f23304a);
        }
        if (this.f23305b != null && this.f23305b.length > 0) {
            i = b;
            for (nzf nzf : this.f23305b) {
                if (nzf != null) {
                    i += nyu.d(2, nzf);
                }
            }
            b = i;
        }
        if (this.f23306c != null && this.f23306c.length > 0) {
            i = b;
            for (nzf nzf2 : this.f23306c) {
                if (nzf2 != null) {
                    i += nyu.d(3, nzf2);
                }
            }
            b = i;
        }
        if (this.f23307d != null && this.f23307d.length > 0) {
            while (i2 < this.f23307d.length) {
                nzf nzf3 = this.f23307d[i2];
                if (nzf3 != null) {
                    b += nyu.d(4, nzf3);
                }
                i2++;
            }
        }
        return b;
    }

    private ktv m27506b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f23304a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    b = nzl.b(nyt, 18);
                    if (this.f23305b == null) {
                        a = 0;
                    } else {
                        a = this.f23305b.length;
                    }
                    obj = new kuh[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f23305b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kuh();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kuh();
                    nyt.a(obj[a]);
                    this.f23305b = obj;
                    continue;
                case wi.dx /*26*/:
                    b = nzl.b(nyt, 26);
                    if (this.f23306c == null) {
                        a = 0;
                    } else {
                        a = this.f23306c.length;
                    }
                    obj = new kul[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f23306c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kul();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kul();
                    nyt.a(obj[a]);
                    this.f23306c = obj;
                    continue;
                case 34:
                    b = nzl.b(nyt, 34);
                    if (this.f23307d == null) {
                        a = 0;
                    } else {
                        a = this.f23307d.length;
                    }
                    obj = new kti[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f23307d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kti();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kti();
                    nyt.a(obj[a]);
                    this.f23307d = obj;
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
