package p000;

public final class khh extends nyx<khh> {
    public String f21754a;
    public String f21755b;
    public String f21756c;
    public String f21757d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m25833b(nyt);
    }

    public khh() {
        m25834d();
    }

    private khh m25834d() {
        this.f21754a = null;
        this.f21755b = null;
        this.f21756c = null;
        this.f21757d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f21754a != null) {
            nyu.a(1, this.f21754a);
        }
        if (this.f21755b != null) {
            nyu.a(2, this.f21755b);
        }
        if (this.f21756c != null) {
            nyu.a(3, this.f21756c);
        }
        if (this.f21757d != null) {
            nyu.a(4, this.f21757d);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f21754a != null) {
            b += nyu.b(1, this.f21754a);
        }
        if (this.f21755b != null) {
            b += nyu.b(2, this.f21755b);
        }
        if (this.f21756c != null) {
            b += nyu.b(3, this.f21756c);
        }
        if (this.f21757d != null) {
            return b + nyu.b(4, this.f21757d);
        }
        return b;
    }

    private khh m25833b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f21754a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f21755b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f21756c = nyt.j();
                    continue;
                case 34:
                    this.f21757d = nyt.j();
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
