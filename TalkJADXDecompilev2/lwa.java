package defpackage;

public final class lwa extends nyx<lwa> {
    public muu a;
    public Integer b;
    public lwb c;
    public lup requestHeader;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public lwa() {
        d();
    }

    private lwa d() {
        this.requestHeader = null;
        this.a = null;
        this.c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.requestHeader != null) {
            nyu.b(1, this.requestHeader);
        }
        if (this.a != null) {
            nyu.b(2, this.a);
        }
        if (this.b != null) {
            nyu.a(3, this.b.intValue());
        }
        if (this.c != null) {
            nyu.b(4, this.c);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.requestHeader != null) {
            b += nyu.d(1, this.requestHeader);
        }
        if (this.a != null) {
            b += nyu.d(2, this.a);
        }
        if (this.b != null) {
            b += nyu.f(3, this.b.intValue());
        }
        if (this.c != null) {
            return b + nyu.d(4, this.c);
        }
        return b;
    }

    private lwa b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.requestHeader == null) {
                        this.requestHeader = new lup();
                    }
                    nyt.a(this.requestHeader);
                    continue;
                case wi.dH /*18*/:
                    if (this.a == null) {
                        this.a = new muu();
                    }
                    nyt.a(this.a);
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
                    if (this.c == null) {
                        this.c = new lwb();
                    }
                    nyt.a(this.c);
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
