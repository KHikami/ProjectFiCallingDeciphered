package p000;

public final class myh extends nyx<myh> {
    private static volatile myh[] f29140f;
    public int f29141a;
    public myj f29142b;
    public Long f29143c;
    public myi f29144d;
    public int f29145e;

    public /* synthetic */ nzf m33802a(nyt nyt) {
        return m33800b(nyt);
    }

    public static myh[] m33801d() {
        if (f29140f == null) {
            synchronized (nzc.f31309c) {
                if (f29140f == null) {
                    f29140f = new myh[0];
                }
            }
        }
        return f29140f;
    }

    public myh() {
        this.f29141a = nzf.UNSET_ENUM_VALUE;
        this.f29143c = null;
        this.f29145e = nzf.UNSET_ENUM_VALUE;
        this.cachedSize = -1;
    }

    public void m33803a(nyu nyu) {
        if (this.f29141a != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(1, this.f29141a);
        }
        if (this.f29142b != null) {
            nyu.m37182b(2, this.f29142b);
        }
        if (this.f29143c != null) {
            nyu.m37181b(3, this.f29143c.longValue());
        }
        if (this.f29144d != null) {
            nyu.m37182b(4, this.f29144d);
        }
        if (this.f29145e != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(5, this.f29145e);
        }
        super.a(nyu);
    }

    protected int m33804b() {
        int b = super.b();
        if (this.f29141a != nzf.UNSET_ENUM_VALUE) {
            b += nyu.m37147f(1, this.f29141a);
        }
        if (this.f29142b != null) {
            b += nyu.m37145d(2, this.f29142b);
        }
        if (this.f29143c != null) {
            b += nyu.m37148f(3, this.f29143c.longValue());
        }
        if (this.f29144d != null) {
            b += nyu.m37145d(4, this.f29144d);
        }
        if (this.f29145e != nzf.UNSET_ENUM_VALUE) {
            return b + nyu.m37147f(5, this.f29145e);
        }
        return b;
    }

    private myh m33800b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.f29141a = a;
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    if (this.f29142b == null) {
                        this.f29142b = new myj();
                    }
                    nyt.m37101a(this.f29142b);
                    continue;
                case wi.dA /*24*/:
                    this.f29143c = Long.valueOf(nyt.m37110e());
                    continue;
                case 34:
                    if (this.f29144d == null) {
                        this.f29144d = new myi();
                    }
                    nyt.m37101a(this.f29144d);
                    continue;
                case 40:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.f29145e = a;
                            break;
                        default:
                            continue;
                    }
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
