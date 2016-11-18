package defpackage;

public final class naw extends nyx<naw> {
    private static volatile naw[] c;
    public String a;
    public Integer b;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static naw[] d() {
        if (c == null) {
            synchronized (nzc.c) {
                if (c == null) {
                    c = new naw[0];
                }
            }
        }
        return c;
    }

    public naw() {
        g();
    }

    private naw g() {
        this.a = null;
        this.b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a);
        }
        if (this.b != null) {
            nyu.a(2, this.b.intValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.b(1, this.a);
        }
        if (this.b != null) {
            return b + nyu.f(2, this.b.intValue());
        }
        return b;
    }

    private naw b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.a = nyt.j();
                    continue;
                case 16:
                    this.b = Integer.valueOf(nyt.f());
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
