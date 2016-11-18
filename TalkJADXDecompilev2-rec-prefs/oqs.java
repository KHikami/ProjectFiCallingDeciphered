package p000;

public final class oqs extends nyx<oqs> {
    public Integer f33786a;
    public String f33787b;
    public String f33788c;
    public oqu f33789d;

    public /* synthetic */ nzf m39231a(nyt nyt) {
        return m39229b(nyt);
    }

    public oqs() {
        m39230d();
    }

    private oqs m39230d() {
        this.f33787b = null;
        this.f33788c = null;
        this.f33789d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39232a(nyu nyu) {
        if (this.f33786a != null) {
            nyu.m37168a(1, this.f33786a.intValue());
        }
        if (this.f33789d != null) {
            nyu.m37182b(2, this.f33789d);
        }
        if (this.f33787b != null) {
            nyu.m37170a(3, this.f33787b);
        }
        if (this.f33788c != null) {
            nyu.m37170a(4, this.f33788c);
        }
        super.a(nyu);
    }

    protected int m39233b() {
        int b = super.b();
        if (this.f33786a != null) {
            b += nyu.m37147f(1, this.f33786a.intValue());
        }
        if (this.f33789d != null) {
            b += nyu.m37145d(2, this.f33789d);
        }
        if (this.f33787b != null) {
            b += nyu.m37137b(3, this.f33787b);
        }
        if (this.f33788c != null) {
            return b + nyu.m37137b(4, this.f33788c);
        }
        return b;
    }

    private oqs m39229b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.m37112f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            this.f33786a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    if (this.f33789d == null) {
                        this.f33789d = new oqu();
                    }
                    nyt.m37101a(this.f33789d);
                    continue;
                case wi.dx /*26*/:
                    this.f33787b = nyt.m37117j();
                    continue;
                case 34:
                    this.f33788c = nyt.m37117j();
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
