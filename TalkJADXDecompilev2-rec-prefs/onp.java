package p000;

public final class onp extends nyx<onp> {
    public Long f33319a;
    public String f33320b;

    public /* synthetic */ nzf m38826a(nyt nyt) {
        return m38825b(nyt);
    }

    public onp() {
        this.f33319a = null;
        this.f33320b = null;
        this.cachedSize = -1;
    }

    public void m38827a(nyu nyu) {
        if (this.f33319a != null) {
            nyu.m37187c(1, this.f33319a.longValue());
        }
        if (this.f33320b != null) {
            nyu.m37170a(2, this.f33320b);
        }
        super.a(nyu);
    }

    protected int m38828b() {
        int b = super.b();
        if (this.f33319a != null) {
            this.f33319a.longValue();
            b += nyu.m37154h(1) + 8;
        }
        if (this.f33320b != null) {
            return b + nyu.m37137b(2, this.f33320b);
        }
        return b;
    }

    private onp m38825b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 9:
                    this.f33319a = Long.valueOf(nyt.m37114g());
                    continue;
                case wi.dH /*18*/:
                    this.f33320b = nyt.m37117j();
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
