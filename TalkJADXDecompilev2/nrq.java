package defpackage;

public final class nrq extends nyx<nrq> {
    public Integer a;
    public Integer b;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public nrq() {
        this.a = null;
        this.b = null;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.b(1, this.a.intValue());
        }
        if (this.b != null) {
            nyu.b(2, this.b.intValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            this.a.intValue();
            b += nyu.h(1) + 4;
        }
        if (this.b == null) {
            return b;
        }
        this.b.intValue();
        return b + (nyu.h(2) + 4);
    }

    private nrq b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 13:
                    this.a = Integer.valueOf(nyt.h());
                    continue;
                case 21:
                    this.b = Integer.valueOf(nyt.h());
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
