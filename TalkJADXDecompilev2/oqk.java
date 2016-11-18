package defpackage;

public final class oqk extends nyx<oqk> {
    private static volatile oqk[] c;
    public mud a;
    public Float b;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static oqk[] d() {
        if (c == null) {
            synchronized (nzc.c) {
                if (c == null) {
                    c = new oqk[0];
                }
            }
        }
        return c;
    }

    public oqk() {
        g();
    }

    private oqk g() {
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
            nyu.a(2, this.b.floatValue());
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
        this.b.floatValue();
        return b + (nyu.h(2) + 4);
    }

    private oqk b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.a == null) {
                        this.a = new mud();
                    }
                    nyt.a(this.a);
                    continue;
                case 21:
                    this.b = Float.valueOf(nyt.c());
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
