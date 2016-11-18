package p000;

public final class nhy extends nyx<nhy> {
    private static volatile nhy[] f29856d;
    public Integer f29857a;
    public Boolean f29858b;
    public Boolean f29859c;

    public /* synthetic */ nzf m35036a(nyt nyt) {
        return m35033b(nyt);
    }

    public static nhy[] m35034d() {
        if (f29856d == null) {
            synchronized (nzc.f31309c) {
                if (f29856d == null) {
                    f29856d = new nhy[0];
                }
            }
        }
        return f29856d;
    }

    public nhy() {
        m35035g();
    }

    private nhy m35035g() {
        this.f29858b = null;
        this.f29859c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35037a(nyu nyu) {
        if (this.f29857a != null) {
            nyu.m37168a(1, this.f29857a.intValue());
        }
        if (this.f29859c != null) {
            nyu.m37172a(2, this.f29859c.booleanValue());
        }
        if (this.f29858b != null) {
            nyu.m37172a(3, this.f29858b.booleanValue());
        }
        super.a(nyu);
    }

    protected int m35038b() {
        int b = super.b();
        if (this.f29857a != null) {
            b += nyu.m37147f(1, this.f29857a.intValue());
        }
        if (this.f29859c != null) {
            this.f29859c.booleanValue();
            b += nyu.m37154h(2) + 1;
        }
        if (this.f29858b == null) {
            return b;
        }
        this.f29858b.booleanValue();
        return b + (nyu.m37154h(3) + 1);
    }

    private nhy m35033b(nyt nyt) {
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
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                            this.f29857a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 16:
                    this.f29859c = Boolean.valueOf(nyt.m37116i());
                    continue;
                case wi.dA /*24*/:
                    this.f29858b = Boolean.valueOf(nyt.m37116i());
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
