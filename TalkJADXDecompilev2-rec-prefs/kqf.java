package p000;

public final class kqf extends nyx<kqf> {
    public kqd f22756a;
    public Integer f22757b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27033b(nyt);
    }

    public kqf() {
        m27034d();
    }

    private kqf m27034d() {
        this.f22756a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22756a != null) {
            nyu.b(1, this.f22756a);
        }
        if (this.f22757b != null) {
            nyu.a(2, this.f22757b.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22756a != null) {
            b += nyu.d(1, this.f22756a);
        }
        if (this.f22757b != null) {
            return b + nyu.f(2, this.f22757b.intValue());
        }
        return b;
    }

    private kqf m27033b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f22756a == null) {
                        this.f22756a = new kqd();
                    }
                    nyt.a(this.f22756a);
                    continue;
                case 16:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f22757b = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
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
