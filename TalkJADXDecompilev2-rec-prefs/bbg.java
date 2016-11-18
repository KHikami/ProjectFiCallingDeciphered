package p000;

public final class bbg extends nyx<bbg> {
    public Integer f2801a;
    public Integer f2802b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m4727b(nyt);
    }

    public bbg() {
        m4728d();
    }

    private bbg m4728d() {
        this.f2801a = null;
        this.f2802b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f2801a != null) {
            nyu.a(1, this.f2801a.intValue());
        }
        if (this.f2802b != null) {
            nyu.a(2, this.f2802b.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f2801a != null) {
            b += nyu.f(1, this.f2801a.intValue());
        }
        if (this.f2802b != null) {
            return b + nyu.f(2, this.f2802b.intValue());
        }
        return b;
    }

    private bbg m4727b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f2801a = Integer.valueOf(nyt.f());
                    continue;
                case 16:
                    this.f2802b = Integer.valueOf(nyt.f());
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
