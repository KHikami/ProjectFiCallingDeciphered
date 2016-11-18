package p000;

public final class oau extends nyx<oau> {
    public Boolean f31804a;
    public Boolean f31805b;
    public Boolean f31806c;

    public /* synthetic */ nzf m37469a(nyt nyt) {
        return m37468b(nyt);
    }

    public oau() {
        this.f31804a = null;
        this.f31805b = null;
        this.f31806c = null;
        this.cachedSize = -1;
    }

    public void m37470a(nyu nyu) {
        if (this.f31804a != null) {
            nyu.m37172a(1, this.f31804a.booleanValue());
        }
        if (this.f31805b != null) {
            nyu.m37172a(2, this.f31805b.booleanValue());
        }
        if (this.f31806c != null) {
            nyu.m37172a(3, this.f31806c.booleanValue());
        }
        super.a(nyu);
    }

    protected int m37471b() {
        int b = super.b();
        if (this.f31804a != null) {
            this.f31804a.booleanValue();
            b += nyu.m37154h(1) + 1;
        }
        if (this.f31805b != null) {
            this.f31805b.booleanValue();
            b += nyu.m37154h(2) + 1;
        }
        if (this.f31806c == null) {
            return b;
        }
        this.f31806c.booleanValue();
        return b + (nyu.m37154h(3) + 1);
    }

    private oau m37468b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f31804a = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 16:
                    this.f31805b = Boolean.valueOf(nyt.m37116i());
                    continue;
                case wi.dA /*24*/:
                    this.f31806c = Boolean.valueOf(nyt.m37116i());
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
