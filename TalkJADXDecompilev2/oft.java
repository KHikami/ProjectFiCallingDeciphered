package defpackage;

public final class oft extends nyx<oft> {
    public String a;
    public String b;
    public ofm c;
    public String d;
    public Integer e;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public oft() {
        d();
    }

    private oft d() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a);
        }
        if (this.b != null) {
            nyu.a(2, this.b);
        }
        if (this.c != null) {
            nyu.b(3, this.c);
        }
        if (this.d != null) {
            nyu.a(4, this.d);
        }
        if (this.e != null) {
            nyu.a(5, this.e.intValue());
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
        if (this.c != null) {
            b += nyu.d(3, this.c);
        }
        if (this.d != null) {
            b += nyu.b(4, this.d);
        }
        if (this.e != null) {
            return b + nyu.f(5, this.e.intValue());
        }
        return b;
    }

    private oft b(nyt nyt) {
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
                case wi.dx /*26*/:
                    if (this.c == null) {
                        this.c = new ofm();
                    }
                    nyt.a(this.c);
                    continue;
                case 34:
                    this.d = nyt.j();
                    continue;
                case 40:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.e = Integer.valueOf(a);
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
