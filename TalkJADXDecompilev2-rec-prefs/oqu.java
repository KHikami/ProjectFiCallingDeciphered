package p000;

public final class oqu extends nyx<oqu> {
    private static volatile oqu[] f33800i;
    public String f33801a;
    public String f33802b;
    public String f33803c;
    public String f33804d;
    public Integer f33805e;
    public opf f33806f;
    public String f33807g;
    public String f33808h;

    public /* synthetic */ nzf m39242a(nyt nyt) {
        return m39239b(nyt);
    }

    public static oqu[] m39240d() {
        if (f33800i == null) {
            synchronized (nzc.f31309c) {
                if (f33800i == null) {
                    f33800i = new oqu[0];
                }
            }
        }
        return f33800i;
    }

    public oqu() {
        m39241g();
    }

    private oqu m39241g() {
        this.f33801a = null;
        this.f33802b = null;
        this.f33803c = null;
        this.f33804d = null;
        this.f33806f = null;
        this.f33807g = null;
        this.f33808h = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39243a(nyu nyu) {
        if (this.f33801a != null) {
            nyu.m37170a(1, this.f33801a);
        }
        if (this.f33804d != null) {
            nyu.m37170a(2, this.f33804d);
        }
        if (this.f33805e != null) {
            nyu.m37168a(3, this.f33805e.intValue());
        }
        if (this.f33806f != null) {
            nyu.m37182b(4, this.f33806f);
        }
        if (this.f33807g != null) {
            nyu.m37170a(5, this.f33807g);
        }
        if (this.f33808h != null) {
            nyu.m37170a(6, this.f33808h);
        }
        if (this.f33802b != null) {
            nyu.m37170a(7, this.f33802b);
        }
        if (this.f33803c != null) {
            nyu.m37170a(8, this.f33803c);
        }
        super.a(nyu);
    }

    protected int m39244b() {
        int b = super.b();
        if (this.f33801a != null) {
            b += nyu.m37137b(1, this.f33801a);
        }
        if (this.f33804d != null) {
            b += nyu.m37137b(2, this.f33804d);
        }
        if (this.f33805e != null) {
            b += nyu.m37147f(3, this.f33805e.intValue());
        }
        if (this.f33806f != null) {
            b += nyu.m37145d(4, this.f33806f);
        }
        if (this.f33807g != null) {
            b += nyu.m37137b(5, this.f33807g);
        }
        if (this.f33808h != null) {
            b += nyu.m37137b(6, this.f33808h);
        }
        if (this.f33802b != null) {
            b += nyu.m37137b(7, this.f33802b);
        }
        if (this.f33803c != null) {
            return b + nyu.m37137b(8, this.f33803c);
        }
        return b;
    }

    private oqu m39239b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f33801a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    this.f33804d = nyt.m37117j();
                    continue;
                case wi.dA /*24*/:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                            this.f33805e = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 34:
                    if (this.f33806f == null) {
                        this.f33806f = new opf();
                    }
                    nyt.m37101a(this.f33806f);
                    continue;
                case 42:
                    this.f33807g = nyt.m37117j();
                    continue;
                case 50:
                    this.f33808h = nyt.m37117j();
                    continue;
                case 58:
                    this.f33802b = nyt.m37117j();
                    continue;
                case 66:
                    this.f33803c = nyt.m37117j();
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
