package p000;

public final class kvm extends nyx<kvm> {
    public int f23645a;
    public String f23646b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27704b(nyt);
    }

    public kvm() {
        this.f23645a = nzf.UNSET_ENUM_VALUE;
        this.f23646b = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f23645a != nzf.UNSET_ENUM_VALUE) {
            nyu.a(1, this.f23645a);
        }
        if (this.f23646b != null) {
            nyu.a(2, this.f23646b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f23645a != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(1, this.f23645a);
        }
        if (this.f23646b != null) {
            return b + nyu.b(2, this.f23646b);
        }
        return b;
    }

    private kvm m27704b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 4:
                        case 11:
                            this.f23645a = a;
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    this.f23646b = nyt.j();
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
