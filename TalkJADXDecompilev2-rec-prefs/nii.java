package p000;

public final class nii extends nyx<nii> {
    public String f29881a;

    public /* synthetic */ nzf m35089a(nyt nyt) {
        return m35087b(nyt);
    }

    public nii() {
        m35088d();
    }

    private nii m35088d() {
        this.f29881a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35090a(nyu nyu) {
        if (this.f29881a != null) {
            nyu.m37170a(1, this.f29881a);
        }
        super.a(nyu);
    }

    protected int m35091b() {
        int b = super.b();
        if (this.f29881a != null) {
            return b + nyu.m37137b(1, this.f29881a);
        }
        return b;
    }

    private nii m35087b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f29881a = nyt.m37117j();
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
