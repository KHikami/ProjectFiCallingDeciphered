package p000;

public final class obf extends nyx<obf> {
    public String f31918a;

    public /* synthetic */ nzf m37610a(nyt nyt) {
        return m37608b(nyt);
    }

    public obf() {
        m37609d();
    }

    private obf m37609d() {
        this.f31918a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m37611a(nyu nyu) {
        if (this.f31918a != null) {
            nyu.m37170a(1, this.f31918a);
        }
        super.a(nyu);
    }

    protected int m37612b() {
        int b = super.b();
        if (this.f31918a != null) {
            return b + nyu.m37137b(1, this.f31918a);
        }
        return b;
    }

    private obf m37608b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f31918a = nyt.m37117j();
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
