package p000;

public final class kmq extends nyx<kmq> {
    public String f22385a;
    public String f22386b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26572b(nyt);
    }

    public kmq() {
        m26573d();
    }

    private kmq m26573d() {
        this.f22385a = null;
        this.f22386b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22385a != null) {
            nyu.a(1, this.f22385a);
        }
        if (this.f22386b != null) {
            nyu.a(2, this.f22386b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22385a != null) {
            b += nyu.b(1, this.f22385a);
        }
        if (this.f22386b != null) {
            return b + nyu.b(2, this.f22386b);
        }
        return b;
    }

    private kmq m26572b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f22385a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f22386b = nyt.j();
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
