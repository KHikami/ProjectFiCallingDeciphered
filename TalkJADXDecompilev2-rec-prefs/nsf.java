package p000;

public final class nsf extends nyx<nsf> {
    public nqi f30688a;
    public odm f30689b;
    public nte f30690c;
    public String f30691d;
    public String f30692e;

    public /* synthetic */ nzf m36350a(nyt nyt) {
        return m36349b(nyt);
    }

    public nsf() {
        this.f30691d = null;
        this.f30692e = null;
        this.cachedSize = -1;
    }

    public void m36351a(nyu nyu) {
        if (this.f30688a != null) {
            nyu.m37182b(1, this.f30688a);
        }
        if (this.f30689b != null) {
            nyu.m37182b(4, this.f30689b);
        }
        if (this.f30691d != null) {
            nyu.m37170a(5, this.f30691d);
        }
        if (this.f30692e != null) {
            nyu.m37170a(6, this.f30692e);
        }
        if (this.f30690c != null) {
            nyu.m37182b(7, this.f30690c);
        }
        super.a(nyu);
    }

    protected int m36352b() {
        int b = super.b();
        if (this.f30688a != null) {
            b += nyu.m37145d(1, this.f30688a);
        }
        if (this.f30689b != null) {
            b += nyu.m37145d(4, this.f30689b);
        }
        if (this.f30691d != null) {
            b += nyu.m37137b(5, this.f30691d);
        }
        if (this.f30692e != null) {
            b += nyu.m37137b(6, this.f30692e);
        }
        if (this.f30690c != null) {
            return b + nyu.m37145d(7, this.f30690c);
        }
        return b;
    }

    private nsf m36349b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f30688a == null) {
                        this.f30688a = new nqi();
                    }
                    nyt.m37101a(this.f30688a);
                    continue;
                case 34:
                    if (this.f30689b == null) {
                        this.f30689b = new odm();
                    }
                    nyt.m37101a(this.f30689b);
                    continue;
                case 42:
                    this.f30691d = nyt.m37117j();
                    continue;
                case 50:
                    this.f30692e = nyt.m37117j();
                    continue;
                case 58:
                    if (this.f30690c == null) {
                        this.f30690c = new nte();
                    }
                    nyt.m37101a(this.f30690c);
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
