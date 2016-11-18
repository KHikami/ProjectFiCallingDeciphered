package p000;

public final class kkq extends nyx<kkq> {
    private static volatile kkq[] f22081e;
    public klk f22082a;
    public Integer f22083b;
    public Integer f22084c;
    public kkr f22085d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26280b(nyt);
    }

    public static kkq[] m26281d() {
        if (f22081e == null) {
            synchronized (nzc.c) {
                if (f22081e == null) {
                    f22081e = new kkq[0];
                }
            }
        }
        return f22081e;
    }

    public kkq() {
        m26282g();
    }

    private kkq m26282g() {
        this.f22082a = null;
        this.f22085d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22082a != null) {
            nyu.b(1, this.f22082a);
        }
        if (this.f22083b != null) {
            nyu.a(2, this.f22083b.intValue());
        }
        if (this.f22084c != null) {
            nyu.a(3, this.f22084c.intValue());
        }
        if (this.f22085d != null) {
            nyu.b(4, this.f22085d);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22082a != null) {
            b += nyu.d(1, this.f22082a);
        }
        if (this.f22083b != null) {
            b += nyu.f(2, this.f22083b.intValue());
        }
        if (this.f22084c != null) {
            b += nyu.f(3, this.f22084c.intValue());
        }
        if (this.f22085d != null) {
            return b + nyu.d(4, this.f22085d);
        }
        return b;
    }

    private kkq m26280b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f22082a == null) {
                        this.f22082a = new klk();
                    }
                    nyt.a(this.f22082a);
                    continue;
                case 16:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            this.f22083b = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dA /*24*/:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f22084c = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 34:
                    if (this.f22085d == null) {
                        this.f22085d = new kkr();
                    }
                    nyt.a(this.f22085d);
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
