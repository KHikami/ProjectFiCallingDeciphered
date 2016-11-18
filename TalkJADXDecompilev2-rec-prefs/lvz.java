package p000;

public final class lvz extends nyx<lvz> {
    public Integer f26629a;
    public Long f26630b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30813b(nyt);
    }

    public lvz() {
        m30814d();
    }

    private lvz m30814d() {
        this.f26630b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26629a != null) {
            nyu.a(1, this.f26629a.intValue());
        }
        if (this.f26630b != null) {
            nyu.b(2, this.f26630b.longValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26629a != null) {
            b += nyu.f(1, this.f26629a.intValue());
        }
        if (this.f26630b != null) {
            return b + nyu.f(2, this.f26630b.longValue());
        }
        return b;
    }

    private lvz m30813b(nyt nyt) {
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
                            this.f26629a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 16:
                    this.f26630b = Long.valueOf(nyt.e());
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
