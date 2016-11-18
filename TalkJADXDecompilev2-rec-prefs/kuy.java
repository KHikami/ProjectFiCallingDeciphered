package p000;

public final class kuy extends nyx<kuy> {
    public String f23524a;
    public String f23525b;
    public String f23526c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27641b(nyt);
    }

    public kuy() {
        m27642d();
    }

    private kuy m27642d() {
        this.f23524a = null;
        this.f23525b = null;
        this.f23526c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        nyu.a(1, this.f23524a);
        nyu.a(2, this.f23525b);
        if (this.f23526c != null) {
            nyu.a(3, this.f23526c);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = (super.mo147b() + nyu.b(1, this.f23524a)) + nyu.b(2, this.f23525b);
        if (this.f23526c != null) {
            return b + nyu.b(3, this.f23526c);
        }
        return b;
    }

    private kuy m27641b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f23524a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f23525b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f23526c = nyt.j();
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
