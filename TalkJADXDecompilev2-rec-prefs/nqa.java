package p000;

public final class nqa extends nyx<nqa> {
    public String f30470a;

    public /* synthetic */ nzf m36112a(nyt nyt) {
        return m36110b(nyt);
    }

    public nqa() {
        m36111d();
    }

    private nqa m36111d() {
        this.f30470a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m36113a(nyu nyu) {
        if (this.f30470a != null) {
            nyu.m37170a(1, this.f30470a);
        }
        super.a(nyu);
    }

    protected int m36114b() {
        int b = super.b();
        if (this.f30470a != null) {
            return b + nyu.m37137b(1, this.f30470a);
        }
        return b;
    }

    private nqa m36110b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f30470a = nyt.m37117j();
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
