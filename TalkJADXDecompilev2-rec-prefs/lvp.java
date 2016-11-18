package p000;

public final class lvp extends nyx<lvp> {
    public lqm f26608a;
    public Integer f26609b;
    public lup requestHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30763b(nyt);
    }

    public lvp() {
        m30764d();
    }

    private lvp m30764d() {
        this.requestHeader = null;
        this.f26608a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.requestHeader != null) {
            nyu.b(1, this.requestHeader);
        }
        if (this.f26608a != null) {
            nyu.b(2, this.f26608a);
        }
        if (this.f26609b != null) {
            nyu.a(4, this.f26609b.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.requestHeader != null) {
            b += nyu.d(1, this.requestHeader);
        }
        if (this.f26608a != null) {
            b += nyu.d(2, this.f26608a);
        }
        if (this.f26609b != null) {
            return b + nyu.f(4, this.f26609b.intValue());
        }
        return b;
    }

    private lvp m30763b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.requestHeader == null) {
                        this.requestHeader = new lup();
                    }
                    nyt.a(this.requestHeader);
                    continue;
                case wi.dH /*18*/:
                    if (this.f26608a == null) {
                        this.f26608a = new lqm();
                    }
                    nyt.a(this.f26608a);
                    continue;
                case 32:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.f26609b = Integer.valueOf(a);
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
