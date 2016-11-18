package defpackage;

public final class nsi extends nyx<nsi> {
    public Boolean a;
    public nsj b;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public nsi() {
        this.a = null;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a.booleanValue());
        }
        if (this.b != null) {
            nyu.b(5, this.b);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            this.a.booleanValue();
            b += nyu.h(1) + 1;
        }
        if (this.b != null) {
            return b + nyu.d(5, this.b);
        }
        return b;
    }

    private nsi b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.a = Boolean.valueOf(nyt.i());
                    continue;
                case 42:
                    if (this.b == null) {
                        this.b = new nsj();
                    }
                    nyt.a(this.b);
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
