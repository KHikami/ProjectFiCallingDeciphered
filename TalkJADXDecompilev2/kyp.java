package defpackage;

public final class kyp extends nyx<kyp> {
    public Integer a;
    public String b;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public kyp() {
        d();
    }

    private kyp d() {
        this.b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        nyu.a(1, this.a.intValue());
        nyu.a(2, this.b);
        super.a(nyu);
    }

    protected int b() {
        return (super.b() + nyu.f(1, this.a.intValue())) + nyu.b(2, this.b);
    }

    private kyp b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                            this.a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    this.b = nyt.j();
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
