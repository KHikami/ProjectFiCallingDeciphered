package p000;

public final class lcd extends nyx<lcd> {
    private static volatile lcd[] f24559e;
    public lcj f24560a;
    public lck f24561b;
    public lcg[] f24562c;
    public lch[] f24563d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28574b(nyt);
    }

    public static lcd[] m28575d() {
        if (f24559e == null) {
            synchronized (nzc.c) {
                if (f24559e == null) {
                    f24559e = new lcd[0];
                }
            }
        }
        return f24559e;
    }

    public lcd() {
        this.f24562c = lcg.m28590d();
        this.f24563d = lch.m28595d();
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        if (this.f24560a != null) {
            nyu.b(1, this.f24560a);
        }
        if (this.f24561b != null) {
            nyu.b(2, this.f24561b);
        }
        if (this.f24562c != null && this.f24562c.length > 0) {
            for (nzf nzf : this.f24562c) {
                if (nzf != null) {
                    nyu.b(3, nzf);
                }
            }
        }
        if (this.f24563d != null && this.f24563d.length > 0) {
            while (i < this.f24563d.length) {
                nzf nzf2 = this.f24563d[i];
                if (nzf2 != null) {
                    nyu.b(4, nzf2);
                }
                i++;
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b();
        if (this.f24560a != null) {
            b += nyu.d(1, this.f24560a);
        }
        if (this.f24561b != null) {
            b += nyu.d(2, this.f24561b);
        }
        if (this.f24562c != null && this.f24562c.length > 0) {
            int i2 = b;
            for (nzf nzf : this.f24562c) {
                if (nzf != null) {
                    i2 += nyu.d(3, nzf);
                }
            }
            b = i2;
        }
        if (this.f24563d != null && this.f24563d.length > 0) {
            while (i < this.f24563d.length) {
                nzf nzf2 = this.f24563d[i];
                if (nzf2 != null) {
                    b += nyu.d(4, nzf2);
                }
                i++;
            }
        }
        return b;
    }

    private lcd m28574b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f24560a == null) {
                        this.f24560a = new lcj();
                    }
                    nyt.a(this.f24560a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f24561b == null) {
                        this.f24561b = new lck();
                    }
                    nyt.a(this.f24561b);
                    continue;
                case wi.dx /*26*/:
                    b = nzl.b(nyt, 26);
                    if (this.f24562c == null) {
                        a = 0;
                    } else {
                        a = this.f24562c.length;
                    }
                    obj = new lcg[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f24562c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lcg();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lcg();
                    nyt.a(obj[a]);
                    this.f24562c = obj;
                    continue;
                case 34:
                    b = nzl.b(nyt, 34);
                    if (this.f24563d == null) {
                        a = 0;
                    } else {
                        a = this.f24563d.length;
                    }
                    obj = new lch[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f24563d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lch();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lch();
                    nyt.a(obj[a]);
                    this.f24563d = obj;
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
