package p000;

public final class oym extends nyx<oym> {
    public Float f34653a;
    public Float f34654b;

    public /* synthetic */ nzf m39927a(nyt nyt) {
        return m39925b(nyt);
    }

    public oym() {
        m39926d();
    }

    private oym m39926d() {
        this.f34653a = null;
        this.f34654b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39928a(nyu nyu) {
        if (this.f34653a != null) {
            nyu.m37167a(1, this.f34653a.floatValue());
        }
        if (this.f34654b != null) {
            nyu.m37167a(2, this.f34654b.floatValue());
        }
        super.a(nyu);
    }

    protected int m39929b() {
        int b = super.b();
        if (this.f34653a != null) {
            this.f34653a.floatValue();
            b += nyu.m37154h(1) + 4;
        }
        if (this.f34654b == null) {
            return b;
        }
        this.f34654b.floatValue();
        return b + (nyu.m37154h(2) + 4);
    }

    private oym m39925b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 13:
                    this.f34653a = Float.valueOf(nyt.m37106c());
                    continue;
                case 21:
                    this.f34654b = Float.valueOf(nyt.m37106c());
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
