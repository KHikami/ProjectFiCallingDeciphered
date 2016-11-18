package p000;

public final class lyn extends nyx<lyn> {
    private static volatile lyn[] f26930c;
    public String f26931a;
    public Integer f26932b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31163b(nyt);
    }

    public static lyn[] m31164d() {
        if (f26930c == null) {
            synchronized (nzc.c) {
                if (f26930c == null) {
                    f26930c = new lyn[0];
                }
            }
        }
        return f26930c;
    }

    public lyn() {
        m31165g();
    }

    private lyn m31165g() {
        this.f26931a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26931a != null) {
            nyu.a(1, this.f26931a);
        }
        if (this.f26932b != null) {
            nyu.a(2, this.f26932b.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26931a != null) {
            b += nyu.b(1, this.f26931a);
        }
        if (this.f26932b != null) {
            return b + nyu.f(2, this.f26932b.intValue());
        }
        return b;
    }

    private lyn m31163b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f26931a = nyt.j();
                    continue;
                case 16:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                            this.f26932b = Integer.valueOf(a);
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
