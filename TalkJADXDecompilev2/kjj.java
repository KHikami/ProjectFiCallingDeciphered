package defpackage;

public final class kjj extends nyx<kjj> {
    private static volatile kjj[] e;
    public klk a;
    public Integer b;
    public String c;
    public mqp d;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static kjj[] d() {
        if (e == null) {
            synchronized (nzc.c) {
                if (e == null) {
                    e = new kjj[0];
                }
            }
        }
        return e;
    }

    public kjj() {
        g();
    }

    private kjj g() {
        this.a = null;
        this.c = null;
        this.d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.b(1, this.a);
        }
        if (this.c != null) {
            nyu.a(2, this.c);
        }
        if (this.b != null) {
            nyu.a(3, this.b.intValue());
        }
        if (this.d != null) {
            nyu.b(4, this.d);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.d(1, this.a);
        }
        if (this.c != null) {
            b += nyu.b(2, this.c);
        }
        if (this.b != null) {
            b += nyu.f(3, this.b.intValue());
        }
        if (this.d != null) {
            return b + nyu.d(4, this.d);
        }
        return b;
    }

    private kjj b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.a == null) {
                        this.a = new klk();
                    }
                    nyt.a(this.a);
                    continue;
                case wi.dH /*18*/:
                    this.c = nyt.j();
                    continue;
                case wi.dA /*24*/:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.b = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 34:
                    if (this.d == null) {
                        this.d = new mqp();
                    }
                    nyt.a(this.d);
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
