package p000;

public final class kkg extends nyx<kkg> {
    public kkh f22043a;
    public kki f22044b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26225b(nyt);
    }

    public kkg() {
        m26226d();
    }

    private kkg m26226d() {
        this.f22043a = null;
        this.f22044b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22043a != null) {
            nyu.b(1, this.f22043a);
        }
        if (this.f22044b != null) {
            nyu.b(2, this.f22044b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22043a != null) {
            b += nyu.d(1, this.f22043a);
        }
        if (this.f22044b != null) {
            return b + nyu.d(2, this.f22044b);
        }
        return b;
    }

    private kkg m26225b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f22043a == null) {
                        this.f22043a = new kkh();
                    }
                    nyt.a(this.f22043a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f22044b == null) {
                        this.f22044b = new kki();
                    }
                    nyt.a(this.f22044b);
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
