package defpackage;

public final class nks extends nyx<nks> {
    public Boolean a;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public nks() {
        d();
    }

    private nks d() {
        this.a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a.booleanValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a == null) {
            return b;
        }
        this.a.booleanValue();
        return b + (nyu.h(1) + 1);
    }

    private nks b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
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
