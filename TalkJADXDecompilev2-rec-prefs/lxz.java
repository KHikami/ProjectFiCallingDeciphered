package p000;

public final class lxz extends nyx<lxz> {
    private static volatile lxz[] f26831c;
    public String f26832a;
    public Float f26833b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31082b(nyt);
    }

    public static lxz[] m31083d() {
        if (f26831c == null) {
            synchronized (nzc.c) {
                if (f26831c == null) {
                    f26831c = new lxz[0];
                }
            }
        }
        return f26831c;
    }

    public lxz() {
        m31084g();
    }

    private lxz m31084g() {
        this.f26832a = null;
        this.f26833b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26832a != null) {
            nyu.a(1, this.f26832a);
        }
        if (this.f26833b != null) {
            nyu.a(2, this.f26833b.floatValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26832a != null) {
            b += nyu.b(1, this.f26832a);
        }
        if (this.f26833b == null) {
            return b;
        }
        this.f26833b.floatValue();
        return b + (nyu.h(2) + 4);
    }

    private lxz m31082b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f26832a = nyt.j();
                    continue;
                case 21:
                    this.f26833b = Float.valueOf(nyt.c());
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
