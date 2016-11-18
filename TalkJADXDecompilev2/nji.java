package defpackage;

public final class nji extends nyx<nji> {
    private static volatile nji[] d;
    public nmj a;
    public nhx b;
    public Float c;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static nji[] d() {
        if (d == null) {
            synchronized (nzc.c) {
                if (d == null) {
                    d = new nji[0];
                }
            }
        }
        return d;
    }

    public nji() {
        g();
    }

    private nji g() {
        this.a = null;
        this.b = null;
        this.c = null;
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
        if (this.c != null) {
            nyu.a(3, this.c.floatValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.d(1, this.a);
        }
        if (this.b != null) {
            b += nyu.d(2, this.b);
        }
        if (this.c == null) {
            return b;
        }
        this.c.floatValue();
        return b + (nyu.h(3) + 4);
    }

    private nji b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.a == null) {
                        this.a = new nmj();
                    }
                    nyt.a(this.a);
                    continue;
                case wi.dH /*18*/:
                    if (this.b == null) {
                        this.b = new nhx();
                    }
                    nyt.a(this.b);
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
