package p000;

public final class ldr extends nyx<ldr> {
    public String f24717a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28776b(nyt);
    }

    public ldr() {
        m28777d();
    }

    private ldr m28777d() {
        this.f24717a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f24717a != null) {
            nyu.a(1, this.f24717a);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24717a != null) {
            return b + nyu.b(1, this.f24717a);
        }
        return b;
    }

    private ldr m28776b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f24717a = nyt.j();
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
