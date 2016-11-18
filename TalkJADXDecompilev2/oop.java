package defpackage;

public final class oop extends nyx<oop> {
    private static volatile oop[] e;
    public String a;
    public String b;
    public Long c;
    public String d;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static oop[] d() {
        if (e == null) {
            synchronized (nzc.c) {
                if (e == null) {
                    e = new oop[0];
                }
            }
        }
        return e;
    }

    public oop() {
        g();
    }

    private oop g() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a);
        }
        if (this.b != null) {
            nyu.a(2, this.b);
        }
        if (this.d != null) {
            nyu.a(3, this.d);
        }
        if (this.c != null) {
            nyu.a(4, this.c.longValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.b(1, this.a);
        }
        if (this.b != null) {
            b += nyu.b(2, this.b);
        }
        if (this.d != null) {
            b += nyu.b(3, this.d);
        }
        if (this.c != null) {
            return b + nyu.e(4, this.c.longValue());
        }
        return b;
    }

    private oop b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.d = nyt.j();
                    continue;
                case 32:
                    this.c = Long.valueOf(nyt.d());
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
