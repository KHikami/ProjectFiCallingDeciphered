package p000;

public final class lsy extends nyx<lsy> {
    public Boolean f26355a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30392b(nyt);
    }

    public lsy() {
        m30393d();
    }

    private lsy m30393d() {
        this.f26355a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26355a != null) {
            nyu.a(1, this.f26355a.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26355a == null) {
            return b;
        }
        this.f26355a.booleanValue();
        return b + (nyu.h(1) + 1);
    }

    private lsy m30392b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f26355a = Boolean.valueOf(nyt.i());
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
