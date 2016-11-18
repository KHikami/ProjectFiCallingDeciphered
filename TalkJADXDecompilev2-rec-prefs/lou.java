package p000;

public final class lou extends nyx<lou> {
    public String f25941a;
    public String f25942b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29807b(nyt);
    }

    public lou() {
        m29808d();
    }

    private lou m29808d() {
        this.f25941a = null;
        this.f25942b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f25941a != null) {
            nyu.a(1, this.f25941a);
        }
        if (this.f25942b != null) {
            nyu.a(2, this.f25942b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f25941a != null) {
            b += nyu.b(1, this.f25941a);
        }
        if (this.f25942b != null) {
            return b + nyu.b(2, this.f25942b);
        }
        return b;
    }

    private lou m29807b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f25941a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f25942b = nyt.j();
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
