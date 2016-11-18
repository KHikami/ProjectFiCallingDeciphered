package p000;

public final class lqp extends nyx<lqp> {
    public String f26153a;
    public String f26154b;
    public Boolean f26155c;
    public Boolean f26156d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30071b(nyt);
    }

    public lqp() {
        m30072d();
    }

    private lqp m30072d() {
        this.f26153a = null;
        this.f26154b = null;
        this.f26155c = null;
        this.f26156d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26154b != null) {
            nyu.a(1, this.f26154b);
        }
        if (this.f26155c != null) {
            nyu.a(2, this.f26155c.booleanValue());
        }
        if (this.f26153a != null) {
            nyu.a(3, this.f26153a);
        }
        if (this.f26156d != null) {
            nyu.a(4, this.f26156d.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26154b != null) {
            b += nyu.b(1, this.f26154b);
        }
        if (this.f26155c != null) {
            this.f26155c.booleanValue();
            b += nyu.h(2) + 1;
        }
        if (this.f26153a != null) {
            b += nyu.b(3, this.f26153a);
        }
        if (this.f26156d == null) {
            return b;
        }
        this.f26156d.booleanValue();
        return b + (nyu.h(4) + 1);
    }

    private lqp m30071b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f26154b = nyt.j();
                    continue;
                case 16:
                    this.f26155c = Boolean.valueOf(nyt.i());
                    continue;
                case wi.dx /*26*/:
                    this.f26153a = nyt.j();
                    continue;
                case 32:
                    this.f26156d = Boolean.valueOf(nyt.i());
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
