package p000;

public final class kts extends nyx<kts> {
    public Float f23256a;
    public Float f23257b;
    public Float f23258c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27495b(nyt);
    }

    public kts() {
        m27496d();
    }

    private kts m27496d() {
        this.f23256a = null;
        this.f23257b = null;
        this.f23258c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f23256a != null) {
            nyu.a(1, this.f23256a.floatValue());
        }
        if (this.f23257b != null) {
            nyu.a(2, this.f23257b.floatValue());
        }
        if (this.f23258c != null) {
            nyu.a(3, this.f23258c.floatValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f23256a != null) {
            this.f23256a.floatValue();
            b += nyu.h(1) + 4;
        }
        if (this.f23257b != null) {
            this.f23257b.floatValue();
            b += nyu.h(2) + 4;
        }
        if (this.f23258c == null) {
            return b;
        }
        this.f23258c.floatValue();
        return b + (nyu.h(3) + 4);
    }

    private kts m27495b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 13:
                    this.f23256a = Float.valueOf(nyt.c());
                    continue;
                case 21:
                    this.f23257b = Float.valueOf(nyt.c());
                    continue;
                case 29:
                    this.f23258c = Float.valueOf(nyt.c());
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
