package p000;

public final class lez extends nyx<lez> {
    public Boolean f24883a;
    public Integer f24884b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28950b(nyt);
    }

    public lez() {
        m28951d();
    }

    private lez m28951d() {
        this.f24883a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f24883a != null) {
            nyu.a(1, this.f24883a.booleanValue());
        }
        if (this.f24884b != null) {
            nyu.a(2, this.f24884b.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24883a != null) {
            this.f24883a.booleanValue();
            b += nyu.h(1) + 1;
        }
        if (this.f24884b != null) {
            return b + nyu.f(2, this.f24884b.intValue());
        }
        return b;
    }

    private lez m28950b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f24883a = Boolean.valueOf(nyt.i());
                    continue;
                case 16:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f24884b = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
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
