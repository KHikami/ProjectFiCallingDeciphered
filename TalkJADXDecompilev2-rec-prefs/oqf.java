package p000;

public final class oqf extends nyx<oqf> {
    private static volatile oqf[] f33720e;
    public String f33721a;
    public oqu f33722b;
    public String f33723c;
    public String f33724d;

    public /* synthetic */ nzf m39161a(nyt nyt) {
        return m39158b(nyt);
    }

    public static oqf[] m39159d() {
        if (f33720e == null) {
            synchronized (nzc.f31309c) {
                if (f33720e == null) {
                    f33720e = new oqf[0];
                }
            }
        }
        return f33720e;
    }

    public oqf() {
        m39160g();
    }

    private oqf m39160g() {
        this.f33721a = null;
        this.f33722b = null;
        this.f33723c = null;
        this.f33724d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39162a(nyu nyu) {
        nyu.m37170a(1, this.f33721a);
        if (this.f33722b != null) {
            nyu.m37182b(2, this.f33722b);
        }
        if (this.f33723c != null) {
            nyu.m37170a(3, this.f33723c);
        }
        if (this.f33724d != null) {
            nyu.m37170a(4, this.f33724d);
        }
        super.a(nyu);
    }

    protected int m39163b() {
        int b = super.b() + nyu.m37137b(1, this.f33721a);
        if (this.f33722b != null) {
            b += nyu.m37145d(2, this.f33722b);
        }
        if (this.f33723c != null) {
            b += nyu.m37137b(3, this.f33723c);
        }
        if (this.f33724d != null) {
            return b + nyu.m37137b(4, this.f33724d);
        }
        return b;
    }

    private oqf m39158b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f33721a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    if (this.f33722b == null) {
                        this.f33722b = new oqu();
                    }
                    nyt.m37101a(this.f33722b);
                    continue;
                case wi.dx /*26*/:
                    this.f33723c = nyt.m37117j();
                    continue;
                case 34:
                    this.f33724d = nyt.m37117j();
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
