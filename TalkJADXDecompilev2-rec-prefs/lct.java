package p000;

public final class lct extends nyx<lct> {
    private static volatile lct[] f24614e;
    public lcw f24615a;
    public lcx f24616b;
    public lcu[] f24617c;
    public lcv[] f24618d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28652b(nyt);
    }

    public static lct[] m28653d() {
        if (f24614e == null) {
            synchronized (nzc.c) {
                if (f24614e == null) {
                    f24614e = new lct[0];
                }
            }
        }
        return f24614e;
    }

    public lct() {
        m28654g();
    }

    private lct m28654g() {
        this.f24615a = null;
        this.f24616b = null;
        this.f24617c = lcu.m28659d();
        this.f24618d = lcv.m28665d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        if (this.f24615a != null) {
            nyu.b(1, this.f24615a);
        }
        if (this.f24616b != null) {
            nyu.b(2, this.f24616b);
        }
        if (this.f24617c != null && this.f24617c.length > 0) {
            for (nzf nzf : this.f24617c) {
                if (nzf != null) {
                    nyu.b(3, nzf);
                }
            }
        }
        if (this.f24618d != null && this.f24618d.length > 0) {
            while (i < this.f24618d.length) {
                nzf nzf2 = this.f24618d[i];
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
        if (this.f24615a != null) {
            b += nyu.d(1, this.f24615a);
        }
        if (this.f24616b != null) {
            b += nyu.d(2, this.f24616b);
        }
        if (this.f24617c != null && this.f24617c.length > 0) {
            int i2 = b;
            for (nzf nzf : this.f24617c) {
                if (nzf != null) {
                    i2 += nyu.d(3, nzf);
                }
            }
            b = i2;
        }
        if (this.f24618d != null && this.f24618d.length > 0) {
            while (i < this.f24618d.length) {
                nzf nzf2 = this.f24618d[i];
                if (nzf2 != null) {
                    b += nyu.d(4, nzf2);
                }
                i++;
            }
        }
        return b;
    }

    private lct m28652b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f24615a == null) {
                        this.f24615a = new lcw();
                    }
                    nyt.a(this.f24615a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f24616b == null) {
                        this.f24616b = new lcx();
                    }
                    nyt.a(this.f24616b);
                    continue;
                case wi.dx /*26*/:
                    b = nzl.b(nyt, 26);
                    if (this.f24617c == null) {
                        a = 0;
                    } else {
                        a = this.f24617c.length;
                    }
                    obj = new lcu[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f24617c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lcu();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lcu();
                    nyt.a(obj[a]);
                    this.f24617c = obj;
                    continue;
                case 34:
                    b = nzl.b(nyt, 34);
                    if (this.f24618d == null) {
                        a = 0;
                    } else {
                        a = this.f24618d.length;
                    }
                    obj = new lcv[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f24618d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lcv();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lcv();
                    nyt.a(obj[a]);
                    this.f24618d = obj;
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
