package p000;

public final class nli extends nyx<nli> {
    public byte[] f30111a;
    public byte[] f30112b;

    public /* synthetic */ nzf m35496a(nyt nyt) {
        return m35494b(nyt);
    }

    public nli() {
        m35495d();
    }

    private nli m35495d() {
        this.f30111a = null;
        this.f30112b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35497a(nyu nyu) {
        if (this.f30111a != null) {
            nyu.m37173a(1, this.f30111a);
        }
        if (this.f30112b != null) {
            nyu.m37173a(2, this.f30112b);
        }
        super.a(nyu);
    }

    protected int m35498b() {
        int b = super.b();
        if (this.f30111a != null) {
            b += nyu.m37139b(1, this.f30111a);
        }
        if (this.f30112b != null) {
            return b + nyu.m37139b(2, this.f30112b);
        }
        return b;
    }

    private nli m35494b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f30111a = nyt.m37118k();
                    continue;
                case wi.dH /*18*/:
                    this.f30112b = nyt.m37118k();
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
