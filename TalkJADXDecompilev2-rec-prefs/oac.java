package p000;

public final class oac extends nyx<oac> {
    public nzw f31472a;

    public /* synthetic */ nzf m37383a(nyt nyt) {
        return m37381b(nyt);
    }

    public oac() {
        m37382d();
    }

    private oac m37382d() {
        this.f31472a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m37384a(nyu nyu) {
        if (this.f31472a != null) {
            nyu.m37182b(1, this.f31472a);
        }
        super.a(nyu);
    }

    protected int m37385b() {
        int b = super.b();
        if (this.f31472a != null) {
            return b + nyu.m37145d(1, this.f31472a);
        }
        return b;
    }

    private oac m37381b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f31472a == null) {
                        this.f31472a = new nzw();
                    }
                    nyt.m37101a(this.f31472a);
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
