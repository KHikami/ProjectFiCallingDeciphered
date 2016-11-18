package p000;

public final class ncm extends nyx<ncm> {
    public Boolean f29507a;

    public /* synthetic */ nzf m34322a(nyt nyt) {
        return m34321b(nyt);
    }

    public ncm() {
        this.f29507a = null;
        this.cachedSize = -1;
    }

    public void m34323a(nyu nyu) {
        if (this.f29507a != null) {
            nyu.m37172a(1, this.f29507a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m34324b() {
        int b = super.b();
        if (this.f29507a == null) {
            return b;
        }
        this.f29507a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private ncm m34321b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f29507a = Boolean.valueOf(nyt.m37116i());
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
