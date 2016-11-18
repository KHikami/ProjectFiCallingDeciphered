package p000;

public final class nfa extends nyx<nfa> {
    public Boolean f29651a;

    public /* synthetic */ nzf m34638a(nyt nyt) {
        return m34636b(nyt);
    }

    public nfa() {
        m34637d();
    }

    private nfa m34637d() {
        this.f29651a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34639a(nyu nyu) {
        if (this.f29651a != null) {
            nyu.m37172a(1, this.f29651a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m34640b() {
        int b = super.b();
        if (this.f29651a == null) {
            return b;
        }
        this.f29651a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private nfa m34636b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f29651a = Boolean.valueOf(nyt.m37116i());
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
