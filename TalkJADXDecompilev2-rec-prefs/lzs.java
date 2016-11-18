package p000;

public final class lzs extends nyx<lzs> {
    private static volatile lzs[] f27035c;
    public String f27036a;
    public String f27037b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31326b(nyt);
    }

    public static lzs[] m31327d() {
        if (f27035c == null) {
            synchronized (nzc.c) {
                if (f27035c == null) {
                    f27035c = new lzs[0];
                }
            }
        }
        return f27035c;
    }

    public lzs() {
        m31328g();
    }

    private lzs m31328g() {
        this.f27036a = null;
        this.f27037b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f27036a != null) {
            nyu.a(1, this.f27036a);
        }
        if (this.f27037b != null) {
            nyu.a(2, this.f27037b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f27036a != null) {
            b += nyu.b(1, this.f27036a);
        }
        if (this.f27037b != null) {
            return b + nyu.b(2, this.f27037b);
        }
        return b;
    }

    private lzs m31326b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f27036a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f27037b = nyt.j();
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
