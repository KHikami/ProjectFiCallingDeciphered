package p000;

public final class lcf extends nyx<lcf> {
    public String f24566a;
    public Long f24567b;
    public ldm f24568c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28584b(nyt);
    }

    public lcf() {
        m28585d();
    }

    private lcf m28585d() {
        this.f24566a = null;
        this.f24567b = null;
        this.f24568c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f24566a != null) {
            nyu.a(1, this.f24566a);
        }
        if (this.f24567b != null) {
            nyu.a(2, this.f24567b.longValue());
        }
        if (this.f24568c != null) {
            nyu.b(3, this.f24568c);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24566a != null) {
            b += nyu.b(1, this.f24566a);
        }
        if (this.f24567b != null) {
            b += nyu.e(2, this.f24567b.longValue());
        }
        if (this.f24568c != null) {
            return b + nyu.d(3, this.f24568c);
        }
        return b;
    }

    private lcf m28584b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f24566a = nyt.j();
                    continue;
                case 16:
                    this.f24567b = Long.valueOf(nyt.d());
                    continue;
                case wi.dx /*26*/:
                    if (this.f24568c == null) {
                        this.f24568c = new ldm();
                    }
                    nyt.a(this.f24568c);
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
