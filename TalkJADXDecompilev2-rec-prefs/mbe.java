package p000;

public final class mbe extends nyx<mbe> {
    private static volatile mbe[] f27206b;
    public String f27207a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31551b(nyt);
    }

    public static mbe[] m31552d() {
        if (f27206b == null) {
            synchronized (nzc.c) {
                if (f27206b == null) {
                    f27206b = new mbe[0];
                }
            }
        }
        return f27206b;
    }

    public mbe() {
        m31553g();
    }

    private mbe m31553g() {
        this.f27207a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f27207a != null) {
            nyu.a(1, this.f27207a);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f27207a != null) {
            return b + nyu.b(1, this.f27207a);
        }
        return b;
    }

    private mbe m31551b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f27207a = nyt.j();
                    continue;
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
