package p000;

public final class loe extends nyx<loe> {
    public String f25857a;
    public String f25858b;
    public String f25859c;
    public String f25860d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29722b(nyt);
    }

    public loe() {
        m29723d();
    }

    private loe m29723d() {
        this.f25857a = null;
        this.f25858b = null;
        this.f25859c = null;
        this.f25860d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f25857a != null) {
            nyu.a(1, this.f25857a);
        }
        if (this.f25858b != null) {
            nyu.a(2, this.f25858b);
        }
        if (this.f25859c != null) {
            nyu.a(3, this.f25859c);
        }
        if (this.f25860d != null) {
            nyu.a(4, this.f25860d);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f25857a != null) {
            b += nyu.b(1, this.f25857a);
        }
        if (this.f25858b != null) {
            b += nyu.b(2, this.f25858b);
        }
        if (this.f25859c != null) {
            b += nyu.b(3, this.f25859c);
        }
        if (this.f25860d != null) {
            return b + nyu.b(4, this.f25860d);
        }
        return b;
    }

    private loe m29722b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f25857a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f25858b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f25859c = nyt.j();
                    continue;
                case 34:
                    this.f25860d = nyt.j();
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
