package p000;

public final class npd extends nyx<npd> {
    public nsz f30425a;

    public /* synthetic */ nzf m36008a(nyt nyt) {
        return m36007b(nyt);
    }

    public npd() {
        this.cachedSize = -1;
    }

    public void m36009a(nyu nyu) {
        if (this.f30425a != null) {
            nyu.m37182b(1, this.f30425a);
        }
        super.a(nyu);
    }

    protected int m36010b() {
        int b = super.b();
        if (this.f30425a != null) {
            return b + nyu.m37145d(1, this.f30425a);
        }
        return b;
    }

    private npd m36007b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f30425a == null) {
                        this.f30425a = new nsz();
                    }
                    nyt.m37101a(this.f30425a);
                    continue;
                default:
                    if (!super.a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
