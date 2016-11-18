package p000;

public final class npp extends nyx<npp> {
    public nha f30446a;

    public /* synthetic */ nzf m36058a(nyt nyt) {
        return m36056b(nyt);
    }

    public npp() {
        m36057d();
    }

    private npp m36057d() {
        this.f30446a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m36059a(nyu nyu) {
        if (this.f30446a != null) {
            nyu.m37182b(1, this.f30446a);
        }
        super.a(nyu);
    }

    protected int m36060b() {
        int b = super.b();
        if (this.f30446a != null) {
            return b + nyu.m37145d(1, this.f30446a);
        }
        return b;
    }

    private npp m36056b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f30446a == null) {
                        this.f30446a = new nha();
                    }
                    nyt.m37101a(this.f30446a);
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
