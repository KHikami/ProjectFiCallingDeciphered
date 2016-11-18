package p000;

public final class lvb extends nyx<lvb> {
    public Integer f26573a;
    public luq responseHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30693b(nyt);
    }

    public lvb() {
        m30694d();
    }

    private lvb m30694d() {
        this.responseHeader = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.responseHeader != null) {
            nyu.b(1, this.responseHeader);
        }
        if (this.f26573a != null) {
            nyu.a(2, this.f26573a.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.responseHeader != null) {
            b += nyu.d(1, this.responseHeader);
        }
        if (this.f26573a != null) {
            return b + nyu.f(2, this.f26573a.intValue());
        }
        return b;
    }

    private lvb m30693b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.responseHeader == null) {
                        this.responseHeader = new luq();
                    }
                    nyt.a(this.responseHeader);
                    continue;
                case 16:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.f26573a = Integer.valueOf(a);
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
