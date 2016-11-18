package p000;

public final class mux extends nyx<mux> {
    public Float f28421a;
    public Float f28422b;
    public Float f28423c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m33025b(nyt);
    }

    public mux() {
        this.f28421a = null;
        this.f28422b = null;
        this.f28423c = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f28421a != null) {
            nyu.a(1, this.f28421a.floatValue());
        }
        if (this.f28422b != null) {
            nyu.a(2, this.f28422b.floatValue());
        }
        if (this.f28423c != null) {
            nyu.a(3, this.f28423c.floatValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f28421a != null) {
            this.f28421a.floatValue();
            b += nyu.h(1) + 4;
        }
        if (this.f28422b != null) {
            this.f28422b.floatValue();
            b += nyu.h(2) + 4;
        }
        if (this.f28423c == null) {
            return b;
        }
        this.f28423c.floatValue();
        return b + (nyu.h(3) + 4);
    }

    private mux m33025b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 13:
                    this.f28421a = Float.valueOf(nyt.c());
                    continue;
                case 21:
                    this.f28422b = Float.valueOf(nyt.c());
                    continue;
                case 29:
                    this.f28423c = Float.valueOf(nyt.c());
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
