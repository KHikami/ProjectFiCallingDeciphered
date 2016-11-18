package p000;

public final class mvd extends nyx<mvd> {
    public Integer f28451a;
    public Integer f28452b;
    public Float f28453c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m33054b(nyt);
    }

    public mvd() {
        m33055d();
    }

    private mvd m33055d() {
        this.f28451a = null;
        this.f28452b = null;
        this.f28453c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f28451a != null) {
            nyu.a(1, this.f28451a.intValue());
        }
        if (this.f28452b != null) {
            nyu.a(2, this.f28452b.intValue());
        }
        if (this.f28453c != null) {
            nyu.a(4, this.f28453c.floatValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f28451a != null) {
            b += nyu.f(1, this.f28451a.intValue());
        }
        if (this.f28452b != null) {
            b += nyu.f(2, this.f28452b.intValue());
        }
        if (this.f28453c == null) {
            return b;
        }
        this.f28453c.floatValue();
        return b + (nyu.h(4) + 4);
    }

    private mvd m33054b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f28451a = Integer.valueOf(nyt.f());
                    continue;
                case 16:
                    this.f28452b = Integer.valueOf(nyt.f());
                    continue;
                case 37:
                    this.f28453c = Float.valueOf(nyt.c());
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
