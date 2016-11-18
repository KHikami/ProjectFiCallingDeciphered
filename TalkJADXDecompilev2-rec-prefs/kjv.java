package p000;

public final class kjv extends nyx<kjv> {
    private static volatile kjv[] f21998d;
    public klk f21999a;
    public String f22000b;
    public String f22001c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26161b(nyt);
    }

    public static kjv[] m26162d() {
        if (f21998d == null) {
            synchronized (nzc.c) {
                if (f21998d == null) {
                    f21998d = new kjv[0];
                }
            }
        }
        return f21998d;
    }

    public kjv() {
        m26163g();
    }

    private kjv m26163g() {
        this.f21999a = null;
        this.f22000b = null;
        this.f22001c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f21999a != null) {
            nyu.b(1, this.f21999a);
        }
        if (this.f22000b != null) {
            nyu.a(2, this.f22000b);
        }
        if (this.f22001c != null) {
            nyu.a(3, this.f22001c);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f21999a != null) {
            b += nyu.d(1, this.f21999a);
        }
        if (this.f22000b != null) {
            b += nyu.b(2, this.f22000b);
        }
        if (this.f22001c != null) {
            return b + nyu.b(3, this.f22001c);
        }
        return b;
    }

    private kjv m26161b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f21999a == null) {
                        this.f21999a = new klk();
                    }
                    nyt.a(this.f21999a);
                    continue;
                case wi.dH /*18*/:
                    this.f22000b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f22001c = nyt.j();
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
