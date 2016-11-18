package defpackage;

public final class nhx extends nyx<nhx> {
    private static volatile nhx[] b;
    public String a;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static nhx[] d() {
        if (b == null) {
            synchronized (nzc.c) {
                if (b == null) {
                    b = new nhx[0];
                }
            }
        }
        return b;
    }

    public nhx() {
        g();
    }

    private nhx g() {
        this.a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
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

    private nhx b(nyt nyt) {
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
