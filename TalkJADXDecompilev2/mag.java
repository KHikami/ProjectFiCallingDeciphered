package defpackage;

public final class mag extends nyx<mag> {
    private static volatile mag[] e;
    public Float a;
    public Float b;
    public Float c;
    public Float d;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static mag[] d() {
        if (e == null) {
            synchronized (nzc.c) {
                if (e == null) {
                    e = new mag[0];
                }
            }
        }
        return e;
    }

    public mag() {
        g();
    }

    private mag g() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        nyu.a(1, this.a.floatValue());
        nyu.a(2, this.b.floatValue());
        nyu.a(3, this.c.floatValue());
        nyu.a(4, this.d.floatValue());
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        this.a.floatValue();
        b += nyu.h(1) + 4;
        this.b.floatValue();
        b += nyu.h(2) + 4;
        this.c.floatValue();
        b += nyu.h(3) + 4;
        this.d.floatValue();
        return b + (nyu.h(4) + 4);
    }

    private mag b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 13:
                    this.a = Float.valueOf(nyt.c());
                    continue;
                case 21:
                    this.b = Float.valueOf(nyt.c());
                    continue;
                case 29:
                    this.c = Float.valueOf(nyt.c());
                    continue;
                case 37:
                    this.d = Float.valueOf(nyt.c());
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
