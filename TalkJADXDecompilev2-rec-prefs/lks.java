package p000;

public final class lks extends nyx<lks> {
    public Integer f25212a;
    public Integer f25213b;
    public Integer f25214c;
    public Integer f25215d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29260b(nyt);
    }

    public lks() {
        m29261d();
    }

    private lks m29261d() {
        this.f25212a = null;
        this.f25213b = null;
        this.f25214c = null;
        this.f25215d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f25212a != null) {
            nyu.a(1, this.f25212a.intValue());
        }
        if (this.f25213b != null) {
            nyu.a(2, this.f25213b.intValue());
        }
        if (this.f25214c != null) {
            nyu.a(3, this.f25214c.intValue());
        }
        if (this.f25215d != null) {
            nyu.a(4, this.f25215d.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f25212a != null) {
            b += nyu.f(1, this.f25212a.intValue());
        }
        if (this.f25213b != null) {
            b += nyu.f(2, this.f25213b.intValue());
        }
        if (this.f25214c != null) {
            b += nyu.f(3, this.f25214c.intValue());
        }
        if (this.f25215d != null) {
            return b + nyu.f(4, this.f25215d.intValue());
        }
        return b;
    }

    private lks m29260b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f25212a = Integer.valueOf(nyt.f());
                    continue;
                case 16:
                    this.f25213b = Integer.valueOf(nyt.f());
                    continue;
                case wi.dA /*24*/:
                    this.f25214c = Integer.valueOf(nyt.f());
                    continue;
                case 32:
                    this.f25215d = Integer.valueOf(nyt.f());
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
