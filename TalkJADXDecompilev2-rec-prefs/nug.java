package p000;

public final class nug extends nyx<nug> {
    public Long f30830a;

    public /* synthetic */ nzf m36585a(nyt nyt) {
        return m36584b(nyt);
    }

    public nug() {
        this.f30830a = null;
        this.cachedSize = -1;
    }

    public void m36586a(nyu nyu) {
        if (this.f30830a != null) {
            nyu.m37181b(1, this.f30830a.longValue());
        }
        super.a(nyu);
    }

    protected int m36587b() {
        int b = super.b();
        if (this.f30830a != null) {
            return b + nyu.m37148f(1, this.f30830a.longValue());
        }
        return b;
    }

    private nug m36584b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30830a = Long.valueOf(nyt.m37110e());
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
