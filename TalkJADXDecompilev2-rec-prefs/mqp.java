package p000;

public final class mqp extends nyx<mqp> {
    public String f28121a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m32713b(nyt);
    }

    public mqp() {
        m32714d();
    }

    private mqp m32714d() {
        this.f28121a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f28121a != null) {
            nyu.a(2, this.f28121a);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f28121a != null) {
            return b + nyu.b(2, this.f28121a);
        }
        return b;
    }

    private mqp m32713b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case wi.dH /*18*/:
                    this.f28121a = nyt.j();
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
