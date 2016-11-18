package p000;

public final class kws extends nyx<kws> {
    public kwr f23796a;
    public Integer f23797b;
    public kwt f23798c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27842b(nyt);
    }

    public kws() {
        m27843d();
    }

    private kws m27843d() {
        this.f23796a = null;
        this.f23798c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f23796a != null) {
            nyu.b(1, this.f23796a);
        }
        if (this.f23797b != null) {
            nyu.a(2, this.f23797b.intValue());
        }
        if (this.f23798c != null) {
            nyu.b(3, this.f23798c);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f23796a != null) {
            b += nyu.d(1, this.f23796a);
        }
        if (this.f23797b != null) {
            b += nyu.f(2, this.f23797b.intValue());
        }
        if (this.f23798c != null) {
            return b + nyu.d(3, this.f23798c);
        }
        return b;
    }

    private kws m27842b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f23796a == null) {
                        this.f23796a = new kwr();
                    }
                    nyt.a(this.f23796a);
                    continue;
                case 16:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                            this.f23797b = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dx /*26*/:
                    if (this.f23798c == null) {
                        this.f23798c = new kwt();
                    }
                    nyt.a(this.f23798c);
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
