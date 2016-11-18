package p000;

public final class njr extends nyx<njr> {
    public String f30006a;

    public /* synthetic */ nzf m35269a(nyt nyt) {
        return m35267b(nyt);
    }

    public njr() {
        m35268d();
    }

    private njr m35268d() {
        this.f30006a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35270a(nyu nyu) {
        if (this.f30006a != null) {
            nyu.m37170a(1, this.f30006a);
        }
        super.a(nyu);
    }

    protected int m35271b() {
        int b = super.b();
        if (this.f30006a != null) {
            return b + nyu.m37137b(1, this.f30006a);
        }
        return b;
    }

    private njr m35267b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f30006a = nyt.m37117j();
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
