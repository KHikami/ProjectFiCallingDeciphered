package defpackage;

public final class nrp extends nyx<nrp> {
    private static volatile nrp[] d;
    public String a;
    public String b;
    public int c;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static nrp[] d() {
        if (d == null) {
            synchronized (nzc.c) {
                if (d == null) {
                    d = new nrp[0];
                }
            }
        }
        return d;
    }

    public nrp() {
        this.a = null;
        this.b = null;
        this.c = nzf.UNSET_ENUM_VALUE;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a);
        }
        if (this.b != null) {
            nyu.a(2, this.b);
        }
        if (this.c != nzf.UNSET_ENUM_VALUE) {
            nyu.a(3, this.c);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.b(1, this.a);
        }
        if (this.b != null) {
            b += nyu.b(2, this.b);
        }
        if (this.c != nzf.UNSET_ENUM_VALUE) {
            return b + nyu.f(3, this.c);
        }
        return b;
    }

    private nrp b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.b = nyt.j();
                    continue;
                case wi.dA /*24*/:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.c = a;
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
