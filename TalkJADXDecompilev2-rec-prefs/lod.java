package p000;

public final class lod extends nyx<lod> {
    public String f25856a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29717b(nyt);
    }

    public lod() {
        m29718d();
    }

    private lod m29718d() {
        this.f25856a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f25856a != null) {
            nyu.a(1, this.f25856a);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f25856a != null) {
            return b + nyu.b(1, this.f25856a);
        }
        return b;
    }

    private lod m29717b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f25856a = nyt.j();
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
