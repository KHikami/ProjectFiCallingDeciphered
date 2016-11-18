package p000;

public final class lof extends nyx<lof> {
    public Long f25861a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29727b(nyt);
    }

    public lof() {
        m29728d();
    }

    private lof m29728d() {
        this.f25861a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f25861a != null) {
            nyu.b(1, this.f25861a.longValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f25861a != null) {
            return b + nyu.f(1, this.f25861a.longValue());
        }
        return b;
    }

    private lof m29727b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f25861a = Long.valueOf(nyt.e());
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
