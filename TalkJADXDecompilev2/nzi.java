package defpackage;

public final class nzi extends nyx<nzi> {
    private int a;
    private long b;
    private int c;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public nzi() {
        d();
    }

    private nzi d() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if ((this.a & 1) != 0) {
            nyu.b(1, this.b);
        }
        if ((this.a & 2) != 0) {
            nyu.a(2, this.c);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if ((this.a & 1) != 0) {
            b += nyu.f(1, this.b);
        }
        if ((this.a & 2) != 0) {
            return b + nyu.f(2, this.c);
        }
        return b;
    }

    private nzi b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.b = nyt.e();
                    this.a |= 1;
                    continue;
                case 16:
                    this.c = nyt.f();
                    this.a |= 2;
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
