package defpackage;

public final class ooz extends nyx<ooz> {
    private static volatile ooz[] b;
    public oqu a;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static ooz[] d() {
        if (b == null) {
            synchronized (nzc.c) {
                if (b == null) {
                    b = new ooz[0];
                }
            }
        }
        return b;
    }

    public ooz() {
        g();
    }

    private ooz g() {
        this.a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.b(1, this.a);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            return b + nyu.d(1, this.a);
        }
        return b;
    }

    private ooz b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.a == null) {
                        this.a = new oqu();
                    }
                    nyt.a(this.a);
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
