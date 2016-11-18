package p000;

public final class lpq extends nyx<lpq> {
    public Boolean f26020a;
    public Boolean f26021b;
    public Boolean f26022c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29936b(nyt);
    }

    public lpq() {
        m29937d();
    }

    private lpq m29937d() {
        this.f26020a = null;
        this.f26021b = null;
        this.f26022c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26020a != null) {
            nyu.a(1, this.f26020a.booleanValue());
        }
        if (this.f26021b != null) {
            nyu.a(2, this.f26021b.booleanValue());
        }
        if (this.f26022c != null) {
            nyu.a(3, this.f26022c.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26020a != null) {
            this.f26020a.booleanValue();
            b += nyu.h(1) + 1;
        }
        if (this.f26021b != null) {
            this.f26021b.booleanValue();
            b += nyu.h(2) + 1;
        }
        if (this.f26022c == null) {
            return b;
        }
        this.f26022c.booleanValue();
        return b + (nyu.h(3) + 1);
    }

    private lpq m29936b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f26020a = Boolean.valueOf(nyt.i());
                    continue;
                case 16:
                    this.f26021b = Boolean.valueOf(nyt.i());
                    continue;
                case wi.dA /*24*/:
                    this.f26022c = Boolean.valueOf(nyt.i());
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
