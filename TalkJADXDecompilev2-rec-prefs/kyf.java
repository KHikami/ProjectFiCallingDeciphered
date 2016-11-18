package p000;

public final class kyf extends nyx<kyf> {
    public Integer f24016a;
    public kyd f24017b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28049b(nyt);
    }

    public kyf() {
        m28050d();
    }

    private kyf m28050d() {
        this.f24017b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f24016a != null) {
            nyu.a(1, this.f24016a.intValue());
        }
        if (this.f24017b != null) {
            nyu.b(2, this.f24017b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24016a != null) {
            b += nyu.f(1, this.f24016a.intValue());
        }
        if (this.f24017b != null) {
            return b + nyu.d(2, this.f24017b);
        }
        return b;
    }

    private kyf m28049b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            this.f24016a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    if (this.f24017b == null) {
                        this.f24017b = new kyd();
                    }
                    nyt.a(this.f24017b);
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
