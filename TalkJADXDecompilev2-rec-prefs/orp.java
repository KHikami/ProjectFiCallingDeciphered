package p000;

public final class orp extends nyx<orp> {
    private static volatile orp[] f34055e;
    public Integer f34056a;
    public Integer f34057b;
    public Integer f34058c;
    public String f34059d;

    public /* synthetic */ nzf m39462a(nyt nyt) {
        return m39459b(nyt);
    }

    public static orp[] m39460d() {
        if (f34055e == null) {
            synchronized (nzc.f31309c) {
                if (f34055e == null) {
                    f34055e = new orp[0];
                }
            }
        }
        return f34055e;
    }

    public orp() {
        m39461g();
    }

    private orp m39461g() {
        this.f34057b = null;
        this.f34058c = null;
        this.f34059d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39463a(nyu nyu) {
        if (this.f34056a != null) {
            nyu.m37168a(1, this.f34056a.intValue());
        }
        if (this.f34057b != null) {
            nyu.m37168a(2, this.f34057b.intValue());
        }
        if (this.f34058c != null) {
            nyu.m37168a(3, this.f34058c.intValue());
        }
        if (this.f34059d != null) {
            nyu.m37170a(1099, this.f34059d);
        }
        super.a(nyu);
    }

    protected int m39464b() {
        int b = super.b();
        if (this.f34056a != null) {
            b += nyu.m37147f(1, this.f34056a.intValue());
        }
        if (this.f34057b != null) {
            b += nyu.m37147f(2, this.f34057b.intValue());
        }
        if (this.f34058c != null) {
            b += nyu.m37147f(3, this.f34058c.intValue());
        }
        if (this.f34059d != null) {
            return b + nyu.m37137b(1099, this.f34059d);
        }
        return b;
    }

    private orp m39459b(nyt nyt) {
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
                        case 20:
                        case 21:
                        case 22:
                        case wi.f29038do /*23*/:
                        case wi.dA /*24*/:
                        case wi.dz /*25*/:
                        case wi.dx /*26*/:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                        case 50:
                        case 51:
                        case 52:
                        case 53:
                        case 54:
                        case 55:
                        case 56:
                        case 57:
                        case 58:
                        case 59:
                        case 60:
                        case 61:
                        case 62:
                        case 63:
                        case 64:
                        case 65:
                        case 66:
                        case 67:
                        case 68:
                        case 69:
                        case 70:
                        case 71:
                        case 72:
                        case 73:
                        case 74:
                        case 75:
                        case 76:
                        case 77:
                        case 78:
                        case wi.ai /*79*/:
                        case 80:
                        case 81:
                        case 82:
                        case 83:
                        case 84:
                        case 85:
                        case 86:
                        case 87:
                        case 88:
                        case 89:
                        case 90:
                        case 91:
                        case 92:
                        case 93:
                        case 94:
                        case 95:
                        case 96:
                        case 97:
                        case 98:
                            this.f34056a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 16:
                    this.f34057b = Integer.valueOf(nyt.m37112f());
                    continue;
                case wi.dA /*24*/:
                    this.f34058c = Integer.valueOf(nyt.m37112f());
                    continue;
                case 8794:
                    this.f34059d = nyt.m37117j();
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
