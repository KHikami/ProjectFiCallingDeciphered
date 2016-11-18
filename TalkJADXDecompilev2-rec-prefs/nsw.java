package p000;

public final class nsw extends nyx<nsw> {
    public ofz f30730a;

    public /* synthetic */ nzf m36420a(nyt nyt) {
        return m36419b(nyt);
    }

    public nsw() {
        this.cachedSize = -1;
    }

    public void m36421a(nyu nyu) {
        if (this.f30730a != null) {
            nyu.m37182b(1, this.f30730a);
        }
        super.a(nyu);
    }

    protected int m36422b() {
        int b = super.b();
        if (this.f30730a != null) {
            return b + nyu.m37145d(1, this.f30730a);
        }
        return b;
    }

    private nsw m36419b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f30730a == null) {
                        this.f30730a = new ofz();
                    }
                    nyt.m37101a(this.f30730a);
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
