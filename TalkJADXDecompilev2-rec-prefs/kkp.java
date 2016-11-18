package p000;

public final class kkp extends nyx<kkp> {
    private static volatile kkp[] f22077d;
    public Integer f22078a;
    public Integer f22079b;
    public String f22080c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26274b(nyt);
    }

    public static kkp[] m26275d() {
        if (f22077d == null) {
            synchronized (nzc.c) {
                if (f22077d == null) {
                    f22077d = new kkp[0];
                }
            }
        }
        return f22077d;
    }

    public kkp() {
        m26276g();
    }

    private kkp m26276g() {
        this.f22079b = null;
        this.f22080c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22078a != null) {
            nyu.a(1, this.f22078a.intValue());
        }
        if (this.f22079b != null) {
            nyu.a(2, this.f22079b.intValue());
        }
        if (this.f22080c != null) {
            nyu.a(3, this.f22080c);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22078a != null) {
            b += nyu.f(1, this.f22078a.intValue());
        }
        if (this.f22079b != null) {
            b += nyu.f(2, this.f22079b.intValue());
        }
        if (this.f22080c != null) {
            return b + nyu.b(3, this.f22080c);
        }
        return b;
    }

    private kkp m26274b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f22078a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 16:
                    this.f22079b = Integer.valueOf(nyt.f());
                    continue;
                case wi.dx /*26*/:
                    this.f22080c = nyt.j();
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
