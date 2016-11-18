package p000;

public final class lwb extends nyx<lwb> {
    public String f26634a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30826b(nyt);
    }

    public lwb() {
        m30827d();
    }

    private lwb m30827d() {
        this.f26634a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26634a != null) {
            nyu.a(1, this.f26634a);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26634a != null) {
            return b + nyu.b(1, this.f26634a);
        }
        return b;
    }

    private lwb m30826b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f26634a = nyt.j();
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
