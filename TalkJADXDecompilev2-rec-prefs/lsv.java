package p000;

public final class lsv extends nyx<lsv> {
    public lsw f26346a;
    public lsx f26347b;
    public lsy f26348c;
    public lod f26349d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30377b(nyt);
    }

    public lsv() {
        m30378d();
    }

    private lsv m30378d() {
        this.f26346a = null;
        this.f26347b = null;
        this.f26348c = null;
        this.f26349d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26347b != null) {
            nyu.b(1, this.f26347b);
        }
        if (this.f26348c != null) {
            nyu.b(2, this.f26348c);
        }
        if (this.f26346a != null) {
            nyu.b(3, this.f26346a);
        }
        if (this.f26349d != null) {
            nyu.b(4, this.f26349d);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26347b != null) {
            b += nyu.d(1, this.f26347b);
        }
        if (this.f26348c != null) {
            b += nyu.d(2, this.f26348c);
        }
        if (this.f26346a != null) {
            b += nyu.d(3, this.f26346a);
        }
        if (this.f26349d != null) {
            return b + nyu.d(4, this.f26349d);
        }
        return b;
    }

    private lsv m30377b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f26347b == null) {
                        this.f26347b = new lsx();
                    }
                    nyt.a(this.f26347b);
                    continue;
                case wi.dH /*18*/:
                    if (this.f26348c == null) {
                        this.f26348c = new lsy();
                    }
                    nyt.a(this.f26348c);
                    continue;
                case wi.dx /*26*/:
                    if (this.f26346a == null) {
                        this.f26346a = new lsw();
                    }
                    nyt.a(this.f26346a);
                    continue;
                case 34:
                    if (this.f26349d == null) {
                        this.f26349d = new lod();
                    }
                    nyt.a(this.f26349d);
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
