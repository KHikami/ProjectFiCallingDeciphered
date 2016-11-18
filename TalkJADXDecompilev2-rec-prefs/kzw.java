package p000;

public final class kzw extends nyx<kzw> {
    public String f24306a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28293b(nyt);
    }

    public kzw() {
        this.f24306a = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f24306a != null) {
            nyu.a(1, this.f24306a);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24306a != null) {
            return b + nyu.b(1, this.f24306a);
        }
        return b;
    }

    private kzw m28293b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f24306a = nyt.j();
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
