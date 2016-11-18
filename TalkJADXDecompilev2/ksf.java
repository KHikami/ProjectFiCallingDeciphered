package defpackage;

public final class ksf extends nyx<ksf> {
    private static volatile ksf[] e;
    public String a;
    public ksr[] b;
    public ksu[] c;
    public kuu[] d;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static ksf[] d() {
        if (e == null) {
            synchronized (nzc.c) {
                if (e == null) {
                    e = new ksf[0];
                }
            }
        }
        return e;
    }

    public ksf() {
        g();
    }

    private ksf g() {
        this.a = null;
        this.b = ksr.d();
        this.c = ksu.d();
        this.d = kuu.d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        int i = 0;
        if (this.a != null) {
            nyu.a(1, this.a);
        }
        if (this.b != null && this.b.length > 0) {
            for (nzf nzf : this.b) {
                if (nzf != null) {
                    nyu.b(2, nzf);
                }
            }
        }
        if (this.c != null && this.c.length > 0) {
            for (nzf nzf2 : this.c) {
                if (nzf2 != null) {
                    nyu.b(3, nzf2);
                }
            }
        }
        if (this.d != null && this.d.length > 0) {
            while (i < this.d.length) {
                nzf nzf3 = this.d[i];
                if (nzf3 != null) {
                    nyu.b(4, nzf3);
                }
                i++;
            }
        }
        super.a(nyu);
    }

    protected int b() {
        int i;
        int i2 = 0;
        int b = super.b();
        if (this.a != null) {
            b += nyu.b(1, this.a);
        }
        if (this.b != null && this.b.length > 0) {
            i = b;
            for (nzf nzf : this.b) {
                if (nzf != null) {
                    i += nyu.d(2, nzf);
                }
            }
            b = i;
        }
        if (this.c != null && this.c.length > 0) {
            i = b;
            for (nzf nzf2 : this.c) {
                if (nzf2 != null) {
                    i += nyu.d(3, nzf2);
                }
            }
            b = i;
        }
        if (this.d != null && this.d.length > 0) {
            while (i2 < this.d.length) {
                nzf nzf3 = this.d[i2];
                if (nzf3 != null) {
                    b += nyu.d(4, nzf3);
                }
                i2++;
            }
        }
        return b;
    }

    private ksf b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    b = nzl.b(nyt, 18);
                    if (this.b == null) {
                        a = 0;
                    } else {
                        a = this.b.length;
                    }
                    obj = new ksr[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ksr();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new ksr();
                    nyt.a(obj[a]);
                    this.b = obj;
                    continue;
                case wi.dx /*26*/:
                    b = nzl.b(nyt, 26);
                    if (this.c == null) {
                        a = 0;
                    } else {
                        a = this.c.length;
                    }
                    obj = new ksu[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ksu();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new ksu();
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
                    obj = new kuu[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kuu();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kuu();
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
