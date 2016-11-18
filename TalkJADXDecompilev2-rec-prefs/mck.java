package p000;

public final class mck extends nyx<mck> {
    public Integer f27330a;
    public Integer f27331b;
    public Integer f27332c;
    public Integer f27333d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31717b(nyt);
    }

    public mck() {
        m31718d();
    }

    private mck m31718d() {
        this.f27330a = null;
        this.f27331b = null;
        this.f27332c = null;
        this.f27333d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f27330a != null) {
            nyu.a(1, this.f27330a.intValue());
        }
        if (this.f27331b != null) {
            nyu.a(2, this.f27331b.intValue());
        }
        if (this.f27332c != null) {
            nyu.a(3, this.f27332c.intValue());
        }
        if (this.f27333d != null) {
            nyu.a(4, this.f27333d.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f27330a != null) {
            b += nyu.f(1, this.f27330a.intValue());
        }
        if (this.f27331b != null) {
            b += nyu.f(2, this.f27331b.intValue());
        }
        if (this.f27332c != null) {
            b += nyu.f(3, this.f27332c.intValue());
        }
        if (this.f27333d != null) {
            return b + nyu.f(4, this.f27333d.intValue());
        }
        return b;
    }

    private mck m31717b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f27330a = Integer.valueOf(nyt.f());
                    continue;
                case 16:
                    this.f27331b = Integer.valueOf(nyt.f());
                    continue;
                case wi.dA /*24*/:
                    this.f27332c = Integer.valueOf(nyt.f());
                    continue;
                case 32:
                    this.f27333d = Integer.valueOf(nyt.f());
                    continue;
                default:
                    if (!super.m1039a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
