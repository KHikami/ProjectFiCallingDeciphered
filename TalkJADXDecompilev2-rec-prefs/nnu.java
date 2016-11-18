package p000;

public final class nnu extends nyx<nnu> {
    public Boolean f30313a;

    public /* synthetic */ nzf m35828a(nyt nyt) {
        return m35826b(nyt);
    }

    public nnu() {
        m35827d();
    }

    private nnu m35827d() {
        this.f30313a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35829a(nyu nyu) {
        if (this.f30313a != null) {
            nyu.m37172a(1, this.f30313a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m35830b() {
        int b = super.b();
        if (this.f30313a == null) {
            return b;
        }
        this.f30313a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private nnu m35826b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30313a = Boolean.valueOf(nyt.m37116i());
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
