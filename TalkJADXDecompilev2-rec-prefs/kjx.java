package p000;

public final class kjx extends nyx<kjx> {
    private static volatile kjx[] f22006i;
    public klk f22007a;
    public String f22008b;
    public String f22009c;
    public String f22010d;
    public String f22011e;
    public kka[] f22012f;
    public kjy[] f22013g;
    public kmj f22014h;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26173b(nyt);
    }

    public static kjx[] m26174d() {
        if (f22006i == null) {
            synchronized (nzc.c) {
                if (f22006i == null) {
                    f22006i = new kjx[0];
                }
            }
        }
        return f22006i;
    }

    public kjx() {
        m26175g();
    }

    private kjx m26175g() {
        this.f22007a = null;
        this.f22008b = null;
        this.f22009c = null;
        this.f22010d = null;
        this.f22011e = null;
        this.f22012f = kka.m26192d();
        this.f22013g = kjy.m26180d();
        this.f22014h = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        if (this.f22007a != null) {
            nyu.b(1, this.f22007a);
        }
        if (this.f22008b != null) {
            nyu.a(2, this.f22008b);
        }
        if (this.f22009c != null) {
            nyu.a(3, this.f22009c);
        }
        if (this.f22010d != null) {
            nyu.a(4, this.f22010d);
        }
        if (this.f22012f != null && this.f22012f.length > 0) {
            for (nzf nzf : this.f22012f) {
                if (nzf != null) {
                    nyu.b(5, nzf);
                }
            }
        }
        if (this.f22011e != null) {
            nyu.a(6, this.f22011e);
        }
        if (this.f22013g != null && this.f22013g.length > 0) {
            while (i < this.f22013g.length) {
                nzf nzf2 = this.f22013g[i];
                if (nzf2 != null) {
                    nyu.b(7, nzf2);
                }
                i++;
            }
        }
        if (this.f22014h != null) {
            nyu.b(8, this.f22014h);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b();
        if (this.f22007a != null) {
            b += nyu.d(1, this.f22007a);
        }
        if (this.f22008b != null) {
            b += nyu.b(2, this.f22008b);
        }
        if (this.f22009c != null) {
            b += nyu.b(3, this.f22009c);
        }
        if (this.f22010d != null) {
            b += nyu.b(4, this.f22010d);
        }
        if (this.f22012f != null && this.f22012f.length > 0) {
            int i2 = b;
            for (nzf nzf : this.f22012f) {
                if (nzf != null) {
                    i2 += nyu.d(5, nzf);
                }
            }
            b = i2;
        }
        if (this.f22011e != null) {
            b += nyu.b(6, this.f22011e);
        }
        if (this.f22013g != null && this.f22013g.length > 0) {
            while (i < this.f22013g.length) {
                nzf nzf2 = this.f22013g[i];
                if (nzf2 != null) {
                    b += nyu.d(7, nzf2);
                }
                i++;
            }
        }
        if (this.f22014h != null) {
            return b + nyu.d(8, this.f22014h);
        }
        return b;
    }

    private kjx m26173b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f22007a == null) {
                        this.f22007a = new klk();
                    }
                    nyt.a(this.f22007a);
                    continue;
                case wi.dH /*18*/:
                    this.f22008b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f22009c = nyt.j();
                    continue;
                case 34:
                    this.f22010d = nyt.j();
                    continue;
                case 42:
                    b = nzl.b(nyt, 42);
                    if (this.f22012f == null) {
                        a = 0;
                    } else {
                        a = this.f22012f.length;
                    }
                    obj = new kka[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f22012f, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kka();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kka();
                    nyt.a(obj[a]);
                    this.f22012f = obj;
                    continue;
                case 50:
                    this.f22011e = nyt.j();
                    continue;
                case 58:
                    b = nzl.b(nyt, 58);
                    if (this.f22013g == null) {
                        a = 0;
                    } else {
                        a = this.f22013g.length;
                    }
                    obj = new kjy[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f22013g, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kjy();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kjy();
                    nyt.a(obj[a]);
                    this.f22013g = obj;
                    continue;
                case 66:
                    if (this.f22014h == null) {
                        this.f22014h = new kmj();
                    }
                    nyt.a(this.f22014h);
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
