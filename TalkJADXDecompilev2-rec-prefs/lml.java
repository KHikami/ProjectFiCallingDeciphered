package p000;

public final class lml extends nyx<lml> {
    private static volatile lml[] f25566m;
    public int f25567a;
    public Long f25568b;
    public Long f25569c;
    public Integer f25570d;
    public Integer f25571e;
    public Integer f25572f;
    public Boolean f25573g;
    public Boolean f25574h;
    public Boolean f25575i;
    public Boolean f25576j;
    public Integer f25577k;
    public Boolean f25578l;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29499b(nyt);
    }

    public static lml[] m29500d() {
        if (f25566m == null) {
            synchronized (nzc.c) {
                if (f25566m == null) {
                    f25566m = new lml[0];
                }
            }
        }
        return f25566m;
    }

    public lml() {
        this.f25567a = nzf.UNSET_ENUM_VALUE;
        this.f25568b = null;
        this.f25569c = null;
        this.f25570d = null;
        this.f25571e = null;
        this.f25572f = null;
        this.f25573g = null;
        this.f25574h = null;
        this.f25575i = null;
        this.f25576j = null;
        this.f25577k = null;
        this.f25578l = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        nyu.a(1, this.f25567a);
        if (this.f25568b != null) {
            nyu.b(2, this.f25568b.longValue());
        }
        if (this.f25571e != null) {
            nyu.a(4, this.f25571e.intValue());
        }
        if (this.f25572f != null) {
            nyu.a(5, this.f25572f.intValue());
        }
        if (this.f25573g != null) {
            nyu.a(6, this.f25573g.booleanValue());
        }
        if (this.f25574h != null) {
            nyu.a(7, this.f25574h.booleanValue());
        }
        if (this.f25575i != null) {
            nyu.a(8, this.f25575i.booleanValue());
        }
        if (this.f25577k != null) {
            nyu.a(11, this.f25577k.intValue());
        }
        if (this.f25570d != null) {
            nyu.a(12, this.f25570d.intValue());
        }
        if (this.f25576j != null) {
            nyu.a(13, this.f25576j.booleanValue());
        }
        if (this.f25569c != null) {
            nyu.b(14, this.f25569c.longValue());
        }
        if (this.f25578l != null) {
            nyu.a(15, this.f25578l.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b() + nyu.f(1, this.f25567a);
        if (this.f25568b != null) {
            b += nyu.f(2, this.f25568b.longValue());
        }
        if (this.f25571e != null) {
            b += nyu.f(4, this.f25571e.intValue());
        }
        if (this.f25572f != null) {
            b += nyu.f(5, this.f25572f.intValue());
        }
        if (this.f25573g != null) {
            this.f25573g.booleanValue();
            b += nyu.h(6) + 1;
        }
        if (this.f25574h != null) {
            this.f25574h.booleanValue();
            b += nyu.h(7) + 1;
        }
        if (this.f25575i != null) {
            this.f25575i.booleanValue();
            b += nyu.h(8) + 1;
        }
        if (this.f25577k != null) {
            b += nyu.f(11, this.f25577k.intValue());
        }
        if (this.f25570d != null) {
            b += nyu.f(12, this.f25570d.intValue());
        }
        if (this.f25576j != null) {
            this.f25576j.booleanValue();
            b += nyu.h(13) + 1;
        }
        if (this.f25569c != null) {
            b += nyu.f(14, this.f25569c.longValue());
        }
        if (this.f25578l == null) {
            return b;
        }
        this.f25578l.booleanValue();
        return b + (nyu.h(15) + 1);
    }

    private lml m29499b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                        case 6:
                        case 7:
                            this.f25567a = a;
                            break;
                        default:
                            continue;
                    }
                case 16:
                    this.f25568b = Long.valueOf(nyt.e());
                    continue;
                case 32:
                    this.f25571e = Integer.valueOf(nyt.f());
                    continue;
                case 40:
                    this.f25572f = Integer.valueOf(nyt.f());
                    continue;
                case 48:
                    this.f25573g = Boolean.valueOf(nyt.i());
                    continue;
                case 56:
                    this.f25574h = Boolean.valueOf(nyt.i());
                    continue;
                case 64:
                    this.f25575i = Boolean.valueOf(nyt.i());
                    continue;
                case 88:
                    this.f25577k = Integer.valueOf(nyt.f());
                    continue;
                case 96:
                    this.f25570d = Integer.valueOf(nyt.f());
                    continue;
                case 104:
                    this.f25576j = Boolean.valueOf(nyt.i());
                    continue;
                case 112:
                    this.f25569c = Long.valueOf(nyt.e());
                    continue;
                case 120:
                    this.f25578l = Boolean.valueOf(nyt.i());
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
