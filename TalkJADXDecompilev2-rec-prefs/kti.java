package p000;

public final class kti extends nyx<kti> {
    private static volatile kti[] f23222b;
    public String f23223a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27444b(nyt);
    }

    public static kti[] m27445d() {
        if (f23222b == null) {
            synchronized (nzc.c) {
                if (f23222b == null) {
                    f23222b = new kti[0];
                }
            }
        }
        return f23222b;
    }

    public kti() {
        this.f23223a = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f23223a != null) {
            nyu.a(1, this.f23223a);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f23223a != null) {
            return b + nyu.b(1, this.f23223a);
        }
        return b;
    }

    private kti m27444b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f23223a = nyt.j();
                    continue;
                default:
                    if (!super.m1039a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
