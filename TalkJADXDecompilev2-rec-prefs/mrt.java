package p000;

public final class mrt extends nyx<mrt> {
    private static volatile mrt[] f28229b;
    public Integer f28230a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m32803b(nyt);
    }

    public static mrt[] m32804d() {
        if (f28229b == null) {
            synchronized (nzc.c) {
                if (f28229b == null) {
                    f28229b = new mrt[0];
                }
            }
        }
        return f28229b;
    }

    public mrt() {
        m32805g();
    }

    private mrt m32805g() {
        this.f28230a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f28230a != null) {
            nyu.a(1, this.f28230a.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f28230a != null) {
            return b + nyu.f(1, this.f28230a.intValue());
        }
        return b;
    }

    private mrt m32803b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f28230a = Integer.valueOf(nyt.f());
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
