package p000;

public final class myz extends nyx<myz> {
    public Long f29206a;
    public Long f29207b;

    public /* synthetic */ nzf m33891a(nyt nyt) {
        return m33889b(nyt);
    }

    public myz() {
        m33890d();
    }

    private myz m33890d() {
        this.f29206a = null;
        this.f29207b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m33892a(nyu nyu) {
        if (this.f29206a != null) {
            nyu.m37181b(1, this.f29206a.longValue());
        }
        if (this.f29207b != null) {
            nyu.m37181b(2, this.f29207b.longValue());
        }
        super.a(nyu);
    }

    protected int m33893b() {
        int b = super.b();
        if (this.f29206a != null) {
            b += nyu.m37148f(1, this.f29206a.longValue());
        }
        if (this.f29207b != null) {
            return b + nyu.m37148f(2, this.f29207b.longValue());
        }
        return b;
    }

    private myz m33889b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f29206a = Long.valueOf(nyt.m37110e());
                    continue;
                case 16:
                    this.f29207b = Long.valueOf(nyt.m37110e());
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
