package defpackage;

public final class kpl extends nyx<kpl> {
    private static volatile kpl[] c;
    public Integer a;
    public Float b;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static kpl[] d() {
        if (c == null) {
            synchronized (nzc.c) {
                if (c == null) {
                    c = new kpl[0];
                }
            }
        }
        return c;
    }

    public kpl() {
        g();
    }

    private kpl g() {
        this.b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a.intValue());
        }
        if (this.b != null) {
            nyu.a(2, this.b.floatValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.f(1, this.a.intValue());
        }
        if (this.b == null) {
            return b;
        }
        this.b.floatValue();
        return b + (nyu.h(2) + 4);
    }

    private kpl b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            this.a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
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
