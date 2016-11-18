package p000;

public final class lsl extends nyx<lsl> {
    public muu f26328a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30324b(nyt);
    }

    public lsl() {
        m30325d();
    }

    private lsl m30325d() {
        this.f26328a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26328a != null) {
            nyu.b(1, this.f26328a);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26328a != null) {
            return b + nyu.d(1, this.f26328a);
        }
        return b;
    }

    private lsl m30324b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f26328a == null) {
                        this.f26328a = new muu();
                    }
                    nyt.a(this.f26328a);
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
