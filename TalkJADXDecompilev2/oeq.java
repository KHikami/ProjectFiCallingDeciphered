package defpackage;

public final class oeq extends nyx<oeq> {
    public int a;
    public int b;
    public int c;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public oeq() {
        d();
    }

    private oeq d() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != 0) {
            nyu.a(1, this.a);
        }
        if (this.b != 0) {
            nyu.a(2, this.b);
        }
        if (this.c != 0) {
            nyu.a(3, this.c);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != 0) {
            b += nyu.f(1, this.a);
        }
        if (this.b != 0) {
            b += nyu.f(2, this.b);
        }
        if (this.c != 0) {
            return b + nyu.f(3, this.c);
        }
        return b;
    }

    private oeq b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.a = nyt.f();
                    continue;
                case 16:
                    this.b = nyt.f();
                    continue;
                case wi.dA /*24*/:
                    this.c = nyt.f();
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
