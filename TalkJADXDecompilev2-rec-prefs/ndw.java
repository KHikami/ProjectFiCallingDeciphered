package p000;

public final class ndw extends nyx<ndw> {
    private static volatile ndw[] f29583b;
    public Integer f29584a;

    public /* synthetic */ nzf m34485a(nyt nyt) {
        return m34482b(nyt);
    }

    public static ndw[] m34483d() {
        if (f29583b == null) {
            synchronized (nzc.f31309c) {
                if (f29583b == null) {
                    f29583b = new ndw[0];
                }
            }
        }
        return f29583b;
    }

    public ndw() {
        m34484g();
    }

    private ndw m34484g() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34486a(nyu nyu) {
        if (this.f29584a != null) {
            nyu.m37168a(1, this.f29584a.intValue());
        }
        super.a(nyu);
    }

    protected int m34487b() {
        int b = super.b();
        if (this.f29584a != null) {
            return b + nyu.m37147f(1, this.f29584a.intValue());
        }
        return b;
    }

    private ndw m34482b(nyt nyt) {
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
                        case wi.dL /*19*/:
                            this.f29584a = Integer.valueOf(a);
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
