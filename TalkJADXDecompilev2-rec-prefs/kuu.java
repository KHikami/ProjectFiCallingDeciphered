package p000;

public final class kuu extends nyx<kuu> {
    private static volatile kuu[] f23506b;
    public String f23507a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27621b(nyt);
    }

    public static kuu[] m27622d() {
        if (f23506b == null) {
            synchronized (nzc.c) {
                if (f23506b == null) {
                    f23506b = new kuu[0];
                }
            }
        }
        return f23506b;
    }

    public kuu() {
        m27623g();
    }

    private kuu m27623g() {
        this.f23507a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f23507a != null) {
            nyu.a(1, this.f23507a);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f23507a != null) {
            return b + nyu.b(1, this.f23507a);
        }
        return b;
    }

    private kuu m27621b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f23507a = nyt.j();
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
