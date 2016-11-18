package defpackage;

public final class ohn extends nyx<ohn> {
    private static volatile ohn[] c;
    public Long a;
    public Long b;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static ohn[] d() {
        if (c == null) {
            synchronized (nzc.c) {
                if (c == null) {
                    c = new ohn[0];
                }
            }
        }
        return c;
    }

    public ohn() {
        this.a = null;
        this.b = null;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        nyu.b(1, this.a.longValue());
        nyu.b(2, this.b.longValue());
        super.a(nyu);
    }

    protected int b() {
        return (super.b() + nyu.f(1, this.a.longValue())) + nyu.f(2, this.b.longValue());
    }

    private ohn b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.a = Long.valueOf(nyt.e());
                    continue;
                case 16:
                    this.b = Long.valueOf(nyt.e());
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
