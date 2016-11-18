package defpackage;

public final class ocv extends nyx<ocv> {
    public String a;
    public String b;
    public Long c;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public ocv() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        nyu.a(1, this.a);
        nyu.a(2, this.b);
        if (this.c != null) {
            nyu.b(7, this.c.longValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int b = (super.b() + nyu.b(1, this.a)) + nyu.b(2, this.b);
        if (this.c != null) {
            return b + nyu.f(7, this.c.longValue());
        }
        return b;
    }

    private ocv b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.b = nyt.j();
                    continue;
                case 56:
                    this.c = Long.valueOf(nyt.e());
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
