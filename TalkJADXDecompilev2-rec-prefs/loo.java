package p000;

public final class loo extends nyx<loo> {
    private static volatile loo[] f25922d;
    public lpk f25923a;
    public Boolean f25924b;
    public Boolean f25925c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29775b(nyt);
    }

    public static loo[] m29776d() {
        if (f25922d == null) {
            synchronized (nzc.c) {
                if (f25922d == null) {
                    f25922d = new loo[0];
                }
            }
        }
        return f25922d;
    }

    public loo() {
        m29777g();
    }

    private loo m29777g() {
        this.f25923a = null;
        this.f25924b = null;
        this.f25925c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f25923a != null) {
            nyu.b(1, this.f25923a);
        }
        if (this.f25924b != null) {
            nyu.a(2, this.f25924b.booleanValue());
        }
        if (this.f25925c != null) {
            nyu.a(3, this.f25925c.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f25923a != null) {
            b += nyu.d(1, this.f25923a);
        }
        if (this.f25924b != null) {
            this.f25924b.booleanValue();
            b += nyu.h(2) + 1;
        }
        if (this.f25925c == null) {
            return b;
        }
        this.f25925c.booleanValue();
        return b + (nyu.h(3) + 1);
    }

    private loo m29775b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f25923a == null) {
                        this.f25923a = new lpk();
                    }
                    nyt.a(this.f25923a);
                    continue;
                case 16:
                    this.f25924b = Boolean.valueOf(nyt.i());
                    continue;
                case wi.dA /*24*/:
                    this.f25925c = Boolean.valueOf(nyt.i());
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
