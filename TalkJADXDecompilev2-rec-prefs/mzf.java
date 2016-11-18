package p000;

public final class mzf extends nyx<mzf> {
    private static volatile mzf[] f29229f;
    public myh[] f29230a;
    public Long f29231b;
    public Long f29232c;
    public mzg f29233d;
    public mzg f29234e;

    public /* synthetic */ nzf m33924a(nyt nyt) {
        return m33922b(nyt);
    }

    public static mzf[] m33923d() {
        if (f29229f == null) {
            synchronized (nzc.f31309c) {
                if (f29229f == null) {
                    f29229f = new mzf[0];
                }
            }
        }
        return f29229f;
    }

    public mzf() {
        this.f29230a = myh.m33801d();
        this.f29231b = null;
        this.f29232c = null;
        this.cachedSize = -1;
    }

    public void m33925a(nyu nyu) {
        if (this.f29230a != null && this.f29230a.length > 0) {
            for (nzf nzf : this.f29230a) {
                if (nzf != null) {
                    nyu.m37182b(1, nzf);
                }
            }
        }
        if (this.f29231b != null) {
            nyu.m37181b(2, this.f29231b.longValue());
        }
        if (this.f29232c != null) {
            nyu.m37181b(3, this.f29232c.longValue());
        }
        if (this.f29233d != null) {
            nyu.m37182b(4, this.f29233d);
        }
        if (this.f29234e != null) {
            nyu.m37182b(5, this.f29234e);
        }
        super.a(nyu);
    }

    protected int m33926b() {
        int b = super.b();
        if (this.f29230a != null && this.f29230a.length > 0) {
            for (nzf nzf : this.f29230a) {
                if (nzf != null) {
                    b += nyu.m37145d(1, nzf);
                }
            }
        }
        if (this.f29231b != null) {
            b += nyu.m37148f(2, this.f29231b.longValue());
        }
        if (this.f29232c != null) {
            b += nyu.m37148f(3, this.f29232c.longValue());
        }
        if (this.f29233d != null) {
            b += nyu.m37145d(4, this.f29233d);
        }
        if (this.f29234e != null) {
            return b + nyu.m37145d(5, this.f29234e);
        }
        return b;
    }

    private mzf m33922b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.m37265b(nyt, 10);
                    if (this.f29230a == null) {
                        a = 0;
                    } else {
                        a = this.f29230a.length;
                    }
                    Object obj = new myh[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f29230a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new myh();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new myh();
                    nyt.m37101a(obj[a]);
                    this.f29230a = obj;
                    continue;
                case 16:
                    this.f29231b = Long.valueOf(nyt.m37110e());
                    continue;
                case wi.dA /*24*/:
                    this.f29232c = Long.valueOf(nyt.m37110e());
                    continue;
                case 34:
                    if (this.f29233d == null) {
                        this.f29233d = new mzg();
                    }
                    nyt.m37101a(this.f29233d);
                    continue;
                case 42:
                    if (this.f29234e == null) {
                        this.f29234e = new mzg();
                    }
                    nyt.m37101a(this.f29234e);
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
