package p000;

public final class lzh extends nyx<lzh> {
    private static volatile lzh[] f26995c;
    public String f26996a;
    public String f26997b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31266b(nyt);
    }

    public static lzh[] m31267d() {
        if (f26995c == null) {
            synchronized (nzc.c) {
                if (f26995c == null) {
                    f26995c = new lzh[0];
                }
            }
        }
        return f26995c;
    }

    public lzh() {
        m31268g();
    }

    private lzh m31268g() {
        this.f26996a = null;
        this.f26997b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26996a != null) {
            nyu.a(1, this.f26996a);
        }
        if (this.f26997b != null) {
            nyu.a(2, this.f26997b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26996a != null) {
            b += nyu.b(1, this.f26996a);
        }
        if (this.f26997b != null) {
            return b + nyu.b(2, this.f26997b);
        }
        return b;
    }

    private lzh m31266b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f26996a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f26997b = nyt.j();
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
