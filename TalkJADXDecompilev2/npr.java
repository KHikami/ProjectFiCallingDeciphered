package defpackage;

public final class npr extends nyx<npr> {
    public npn a;
    public npn b;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public npr() {
        d();
    }

    private npr d() {
        this.a = null;
        this.b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.b(4, this.a);
        }
        if (this.b != null) {
            nyu.b(5, this.b);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.d(4, this.a);
        }
        if (this.b != null) {
            return b + nyu.d(5, this.b);
        }
        return b;
    }

    private npr b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 34:
                    if (this.a == null) {
                        this.a = new npn();
                    }
                    nyt.a(this.a);
                    continue;
                case 42:
                    if (this.b == null) {
                        this.b = new npn();
                    }
                    nyt.a(this.b);
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
