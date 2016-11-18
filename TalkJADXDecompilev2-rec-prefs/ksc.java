package p000;

public final class ksc extends nyx<ksc> {
    public Float f22964a;
    public Float f22965b;
    public Float f22966c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27279b(nyt);
    }

    public ksc() {
        this.f22964a = null;
        this.f22965b = null;
        this.f22966c = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f22964a != null) {
            nyu.a(1, this.f22964a.floatValue());
        }
        if (this.f22965b != null) {
            nyu.a(2, this.f22965b.floatValue());
        }
        if (this.f22966c != null) {
            nyu.a(3, this.f22966c.floatValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22964a != null) {
            this.f22964a.floatValue();
            b += nyu.h(1) + 4;
        }
        if (this.f22965b != null) {
            this.f22965b.floatValue();
            b += nyu.h(2) + 4;
        }
        if (this.f22966c == null) {
            return b;
        }
        this.f22966c.floatValue();
        return b + (nyu.h(3) + 4);
    }

    private ksc m27279b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 13:
                    this.f22964a = Float.valueOf(nyt.c());
                    continue;
                case 21:
                    this.f22965b = Float.valueOf(nyt.c());
                    continue;
                case 29:
                    this.f22966c = Float.valueOf(nyt.c());
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
