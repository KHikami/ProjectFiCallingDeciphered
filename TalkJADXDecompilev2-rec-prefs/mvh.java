package p000;

public final class mvh extends nyx<mvh> {
    public long f28471a;
    public long f28472b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m33072b(nyt);
    }

    public mvh() {
        m33073d();
    }

    private mvh m33073d() {
        this.f28471a = 0;
        this.f28472b = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f28471a != 0) {
            nyu.b(1, this.f28471a);
        }
        if (this.f28472b != 0) {
            nyu.b(2, this.f28472b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f28471a != 0) {
            b += nyu.f(1, this.f28471a);
        }
        if (this.f28472b != 0) {
            return b + nyu.f(2, this.f28472b);
        }
        return b;
    }

    private mvh m33072b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f28471a = nyt.e();
                    continue;
                case 16:
                    this.f28472b = nyt.e();
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
