package p000;

public final class ldn extends nyx<ldn> {
    public Integer f24690a;
    public Integer f24691b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28757b(nyt);
    }

    public ldn() {
        m28758d();
    }

    private ldn m28758d() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f24690a != null) {
            nyu.a(1, this.f24690a.intValue());
        }
        if (this.f24691b != null) {
            nyu.a(2, this.f24691b.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24690a != null) {
            b += nyu.f(1, this.f24690a.intValue());
        }
        if (this.f24691b != null) {
            return b + nyu.f(2, this.f24691b.intValue());
        }
        return b;
    }

    private ldn m28757b(nyt nyt) {
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
                            this.f24690a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 16:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.f24691b = Integer.valueOf(a);
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
