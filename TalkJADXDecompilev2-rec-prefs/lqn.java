package p000;

public final class lqn extends nyx<lqn> {
    public lqo f26149a;
    public lqp f26150b;
    public lod f26151c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30061b(nyt);
    }

    public lqn() {
        m30062d();
    }

    private lqn m30062d() {
        this.f26149a = null;
        this.f26150b = null;
        this.f26151c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26150b != null) {
            nyu.b(1, this.f26150b);
        }
        if (this.f26149a != null) {
            nyu.b(2, this.f26149a);
        }
        if (this.f26151c != null) {
            nyu.b(3, this.f26151c);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26150b != null) {
            b += nyu.d(1, this.f26150b);
        }
        if (this.f26149a != null) {
            b += nyu.d(2, this.f26149a);
        }
        if (this.f26151c != null) {
            return b + nyu.d(3, this.f26151c);
        }
        return b;
    }

    private lqn m30061b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f26150b == null) {
                        this.f26150b = new lqp();
                    }
                    nyt.a(this.f26150b);
                    continue;
                case wi.dH /*18*/:
                    if (this.f26149a == null) {
                        this.f26149a = new lqo();
                    }
                    nyt.a(this.f26149a);
                    continue;
                case wi.dx /*26*/:
                    if (this.f26151c == null) {
                        this.f26151c = new lod();
                    }
                    nyt.a(this.f26151c);
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
