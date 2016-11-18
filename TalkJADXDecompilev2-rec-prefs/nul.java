package p000;

public final class nul extends nyx<nul> {
    public Long f30896a;

    public /* synthetic */ nzf m36606a(nyt nyt) {
        return m36604b(nyt);
    }

    public nul() {
        m36605d();
    }

    private nul m36605d() {
        this.f30896a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m36607a(nyu nyu) {
        if (this.f30896a != null) {
            nyu.m37181b(1, this.f30896a.longValue());
        }
        super.a(nyu);
    }

    protected int m36608b() {
        int b = super.b();
        if (this.f30896a != null) {
            return b + nyu.m37148f(1, this.f30896a.longValue());
        }
        return b;
    }

    private nul m36604b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30896a = Long.valueOf(nyt.m37110e());
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
