package p000;

public final class npz extends nyx<npz> {
    public String f30468a;

    public /* synthetic */ nzf m36107a(nyt nyt) {
        return m36105b(nyt);
    }

    public npz() {
        m36106d();
    }

    private npz m36106d() {
        this.f30468a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m36108a(nyu nyu) {
        if (this.f30468a != null) {
            nyu.m37170a(1, this.f30468a);
        }
        super.a(nyu);
    }

    protected int m36109b() {
        int b = super.b();
        if (this.f30468a != null) {
            return b + nyu.m37137b(1, this.f30468a);
        }
        return b;
    }

    private npz m36105b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f30468a = nyt.m37117j();
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
