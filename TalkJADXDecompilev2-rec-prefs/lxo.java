package p000;

public final class lxo extends nyx<lxo> {
    public String f26796a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31028b(nyt);
    }

    public lxo() {
        m31029d();
    }

    private lxo m31029d() {
        this.f26796a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26796a != null) {
            nyu.a(1, this.f26796a);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26796a != null) {
            return b + nyu.b(1, this.f26796a);
        }
        return b;
    }

    private lxo m31028b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f26796a = nyt.j();
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
