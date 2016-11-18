package p000;

public final class ocq extends nyx<ocq> {
    public String f32284a;
    public Long f32285b;

    public /* synthetic */ nzf m37775a(nyt nyt) {
        return m37774b(nyt);
    }

    public ocq() {
        this.f32284a = null;
        this.f32285b = null;
        this.cachedSize = -1;
    }

    public void m37776a(nyu nyu) {
        nyu.m37170a(1, this.f32284a);
        nyu.m37181b(2, this.f32285b.longValue());
        super.a(nyu);
    }

    protected int m37777b() {
        return (super.b() + nyu.m37137b(1, this.f32284a)) + nyu.m37148f(2, this.f32285b.longValue());
    }

    private ocq m37774b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f32284a = nyt.m37117j();
                    continue;
                case 16:
                    this.f32285b = Long.valueOf(nyt.m37110e());
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
