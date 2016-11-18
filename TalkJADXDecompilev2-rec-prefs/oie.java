package p000;

public final class oie extends nyx<oie> {
    public ohz f32966a;

    public /* synthetic */ nzf m38459a(nyt nyt) {
        return m38457b(nyt);
    }

    public oie() {
        m38458d();
    }

    private oie m38458d() {
        this.f32966a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m38460a(nyu nyu) {
        if (this.f32966a != null) {
            nyu.m37182b(1, this.f32966a);
        }
        super.a(nyu);
    }

    protected int m38461b() {
        int b = super.b();
        if (this.f32966a != null) {
            return b + nyu.m37145d(1, this.f32966a);
        }
        return b;
    }

    private oie m38457b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f32966a == null) {
                        this.f32966a = new ohz();
                    }
                    nyt.m37101a(this.f32966a);
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
