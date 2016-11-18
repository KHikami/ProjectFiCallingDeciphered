package p000;

public final class kwy extends nyx<kwy> {
    public String f23816a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27871b(nyt);
    }

    public kwy() {
        this.f23816a = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f23816a != null) {
            nyu.a(1, this.f23816a);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f23816a != null) {
            return b + nyu.b(1, this.f23816a);
        }
        return b;
    }

    private kwy m27871b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f23816a = nyt.j();
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
