package defpackage;

public final class nqg extends nyx<nqg> {
    private static volatile nqg[] b;
    public nqz a;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static nqg[] d() {
        if (b == null) {
            synchronized (nzc.c) {
                if (b == null) {
                    b = new nqg[0];
                }
            }
        }
        return b;
    }

    public nqg() {
        this.cachedSize = -1;
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

    private nqg b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.a == null) {
                        this.a = new nqz();
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
