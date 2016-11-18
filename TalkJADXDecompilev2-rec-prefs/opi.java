package p000;

public final class opi extends nyx<opi> {
    public Double f33551a;
    public String f33552b;

    public /* synthetic */ nzf m39039a(nyt nyt) {
        return m39037b(nyt);
    }

    public opi() {
        m39038d();
    }

    private opi m39038d() {
        this.f33551a = null;
        this.f33552b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39040a(nyu nyu) {
        if (this.f33551a != null) {
            nyu.m37166a(1, this.f33551a.doubleValue());
        }
        if (this.f33552b != null) {
            nyu.m37170a(2, this.f33552b);
        }
        super.a(nyu);
    }

    protected int m39041b() {
        int b = super.b();
        if (this.f33551a != null) {
            this.f33551a.doubleValue();
            b += nyu.m37154h(1) + 8;
        }
        if (this.f33552b != null) {
            return b + nyu.m37137b(2, this.f33552b);
        }
        return b;
    }

    private opi m39037b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 9:
                    this.f33551a = Double.valueOf(nyt.m37104b());
                    continue;
                case wi.dH /*18*/:
                    this.f33552b = nyt.m37117j();
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
