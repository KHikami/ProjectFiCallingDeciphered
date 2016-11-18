package p000;

public final class nqs extends nyx<nqs> {
    public byte[] f30522a;
    public byte[] f30523b;

    public /* synthetic */ nzf m36189a(nyt nyt) {
        return m36188b(nyt);
    }

    public nqs() {
        this.f30522a = null;
        this.f30523b = null;
        this.cachedSize = -1;
    }

    public void m36190a(nyu nyu) {
        if (this.f30522a != null) {
            nyu.m37173a(1, this.f30522a);
        }
        if (this.f30523b != null) {
            nyu.m37173a(2, this.f30523b);
        }
        super.a(nyu);
    }

    protected int m36191b() {
        int b = super.b();
        if (this.f30522a != null) {
            b += nyu.m37139b(1, this.f30522a);
        }
        if (this.f30523b != null) {
            return b + nyu.m37139b(2, this.f30523b);
        }
        return b;
    }

    private nqs m36188b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f30522a = nyt.m37118k();
                    continue;
                case wi.dH /*18*/:
                    this.f30523b = nyt.m37118k();
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
