package p000;

public final class lbf extends nyx<lbf> {
    public String f24469a;
    public ldm f24470b;
    public lbg f24471c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28456b(nyt);
    }

    public lbf() {
        m28457d();
    }

    private lbf m28457d() {
        this.f24469a = null;
        this.f24470b = null;
        this.f24471c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f24469a != null) {
            nyu.a(2, this.f24469a);
        }
        if (this.f24470b != null) {
            nyu.b(3, this.f24470b);
        }
        if (this.f24471c != null) {
            nyu.b(4, this.f24471c);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24469a != null) {
            b += nyu.b(2, this.f24469a);
        }
        if (this.f24470b != null) {
            b += nyu.d(3, this.f24470b);
        }
        if (this.f24471c != null) {
            return b + nyu.d(4, this.f24471c);
        }
        return b;
    }

    private lbf m28456b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case wi.dH /*18*/:
                    this.f24469a = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    if (this.f24470b == null) {
                        this.f24470b = new ldm();
                    }
                    nyt.a(this.f24470b);
                    continue;
                case 34:
                    if (this.f24471c == null) {
                        this.f24471c = new lbg();
                    }
                    nyt.a(this.f24471c);
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
