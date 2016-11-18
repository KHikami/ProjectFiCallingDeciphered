package p000;

public final class mds extends nyx<mds> {
    public String f27528a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31894b(nyt);
    }

    public mds() {
        m31895d();
    }

    private mds m31895d() {
        this.f27528a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f27528a != null) {
            nyu.a(1, this.f27528a);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f27528a != null) {
            return b + nyu.b(1, this.f27528a);
        }
        return b;
    }

    private mds m31894b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f27528a = nyt.j();
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
