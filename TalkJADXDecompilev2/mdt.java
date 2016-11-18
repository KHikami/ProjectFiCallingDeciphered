package defpackage;

public final class mdt extends nyx<mdt> {
    private static volatile mdt[] e;
    public Long a;
    public Boolean b;
    public String c;
    public String d;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static mdt[] d() {
        if (e == null) {
            synchronized (nzc.c) {
                if (e == null) {
                    e = new mdt[0];
                }
            }
        }
        return e;
    }

    public mdt() {
        g();
    }

    private mdt g() {
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
            nyu.b(1, this.a.longValue());
        }
        if (this.b != null) {
            nyu.a(2, this.b.booleanValue());
        }
        if (this.c != null) {
            nyu.a(5, this.c);
        }
        if (this.d != null) {
            nyu.a(6, this.d);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.f(1, this.a.longValue());
        }
        if (this.b != null) {
            this.b.booleanValue();
            b += nyu.h(2) + 1;
        }
        if (this.c != null) {
            b += nyu.b(5, this.c);
        }
        if (this.d != null) {
            return b + nyu.b(6, this.d);
        }
        return b;
    }

    private mdt b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.a = Long.valueOf(nyt.e());
                    continue;
                case 16:
                    this.b = Boolean.valueOf(nyt.i());
                    continue;
                case 42:
                    this.c = nyt.j();
                    continue;
                case 50:
                    this.d = nyt.j();
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
