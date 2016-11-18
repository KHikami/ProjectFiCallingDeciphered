package p000;

public final class nku extends nyx<nku> {
    public Boolean f30080a;
    public nkv f30081b;

    public /* synthetic */ nzf m35415a(nyt nyt) {
        return m35413b(nyt);
    }

    public nku() {
        m35414d();
    }

    private nku m35414d() {
        this.f30080a = null;
        this.f30081b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35416a(nyu nyu) {
        if (this.f30080a != null) {
            nyu.m37172a(1, this.f30080a.booleanValue());
        }
        if (this.f30081b != null) {
            nyu.m37182b(5, this.f30081b);
        }
        super.a(nyu);
    }

    protected int m35417b() {
        int b = super.b();
        if (this.f30080a != null) {
            this.f30080a.booleanValue();
            b += nyu.m37154h(1) + 1;
        }
        if (this.f30081b != null) {
            return b + nyu.m37145d(5, this.f30081b);
        }
        return b;
    }

    private nku m35413b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30080a = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 42:
                    if (this.f30081b == null) {
                        this.f30081b = new nkv();
                    }
                    nyt.m37101a(this.f30081b);
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
