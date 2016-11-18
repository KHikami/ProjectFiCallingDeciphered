package p000;

public final class ozd extends nyx<ozd> {
    public String f34683a;

    public /* synthetic */ nzf m39998a(nyt nyt) {
        return m39996b(nyt);
    }

    public ozd() {
        m39997d();
    }

    private ozd m39997d() {
        this.f34683a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39999a(nyu nyu) {
        if (this.f34683a != null) {
            nyu.m37170a(1, this.f34683a);
        }
        super.a(nyu);
    }

    protected int m40000b() {
        int b = super.b();
        if (this.f34683a != null) {
            return b + nyu.m37137b(1, this.f34683a);
        }
        return b;
    }

    private ozd m39996b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f34683a = nyt.m37117j();
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
