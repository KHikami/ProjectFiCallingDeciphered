package p000;

public final class nid extends nyx<nid> {
    public njs f29874a;

    public /* synthetic */ nzf m35064a(nyt nyt) {
        return m35062b(nyt);
    }

    public nid() {
        m35063d();
    }

    private nid m35063d() {
        this.f29874a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35065a(nyu nyu) {
        if (this.f29874a != null) {
            nyu.m37182b(1, this.f29874a);
        }
        super.a(nyu);
    }

    protected int m35066b() {
        int b = super.b();
        if (this.f29874a != null) {
            return b + nyu.m37145d(1, this.f29874a);
        }
        return b;
    }

    private nid m35062b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f29874a == null) {
                        this.f29874a = new njs();
                    }
                    nyt.m37101a(this.f29874a);
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
