package p000;

public final class mae extends nyx<mae> {
    public String f27094a;
    public Float f27095b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31403b(nyt);
    }

    public mae() {
        m31404d();
    }

    private mae m31404d() {
        this.f27094a = null;
        this.f27095b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        nyu.a(1, this.f27094a);
        if (this.f27095b != null) {
            nyu.a(2, this.f27095b.floatValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b() + nyu.b(1, this.f27094a);
        if (this.f27095b == null) {
            return b;
        }
        this.f27095b.floatValue();
        return b + (nyu.h(2) + 4);
    }

    private mae m31403b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f27094a = nyt.j();
                    continue;
                case 21:
                    this.f27095b = Float.valueOf(nyt.c());
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
