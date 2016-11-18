package defpackage;

public final class lqw extends nyx<lqw> {
    private static volatile lqw[] c;
    public lqv a;
    public Boolean b;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static lqw[] d() {
        if (c == null) {
            synchronized (nzc.c) {
                if (c == null) {
                    c = new lqw[0];
                }
            }
        }
        return c;
    }

    public lqw() {
        g();
    }

    private lqw g() {
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
            nyu.a(2, this.b.booleanValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.d(1, this.a);
        }
        if (this.b == null) {
            return b;
        }
        this.b.booleanValue();
        return b + (nyu.h(2) + 1);
    }

    private lqw b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.a == null) {
                        this.a = new lqv();
                    }
                    nyt.a(this.a);
                    continue;
                case 16:
                    this.b = Boolean.valueOf(nyt.i());
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
