package p000;

public final class kyh extends nyx<kyh> {
    public String f24036a;
    public String f24037b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28059b(nyt);
    }

    public kyh() {
        m28060d();
    }

    private kyh m28060d() {
        this.f24036a = null;
        this.f24037b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        nyu.a(1, this.f24036a);
        nyu.a(2, this.f24037b);
        super.mo146a(nyu);
    }

    protected int mo147b() {
        return (super.mo147b() + nyu.b(1, this.f24036a)) + nyu.b(2, this.f24037b);
    }

    private kyh m28059b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f24036a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f24037b = nyt.j();
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
