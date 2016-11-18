package p000;

public final class nti extends nyx<nti> {
    public ntj f30749a;

    public /* synthetic */ nzf m36473a(nyt nyt) {
        return m36471b(nyt);
    }

    public nti() {
        m36472d();
    }

    private nti m36472d() {
        this.f30749a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m36474a(nyu nyu) {
        if (this.f30749a != null) {
            nyu.m37182b(1, this.f30749a);
        }
        super.a(nyu);
    }

    protected int m36475b() {
        int b = super.b();
        if (this.f30749a != null) {
            return b + nyu.m37145d(1, this.f30749a);
        }
        return b;
    }

    private nti m36471b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f30749a == null) {
                        this.f30749a = new ntj();
                    }
                    nyt.m37101a(this.f30749a);
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
