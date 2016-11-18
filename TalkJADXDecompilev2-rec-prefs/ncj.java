package p000;

public final class ncj extends nyx<ncj> {
    public String f29501a;
    public nck f29502b;

    public /* synthetic */ nzf m34310a(nyt nyt) {
        return m34309b(nyt);
    }

    public ncj() {
        this.f29501a = null;
        this.cachedSize = -1;
    }

    public void m34311a(nyu nyu) {
        if (this.f29501a != null) {
            nyu.m37170a(1, this.f29501a);
        }
        if (this.f29502b != null) {
            nyu.m37182b(2, this.f29502b);
        }
        super.a(nyu);
    }

    protected int m34312b() {
        int b = super.b();
        if (this.f29501a != null) {
            b += nyu.m37137b(1, this.f29501a);
        }
        if (this.f29502b != null) {
            return b + nyu.m37145d(2, this.f29502b);
        }
        return b;
    }

    private ncj m34309b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f29501a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    if (this.f29502b == null) {
                        this.f29502b = new nck();
                    }
                    nyt.m37101a(this.f29502b);
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
