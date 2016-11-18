package p000;

public final class mxi extends nyx<mxi> {
    public Integer f28679a;
    public Integer f28680b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m33325b(nyt);
    }

    public mxi() {
        m33326d();
    }

    private mxi m33326d() {
        this.f28680b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f28679a != null) {
            nyu.a(1, this.f28679a.intValue());
        }
        if (this.f28680b != null) {
            nyu.a(2, this.f28680b.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f28679a != null) {
            b += nyu.f(1, this.f28679a.intValue());
        }
        if (this.f28680b != null) {
            return b + nyu.f(2, this.f28680b.intValue());
        }
        return b;
    }

    private mxi m33325b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.f28679a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 16:
                    this.f28680b = Integer.valueOf(nyt.f());
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
