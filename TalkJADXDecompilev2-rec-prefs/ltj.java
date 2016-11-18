package p000;

public final class ltj extends nyx<ltj> {
    public lpv f26381a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30449b(nyt);
    }

    public ltj() {
        m30450d();
    }

    private ltj m30450d() {
        this.f26381a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26381a != null) {
            nyu.b(1, this.f26381a);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26381a != null) {
            return b + nyu.d(1, this.f26381a);
        }
        return b;
    }

    private ltj m30449b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f26381a == null) {
                        this.f26381a = new lpv();
                    }
                    nyt.a(this.f26381a);
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
