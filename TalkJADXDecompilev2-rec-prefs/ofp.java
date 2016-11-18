package p000;

public final class ofp extends nyx<ofp> {
    public String f32654a;
    public String f32655b;
    public ofl f32656c;
    public String f32657d;
    public int f32658e;

    public /* synthetic */ nzf m38091a(nyt nyt) {
        return m38090b(nyt);
    }

    public ofp() {
        this.f32654a = null;
        this.f32655b = null;
        this.f32657d = null;
        this.f32658e = nzf.UNSET_ENUM_VALUE;
        this.cachedSize = -1;
    }

    public void m38092a(nyu nyu) {
        if (this.f32654a != null) {
            nyu.m37170a(1, this.f32654a);
        }
        if (this.f32655b != null) {
            nyu.m37170a(2, this.f32655b);
        }
        if (this.f32656c != null) {
            nyu.m37182b(3, this.f32656c);
        }
        if (this.f32657d != null) {
            nyu.m37170a(4, this.f32657d);
        }
        if (this.f32658e != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(5, this.f32658e);
        }
        super.a(nyu);
    }

    protected int m38093b() {
        int b = super.b();
        if (this.f32654a != null) {
            b += nyu.m37137b(1, this.f32654a);
        }
        if (this.f32655b != null) {
            b += nyu.m37137b(2, this.f32655b);
        }
        if (this.f32656c != null) {
            b += nyu.m37145d(3, this.f32656c);
        }
        if (this.f32657d != null) {
            b += nyu.m37137b(4, this.f32657d);
        }
        if (this.f32658e != nzf.UNSET_ENUM_VALUE) {
            return b + nyu.m37147f(5, this.f32658e);
        }
        return b;
    }

    private ofp m38090b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f32654a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    this.f32655b = nyt.m37117j();
                    continue;
                case wi.dx /*26*/:
                    if (this.f32656c == null) {
                        this.f32656c = new ofl();
                    }
                    nyt.m37101a(this.f32656c);
                    continue;
                case 34:
                    this.f32657d = nyt.m37117j();
                    continue;
                case 40:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f32658e = a;
                            break;
                        default:
                            continue;
                    }
                default:
                    if (!super.a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
