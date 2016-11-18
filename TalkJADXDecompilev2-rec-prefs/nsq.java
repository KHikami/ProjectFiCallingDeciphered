package p000;

public final class nsq extends nyx<nsq> {
    public String f30720a;

    public /* synthetic */ nzf m36395a(nyt nyt) {
        return m36394b(nyt);
    }

    public nsq() {
        this.f30720a = null;
        this.cachedSize = -1;
    }

    public void m36396a(nyu nyu) {
        if (this.f30720a != null) {
            nyu.m37170a(1, this.f30720a);
        }
        super.a(nyu);
    }

    protected int m36397b() {
        int b = super.b();
        if (this.f30720a != null) {
            return b + nyu.m37137b(1, this.f30720a);
        }
        return b;
    }

    private nsq m36394b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f30720a = nyt.m37117j();
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
