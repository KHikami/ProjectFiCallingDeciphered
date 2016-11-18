package p000;

public final class lax extends nyx<lax> {
    public String f24427a;
    public Long f24428b;
    public laa f24429c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28422b(nyt);
    }

    public lax() {
        this.f24427a = null;
        this.f24428b = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f24427a != null) {
            nyu.a(1, this.f24427a);
        }
        if (this.f24428b != null) {
            nyu.a(2, this.f24428b.longValue());
        }
        if (this.f24429c != null) {
            nyu.b(3, this.f24429c);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24427a != null) {
            b += nyu.b(1, this.f24427a);
        }
        if (this.f24428b != null) {
            b += nyu.e(2, this.f24428b.longValue());
        }
        if (this.f24429c != null) {
            return b + nyu.d(3, this.f24429c);
        }
        return b;
    }

    private lax m28422b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f24427a = nyt.j();
                    continue;
                case 16:
                    this.f24428b = Long.valueOf(nyt.d());
                    continue;
                case wi.dx /*26*/:
                    if (this.f24429c == null) {
                        this.f24429c = new laa();
                    }
                    nyt.a(this.f24429c);
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
