package defpackage;

public final class nmg extends nyx<nmg> {
    public Integer a;
    public Integer b;
    public String c;
    public nmp d;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public nmg() {
        d();
    }

    private nmg d() {
        this.b = null;
        this.c = null;
        this.d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.b != null) {
            nyu.a(1, this.b.intValue());
        }
        if (this.c != null) {
            nyu.a(2, this.c);
        }
        if (this.a != null) {
            nyu.a(3, this.a.intValue());
        }
        if (this.d != null) {
            nyu.b(4, this.d);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.b != null) {
            b += nyu.f(1, this.b.intValue());
        }
        if (this.c != null) {
            b += nyu.b(2, this.c);
        }
        if (this.a != null) {
            b += nyu.f(3, this.a.intValue());
        }
        if (this.d != null) {
            return b + nyu.d(4, this.d);
        }
        return b;
    }

    private nmg b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.b = Integer.valueOf(nyt.f());
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
                            this.a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 34:
                    if (this.d == null) {
                        this.d = new nmp();
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
