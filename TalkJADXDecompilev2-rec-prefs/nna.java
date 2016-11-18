package p000;

public final class nna extends nyx<nna> {
    public Boolean f30267a;

    public /* synthetic */ nzf m35726a(nyt nyt) {
        return m35724b(nyt);
    }

    public nna() {
        m35725d();
    }

    private nna m35725d() {
        this.f30267a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35727a(nyu nyu) {
        if (this.f30267a != null) {
            nyu.m37172a(1, this.f30267a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m35728b() {
        int b = super.b();
        if (this.f30267a == null) {
            return b;
        }
        this.f30267a.booleanValue();
        return b + (nyu.m37154h(1) + 1);
    }

    private nna m35724b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30267a = Boolean.valueOf(nyt.m37116i());
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
