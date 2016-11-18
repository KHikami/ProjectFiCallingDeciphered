package p000;

public final class njb extends nyx<njb> {
    public Integer f29965a;
    public nit f29966b;
    public nik f29967c;
    public nii f29968d;
    public nij f29969e;
    public nhx f29970f;

    public /* synthetic */ nzf m35188a(nyt nyt) {
        return m35186b(nyt);
    }

    public njb() {
        m35187d();
    }

    private njb m35187d() {
        this.f29966b = null;
        this.f29967c = null;
        this.f29968d = null;
        this.f29969e = null;
        this.f29970f = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35189a(nyu nyu) {
        if (this.f29965a != null) {
            nyu.m37168a(1, this.f29965a.intValue());
        }
        if (this.f29966b != null) {
            nyu.m37182b(2, this.f29966b);
        }
        if (this.f29967c != null) {
            nyu.m37182b(3, this.f29967c);
        }
        if (this.f29968d != null) {
            nyu.m37182b(4, this.f29968d);
        }
        if (this.f29969e != null) {
            nyu.m37182b(5, this.f29969e);
        }
        if (this.f29970f != null) {
            nyu.m37182b(6, this.f29970f);
        }
        super.a(nyu);
    }

    protected int m35190b() {
        int b = super.b();
        if (this.f29965a != null) {
            b += nyu.m37147f(1, this.f29965a.intValue());
        }
        if (this.f29966b != null) {
            b += nyu.m37145d(2, this.f29966b);
        }
        if (this.f29967c != null) {
            b += nyu.m37145d(3, this.f29967c);
        }
        if (this.f29968d != null) {
            b += nyu.m37145d(4, this.f29968d);
        }
        if (this.f29969e != null) {
            b += nyu.m37145d(5, this.f29969e);
        }
        if (this.f29970f != null) {
            return b + nyu.m37145d(6, this.f29970f);
        }
        return b;
    }

    private njb m35186b(nyt nyt) {
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
                        case 4:
                        case 5:
                            this.f29965a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    if (this.f29966b == null) {
                        this.f29966b = new nit();
                    }
                    nyt.m37101a(this.f29966b);
                    continue;
                case wi.dx /*26*/:
                    if (this.f29967c == null) {
                        this.f29967c = new nik();
                    }
                    nyt.m37101a(this.f29967c);
                    continue;
                case 34:
                    if (this.f29968d == null) {
                        this.f29968d = new nii();
                    }
                    nyt.m37101a(this.f29968d);
                    continue;
                case 42:
                    if (this.f29969e == null) {
                        this.f29969e = new nij();
                    }
                    nyt.m37101a(this.f29969e);
                    continue;
                case 50:
                    if (this.f29970f == null) {
                        this.f29970f = new nhx();
                    }
                    nyt.m37101a(this.f29970f);
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
