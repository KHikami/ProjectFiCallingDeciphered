package p000;

public final class lts extends nyx<lts> {
    private static volatile lts[] f26404g;
    public muu f26405a;
    public Boolean f26406b;
    public Integer f26407c;
    public Boolean f26408d;
    public Integer f26409e;
    public Boolean f26410f;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30497b(nyt);
    }

    public static lts[] m30498d() {
        if (f26404g == null) {
            synchronized (nzc.c) {
                if (f26404g == null) {
                    f26404g = new lts[0];
                }
            }
        }
        return f26404g;
    }

    public lts() {
        m30499g();
    }

    private lts m30499g() {
        this.f26405a = null;
        this.f26406b = null;
        this.f26408d = null;
        this.f26410f = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26405a != null) {
            nyu.b(1, this.f26405a);
        }
        if (this.f26406b != null) {
            nyu.a(2, this.f26406b.booleanValue());
        }
        if (this.f26407c != null) {
            nyu.a(3, this.f26407c.intValue());
        }
        if (this.f26408d != null) {
            nyu.a(4, this.f26408d.booleanValue());
        }
        if (this.f26409e != null) {
            nyu.a(5, this.f26409e.intValue());
        }
        if (this.f26410f != null) {
            nyu.a(6, this.f26410f.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26405a != null) {
            b += nyu.d(1, this.f26405a);
        }
        if (this.f26406b != null) {
            this.f26406b.booleanValue();
            b += nyu.h(2) + 1;
        }
        if (this.f26407c != null) {
            b += nyu.f(3, this.f26407c.intValue());
        }
        if (this.f26408d != null) {
            this.f26408d.booleanValue();
            b += nyu.h(4) + 1;
        }
        if (this.f26409e != null) {
            b += nyu.f(5, this.f26409e.intValue());
        }
        if (this.f26410f == null) {
            return b;
        }
        this.f26410f.booleanValue();
        return b + (nyu.h(6) + 1);
    }

    private lts m30497b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f26405a == null) {
                        this.f26405a = new muu();
                    }
                    nyt.a(this.f26405a);
                    continue;
                case 16:
                    this.f26406b = Boolean.valueOf(nyt.i());
                    continue;
                case wi.dA /*24*/:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                            this.f26407c = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 32:
                    this.f26408d = Boolean.valueOf(nyt.i());
                    continue;
                case 40:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.f26409e = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 48:
                    this.f26410f = Boolean.valueOf(nyt.i());
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
