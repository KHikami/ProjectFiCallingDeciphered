package defpackage;

public final class orb extends nyx<orb> {
    public Integer a;
    public String b;
    public oox c;
    public osq d;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public orb() {
        d();
    }

    private orb d() {
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
        if (this.b != null) {
            nyu.a(4, this.b);
        }
        if (this.d != null) {
            nyu.b(5, this.d);
        }
        if (this.c != null) {
            nyu.b(6, this.c);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.f(1, this.a.intValue());
        }
        if (this.b != null) {
            b += nyu.b(4, this.b);
        }
        if (this.d != null) {
            b += nyu.d(5, this.d);
        }
        if (this.c != null) {
            return b + nyu.d(6, this.c);
        }
        return b;
    }

    private orb b(nyt nyt) {
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
                            this.a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 34:
                    this.b = nyt.j();
                    continue;
                case 42:
                    if (this.d == null) {
                        this.d = new osq();
                    }
                    nyt.a(this.d);
                    continue;
                case 50:
                    if (this.c == null) {
                        this.c = new oox();
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
