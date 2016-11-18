package p000;

public final class koj extends nyx<koj> {
    public String f22528a;
    public String f22529b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26791b(nyt);
    }

    public koj() {
        this.f22528a = null;
        this.f22529b = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f22528a != null) {
            nyu.a(1, this.f22528a);
        }
        if (this.f22529b != null) {
            nyu.a(2, this.f22529b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22528a != null) {
            b += nyu.b(1, this.f22528a);
        }
        if (this.f22529b != null) {
            return b + nyu.b(2, this.f22529b);
        }
        return b;
    }

    private koj m26791b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f22528a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f22529b = nyt.j();
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
