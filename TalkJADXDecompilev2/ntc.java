package defpackage;

public final class ntc extends nyx<ntc> {
    private static volatile ntc[] b;
    public int a;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static ntc[] d() {
        if (b == null) {
            synchronized (nzc.c) {
                if (b == null) {
                    b = new ntc[0];
                }
            }
        }
        return b;
    }

    public ntc() {
        this.a = nzf.UNSET_ENUM_VALUE;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        if (this.a != nzf.UNSET_ENUM_VALUE) {
            nyu.a(1, this.a);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != nzf.UNSET_ENUM_VALUE) {
            return b + nyu.f(1, this.a);
        }
        return b;
    }

    private ntc b(nyt nyt) {
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
                            this.a = a;
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
