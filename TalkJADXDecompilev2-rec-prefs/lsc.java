package p000;

public final class lsc extends nyx<lsc> {
    public lor f26301a;
    public ltr f26302b;
    public Integer f26303c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30276b(nyt);
    }

    public lsc() {
        m30277d();
    }

    private lsc m30277d() {
        this.f26301a = null;
        this.f26302b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26301a != null) {
            nyu.b(1, this.f26301a);
        }
        if (this.f26302b != null) {
            nyu.b(2, this.f26302b);
        }
        if (this.f26303c != null) {
            nyu.a(3, this.f26303c.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26301a != null) {
            b += nyu.d(1, this.f26301a);
        }
        if (this.f26302b != null) {
            b += nyu.d(2, this.f26302b);
        }
        if (this.f26303c != null) {
            return b + nyu.f(3, this.f26303c.intValue());
        }
        return b;
    }

    private lsc m30276b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f26301a == null) {
                        this.f26301a = new lor();
                    }
                    nyt.a(this.f26301a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f26302b == null) {
                        this.f26302b = new ltr();
                    }
                    nyt.a(this.f26302b);
                    continue;
                case wi.dA /*24*/:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.f26303c = Integer.valueOf(a);
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
