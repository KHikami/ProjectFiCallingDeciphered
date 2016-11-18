package defpackage;

public final class mrt extends nyx<mrt> {
    private static volatile mrt[] b;
    public Integer a;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static mrt[] d() {
        if (b == null) {
            synchronized (nzc.c) {
                if (b == null) {
                    b = new mrt[0];
                }
            }
        }
        return b;
    }

    public mrt() {
        g();
    }

    private mrt g() {
        this.a = null;
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

    private mrt b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.a = Integer.valueOf(nyt.f());
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
