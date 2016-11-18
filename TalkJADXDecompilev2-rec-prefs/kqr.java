package p000;

public final class kqr extends nyx<kqr> {
    public Float f22800a;
    public Float f22801b;
    public Float f22802c;
    public Float f22803d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27096b(nyt);
    }

    public kqr() {
        m27097d();
    }

    private kqr m27097d() {
        this.f22800a = null;
        this.f22801b = null;
        this.f22802c = null;
        this.f22803d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22800a != null) {
            nyu.a(1, this.f22800a.floatValue());
        }
        if (this.f22801b != null) {
            nyu.a(2, this.f22801b.floatValue());
        }
        if (this.f22802c != null) {
            nyu.a(3, this.f22802c.floatValue());
        }
        if (this.f22803d != null) {
            nyu.a(4, this.f22803d.floatValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22800a != null) {
            this.f22800a.floatValue();
            b += nyu.h(1) + 4;
        }
        if (this.f22801b != null) {
            this.f22801b.floatValue();
            b += nyu.h(2) + 4;
        }
        if (this.f22802c != null) {
            this.f22802c.floatValue();
            b += nyu.h(3) + 4;
        }
        if (this.f22803d == null) {
            return b;
        }
        this.f22803d.floatValue();
        return b + (nyu.h(4) + 4);
    }

    private kqr m27096b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 13:
                    this.f22800a = Float.valueOf(nyt.c());
                    continue;
                case 21:
                    this.f22801b = Float.valueOf(nyt.c());
                    continue;
                case 29:
                    this.f22802c = Float.valueOf(nyt.c());
                    continue;
                case 37:
                    this.f22803d = Float.valueOf(nyt.c());
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
