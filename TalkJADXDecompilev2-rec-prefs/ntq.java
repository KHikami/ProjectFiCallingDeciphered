package p000;

public final class ntq extends nyx<ntq> {
    public Boolean f30770a;

    public /* synthetic */ nzf m36506a(nyt nyt) {
        return m36505b(nyt);
    }

    public ntq() {
        this.f30770a = null;
        this.cachedSize = -1;
    }

    public void m36507a(nyu nyu) {
        if (this.f30770a != null) {
            nyu.m37172a(1, this.f30770a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m36508b() {
        int b = super.b();
        if (this.f30770a == null) {
            return b;
        }
        this.f30770a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private ntq m36505b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30770a = Boolean.valueOf(nyt.m37116i());
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
