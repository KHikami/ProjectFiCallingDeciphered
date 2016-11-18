package defpackage;

public final class lrw extends nyx<lrw> {
    private static volatile lrw[] c;
    public mrp a;
    public lrx b;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static lrw[] d() {
        if (c == null) {
            synchronized (nzc.c) {
                if (c == null) {
                    c = new lrw[0];
                }
            }
        }
        return c;
    }

    public lrw() {
        g();
    }

    private lrw g() {
        this.a = null;
        this.b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.b(1, this.a);
        }
        if (this.b != null) {
            nyu.b(2, this.b);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.d(1, this.a);
        }
        if (this.b != null) {
            return b + nyu.d(2, this.b);
        }
        return b;
    }

    private lrw b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.a == null) {
                        this.a = new mrp();
                    }
                    nyt.a(this.a);
                    continue;
                case wi.dH /*18*/:
                    if (this.b == null) {
                        this.b = new lrx();
                    }
                    nyt.a(this.b);
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
