package p000;

public final class onh extends nyx<onh> {
    public String f33299a;
    public String f33300b;
    public int f33301c;
    public Long f33302d;

    public /* synthetic */ nzf m38795a(nyt nyt) {
        return m38794b(nyt);
    }

    public onh() {
        this.f33299a = null;
        this.f33300b = null;
        this.f33301c = nzf.UNSET_ENUM_VALUE;
        this.f33302d = null;
        this.cachedSize = -1;
    }

    public void m38796a(nyu nyu) {
        if (this.f33299a != null) {
            nyu.m37170a(1, this.f33299a);
        }
        if (this.f33300b != null) {
            nyu.m37170a(2, this.f33300b);
        }
        if (this.f33301c != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(3, this.f33301c);
        }
        if (this.f33302d != null) {
            nyu.m37181b(4, this.f33302d.longValue());
        }
        super.a(nyu);
    }

    protected int m38797b() {
        int b = super.b();
        if (this.f33299a != null) {
            b += nyu.m37137b(1, this.f33299a);
        }
        if (this.f33300b != null) {
            b += nyu.m37137b(2, this.f33300b);
        }
        if (this.f33301c != nzf.UNSET_ENUM_VALUE) {
            b += nyu.m37147f(3, this.f33301c);
        }
        if (this.f33302d != null) {
            return b + nyu.m37148f(4, this.f33302d.longValue());
        }
        return b;
    }

    private onh m38794b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f33299a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    this.f33300b = nyt.m37117j();
                    continue;
                case wi.dA /*24*/:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f33301c = a;
                            break;
                        default:
                            continue;
                    }
                case 32:
                    this.f33302d = Long.valueOf(nyt.m37110e());
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
