package p000;

public final class kql extends nyx<kql> {
    private static volatile kql[] f22772b;
    public Integer f22773a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27064b(nyt);
    }

    public static kql[] m27065d() {
        if (f22772b == null) {
            synchronized (nzc.c) {
                if (f22772b == null) {
                    f22772b = new kql[0];
                }
            }
        }
        return f22772b;
    }

    public kql() {
        m27066g();
    }

    private kql m27066g() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22773a != null) {
            nyu.a(1, this.f22773a.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22773a != null) {
            return b + nyu.f(1, this.f22773a.intValue());
        }
        return b;
    }

    private kql m27064b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.f();
                    switch (a) {
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                            this.f22773a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                default:
                    if (!super.m1039a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
