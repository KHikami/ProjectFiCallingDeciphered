package defpackage;

public final class kth extends nyx<kth> {
    private static volatile kth[] b;
    public Integer a;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static kth[] d() {
        if (b == null) {
            synchronized (nzc.c) {
                if (b == null) {
                    b = new kth[0];
                }
            }
        }
        return b;
    }

    public kth() {
        g();
    }

    private kth g() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a.intValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            return b + nyu.f(1, this.a.intValue());
        }
        return b;
    }

    private kth b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            this.a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
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
