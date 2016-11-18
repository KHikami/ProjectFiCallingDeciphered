package p000;

public final class onm extends nyx<onm> {
    public Boolean f33315a;

    public /* synthetic */ nzf m38816a(nyt nyt) {
        return m38815b(nyt);
    }

    public onm() {
        this.f33315a = null;
        this.cachedSize = -1;
    }

    public void m38817a(nyu nyu) {
        if (this.f33315a != null) {
            nyu.m37172a(1, this.f33315a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m38818b() {
        int b = super.b();
        if (this.f33315a == null) {
            return b;
        }
        this.f33315a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private onm m38815b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f33315a = Boolean.valueOf(nyt.m37116i());
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
