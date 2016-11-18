package p000;

public final class mco extends nyx<mco> {
    public Integer f27344a;
    public Integer f27345b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31737b(nyt);
    }

    public mco() {
        m31738d();
    }

    private mco m31738d() {
        this.f27344a = null;
        this.f27345b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f27344a != null) {
            nyu.a(1, this.f27344a.intValue());
        }
        if (this.f27345b != null) {
            nyu.a(2, this.f27345b.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f27344a != null) {
            b += nyu.f(1, this.f27344a.intValue());
        }
        if (this.f27345b != null) {
            return b + nyu.f(2, this.f27345b.intValue());
        }
        return b;
    }

    private mco m31737b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f27344a = Integer.valueOf(nyt.f());
                    continue;
                case 16:
                    this.f27345b = Integer.valueOf(nyt.f());
                    continue;
                default:
                    if (!super.m1039a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
