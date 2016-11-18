package defpackage;

public final class mzf extends nyx<mzf> {
    private static volatile mzf[] f;
    public myh[] a;
    public Long b;
    public Long c;
    public mzg d;
    public mzg e;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static mzf[] d() {
        if (f == null) {
            synchronized (nzc.c) {
                if (f == null) {
                    f = new mzf[0];
                }
            }
        }
        return f;
    }

    public mzf() {
        this.a = myh.d();
        this.b = null;
        this.c = null;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        if (this.a != null && this.a.length > 0) {
            for (nzf nzf : this.a) {
                if (nzf != null) {
                    nyu.b(1, nzf);
                }
            }
        }
        if (this.b != null) {
            nyu.b(2, this.b.longValue());
        }
        if (this.c != null) {
            nyu.b(3, this.c.longValue());
        }
        if (this.d != null) {
            nyu.b(4, this.d);
        }
        if (this.e != null) {
            nyu.b(5, this.e);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null && this.a.length > 0) {
            for (nzf nzf : this.a) {
                if (nzf != null) {
                    b += nyu.d(1, nzf);
                }
            }
        }
        if (this.b != null) {
            b += nyu.f(2, this.b.longValue());
        }
        if (this.c != null) {
            b += nyu.f(3, this.c.longValue());
        }
        if (this.d != null) {
            b += nyu.d(4, this.d);
        }
        if (this.e != null) {
            return b + nyu.d(5, this.e);
        }
        return b;
    }

    private mzf b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.b(nyt, 10);
                    if (this.a == null) {
                        a = 0;
                    } else {
                        a = this.a.length;
                    }
                    Object obj = new myh[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new myh();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new myh();
                    nyt.a(obj[a]);
                    this.a = obj;
                    continue;
                case 16:
                    this.b = Long.valueOf(nyt.e());
                    continue;
                case wi.dA /*24*/:
                    this.c = Long.valueOf(nyt.e());
                    continue;
                case 34:
                    if (this.d == null) {
                        this.d = new mzg();
                    }
                    nyt.a(this.d);
                    continue;
                case 42:
                    if (this.e == null) {
                        this.e = new mzg();
                    }
                    nyt.a(this.e);
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
