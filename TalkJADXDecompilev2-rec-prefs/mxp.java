package p000;

public final class mxp extends nyx<mxp> {
    private static volatile mxp[] f28699d;
    public Integer f28700a;
    public Float f28701b;
    public Float f28702c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m33362b(nyt);
    }

    public static mxp[] m33363d() {
        if (f28699d == null) {
            synchronized (nzc.c) {
                if (f28699d == null) {
                    f28699d = new mxp[0];
                }
            }
        }
        return f28699d;
    }

    public mxp() {
        m33364g();
    }

    private mxp m33364g() {
        this.f28701b = null;
        this.f28702c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f28700a != null) {
            nyu.a(1, this.f28700a.intValue());
        }
        if (this.f28701b != null) {
            nyu.a(2, this.f28701b.floatValue());
        }
        if (this.f28702c != null) {
            nyu.a(3, this.f28702c.floatValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f28700a != null) {
            b += nyu.f(1, this.f28700a.intValue());
        }
        if (this.f28701b != null) {
            this.f28701b.floatValue();
            b += nyu.h(2) + 4;
        }
        if (this.f28702c == null) {
            return b;
        }
        this.f28702c.floatValue();
        return b + (nyu.h(3) + 4);
    }

    private mxp m33362b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f28700a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 21:
                    this.f28701b = Float.valueOf(nyt.c());
                    continue;
                case 29:
                    this.f28702c = Float.valueOf(nyt.c());
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
