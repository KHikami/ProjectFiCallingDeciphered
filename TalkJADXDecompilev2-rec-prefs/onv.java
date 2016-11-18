package p000;

public final class onv extends nyx<onv> {
    public onu f33331a;
    public oog f33332b;
    public int f33333c;
    public onm f33334d;
    public String f33335e;

    public /* synthetic */ nzf m38848a(nyt nyt) {
        return m38847b(nyt);
    }

    public onv() {
        this.f33333c = nzf.UNSET_ENUM_VALUE;
        this.f33335e = null;
        this.cachedSize = -1;
    }

    public void m38849a(nyu nyu) {
        if (this.f33331a != null) {
            nyu.m37182b(1, this.f33331a);
        }
        if (this.f33332b != null) {
            nyu.m37182b(2, this.f33332b);
        }
        if (this.f33333c != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(3, this.f33333c);
        }
        if (this.f33334d != null) {
            nyu.m37182b(4, this.f33334d);
        }
        if (this.f33335e != null) {
            nyu.m37170a(5, this.f33335e);
        }
        super.a(nyu);
    }

    protected int m38850b() {
        int b = super.b();
        if (this.f33331a != null) {
            b += nyu.m37145d(1, this.f33331a);
        }
        if (this.f33332b != null) {
            b += nyu.m37145d(2, this.f33332b);
        }
        if (this.f33333c != nzf.UNSET_ENUM_VALUE) {
            b += nyu.m37147f(3, this.f33333c);
        }
        if (this.f33334d != null) {
            b += nyu.m37145d(4, this.f33334d);
        }
        if (this.f33335e != null) {
            return b + nyu.m37137b(5, this.f33335e);
        }
        return b;
    }

    private onv m38847b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f33331a == null) {
                        this.f33331a = new onu();
                    }
                    nyt.m37101a(this.f33331a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f33332b == null) {
                        this.f33332b = new oog();
                    }
                    nyt.m37101a(this.f33332b);
                    continue;
                case wi.dA /*24*/:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                            this.f33333c = a;
                            break;
                        default:
                            continue;
                    }
                case 34:
                    if (this.f33334d == null) {
                        this.f33334d = new onm();
                    }
                    nyt.m37101a(this.f33334d);
                    continue;
                case 42:
                    this.f33335e = nyt.m37117j();
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
