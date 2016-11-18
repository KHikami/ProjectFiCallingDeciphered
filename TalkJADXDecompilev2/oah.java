package defpackage;

public final class oah extends nyx<oah> {
    private static volatile oah[] b;
    public String a;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static oah[] d() {
        if (b == null) {
            synchronized (nzc.c) {
                if (b == null) {
                    b = new oah[0];
                }
            }
        }
        return b;
    }

    public oah() {
        g();
    }

    private oah g() {
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

    private oah b(nyt nyt) {
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
