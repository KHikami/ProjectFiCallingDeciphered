package p000;

public final class mus extends nyx<mus> {
    private static volatile mus[] f28403e;
    public muu f28404a;
    public muw f28405b;
    public String f28406c;
    public String f28407d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m32998b(nyt);
    }

    public static mus[] m32999d() {
        if (f28403e == null) {
            synchronized (nzc.c) {
                if (f28403e == null) {
                    f28403e = new mus[0];
                }
            }
        }
        return f28403e;
    }

    public mus() {
        m33000g();
    }

    private mus m33000g() {
        this.f28404a = null;
        this.f28405b = null;
        this.f28406c = null;
        this.f28407d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f28404a != null) {
            nyu.b(1, this.f28404a);
        }
        if (this.f28405b != null) {
            nyu.b(2, this.f28405b);
        }
        if (this.f28406c != null) {
            nyu.a(3, this.f28406c);
        }
        if (this.f28407d != null) {
            nyu.a(4, this.f28407d);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f28404a != null) {
            b += nyu.d(1, this.f28404a);
        }
        if (this.f28405b != null) {
            b += nyu.d(2, this.f28405b);
        }
        if (this.f28406c != null) {
            b += nyu.b(3, this.f28406c);
        }
        if (this.f28407d != null) {
            return b + nyu.b(4, this.f28407d);
        }
        return b;
    }

    private mus m32998b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f28404a == null) {
                        this.f28404a = new muu();
                    }
                    nyt.a(this.f28404a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f28405b == null) {
                        this.f28405b = new muw();
                    }
                    nyt.a(this.f28405b);
                    continue;
                case wi.dx /*26*/:
                    this.f28406c = nyt.j();
                    continue;
                case 34:
                    this.f28407d = nyt.j();
                    continue;
                default:
                    if (!super.m1039a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
