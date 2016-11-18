package p000;

public final class lxl extends nyx<lxl> {
    public Integer f26784a;
    public Long f26785b;
    public Boolean f26786c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31013b(nyt);
    }

    public lxl() {
        m31014d();
    }

    private lxl m31014d() {
        this.f26785b = null;
        this.f26786c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26784a != null) {
            nyu.a(3, this.f26784a.intValue());
        }
        if (this.f26785b != null) {
            nyu.b(4, this.f26785b.longValue());
        }
        if (this.f26786c != null) {
            nyu.a(5, this.f26786c.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26784a != null) {
            b += nyu.f(3, this.f26784a.intValue());
        }
        if (this.f26785b != null) {
            b += nyu.f(4, this.f26785b.longValue());
        }
        if (this.f26786c == null) {
            return b;
        }
        this.f26786c.booleanValue();
        return b + (nyu.h(5) + 1);
    }

    private lxl m31013b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case wi.dA /*24*/:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                            this.f26784a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 32:
                    this.f26785b = Long.valueOf(nyt.e());
                    continue;
                case 40:
                    this.f26786c = Boolean.valueOf(nyt.i());
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
