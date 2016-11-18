package p000;

public final class lsj extends nyx<lsj> {
    public String f26326a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30314b(nyt);
    }

    public lsj() {
        m30315d();
    }

    private lsj m30315d() {
        this.f26326a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26326a != null) {
            nyu.a(1, this.f26326a);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26326a != null) {
            return b + nyu.b(1, this.f26326a);
        }
        return b;
    }

    private lsj m30314b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f26326a = nyt.j();
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
