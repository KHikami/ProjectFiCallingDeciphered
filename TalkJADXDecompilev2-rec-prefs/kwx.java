package p000;

public final class kwx extends nyx<kwx> {
    public kww f23813a;
    public int f23814b;
    public kwy f23815c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27867b(nyt);
    }

    public kwx() {
        this.f23814b = nzf.UNSET_ENUM_VALUE;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f23813a != null) {
            nyu.b(1, this.f23813a);
        }
        if (this.f23814b != nzf.UNSET_ENUM_VALUE) {
            nyu.a(2, this.f23814b);
        }
        if (this.f23815c != null) {
            nyu.b(3, this.f23815c);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f23813a != null) {
            b += nyu.d(1, this.f23813a);
        }
        if (this.f23814b != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(2, this.f23814b);
        }
        if (this.f23815c != null) {
            return b + nyu.d(3, this.f23815c);
        }
        return b;
    }

    private kwx m27867b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f23813a == null) {
                        this.f23813a = new kww();
                    }
                    nyt.a(this.f23813a);
                    continue;
                case 16:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                            this.f23814b = a;
                            break;
                        default:
                            continue;
                    }
                case wi.dx /*26*/:
                    if (this.f23815c == null) {
                        this.f23815c = new kwy();
                    }
                    nyt.a(this.f23815c);
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
