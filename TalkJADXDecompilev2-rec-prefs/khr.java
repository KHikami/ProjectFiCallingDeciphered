package p000;

public final class khr extends nyx<khr> {
    private static volatile khr[] f21783b;
    public Integer f21784a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m25880b(nyt);
    }

    public static khr[] m25881d() {
        if (f21783b == null) {
            synchronized (nzc.c) {
                if (f21783b == null) {
                    f21783b = new khr[0];
                }
            }
        }
        return f21783b;
    }

    public khr() {
        m25882g();
    }

    private khr m25882g() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f21784a != null) {
            nyu.a(1, this.f21784a.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f21784a != null) {
            return b + nyu.f(1, this.f21784a.intValue());
        }
        return b;
    }

    private khr m25880b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.f();
                    switch (a) {
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
                            this.f21784a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
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
