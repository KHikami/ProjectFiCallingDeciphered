package p000;

public final class lne extends nyx<lne> {
    private static volatile lne[] f25754g;
    public Integer f25755a;
    public Integer f25756b;
    public Integer f25757c;
    public String f25758d;
    public byte[] f25759e;
    public Integer f25760f;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29587b(nyt);
    }

    public static lne[] m29588d() {
        if (f25754g == null) {
            synchronized (nzc.c) {
                if (f25754g == null) {
                    f25754g = new lne[0];
                }
            }
        }
        return f25754g;
    }

    public lne() {
        this.f25755a = null;
        this.f25756b = null;
        this.f25757c = null;
        this.f25758d = null;
        this.f25759e = null;
        this.f25760f = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f25755a != null) {
            nyu.c(1, this.f25755a.intValue());
        }
        if (this.f25756b != null) {
            nyu.c(2, this.f25756b.intValue());
        }
        if (this.f25757c != null) {
            nyu.c(3, this.f25757c.intValue());
        }
        if (this.f25758d != null) {
            nyu.a(4, this.f25758d);
        }
        if (this.f25759e != null) {
            nyu.a(5, this.f25759e);
        }
        if (this.f25760f != null) {
            nyu.c(6, this.f25760f.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f25755a != null) {
            b += nyu.g(1, this.f25755a.intValue());
        }
        if (this.f25756b != null) {
            b += nyu.g(2, this.f25756b.intValue());
        }
        if (this.f25757c != null) {
            b += nyu.g(3, this.f25757c.intValue());
        }
        if (this.f25758d != null) {
            b += nyu.b(4, this.f25758d);
        }
        if (this.f25759e != null) {
            b += nyu.b(5, this.f25759e);
        }
        if (this.f25760f != null) {
            return b + nyu.g(6, this.f25760f.intValue());
        }
        return b;
    }

    private lne m29587b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f25755a = Integer.valueOf(nyt.l());
                    continue;
                case 16:
                    this.f25756b = Integer.valueOf(nyt.l());
                    continue;
                case wi.dA /*24*/:
                    this.f25757c = Integer.valueOf(nyt.l());
                    continue;
                case 34:
                    this.f25758d = nyt.j();
                    continue;
                case 42:
                    this.f25759e = nyt.k();
                    continue;
                case 48:
                    this.f25760f = Integer.valueOf(nyt.l());
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
