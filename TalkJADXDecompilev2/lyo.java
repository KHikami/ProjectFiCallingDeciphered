package defpackage;

public final class lyo extends nyx<lyo> {
    public Boolean a;
    public Boolean b;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public lyo() {
        d();
    }

    private lyo d() {
        this.a = null;
        this.b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(3, this.a.booleanValue());
        }
        if (this.b != null) {
            nyu.a(4, this.b.booleanValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            this.a.booleanValue();
            b += nyu.h(3) + 1;
        }
        if (this.b == null) {
            return b;
        }
        this.b.booleanValue();
        return b + (nyu.h(4) + 1);
    }

    private lyo b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case wi.dA /*24*/:
                    this.a = Boolean.valueOf(nyt.i());
                    continue;
                case 32:
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
