package p000;

public final class lng extends nyx<lng> {
    public int f25762a;
    public lnh f25763b;
    public oev f25764c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29597b(nyt);
    }

    public lng() {
        m29598d();
    }

    private lng m29598d() {
        this.f25762a = 0;
        this.f25763b = null;
        this.f25764c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f25762a != 0) {
            nyu.a(1, this.f25762a);
        }
        if (this.f25763b != null) {
            nyu.b(2, this.f25763b);
        }
        if (this.f25764c != null) {
            nyu.b(3, this.f25764c);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f25762a != 0) {
            b += nyu.f(1, this.f25762a);
        }
        if (this.f25763b != null) {
            b += nyu.d(2, this.f25763b);
        }
        if (this.f25764c != null) {
            return b + nyu.d(3, this.f25764c);
        }
        return b;
    }

    private lng m29597b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f25762a = nyt.f();
                    continue;
                case wi.dH /*18*/:
                    if (this.f25763b == null) {
                        this.f25763b = new lnh();
                    }
                    nyt.a(this.f25763b);
                    continue;
                case wi.dx /*26*/:
                    if (this.f25764c == null) {
                        this.f25764c = new oev();
                    }
                    nyt.a(this.f25764c);
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
