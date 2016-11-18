package p000;

public final class nbz extends nyx<nbz> {
    public int f29472a;
    public String f29473b;
    public String f29474c;

    public /* synthetic */ nzf m34254a(nyt nyt) {
        return m34253b(nyt);
    }

    public nbz() {
        this.f29472a = nzf.UNSET_ENUM_VALUE;
        this.f29473b = null;
        this.f29474c = null;
        this.cachedSize = -1;
    }

    public void m34255a(nyu nyu) {
        if (this.f29472a != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(1, this.f29472a);
        }
        if (this.f29473b != null) {
            nyu.m37170a(2, this.f29473b);
        }
        if (this.f29474c != null) {
            nyu.m37170a(3, this.f29474c);
        }
        super.a(nyu);
    }

    protected int m34256b() {
        int b = super.b();
        if (this.f29472a != nzf.UNSET_ENUM_VALUE) {
            b += nyu.m37147f(1, this.f29472a);
        }
        if (this.f29473b != null) {
            b += nyu.m37137b(2, this.f29473b);
        }
        if (this.f29474c != null) {
            return b + nyu.m37137b(3, this.f29474c);
        }
        return b;
    }

    private nbz m34253b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.f29472a = a;
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    this.f29473b = nyt.m37117j();
                    continue;
                case wi.dx /*26*/:
                    this.f29474c = nyt.m37117j();
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
