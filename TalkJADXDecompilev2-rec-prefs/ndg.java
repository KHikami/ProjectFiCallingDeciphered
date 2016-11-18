package p000;

public final class ndg extends nyx<ndg> {
    public int f29552a;
    public Boolean f29553b;
    public Boolean f29554c;

    public /* synthetic */ nzf m34411a(nyt nyt) {
        return m34410b(nyt);
    }

    public ndg() {
        this.f29552a = nzf.UNSET_ENUM_VALUE;
        this.f29553b = null;
        this.f29554c = null;
        this.cachedSize = -1;
    }

    public void m34412a(nyu nyu) {
        if (this.f29552a != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(1, this.f29552a);
        }
        if (this.f29553b != null) {
            nyu.m37172a(2, this.f29553b.booleanValue());
        }
        if (this.f29554c != null) {
            nyu.m37172a(3, this.f29554c.booleanValue());
        }
        super.a(nyu);
    }

    protected int m34413b() {
        int b = super.b();
        if (this.f29552a != nzf.UNSET_ENUM_VALUE) {
            b += nyu.m37147f(1, this.f29552a);
        }
        if (this.f29553b != null) {
            this.f29553b.booleanValue();
            b += nyu.m37154h(2) + 1;
        }
        if (this.f29554c == null) {
            return b;
        }
        this.f29554c.booleanValue();
        return b + (nyu.m37154h(3) + 1);
    }

    private ndg m34410b(nyt nyt) {
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
                        case 4:
                        case 5:
                        case 6:
                            this.f29552a = a;
                            break;
                        default:
                            continue;
                    }
                case 16:
                    this.f29553b = Boolean.valueOf(nyt.m37116i());
                    continue;
                case wi.dA /*24*/:
                    this.f29554c = Boolean.valueOf(nyt.m37116i());
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
