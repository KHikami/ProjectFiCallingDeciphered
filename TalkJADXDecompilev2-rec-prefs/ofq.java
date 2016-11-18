package p000;

public final class ofq extends nyx<ofq> {
    private static volatile ofq[] f32659g;
    public int f32660a;
    public String f32661b;
    public ofn f32662c;
    public ofp f32663d;
    public ofy f32664e;
    public ofo f32665f;

    public /* synthetic */ nzf m38096a(nyt nyt) {
        return m38094b(nyt);
    }

    public static ofq[] m38095d() {
        if (f32659g == null) {
            synchronized (nzc.f31309c) {
                if (f32659g == null) {
                    f32659g = new ofq[0];
                }
            }
        }
        return f32659g;
    }

    public ofq() {
        this.f32660a = nzf.UNSET_ENUM_VALUE;
        this.f32661b = null;
        this.cachedSize = -1;
    }

    public void m38097a(nyu nyu) {
        if (this.f32660a != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(1, this.f32660a);
        }
        if (this.f32661b != null) {
            nyu.m37170a(2, this.f32661b);
        }
        if (this.f32662c != null) {
            nyu.m37182b(3, this.f32662c);
        }
        if (this.f32663d != null) {
            nyu.m37182b(4, this.f32663d);
        }
        if (this.f32664e != null) {
            nyu.m37182b(5, this.f32664e);
        }
        if (this.f32665f != null) {
            nyu.m37182b(6, this.f32665f);
        }
        super.a(nyu);
    }

    protected int m38098b() {
        int b = super.b();
        if (this.f32660a != nzf.UNSET_ENUM_VALUE) {
            b += nyu.m37147f(1, this.f32660a);
        }
        if (this.f32661b != null) {
            b += nyu.m37137b(2, this.f32661b);
        }
        if (this.f32662c != null) {
            b += nyu.m37145d(3, this.f32662c);
        }
        if (this.f32663d != null) {
            b += nyu.m37145d(4, this.f32663d);
        }
        if (this.f32664e != null) {
            b += nyu.m37145d(5, this.f32664e);
        }
        if (this.f32665f != null) {
            return b + nyu.m37145d(6, this.f32665f);
        }
        return b;
    }

    private ofq m38094b(nyt nyt) {
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
                            this.f32660a = a;
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    this.f32661b = nyt.m37117j();
                    continue;
                case wi.dx /*26*/:
                    if (this.f32662c == null) {
                        this.f32662c = new ofn();
                    }
                    nyt.m37101a(this.f32662c);
                    continue;
                case 34:
                    if (this.f32663d == null) {
                        this.f32663d = new ofp();
                    }
                    nyt.m37101a(this.f32663d);
                    continue;
                case 42:
                    if (this.f32664e == null) {
                        this.f32664e = new ofy();
                    }
                    nyt.m37101a(this.f32664e);
                    continue;
                case 50:
                    if (this.f32665f == null) {
                        this.f32665f = new ofo();
                    }
                    nyt.m37101a(this.f32665f);
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
