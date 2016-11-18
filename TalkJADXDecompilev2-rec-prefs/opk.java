package p000;

public final class opk extends nyx<opk> {
    public String f33556a;
    public String f33557b;
    public oqu f33558c;
    public String f33559d;

    public /* synthetic */ nzf m39049a(nyt nyt) {
        return m39047b(nyt);
    }

    public opk() {
        m39048d();
    }

    private opk m39048d() {
        this.f33556a = null;
        this.f33557b = null;
        this.f33558c = null;
        this.f33559d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39050a(nyu nyu) {
        if (this.f33556a != null) {
            nyu.m37170a(1, this.f33556a);
        }
        if (this.f33558c != null) {
            nyu.m37182b(2, this.f33558c);
        }
        if (this.f33559d != null) {
            nyu.m37170a(3, this.f33559d);
        }
        if (this.f33557b != null) {
            nyu.m37170a(4, this.f33557b);
        }
        super.a(nyu);
    }

    protected int m39051b() {
        int b = super.b();
        if (this.f33556a != null) {
            b += nyu.m37137b(1, this.f33556a);
        }
        if (this.f33558c != null) {
            b += nyu.m37145d(2, this.f33558c);
        }
        if (this.f33559d != null) {
            b += nyu.m37137b(3, this.f33559d);
        }
        if (this.f33557b != null) {
            return b + nyu.m37137b(4, this.f33557b);
        }
        return b;
    }

    private opk m39047b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f33556a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    if (this.f33558c == null) {
                        this.f33558c = new oqu();
                    }
                    nyt.m37101a(this.f33558c);
                    continue;
                case wi.dx /*26*/:
                    this.f33559d = nyt.m37117j();
                    continue;
                case 34:
                    this.f33557b = nyt.m37117j();
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
