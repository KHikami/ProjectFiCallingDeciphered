package defpackage;

public final class odj extends nyx<odj> {
    public Float a;
    public Float b;
    public Float c;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public odj() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a.floatValue());
        }
        if (this.b != null) {
            nyu.a(2, this.b.floatValue());
        }
        if (this.c != null) {
            nyu.a(3, this.c.floatValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            this.a.floatValue();
            b += nyu.h(1) + 4;
        }
        if (this.b != null) {
            this.b.floatValue();
            b += nyu.h(2) + 4;
        }
        if (this.c == null) {
            return b;
        }
        this.c.floatValue();
        return b + (nyu.h(3) + 4);
    }

    private odj b(nyt nyt) {
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
