package p000;

public final class osb extends nyx<osb> {
    public osa f34109a;

    public /* synthetic */ nzf m39526a(nyt nyt) {
        return m39524b(nyt);
    }

    public osb() {
        m39525d();
    }

    private osb m39525d() {
        this.f34109a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39527a(nyu nyu) {
        if (this.f34109a != null) {
            nyu.m37182b(4, this.f34109a);
        }
        super.a(nyu);
    }

    protected int m39528b() {
        int b = super.b();
        if (this.f34109a != null) {
            return b + nyu.m37145d(4, this.f34109a);
        }
        return b;
    }

    private osb m39524b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 34:
                    if (this.f34109a == null) {
                        this.f34109a = new osa();
                    }
                    nyt.m37101a(this.f34109a);
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
