package defpackage;

public final class nmr extends nyx<nmr> {
    public nms a;
    public Boolean b;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public nmr() {
        d();
    }

    private nmr d() {
        this.a = null;
        this.b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.b(1, this.a);
        }
        if (this.b != null) {
            nyu.a(2, this.b.booleanValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.d(1, this.a);
        }
        if (this.b == null) {
            return b;
        }
        this.b.booleanValue();
        return b + (nyu.h(2) + 1);
    }

    private nmr b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.a == null) {
                        this.a = new nms();
                    }
                    nyt.a(this.a);
                    continue;
                case 16:
                    this.b = Boolean.valueOf(nyt.i());
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
