package p000;

public final class mdr extends nyx<mdr> {
    public String f27526a;
    public Long f27527b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31889b(nyt);
    }

    public mdr() {
        m31890d();
    }

    private mdr m31890d() {
        this.f27526a = null;
        this.f27527b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f27526a != null) {
            nyu.a(1, this.f27526a);
        }
        if (this.f27527b != null) {
            nyu.a(7, this.f27527b.longValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f27526a != null) {
            b += nyu.b(1, this.f27526a);
        }
        if (this.f27527b != null) {
            return b + nyu.e(7, this.f27527b.longValue());
        }
        return b;
    }

    private mdr m31889b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f27526a = nyt.j();
                    continue;
                case 56:
                    this.f27527b = Long.valueOf(nyt.d());
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
