package defpackage;

public final class lpd extends nyx<lpd> {
    private static volatile lpd[] c;
    public Long a;
    public Integer b;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static lpd[] d() {
        if (c == null) {
            synchronized (nzc.c) {
                if (c == null) {
                    c = new lpd[0];
                }
            }
        }
        return c;
    }

    public lpd() {
        g();
    }

    private lpd g() {
        this.a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a.longValue());
        }
        if (this.b != null) {
            nyu.a(2, this.b.intValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.e(1, this.a.longValue());
        }
        if (this.b != null) {
            return b + nyu.f(2, this.b.intValue());
        }
        return b;
    }

    private lpd b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.a = Long.valueOf(nyt.d());
                    continue;
                case 16:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.b = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
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
