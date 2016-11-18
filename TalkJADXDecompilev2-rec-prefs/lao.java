package p000;

public final class lao extends nyx<lao> {
    private static volatile lao[] f24399d;
    public String f24400a;
    public String f24401b;
    public String f24402c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28380b(nyt);
    }

    public static lao[] m28381d() {
        if (f24399d == null) {
            synchronized (nzc.c) {
                if (f24399d == null) {
                    f24399d = new lao[0];
                }
            }
        }
        return f24399d;
    }

    public lao() {
        this.f24400a = null;
        this.f24401b = null;
        this.f24402c = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        nyu.a(1, this.f24400a);
        nyu.a(2, this.f24401b);
        if (this.f24402c != null) {
            nyu.a(3, this.f24402c);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = (super.mo147b() + nyu.b(1, this.f24400a)) + nyu.b(2, this.f24401b);
        if (this.f24402c != null) {
            return b + nyu.b(3, this.f24402c);
        }
        return b;
    }

    private lao m28380b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f24400a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f24401b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f24402c = nyt.j();
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
