package p000;

public final class C0053d extends nyx<C0053d> {
    public String f9401a;
    public String f9402b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m11355b(nyt);
    }

    public C0053d() {
        m11356d();
    }

    private C0053d m11356d() {
        this.f9401a = null;
        this.f9402b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        nyu.a(1, this.f9401a);
        nyu.a(2, this.f9402b);
        super.mo146a(nyu);
    }

    protected int mo147b() {
        return (super.mo147b() + nyu.b(1, this.f9401a)) + nyu.b(2, this.f9402b);
    }

    private C0053d m11355b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f9401a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f9402b = nyt.j();
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
