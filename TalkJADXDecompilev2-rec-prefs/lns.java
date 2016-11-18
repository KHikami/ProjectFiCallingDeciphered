package p000;

public final class lns extends nyx<lns> {
    public Integer f25822a;
    public ltr f25823b;
    public ltr f25824c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29658b(nyt);
    }

    public lns() {
        m29659d();
    }

    private lns m29659d() {
        this.f25823b = null;
        this.f25824c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f25822a != null) {
            nyu.a(1, this.f25822a.intValue());
        }
        if (this.f25823b != null) {
            nyu.b(2, this.f25823b);
        }
        if (this.f25824c != null) {
            nyu.b(3, this.f25824c);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f25822a != null) {
            b += nyu.f(1, this.f25822a.intValue());
        }
        if (this.f25823b != null) {
            b += nyu.d(2, this.f25823b);
        }
        if (this.f25824c != null) {
            return b + nyu.d(3, this.f25824c);
        }
        return b;
    }

    private lns m29658b(nyt nyt) {
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
                            this.f25822a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    if (this.f25823b == null) {
                        this.f25823b = new ltr();
                    }
                    nyt.a(this.f25823b);
                    continue;
                case wi.dx /*26*/:
                    if (this.f25824c == null) {
                        this.f25824c = new ltr();
                    }
                    nyt.a(this.f25824c);
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
