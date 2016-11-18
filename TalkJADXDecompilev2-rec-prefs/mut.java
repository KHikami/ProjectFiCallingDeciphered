package p000;

public final class mut extends nyx<mut> {
    public String f28408a;
    public Integer f28409b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m33004b(nyt);
    }

    public mut() {
        m33005d();
    }

    private mut m33005d() {
        this.f28408a = null;
        this.f28409b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f28408a != null) {
            nyu.a(1, this.f28408a);
        }
        if (this.f28409b != null) {
            nyu.a(2, this.f28409b.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f28408a != null) {
            b += nyu.b(1, this.f28408a);
        }
        if (this.f28409b != null) {
            return b + nyu.f(2, this.f28409b.intValue());
        }
        return b;
    }

    private mut m33004b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f28408a = nyt.j();
                    continue;
                case 16:
                    this.f28409b = Integer.valueOf(nyt.f());
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
