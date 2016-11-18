package p000;

public final class lco extends nyx<lco> {
    public String f24601a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28627b(nyt);
    }

    public lco() {
        m28628d();
    }

    private lco m28628d() {
        this.f24601a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f24601a != null) {
            nyu.a(1, this.f24601a);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24601a != null) {
            return b + nyu.b(1, this.f24601a);
        }
        return b;
    }

    private lco m28627b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f24601a = nyt.j();
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
