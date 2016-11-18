package defpackage;

public final class kqh extends nyx<kqh> {
    private static volatile kqh[] b;
    public String a;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static kqh[] d() {
        if (b == null) {
            synchronized (nzc.c) {
                if (b == null) {
                    b = new kqh[0];
                }
            }
        }
        return b;
    }

    public kqh() {
        g();
    }

    private kqh g() {
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

    private kqh b(nyt nyt) {
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
