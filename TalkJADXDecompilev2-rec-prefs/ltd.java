package p000;

public final class ltd extends nyx<ltd> {
    public luq responseHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30419b(nyt);
    }

    public ltd() {
        m30420d();
    }

    private ltd m30420d() {
        this.responseHeader = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.responseHeader != null) {
            nyu.b(1, this.responseHeader);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.responseHeader != null) {
            return b + nyu.d(1, this.responseHeader);
        }
        return b;
    }

    private ltd m30419b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.responseHeader == null) {
                        this.responseHeader = new luq();
                    }
                    nyt.a(this.responseHeader);
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
