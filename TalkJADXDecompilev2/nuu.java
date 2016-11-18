package defpackage;

public final class nuu extends nyx<nuu> {
    public Integer a;
    public Integer b;
    public Integer c;
    public Integer d;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public nuu() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        nyu.a(1, this.a.intValue());
        nyu.a(2, this.b.intValue());
        nyu.a(3, this.c.intValue());
        nyu.a(4, this.d.intValue());
        super.a(nyu);
    }

    protected int b() {
        return (((super.b() + nyu.f(1, this.a.intValue())) + nyu.f(2, this.b.intValue())) + nyu.f(3, this.c.intValue())) + nyu.f(4, this.d.intValue());
    }

    private nuu b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.a = Integer.valueOf(nyt.f());
                    continue;
                case 16:
                    this.b = Integer.valueOf(nyt.f());
                    continue;
                case wi.dA /*24*/:
                    this.c = Integer.valueOf(nyt.f());
                    continue;
                case 32:
                    this.d = Integer.valueOf(nyt.f());
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
