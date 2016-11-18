package p000;

public final class osp extends nyx<osp> {
    public mty f34170a;
    public Integer f34171b;
    public mwf f34172c;
    public String f34173d;

    public /* synthetic */ nzf m39600a(nyt nyt) {
        return m39598b(nyt);
    }

    public osp() {
        m39599d();
    }

    private osp m39599d() {
        this.f34170a = null;
        this.f34172c = null;
        this.f34173d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39601a(nyu nyu) {
        if (this.f34170a != null) {
            nyu.m37182b(1, this.f34170a);
        }
        if (this.f34171b != null) {
            nyu.m37168a(2, this.f34171b.intValue());
        }
        if (this.f34172c != null) {
            nyu.m37182b(3, this.f34172c);
        }
        if (this.f34173d != null) {
            nyu.m37170a(4, this.f34173d);
        }
        super.a(nyu);
    }

    protected int m39602b() {
        int b = super.b();
        if (this.f34170a != null) {
            b += nyu.m37145d(1, this.f34170a);
        }
        if (this.f34171b != null) {
            b += nyu.m37147f(2, this.f34171b.intValue());
        }
        if (this.f34172c != null) {
            b += nyu.m37145d(3, this.f34172c);
        }
        if (this.f34173d != null) {
            return b + nyu.m37137b(4, this.f34173d);
        }
        return b;
    }

    private osp m39598b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f34170a == null) {
                        this.f34170a = new mty();
                    }
                    nyt.m37101a(this.f34170a);
                    continue;
                case 16:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                            this.f34171b = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dx /*26*/:
                    if (this.f34172c == null) {
                        this.f34172c = new mwf();
                    }
                    nyt.m37101a(this.f34172c);
                    continue;
                case 34:
                    this.f34173d = nyt.m37117j();
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
