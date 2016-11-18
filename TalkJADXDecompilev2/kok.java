package defpackage;

public final class kok extends nyx<kok> {
    public String a;
    public String b;
    public int c;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public kok() {
        this.a = null;
        this.b = null;
        this.c = nzf.UNSET_ENUM_VALUE;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a);
        }
        if (this.c != nzf.UNSET_ENUM_VALUE) {
            nyu.a(2, this.c);
        }
        if (this.b != null) {
            nyu.a(3, this.b);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.b(1, this.a);
        }
        if (this.c != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(2, this.c);
        }
        if (this.b != null) {
            return b + nyu.b(3, this.b);
        }
        return b;
    }

    private kok b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.a = nyt.j();
                    continue;
                case 16:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                            this.c = a;
                            break;
                        default:
                            continue;
                    }
                case wi.dx /*26*/:
                    this.b = nyt.j();
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
