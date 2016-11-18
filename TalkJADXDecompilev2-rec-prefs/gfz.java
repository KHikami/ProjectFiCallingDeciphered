package p000;

public final class gfz extends nzf {
    public int f15205a;
    public String f15206b;
    public String f15207c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m17591b(nyt);
    }

    public gfz() {
        m17592d();
    }

    private gfz m17592d() {
        this.f15205a = 0;
        this.f15206b = "";
        this.f15207c = "";
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f15205a != 0) {
            nyu.a(1, this.f15205a);
        }
        if (!(this.f15206b == null || this.f15206b.equals(""))) {
            nyu.a(2, this.f15206b);
        }
        if (!(this.f15207c == null || this.f15207c.equals(""))) {
            nyu.a(3, this.f15207c);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f15205a != 0) {
            b += nyu.f(1, this.f15205a);
        }
        if (!(this.f15206b == null || this.f15206b.equals(""))) {
            b += nyu.b(2, this.f15206b);
        }
        if (this.f15207c == null || this.f15207c.equals("")) {
            return b;
        }
        return b + nyu.b(3, this.f15207c);
    }

    private gfz m17591b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f15205a = nyt.f();
                    continue;
                case wi.dH /*18*/:
                    this.f15206b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f15207c = nyt.j();
                    continue;
                default:
                    if (!nyt.b(a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
