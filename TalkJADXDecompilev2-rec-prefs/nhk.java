package p000;

public final class nhk extends nyx<nhk> {
    public nhl f29835a;

    public /* synthetic */ nzf m34962a(nyt nyt) {
        return m34960b(nyt);
    }

    public nhk() {
        m34961d();
    }

    private nhk m34961d() {
        this.f29835a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34963a(nyu nyu) {
        if (this.f29835a != null) {
            nyu.m37182b(2, this.f29835a);
        }
        super.a(nyu);
    }

    protected int m34964b() {
        int b = super.b();
        if (this.f29835a != null) {
            return b + nyu.m37145d(2, this.f29835a);
        }
        return b;
    }

    private nhk m34960b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case wi.dH /*18*/:
                    if (this.f29835a == null) {
                        this.f29835a = new nhl();
                    }
                    nyt.m37101a(this.f29835a);
                    continue;
                default:
                    if (!super.a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
