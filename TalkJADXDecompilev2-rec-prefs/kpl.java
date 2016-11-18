package p000;

public final class kpl extends nyx<kpl> {
    private static volatile kpl[] f22654c;
    public Integer f22655a;
    public Float f22656b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26924b(nyt);
    }

    public static kpl[] m26925d() {
        if (f22654c == null) {
            synchronized (nzc.c) {
                if (f22654c == null) {
                    f22654c = new kpl[0];
                }
            }
        }
        return f22654c;
    }

    public kpl() {
        m26926g();
    }

    private kpl m26926g() {
        this.f22656b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22655a != null) {
            nyu.a(1, this.f22655a.intValue());
        }
        if (this.f22656b != null) {
            nyu.a(2, this.f22656b.floatValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22655a != null) {
            b += nyu.f(1, this.f22655a.intValue());
        }
        if (this.f22656b == null) {
            return b;
        }
        this.f22656b.floatValue();
        return b + (nyu.h(2) + 4);
    }

    private kpl m26924b(nyt nyt) {
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
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            this.f22655a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 21:
                    this.f22656b = Float.valueOf(nyt.c());
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
