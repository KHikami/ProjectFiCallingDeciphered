package p000;

public final class kjr extends nyx<kjr> {
    private static volatile kjr[] f21969e;
    public klk f21970a;
    public String f21971b;
    public String f21972c;
    public String f21973d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26137b(nyt);
    }

    public static kjr[] m26138d() {
        if (f21969e == null) {
            synchronized (nzc.c) {
                if (f21969e == null) {
                    f21969e = new kjr[0];
                }
            }
        }
        return f21969e;
    }

    public kjr() {
        m26139g();
    }

    private kjr m26139g() {
        this.f21970a = null;
        this.f21971b = null;
        this.f21972c = null;
        this.f21973d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f21970a != null) {
            nyu.b(1, this.f21970a);
        }
        if (this.f21971b != null) {
            nyu.a(2, this.f21971b);
        }
        if (this.f21972c != null) {
            nyu.a(3, this.f21972c);
        }
        if (this.f21973d != null) {
            nyu.a(4, this.f21973d);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f21970a != null) {
            b += nyu.d(1, this.f21970a);
        }
        if (this.f21971b != null) {
            b += nyu.b(2, this.f21971b);
        }
        if (this.f21972c != null) {
            b += nyu.b(3, this.f21972c);
        }
        if (this.f21973d != null) {
            return b + nyu.b(4, this.f21973d);
        }
        return b;
    }

    private kjr m26137b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f21970a == null) {
                        this.f21970a = new klk();
                    }
                    nyt.a(this.f21970a);
                    continue;
                case wi.dH /*18*/:
                    this.f21971b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f21972c = nyt.j();
                    continue;
                case 34:
                    this.f21973d = nyt.j();
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
