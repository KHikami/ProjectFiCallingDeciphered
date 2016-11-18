package p000;

public final class kqn extends nyx<kqn> {
    public kqd f22776a;
    public Integer f22777b;
    public Boolean f22778c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27075b(nyt);
    }

    public kqn() {
        m27076d();
    }

    private kqn m27076d() {
        this.f22776a = null;
        this.f22778c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22776a != null) {
            nyu.b(1, this.f22776a);
        }
        if (this.f22777b != null) {
            nyu.a(2, this.f22777b.intValue());
        }
        if (this.f22778c != null) {
            nyu.a(3, this.f22778c.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22776a != null) {
            b += nyu.d(1, this.f22776a);
        }
        if (this.f22777b != null) {
            b += nyu.f(2, this.f22777b.intValue());
        }
        if (this.f22778c == null) {
            return b;
        }
        this.f22778c.booleanValue();
        return b + (nyu.h(3) + 1);
    }

    private kqn m27075b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f22776a == null) {
                        this.f22776a = new kqd();
                    }
                    nyt.a(this.f22776a);
                    continue;
                case 16:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                            this.f22777b = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dA /*24*/:
                    this.f22778c = Boolean.valueOf(nyt.i());
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
