package p000;

public final class nip extends nyx<nip> {
    public String f29902a;

    public /* synthetic */ nzf m35126a(nyt nyt) {
        return m35124b(nyt);
    }

    public nip() {
        m35125d();
    }

    private nip m35125d() {
        this.f29902a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35127a(nyu nyu) {
        if (this.f29902a != null) {
            nyu.m37170a(1, this.f29902a);
        }
        super.a(nyu);
    }

    protected int m35128b() {
        int b = super.b();
        if (this.f29902a != null) {
            return b + nyu.m37137b(1, this.f29902a);
        }
        return b;
    }

    private nip m35124b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f29902a = nyt.m37117j();
                    continue;
                default:
                    if (!super.a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
