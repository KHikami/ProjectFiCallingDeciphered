package p000;

public final class nls extends nyx<nls> {
    private static volatile nls[] f30173f;
    public njp f30174a;
    public njw f30175b;
    public Float f30176c;
    public Float f30177d;
    public nlt f30178e;

    public /* synthetic */ nzf m35548a(nyt nyt) {
        return m35545b(nyt);
    }

    public static nls[] m35546d() {
        if (f30173f == null) {
            synchronized (nzc.f31309c) {
                if (f30173f == null) {
                    f30173f = new nls[0];
                }
            }
        }
        return f30173f;
    }

    public nls() {
        m35547g();
    }

    private nls m35547g() {
        this.f30174a = null;
        this.f30175b = null;
        this.f30176c = null;
        this.f30177d = null;
        this.f30178e = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35549a(nyu nyu) {
        if (this.f30174a != null) {
            nyu.m37182b(1, this.f30174a);
        }
        if (this.f30175b != null) {
            nyu.m37182b(2, this.f30175b);
        }
        if (this.f30176c != null) {
            nyu.m37167a(3, this.f30176c.floatValue());
        }
        if (this.f30177d != null) {
            nyu.m37167a(4, this.f30177d.floatValue());
        }
        if (this.f30178e != null) {
            nyu.m37182b(5, this.f30178e);
        }
        super.a(nyu);
    }

    protected int m35550b() {
        int b = super.b();
        if (this.f30174a != null) {
            b += nyu.m37145d(1, this.f30174a);
        }
        if (this.f30175b != null) {
            b += nyu.m37145d(2, this.f30175b);
        }
        if (this.f30176c != null) {
            this.f30176c.floatValue();
            b += nyu.m37154h(3) + 4;
        }
        if (this.f30177d != null) {
            this.f30177d.floatValue();
            b += nyu.m37154h(4) + 4;
        }
        if (this.f30178e != null) {
            return b + nyu.m37145d(5, this.f30178e);
        }
        return b;
    }

    private nls m35545b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f30174a == null) {
                        this.f30174a = new njp();
                    }
                    nyt.m37101a(this.f30174a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f30175b == null) {
                        this.f30175b = new njw();
                    }
                    nyt.m37101a(this.f30175b);
                    continue;
                case 29:
                    this.f30176c = Float.valueOf(nyt.m37106c());
                    continue;
                case 37:
                    this.f30177d = Float.valueOf(nyt.m37106c());
                    continue;
                case 42:
                    if (this.f30178e == null) {
                        this.f30178e = new nlt();
                    }
                    nyt.m37101a(this.f30178e);
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
