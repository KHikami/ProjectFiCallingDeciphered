package p000;

public final class lbu extends nyx<lbu> {
    public Boolean f24516a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28523b(nyt);
    }

    public lbu() {
        this.f24516a = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        nyu.a(1, this.f24516a.booleanValue());
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        this.f24516a.booleanValue();
        return b + (nyu.h(1) + 1);
    }

    private lbu m28523b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f24516a = Boolean.valueOf(nyt.i());
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
