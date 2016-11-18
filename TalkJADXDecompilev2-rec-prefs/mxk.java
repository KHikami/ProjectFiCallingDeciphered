package p000;

public final class mxk extends nyx<mxk> {
    public Long f28685a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m33335b(nyt);
    }

    public mxk() {
        m33336d();
    }

    private mxk m33336d() {
        this.f28685a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f28685a != null) {
            nyu.c(1, this.f28685a.longValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f28685a == null) {
            return b;
        }
        this.f28685a.longValue();
        return b + (nyu.h(1) + 8);
    }

    private mxk m33335b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 9:
                    this.f28685a = Long.valueOf(nyt.g());
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
