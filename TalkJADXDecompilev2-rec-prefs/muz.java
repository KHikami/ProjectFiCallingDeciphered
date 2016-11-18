package p000;

public final class muz extends nyx<muz> {
    public Float f28429a;
    public Float f28430b;
    public Float f28431c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m33033b(nyt);
    }

    public muz() {
        m33034d();
    }

    private muz m33034d() {
        this.f28429a = null;
        this.f28430b = null;
        this.f28431c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f28429a != null) {
            nyu.a(1, this.f28429a.floatValue());
        }
        if (this.f28430b != null) {
            nyu.a(2, this.f28430b.floatValue());
        }
        if (this.f28431c != null) {
            nyu.a(3, this.f28431c.floatValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f28429a != null) {
            this.f28429a.floatValue();
            b += nyu.h(1) + 4;
        }
        if (this.f28430b != null) {
            this.f28430b.floatValue();
            b += nyu.h(2) + 4;
        }
        if (this.f28431c == null) {
            return b;
        }
        this.f28431c.floatValue();
        return b + (nyu.h(3) + 4);
    }

    private muz m33033b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 13:
                    this.f28429a = Float.valueOf(nyt.c());
                    continue;
                case 21:
                    this.f28430b = Float.valueOf(nyt.c());
                    continue;
                case 29:
                    this.f28431c = Float.valueOf(nyt.c());
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
