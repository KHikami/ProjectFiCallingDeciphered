package p000;

public final class nsg extends nyx<nsg> {
    private static volatile nsg[] f30693f;
    public non f30694a;
    public nqc f30695b;
    public Float f30696c;
    public Float f30697d;
    public nsh f30698e;

    public /* synthetic */ nzf m36355a(nyt nyt) {
        return m36353b(nyt);
    }

    public static nsg[] m36354d() {
        if (f30693f == null) {
            synchronized (nzc.f31309c) {
                if (f30693f == null) {
                    f30693f = new nsg[0];
                }
            }
        }
        return f30693f;
    }

    public nsg() {
        this.f30696c = null;
        this.f30697d = null;
        this.cachedSize = -1;
    }

    public void m36356a(nyu nyu) {
        if (this.f30694a != null) {
            nyu.m37182b(1, this.f30694a);
        }
        if (this.f30695b != null) {
            nyu.m37182b(2, this.f30695b);
        }
        if (this.f30696c != null) {
            nyu.m37167a(3, this.f30696c.floatValue());
        }
        if (this.f30697d != null) {
            nyu.m37167a(4, this.f30697d.floatValue());
        }
        if (this.f30698e != null) {
            nyu.m37182b(5, this.f30698e);
        }
        super.a(nyu);
    }

    protected int m36357b() {
        int b = super.b();
        if (this.f30694a != null) {
            b += nyu.m37145d(1, this.f30694a);
        }
        if (this.f30695b != null) {
            b += nyu.m37145d(2, this.f30695b);
        }
        if (this.f30696c != null) {
            this.f30696c.floatValue();
            b += nyu.m37154h(3) + 4;
        }
        if (this.f30697d != null) {
            this.f30697d.floatValue();
            b += nyu.m37154h(4) + 4;
        }
        if (this.f30698e != null) {
            return b + nyu.m37145d(5, this.f30698e);
        }
        return b;
    }

    private nsg m36353b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f30694a == null) {
                        this.f30694a = new non();
                    }
                    nyt.m37101a(this.f30694a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f30695b == null) {
                        this.f30695b = new nqc();
                    }
                    nyt.m37101a(this.f30695b);
                    continue;
                case 29:
                    this.f30696c = Float.valueOf(nyt.m37106c());
                    continue;
                case 37:
                    this.f30697d = Float.valueOf(nyt.m37106c());
                    continue;
                case 42:
                    if (this.f30698e == null) {
                        this.f30698e = new nsh();
                    }
                    nyt.m37101a(this.f30698e);
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
