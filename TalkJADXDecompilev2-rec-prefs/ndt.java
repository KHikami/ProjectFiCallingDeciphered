package p000;

public final class ndt extends nyx<ndt> {
    private static volatile ndt[] f29577b;
    public Integer f29578a;

    public /* synthetic */ nzf m34467a(nyt nyt) {
        return m34464b(nyt);
    }

    public static ndt[] m34465d() {
        if (f29577b == null) {
            synchronized (nzc.f31309c) {
                if (f29577b == null) {
                    f29577b = new ndt[0];
                }
            }
        }
        return f29577b;
    }

    public ndt() {
        m34466g();
    }

    private ndt m34466g() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34468a(nyu nyu) {
        if (this.f29578a != null) {
            nyu.m37168a(1, this.f29578a.intValue());
        }
        super.a(nyu);
    }

    protected int m34469b() {
        int b = super.b();
        if (this.f29578a != null) {
            return b + nyu.m37147f(1, this.f29578a.intValue());
        }
        return b;
    }

    private ndt m34464b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case wi.dK /*17*/:
                        case wi.dH /*18*/:
                            this.f29578a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
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
