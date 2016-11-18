package defpackage;

public final class nmn extends nyx<nmn> {
    private static volatile nmn[] b;
    public Integer a;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static nmn[] d() {
        if (b == null) {
            synchronized (nzc.c) {
                if (b == null) {
                    b = new nmn[0];
                }
            }
        }
        return b;
    }

    public nmn() {
        g();
    }

    private nmn g() {
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

    private nmn b(nyt nyt) {
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
