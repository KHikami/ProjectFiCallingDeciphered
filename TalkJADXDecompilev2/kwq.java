package defpackage;

public final class kwq extends nyx<kwq> {
    public Integer a;
    public Integer b;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public kwq() {
        d();
    }

    private kwq d() {
        this.a = null;
        this.b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        nyu.a(1, this.a.intValue());
        nyu.a(2, this.b.intValue());
        super.a(nyu);
    }

    protected int b() {
        return (super.b() + nyu.f(1, this.a.intValue())) + nyu.f(2, this.b.intValue());
    }

    private kwq b(nyt nyt) {
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
