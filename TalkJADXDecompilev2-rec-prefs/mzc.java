package p000;

public final class mzc extends nyx<mzc> {
    private static volatile mzc[] f29213f;
    public myy[] f29214a;
    public Long f29215b;
    public Long f29216c;
    public mzd f29217d;
    public mzd f29218e;

    public /* synthetic */ nzf m33909a(nyt nyt) {
        return m33906b(nyt);
    }

    public static mzc[] m33907d() {
        if (f29213f == null) {
            synchronized (nzc.f31309c) {
                if (f29213f == null) {
                    f29213f = new mzc[0];
                }
            }
        }
        return f29213f;
    }

    public mzc() {
        m33908g();
    }

    private mzc m33908g() {
        this.f29214a = myy.m33884d();
        this.f29215b = null;
        this.f29216c = null;
        this.f29217d = null;
        this.f29218e = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m33910a(nyu nyu) {
        if (this.f29214a != null && this.f29214a.length > 0) {
            for (nzf nzf : this.f29214a) {
                if (nzf != null) {
                    nyu.m37182b(1, nzf);
                }
            }
        }
        if (this.f29215b != null) {
            nyu.m37181b(2, this.f29215b.longValue());
        }
        if (this.f29216c != null) {
            nyu.m37181b(3, this.f29216c.longValue());
        }
        if (this.f29217d != null) {
            nyu.m37182b(4, this.f29217d);
        }
        if (this.f29218e != null) {
            nyu.m37182b(5, this.f29218e);
        }
        super.a(nyu);
    }

    protected int m33911b() {
        int b = super.b();
        if (this.f29214a != null && this.f29214a.length > 0) {
            for (nzf nzf : this.f29214a) {
                if (nzf != null) {
                    b += nyu.m37145d(1, nzf);
                }
            }
        }
        if (this.f29215b != null) {
            b += nyu.m37148f(2, this.f29215b.longValue());
        }
        if (this.f29216c != null) {
            b += nyu.m37148f(3, this.f29216c.longValue());
        }
        if (this.f29217d != null) {
            b += nyu.m37145d(4, this.f29217d);
        }
        if (this.f29218e != null) {
            return b + nyu.m37145d(5, this.f29218e);
        }
        return b;
    }

    private mzc m33906b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.m37265b(nyt, 10);
                    if (this.f29214a == null) {
                        a = 0;
                    } else {
                        a = this.f29214a.length;
                    }
                    Object obj = new myy[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f29214a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new myy();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new myy();
                    nyt.m37101a(obj[a]);
                    this.f29214a = obj;
                    continue;
                case 16:
                    this.f29215b = Long.valueOf(nyt.m37110e());
                    continue;
                case wi.dA /*24*/:
                    this.f29216c = Long.valueOf(nyt.m37110e());
                    continue;
                case 34:
                    if (this.f29217d == null) {
                        this.f29217d = new mzd();
                    }
                    nyt.m37101a(this.f29217d);
                    continue;
                case 42:
                    if (this.f29218e == null) {
                        this.f29218e = new mzd();
                    }
                    nyt.m37101a(this.f29218e);
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
