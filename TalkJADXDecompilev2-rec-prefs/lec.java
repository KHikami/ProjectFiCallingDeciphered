package p000;

public final class lec extends nyx<lec> {
    public Integer f24789a;
    public String f24790b;
    public String f24791c;
    public Integer f24792d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28833b(nyt);
    }

    public lec() {
        m28834d();
    }

    private lec m28834d() {
        this.f24789a = null;
        this.f24790b = null;
        this.f24791c = null;
        this.f24792d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f24789a != null) {
            nyu.a(1, this.f24789a.intValue());
        }
        if (this.f24790b != null) {
            nyu.a(2, this.f24790b);
        }
        if (this.f24791c != null) {
            nyu.a(3, this.f24791c);
        }
        if (this.f24792d != null) {
            nyu.a(5, this.f24792d.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24789a != null) {
            b += nyu.f(1, this.f24789a.intValue());
        }
        if (this.f24790b != null) {
            b += nyu.b(2, this.f24790b);
        }
        if (this.f24791c != null) {
            b += nyu.b(3, this.f24791c);
        }
        if (this.f24792d != null) {
            return b + nyu.f(5, this.f24792d.intValue());
        }
        return b;
    }

    private lec m28833b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f24789a = Integer.valueOf(nyt.f());
                    continue;
                case wi.dH /*18*/:
                    this.f24790b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f24791c = nyt.j();
                    continue;
                case 40:
                    this.f24792d = Integer.valueOf(nyt.f());
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
