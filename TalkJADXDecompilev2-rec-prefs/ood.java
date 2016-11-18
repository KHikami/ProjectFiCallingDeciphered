package p000;

public final class ood extends nyx<ood> {
    private static volatile ood[] f33370a;

    public /* synthetic */ nzf m38885a(nyt nyt) {
        return m38883b(nyt);
    }

    public static ood[] m38884d() {
        if (f33370a == null) {
            synchronized (nzc.f31309c) {
                if (f33370a == null) {
                    f33370a = new ood[0];
                }
            }
        }
        return f33370a;
    }

    public ood() {
        this.cachedSize = -1;
    }

    private ood m38883b(nyt nyt) {
        int a;
        do {
            a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                default:
                    break;
            }
            return this;
        } while (super.a(nyt, a));
        return this;
    }
}
