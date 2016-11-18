package p000;

public final class lcq extends nyx<lcq> {
    public String f24607a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28637b(nyt);
    }

    public lcq() {
        m28638d();
    }

    private lcq m28638d() {
        this.f24607a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f24607a != null) {
            nyu.a(1, this.f24607a);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24607a != null) {
            return b + nyu.b(1, this.f24607a);
        }
        return b;
    }

    private lcq m28637b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f24607a = nyt.j();
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
