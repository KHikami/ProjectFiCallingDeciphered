package p000;

public final class ntw extends nyx<ntw> {
    public Boolean f30796a;
    public nty f30797b;
    public ntx f30798c;

    public /* synthetic */ nzf m36533a(nyt nyt) {
        return m36532b(nyt);
    }

    public ntw() {
        this.f30796a = null;
        this.cachedSize = -1;
    }

    public void m36534a(nyu nyu) {
        if (this.f30796a != null) {
            nyu.m37172a(1, this.f30796a.booleanValue());
        }
        if (this.f30797b != null) {
            nyu.m37182b(2, this.f30797b);
        }
        if (this.f30798c != null) {
            nyu.m37182b(3, this.f30798c);
        }
        super.a(nyu);
    }

    protected int m36535b() {
        int b = super.b();
        if (this.f30796a != null) {
            this.f30796a.booleanValue();
            b += nyu.m37154h(1) + 1;
        }
        if (this.f30797b != null) {
            b += nyu.m37145d(2, this.f30797b);
        }
        if (this.f30798c != null) {
            return b + nyu.m37145d(3, this.f30798c);
        }
        return b;
    }

    private ntw m36532b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30796a = Boolean.valueOf(nyt.m37116i());
                    continue;
                case wi.dH /*18*/:
                    if (this.f30797b == null) {
                        this.f30797b = new nty();
                    }
                    nyt.m37101a(this.f30797b);
                    continue;
                case wi.dx /*26*/:
                    if (this.f30798c == null) {
                        this.f30798c = new ntx();
                    }
                    nyt.m37101a(this.f30798c);
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
