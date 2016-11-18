package p000;

public final class llg extends nyx<llg> {
    public llh f25333a;
    public llh f25334b;
    public Integer f25335c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29336b(nyt);
    }

    public llg() {
        m29337d();
    }

    private llg m29337d() {
        this.f25333a = null;
        this.f25334b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f25333a != null) {
            nyu.b(1, this.f25333a);
        }
        if (this.f25334b != null) {
            nyu.b(2, this.f25334b);
        }
        if (this.f25335c != null) {
            nyu.a(3, this.f25335c.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f25333a != null) {
            b += nyu.d(1, this.f25333a);
        }
        if (this.f25334b != null) {
            b += nyu.d(2, this.f25334b);
        }
        if (this.f25335c != null) {
            return b + nyu.f(3, this.f25335c.intValue());
        }
        return b;
    }

    private llg m29336b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f25333a == null) {
                        this.f25333a = new llh();
                    }
                    nyt.a(this.f25333a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f25334b == null) {
                        this.f25334b = new llh();
                    }
                    nyt.a(this.f25334b);
                    continue;
                case wi.dA /*24*/:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                            this.f25335c = Integer.valueOf(a);
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
