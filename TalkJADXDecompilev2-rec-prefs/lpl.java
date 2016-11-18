package p000;

public final class lpl extends nyx<lpl> {
    public Boolean f26006a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29910b(nyt);
    }

    public lpl() {
        m29911d();
    }

    private lpl m29911d() {
        this.f26006a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26006a != null) {
            nyu.a(1, this.f26006a.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26006a == null) {
            return b;
        }
        this.f26006a.booleanValue();
        return b + (nyu.h(1) + 1);
    }

    private lpl m29910b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f26006a = Boolean.valueOf(nyt.i());
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
