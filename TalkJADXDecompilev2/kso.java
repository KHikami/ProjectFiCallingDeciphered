package defpackage;

public final class kso extends nyx<kso> {
    public Integer a;
    public Integer b;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public kso() {
        d();
    }

    private kso d() {
        this.a = null;
        this.b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        nyu.b(1, this.a.intValue());
        nyu.b(2, this.b.intValue());
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        this.a.intValue();
        b += nyu.h(1) + 4;
        this.b.intValue();
        return b + (nyu.h(2) + 4);
    }

    private kso b(nyt nyt) {
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