package defpackage;

public final class oqs extends nyx<oqs> {
    public Integer a;
    public String b;
    public String c;
    public oqu d;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public oqs() {
        d();
    }

    private oqs d() {
        this.b = null;
        this.c = null;
        this.d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a.intValue());
        }
        if (this.d != null) {
            nyu.b(2, this.d);
        }
        if (this.b != null) {
            nyu.a(3, this.b);
        }
        if (this.c != null) {
            nyu.a(4, this.c);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.f(1, this.a.intValue());
        }
        if (this.d != null) {
            b += nyu.d(2, this.d);
        }
        if (this.b != null) {
            b += nyu.b(3, this.b);
        }
        if (this.c != null) {
            return b + nyu.b(4, this.c);
        }
        return b;
    }

    private oqs b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            this.a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    if (this.d == null) {
                        this.d = new oqu();
                    }
                    nyt.a(this.d);
                    continue;
                case wi.dx /*26*/:
                    this.b = nyt.j();
                    continue;
                case 34:
                    this.c = nyt.j();
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
