package p000;

public final class oog extends nyx<oog> {
    public ong f33381a;
    public onr f33382b;

    public /* synthetic */ nzf m38896a(nyt nyt) {
        return m38895b(nyt);
    }

    public oog() {
        this.cachedSize = -1;
    }

    public void m38897a(nyu nyu) {
        if (this.f33381a != null) {
            nyu.m37182b(1, this.f33381a);
        }
        if (this.f33382b != null) {
            nyu.m37182b(2, this.f33382b);
        }
        super.a(nyu);
    }

    protected int m38898b() {
        int b = super.b();
        if (this.f33381a != null) {
            b += nyu.m37145d(1, this.f33381a);
        }
        if (this.f33382b != null) {
            return b + nyu.m37145d(2, this.f33382b);
        }
        return b;
    }

    private oog m38895b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f33381a == null) {
                        this.f33381a = new ong();
                    }
                    nyt.m37101a(this.f33381a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f33382b == null) {
                        this.f33382b = new onr();
                    }
                    nyt.m37101a(this.f33382b);
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
