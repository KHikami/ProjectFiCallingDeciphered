package defpackage;

public final class ood extends nyx<ood> {
    private static volatile ood[] a;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static ood[] d() {
        if (a == null) {
            synchronized (nzc.c) {
                if (a == null) {
                    a = new ood[0];
                }
            }
        }
        return a;
    }

    public ood() {
        this.cachedSize = -1;
    }

    private ood b(nyt nyt) {
        int a;
        do {
            a = nyt.a();
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
