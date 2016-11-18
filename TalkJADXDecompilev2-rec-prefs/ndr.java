package p000;

public final class ndr extends nyx<ndr> {
    public String f29575a;

    public /* synthetic */ nzf m34456a(nyt nyt) {
        return m34455b(nyt);
    }

    public ndr() {
        this.f29575a = null;
        this.cachedSize = -1;
    }

    public void m34457a(nyu nyu) {
        if (this.f29575a != null) {
            nyu.m37170a(1, this.f29575a);
        }
        super.a(nyu);
    }

    protected int m34458b() {
        int b = super.b();
        if (this.f29575a != null) {
            return b + nyu.m37137b(1, this.f29575a);
        }
        return b;
    }

    private ndr m34455b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f29575a = nyt.m37117j();
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
