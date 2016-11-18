package defpackage;

public final class ocq extends nyx<ocq> {
    public String a;
    public Long b;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public ocq() {
        this.a = null;
        this.b = null;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        nyu.a(1, this.a);
        nyu.b(2, this.b.longValue());
        super.a(nyu);
    }

    protected int b() {
        return (super.b() + nyu.b(1, this.a)) + nyu.f(2, this.b.longValue());
    }

    private ocq b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.a = nyt.j();
                    continue;
                case 16:
                    this.b = Long.valueOf(nyt.e());
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
