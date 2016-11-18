package p000;

public final class opj extends nyx<opj> {
    public String f33553a;
    public opi f33554b;
    public opi f33555c;

    public /* synthetic */ nzf m39044a(nyt nyt) {
        return m39042b(nyt);
    }

    public opj() {
        m39043d();
    }

    private opj m39043d() {
        this.f33553a = null;
        this.f33554b = null;
        this.f33555c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39045a(nyu nyu) {
        if (this.f33553a != null) {
            nyu.m37170a(1, this.f33553a);
        }
        if (this.f33554b != null) {
            nyu.m37182b(2, this.f33554b);
        }
        if (this.f33555c != null) {
            nyu.m37182b(3, this.f33555c);
        }
        super.a(nyu);
    }

    protected int m39046b() {
        int b = super.b();
        if (this.f33553a != null) {
            b += nyu.m37137b(1, this.f33553a);
        }
        if (this.f33554b != null) {
            b += nyu.m37145d(2, this.f33554b);
        }
        if (this.f33555c != null) {
            return b + nyu.m37145d(3, this.f33555c);
        }
        return b;
    }

    private opj m39042b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f33553a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    if (this.f33554b == null) {
                        this.f33554b = new opi();
                    }
                    nyt.m37101a(this.f33554b);
                    continue;
                case wi.dx /*26*/:
                    if (this.f33555c == null) {
                        this.f33555c = new opi();
                    }
                    nyt.m37101a(this.f33555c);
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
