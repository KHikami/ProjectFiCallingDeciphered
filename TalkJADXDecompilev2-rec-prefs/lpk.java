package p000;

public final class lpk extends nyx<lpk> {
    public Integer f26004a;
    public muu f26005b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29905b(nyt);
    }

    public lpk() {
        m29906d();
    }

    private lpk m29906d() {
        this.f26005b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26004a != null) {
            nyu.a(1, this.f26004a.intValue());
        }
        if (this.f26005b != null) {
            nyu.b(2, this.f26005b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26004a != null) {
            b += nyu.f(1, this.f26004a.intValue());
        }
        if (this.f26005b != null) {
            return b + nyu.d(2, this.f26005b);
        }
        return b;
    }

    private lpk m29905b(nyt nyt) {
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
                            this.f26004a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    if (this.f26005b == null) {
                        this.f26005b = new muu();
                    }
                    nyt.a(this.f26005b);
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
