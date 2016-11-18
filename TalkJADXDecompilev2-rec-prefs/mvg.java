package p000;

public final class mvg extends nyx<mvg> {
    public Integer f28468a;
    public Integer f28469b;
    public Float f28470c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m33068b(nyt);
    }

    public mvg() {
        this.f28468a = null;
        this.f28469b = null;
        this.f28470c = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f28468a != null) {
            nyu.a(1, this.f28468a.intValue());
        }
        if (this.f28469b != null) {
            nyu.a(2, this.f28469b.intValue());
        }
        if (this.f28470c != null) {
            nyu.a(4, this.f28470c.floatValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f28468a != null) {
            b += nyu.f(1, this.f28468a.intValue());
        }
        if (this.f28469b != null) {
            b += nyu.f(2, this.f28469b.intValue());
        }
        if (this.f28470c == null) {
            return b;
        }
        this.f28470c.floatValue();
        return b + (nyu.h(4) + 4);
    }

    private mvg m33068b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f28468a = Integer.valueOf(nyt.f());
                    continue;
                case 16:
                    this.f28469b = Integer.valueOf(nyt.f());
                    continue;
                case 37:
                    this.f28470c = Float.valueOf(nyt.c());
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
