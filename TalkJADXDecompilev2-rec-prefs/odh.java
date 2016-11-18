package p000;

public final class odh extends nyx<odh> {
    private static volatile odh[] f32411d;
    public odi f32412a;
    public odj f32413b;
    public int f32414c;

    public /* synthetic */ nzf m37850a(nyt nyt) {
        return m37848b(nyt);
    }

    public static odh[] m37849d() {
        if (f32411d == null) {
            synchronized (nzc.f31309c) {
                if (f32411d == null) {
                    f32411d = new odh[0];
                }
            }
        }
        return f32411d;
    }

    public odh() {
        this.f32414c = nzf.UNSET_ENUM_VALUE;
        this.cachedSize = -1;
    }

    public void m37851a(nyu nyu) {
        if (this.f32412a != null) {
            nyu.m37182b(1, this.f32412a);
        }
        if (this.f32414c != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(2, this.f32414c);
        }
        if (this.f32413b != null) {
            nyu.m37182b(3, this.f32413b);
        }
        super.a(nyu);
    }

    protected int m37852b() {
        int b = super.b();
        if (this.f32412a != null) {
            b += nyu.m37145d(1, this.f32412a);
        }
        if (this.f32414c != nzf.UNSET_ENUM_VALUE) {
            b += nyu.m37147f(2, this.f32414c);
        }
        if (this.f32413b != null) {
            return b + nyu.m37145d(3, this.f32413b);
        }
        return b;
    }

    private odh m37848b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f32412a == null) {
                        this.f32412a = new odi();
                    }
                    nyt.m37101a(this.f32412a);
                    continue;
                case 16:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 45:
                            this.f32414c = a;
                            break;
                        default:
                            continue;
                    }
                case wi.dx /*26*/:
                    if (this.f32413b == null) {
                        this.f32413b = new odj();
                    }
                    nyt.m37101a(this.f32413b);
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
