package p000;

public final class mvi extends nyx<mvi> {
    public String f28473a;
    public String f28474b;
    public mvl f28475c;
    public boolean f28476d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m33077b(nyt);
    }

    public mvi() {
        m33078d();
    }

    private mvi m33078d() {
        this.f28473a = "";
        this.f28474b = "";
        this.f28475c = null;
        this.f28476d = false;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (!(this.f28473a == null || this.f28473a.equals(""))) {
            nyu.a(1, this.f28473a);
        }
        if (!(this.f28474b == null || this.f28474b.equals(""))) {
            nyu.a(2, this.f28474b);
        }
        if (this.f28475c != null) {
            nyu.b(3, this.f28475c);
        }
        if (this.f28476d) {
            nyu.a(4, this.f28476d);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (!(this.f28473a == null || this.f28473a.equals(""))) {
            b += nyu.b(1, this.f28473a);
        }
        if (!(this.f28474b == null || this.f28474b.equals(""))) {
            b += nyu.b(2, this.f28474b);
        }
        if (this.f28475c != null) {
            b += nyu.d(3, this.f28475c);
        }
        if (!this.f28476d) {
            return b;
        }
        boolean z = this.f28476d;
        return b + (nyu.h(4) + 1);
    }

    private mvi m33077b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f28473a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f28474b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    if (this.f28475c == null) {
                        this.f28475c = new mvl();
                    }
                    nyt.a(this.f28475c);
                    continue;
                case 32:
                    this.f28476d = nyt.i();
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
