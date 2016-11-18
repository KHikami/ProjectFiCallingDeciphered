package defpackage;

public final class kwf extends nyx<kwf> {
    public int a;
    public String b;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public kwf() {
        this.a = nzf.UNSET_ENUM_VALUE;
        this.b = null;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        if (this.a != nzf.UNSET_ENUM_VALUE) {
            nyu.a(1, this.a);
        }
        if (this.b != null) {
            nyu.a(2, this.b);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(1, this.a);
        }
        if (this.b != null) {
            return b + nyu.b(2, this.b);
        }
        return b;
    }

    private kwf b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            this.a = a;
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    this.b = nyt.j();
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
