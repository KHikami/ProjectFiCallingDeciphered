package p000;

public final class nke extends nyx<nke> {
    public nod f30032a;

    public /* synthetic */ nzf m35335a(nyt nyt) {
        return m35333b(nyt);
    }

    public nke() {
        m35334d();
    }

    private nke m35334d() {
        this.f30032a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35336a(nyu nyu) {
        if (this.f30032a != null) {
            nyu.m37182b(1, this.f30032a);
        }
        super.a(nyu);
    }

    protected int m35337b() {
        int b = super.b();
        if (this.f30032a != null) {
            return b + nyu.m37145d(1, this.f30032a);
        }
        return b;
    }

    private nke m35333b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f30032a == null) {
                        this.f30032a = new nod();
                    }
                    nyt.m37101a(this.f30032a);
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
