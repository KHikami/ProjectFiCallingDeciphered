package p000;

public final class ora extends nyx<ora> {
    private static volatile ora[] f33847f;
    public String f33848a;
    public String f33849b;
    public oqu f33850c;
    public Integer f33851d;
    public Integer f33852e;

    public /* synthetic */ nzf m39279a(nyt nyt) {
        return m39276b(nyt);
    }

    public static ora[] m39277d() {
        if (f33847f == null) {
            synchronized (nzc.f31309c) {
                if (f33847f == null) {
                    f33847f = new ora[0];
                }
            }
        }
        return f33847f;
    }

    public ora() {
        m39278g();
    }

    private ora m39278g() {
        this.f33848a = null;
        this.f33849b = null;
        this.f33850c = null;
        this.f33851d = null;
        this.f33852e = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39280a(nyu nyu) {
        if (this.f33848a != null) {
            nyu.m37170a(1, this.f33848a);
        }
        if (this.f33849b != null) {
            nyu.m37170a(2, this.f33849b);
        }
        if (this.f33850c != null) {
            nyu.m37182b(3, this.f33850c);
        }
        if (this.f33851d != null) {
            nyu.m37168a(4, this.f33851d.intValue());
        }
        if (this.f33852e != null) {
            nyu.m37168a(5, this.f33852e.intValue());
        }
        super.a(nyu);
    }

    protected int m39281b() {
        int b = super.b();
        if (this.f33848a != null) {
            b += nyu.m37137b(1, this.f33848a);
        }
        if (this.f33849b != null) {
            b += nyu.m37137b(2, this.f33849b);
        }
        if (this.f33850c != null) {
            b += nyu.m37145d(3, this.f33850c);
        }
        if (this.f33851d != null) {
            b += nyu.m37147f(4, this.f33851d.intValue());
        }
        if (this.f33852e != null) {
            return b + nyu.m37147f(5, this.f33852e.intValue());
        }
        return b;
    }

    private ora m39276b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f33848a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    this.f33849b = nyt.m37117j();
                    continue;
                case wi.dx /*26*/:
                    if (this.f33850c == null) {
                        this.f33850c = new oqu();
                    }
                    nyt.m37101a(this.f33850c);
                    continue;
                case 32:
                    this.f33851d = Integer.valueOf(nyt.m37112f());
                    continue;
                case 40:
                    this.f33852e = Integer.valueOf(nyt.m37112f());
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
