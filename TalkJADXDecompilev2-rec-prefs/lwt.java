package p000;

public final class lwt extends nyx<lwt> {
    public Integer f26725a;
    public String f26726b;
    public Integer f26727c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30918b(nyt);
    }

    public lwt() {
        m30919d();
    }

    private lwt m30919d() {
        this.f26726b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26725a != null) {
            nyu.a(1, this.f26725a.intValue());
        }
        if (this.f26726b != null) {
            nyu.a(2, this.f26726b);
        }
        if (this.f26727c != null) {
            nyu.a(3, this.f26727c.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26725a != null) {
            b += nyu.f(1, this.f26725a.intValue());
        }
        if (this.f26726b != null) {
            b += nyu.b(2, this.f26726b);
        }
        if (this.f26727c != null) {
            return b + nyu.f(3, this.f26727c.intValue());
        }
        return b;
    }

    private lwt m30918b(nyt nyt) {
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
                            this.f26725a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    this.f26726b = nyt.j();
                    continue;
                case wi.dA /*24*/:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                            this.f26727c = Integer.valueOf(a);
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
