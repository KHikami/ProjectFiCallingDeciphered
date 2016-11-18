package defpackage;

public final class nkv extends nyx<nkv> {
    public Boolean a;
    public nkh b;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public nkv() {
        d();
    }

    private nkv d() {
        this.a = null;
        this.b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.b != null) {
            nyu.b(3, this.b);
        }
        if (this.a != null) {
            nyu.a(4, this.a.booleanValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.b != null) {
            b += nyu.d(3, this.b);
        }
        if (this.a == null) {
            return b;
        }
        this.a.booleanValue();
        return b + (nyu.h(4) + 1);
    }

    private nkv b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case wi.dx /*26*/:
                    if (this.b == null) {
                        this.b = new nkh();
                    }
                    nyt.a(this.b);
                    continue;
                case 32:
                    this.a = Boolean.valueOf(nyt.i());
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
