package p000;

public final class ktq extends nyx<ktq> {
    public Integer f23252a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27484b(nyt);
    }

    public ktq() {
        m27485d();
    }

    private ktq m27485d() {
        this.f23252a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f23252a != null) {
            nyu.a(1, this.f23252a.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f23252a != null) {
            return b + nyu.f(1, this.f23252a.intValue());
        }
        return b;
    }

    private ktq m27484b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f23252a = Integer.valueOf(nyt.f());
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
