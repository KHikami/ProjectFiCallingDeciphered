package p000;

public final class kkw extends nyx<kkw> {
    public String f22100a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26314b(nyt);
    }

    public kkw() {
        m26315d();
    }

    private kkw m26315d() {
        this.f22100a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22100a != null) {
            nyu.a(1, this.f22100a);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22100a != null) {
            return b + nyu.b(1, this.f22100a);
        }
        return b;
    }

    private kkw m26314b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f22100a = nyt.j();
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
