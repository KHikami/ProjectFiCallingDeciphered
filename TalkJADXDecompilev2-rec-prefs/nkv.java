package p000;

public final class nkv extends nyx<nkv> {
    public Boolean f30082a;
    public nkh f30083b;

    public /* synthetic */ nzf m35420a(nyt nyt) {
        return m35418b(nyt);
    }

    public nkv() {
        m35419d();
    }

    private nkv m35419d() {
        this.f30082a = null;
        this.f30083b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35421a(nyu nyu) {
        if (this.f30083b != null) {
            nyu.m37182b(3, this.f30083b);
        }
        if (this.f30082a != null) {
            nyu.m37172a(4, this.f30082a.booleanValue());
        }
        super.a(nyu);
    }

    protected int m35422b() {
        int b = super.b();
        if (this.f30083b != null) {
            b += nyu.m37145d(3, this.f30083b);
        }
        if (this.f30082a == null) {
            return b;
        }
        this.f30082a.booleanValue();
        return b + (nyu.m37154h(4) + 1);
    }

    private nkv m35418b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case wi.dx /*26*/:
                    if (this.f30083b == null) {
                        this.f30083b = new nkh();
                    }
                    nyt.m37101a(this.f30083b);
                    continue;
                case 32:
                    this.f30082a = Boolean.valueOf(nyt.m37116i());
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
