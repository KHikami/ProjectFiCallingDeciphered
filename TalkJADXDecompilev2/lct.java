package defpackage;

public final class lct extends nyx<lct> {
    private static volatile lct[] e;
    public lcw a;
    public lcx b;
    public lcu[] c;
    public lcv[] d;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static lct[] d() {
        if (e == null) {
            synchronized (nzc.c) {
                if (e == null) {
                    e = new lct[0];
                }
            }
        }
        return e;
    }

    public lct() {
        g();
    }

    private lct g() {
        this.a = null;
        this.b = null;
        this.c = lcu.d();
        this.d = lcv.d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        int i = 0;
        if (this.a != null) {
            nyu.b(1, this.a);
        }
        if (this.b != null) {
            nyu.b(2, this.b);
        }
        if (this.c != null && this.c.length > 0) {
            for (nzf nzf : this.c) {
                if (nzf != null) {
                    nyu.b(3, nzf);
                }
            }
        }
        if (this.d != null && this.d.length > 0) {
            while (i < this.d.length) {
                nzf nzf2 = this.d[i];
                if (nzf2 != null) {
                    nyu.b(4, nzf2);
                }
                i++;
            }
        }
        super.a(nyu);
    }

    protected int b() {
        int i = 0;
        int b = super.b();
        if (this.a != null) {
            b += nyu.d(1, this.a);
        }
        if (this.b != null) {
            b += nyu.d(2, this.b);
        }
        if (this.c != null && this.c.length > 0) {
            int i2 = b;
            for (nzf nzf : this.c) {
                if (nzf != null) {
                    i2 += nyu.d(3, nzf);
                }
            }
            b = i2;
        }
        if (this.d != null && this.d.length > 0) {
            while (i < this.d.length) {
                nzf nzf2 = this.d[i];
                if (nzf2 != null) {
                    b += nyu.d(4, nzf2);
                }
                i++;
            }
        }
        return b;
    }

    private lct b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.a == null) {
                        this.a = new lcw();
                    }
                    nyt.a(this.a);
                    continue;
                case wi.dH /*18*/:
                    if (this.b == null) {
                        this.b = new lcx();
                    }
                    nyt.a(this.b);
                    continue;
                case wi.dx /*26*/:
                    b = nzl.b(nyt, 26);
                    if (this.c == null) {
                        a = 0;
                    } else {
                        a = this.c.length;
                    }
                    obj = new lcu[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lcu();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lcu();
                    nyt.a(obj[a]);
                    this.c = obj;
                    continue;
                case 34:
                    b = nzl.b(nyt, 34);
                    if (this.d == null) {
                        a = 0;
                    } else {
                        a = this.d.length;
                    }
                    obj = new lcv[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lcv();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lcv();
                    nyt.a(obj[a]);
                    this.d = obj;
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
