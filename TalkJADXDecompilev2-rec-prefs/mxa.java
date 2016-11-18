package p000;

public final class mxa extends nyx<mxa> {
    private static volatile mxa[] f28647d;
    public int f28648a;
    public Float f28649b;
    public Float f28650c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m33284b(nyt);
    }

    public static mxa[] m33285d() {
        if (f28647d == null) {
            synchronized (nzc.c) {
                if (f28647d == null) {
                    f28647d = new mxa[0];
                }
            }
        }
        return f28647d;
    }

    public mxa() {
        this.f28648a = nzf.UNSET_ENUM_VALUE;
        this.f28649b = null;
        this.f28650c = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f28648a != nzf.UNSET_ENUM_VALUE) {
            nyu.a(1, this.f28648a);
        }
        if (this.f28649b != null) {
            nyu.a(2, this.f28649b.floatValue());
        }
        if (this.f28650c != null) {
            nyu.a(3, this.f28650c.floatValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f28648a != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(1, this.f28648a);
        }
        if (this.f28649b != null) {
            this.f28649b.floatValue();
            b += nyu.h(2) + 4;
        }
        if (this.f28650c == null) {
            return b;
        }
        this.f28650c.floatValue();
        return b + (nyu.h(3) + 4);
    }

    private mxa m33284b(nyt nyt) {
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
                            this.f28648a = a;
                            break;
                        default:
                            continue;
                    }
                case 21:
                    this.f28649b = Float.valueOf(nyt.c());
                    continue;
                case 29:
                    this.f28650c = Float.valueOf(nyt.c());
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
