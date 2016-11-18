package p000;

public final class lrg extends nyx<lrg> {
    public lup requestHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30161b(nyt);
    }

    public lrg() {
        m30162d();
    }

    private lrg m30162d() {
        this.requestHeader = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.requestHeader != null) {
            nyu.b(1, this.requestHeader);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.requestHeader != null) {
            return b + nyu.d(1, this.requestHeader);
        }
        return b;
    }

    private lrg m30161b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.requestHeader == null) {
                        this.requestHeader = new lup();
                    }
                    nyt.a(this.requestHeader);
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
