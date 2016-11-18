package defpackage;

public final class kti extends nyx<kti> {
    private static volatile kti[] b;
    public String a;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static kti[] d() {
        if (b == null) {
            synchronized (nzc.c) {
                if (b == null) {
                    b = new kti[0];
                }
            }
        }
        return b;
    }

    public kti() {
        this.a = null;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            return b + nyu.b(1, this.a);
        }
        return b;
    }

    private kti b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.a = nyt.j();
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
