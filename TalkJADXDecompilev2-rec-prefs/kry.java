package p000;

public final class kry extends nyx<kry> {
    private static volatile kry[] f22958b;
    public String f22959a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27263b(nyt);
    }

    public static kry[] m27264d() {
        if (f22958b == null) {
            synchronized (nzc.c) {
                if (f22958b == null) {
                    f22958b = new kry[0];
                }
            }
        }
        return f22958b;
    }

    public kry() {
        this.f22959a = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f22959a != null) {
            nyu.a(1, this.f22959a);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22959a != null) {
            return b + nyu.b(1, this.f22959a);
        }
        return b;
    }

    private kry m27263b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f22959a = nyt.j();
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
