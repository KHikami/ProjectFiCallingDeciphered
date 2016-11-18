package p000;

public final class lzd extends nyx<lzd> {
    public String f26983a;
    public String f26984b;
    public String f26985c;
    public String f26986d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31244b(nyt);
    }

    public lzd() {
        m31245d();
    }

    private lzd m31245d() {
        this.f26983a = null;
        this.f26984b = null;
        this.f26985c = null;
        this.f26986d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26983a != null) {
            nyu.a(1, this.f26983a);
        }
        if (this.f26984b != null) {
            nyu.a(2, this.f26984b);
        }
        if (this.f26985c != null) {
            nyu.a(3, this.f26985c);
        }
        if (this.f26986d != null) {
            nyu.a(4, this.f26986d);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26983a != null) {
            b += nyu.b(1, this.f26983a);
        }
        if (this.f26984b != null) {
            b += nyu.b(2, this.f26984b);
        }
        if (this.f26985c != null) {
            b += nyu.b(3, this.f26985c);
        }
        if (this.f26986d != null) {
            return b + nyu.b(4, this.f26986d);
        }
        return b;
    }

    private lzd m31244b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f26983a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f26984b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f26985c = nyt.j();
                    continue;
                case 34:
                    this.f26986d = nyt.j();
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
