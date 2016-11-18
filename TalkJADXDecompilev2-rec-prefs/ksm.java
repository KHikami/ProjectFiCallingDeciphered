package p000;

public final class ksm extends nyx<ksm> {
    public String f23068a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27330b(nyt);
    }

    public ksm() {
        m27331d();
    }

    private ksm m27331d() {
        this.f23068a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f23068a != null) {
            nyu.a(1, this.f23068a);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f23068a != null) {
            return b + nyu.b(1, this.f23068a);
        }
        return b;
    }

    private ksm m27330b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f23068a = nyt.j();
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
