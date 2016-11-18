package p000;

public final class lnr extends nyx<lnr> {
    public Boolean f25820a;
    public Integer f25821b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29653b(nyt);
    }

    public lnr() {
        m29654d();
    }

    private lnr m29654d() {
        this.f25820a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f25820a != null) {
            nyu.a(1, this.f25820a.booleanValue());
        }
        if (this.f25821b != null) {
            nyu.a(2, this.f25821b.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f25820a != null) {
            this.f25820a.booleanValue();
            b += nyu.h(1) + 1;
        }
        if (this.f25821b != null) {
            return b + nyu.f(2, this.f25821b.intValue());
        }
        return b;
    }

    private lnr m29653b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f25820a = Boolean.valueOf(nyt.i());
                    continue;
                case 16:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f25821b = Integer.valueOf(a);
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
