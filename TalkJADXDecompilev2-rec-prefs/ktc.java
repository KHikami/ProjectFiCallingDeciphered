package p000;

public final class ktc extends nyx<ktc> {
    private static volatile ktc[] f23205f;
    public Double f23206a;
    public Double f23207b;
    public String f23208c;
    public String f23209d;
    public String f23210e;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27413b(nyt);
    }

    public static ktc[] m27414d() {
        if (f23205f == null) {
            synchronized (nzc.c) {
                if (f23205f == null) {
                    f23205f = new ktc[0];
                }
            }
        }
        return f23205f;
    }

    public ktc() {
        this.f23206a = null;
        this.f23207b = null;
        this.f23208c = null;
        this.f23209d = null;
        this.f23210e = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f23206a != null) {
            nyu.a(1, this.f23206a.doubleValue());
        }
        if (this.f23207b != null) {
            nyu.a(2, this.f23207b.doubleValue());
        }
        if (this.f23208c != null) {
            nyu.a(3, this.f23208c);
        }
        if (this.f23209d != null) {
            nyu.a(4, this.f23209d);
        }
        if (this.f23210e != null) {
            nyu.a(5, this.f23210e);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f23206a != null) {
            this.f23206a.doubleValue();
            b += nyu.h(1) + 8;
        }
        if (this.f23207b != null) {
            this.f23207b.doubleValue();
            b += nyu.h(2) + 8;
        }
        if (this.f23208c != null) {
            b += nyu.b(3, this.f23208c);
        }
        if (this.f23209d != null) {
            b += nyu.b(4, this.f23209d);
        }
        if (this.f23210e != null) {
            return b + nyu.b(5, this.f23210e);
        }
        return b;
    }

    private ktc m27413b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 9:
                    this.f23206a = Double.valueOf(nyt.b());
                    continue;
                case wi.dK /*17*/:
                    this.f23207b = Double.valueOf(nyt.b());
                    continue;
                case wi.dx /*26*/:
                    this.f23208c = nyt.j();
                    continue;
                case 34:
                    this.f23209d = nyt.j();
                    continue;
                case 42:
                    this.f23210e = nyt.j();
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
