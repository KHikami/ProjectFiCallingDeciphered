package p000;

public final class muw extends nyx<muw> {
    public String f28419a;
    public String f28420b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m33020b(nyt);
    }

    public muw() {
        m33021d();
    }

    private muw m33021d() {
        this.f28419a = null;
        this.f28420b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f28419a != null) {
            nyu.a(1, this.f28419a);
        }
        if (this.f28420b != null) {
            nyu.a(2, this.f28420b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f28419a != null) {
            b += nyu.b(1, this.f28419a);
        }
        if (this.f28420b != null) {
            return b + nyu.b(2, this.f28420b);
        }
        return b;
    }

    private muw m33020b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f28419a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f28420b = nyt.j();
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
