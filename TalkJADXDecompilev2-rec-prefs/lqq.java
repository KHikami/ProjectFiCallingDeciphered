package p000;

public final class lqq extends nyx<lqq> {
    private static volatile lqq[] f26157e;
    public String f26158a;
    public Integer f26159b;
    public lqr f26160c;
    public Integer f26161d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30076b(nyt);
    }

    public static lqq[] m30077d() {
        if (f26157e == null) {
            synchronized (nzc.c) {
                if (f26157e == null) {
                    f26157e = new lqq[0];
                }
            }
        }
        return f26157e;
    }

    public lqq() {
        m30078g();
    }

    private lqq m30078g() {
        this.f26158a = null;
        this.f26160c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26158a != null) {
            nyu.a(1, this.f26158a);
        }
        if (this.f26159b != null) {
            nyu.a(2, this.f26159b.intValue());
        }
        if (this.f26160c != null) {
            nyu.b(3, this.f26160c);
        }
        if (this.f26161d != null) {
            nyu.a(4, this.f26161d.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26158a != null) {
            b += nyu.b(1, this.f26158a);
        }
        if (this.f26159b != null) {
            b += nyu.f(2, this.f26159b.intValue());
        }
        if (this.f26160c != null) {
            b += nyu.d(3, this.f26160c);
        }
        if (this.f26161d != null) {
            return b + nyu.f(4, this.f26161d.intValue());
        }
        return b;
    }

    private lqq m30076b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f26158a = nyt.j();
                    continue;
                case 16:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            this.f26159b = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dx /*26*/:
                    if (this.f26160c == null) {
                        this.f26160c = new lqr();
                    }
                    nyt.a(this.f26160c);
                    continue;
                case 32:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f26161d = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
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
