package p000;

public final class krr extends nyx<krr> {
    public kqv f22930a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27230b(nyt);
    }

    public krr() {
        m27231d();
    }

    private krr m27231d() {
        this.f22930a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22930a != null) {
            nyu.b(1, this.f22930a);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22930a != null) {
            return b + nyu.d(1, this.f22930a);
        }
        return b;
    }

    private krr m27230b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f22930a == null) {
                        this.f22930a = new kqv();
                    }
                    nyt.a(this.f22930a);
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
