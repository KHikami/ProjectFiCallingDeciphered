package p000;

public final class mwr extends nyx<mwr> {
    private static volatile mwr[] f28619b;
    public Integer f28620a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m33244b(nyt);
    }

    public static mwr[] m33245d() {
        if (f28619b == null) {
            synchronized (nzc.c) {
                if (f28619b == null) {
                    f28619b = new mwr[0];
                }
            }
        }
        return f28619b;
    }

    public mwr() {
        this.f28620a = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f28620a != null) {
            nyu.a(1, this.f28620a.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f28620a != null) {
            return b + nyu.f(1, this.f28620a.intValue());
        }
        return b;
    }

    private mwr m33244b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f28620a = Integer.valueOf(nyt.f());
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
