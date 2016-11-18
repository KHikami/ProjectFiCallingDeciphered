package p000;

public final class ley extends nyx<ley> {
    public len f24879a;
    public Boolean f24880b;
    public kis f24881c;
    public Boolean f24882d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28945b(nyt);
    }

    public ley() {
        m28946d();
    }

    private ley m28946d() {
        this.f24879a = null;
        this.f24880b = null;
        this.f24881c = null;
        this.f24882d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f24879a != null) {
            nyu.b(1, this.f24879a);
        }
        if (this.f24880b != null) {
            nyu.a(2, this.f24880b.booleanValue());
        }
        if (this.f24881c != null) {
            nyu.b(3, this.f24881c);
        }
        if (this.f24882d != null) {
            nyu.a(4, this.f24882d.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24879a != null) {
            b += nyu.d(1, this.f24879a);
        }
        if (this.f24880b != null) {
            this.f24880b.booleanValue();
            b += nyu.h(2) + 1;
        }
        if (this.f24881c != null) {
            b += nyu.d(3, this.f24881c);
        }
        if (this.f24882d == null) {
            return b;
        }
        this.f24882d.booleanValue();
        return b + (nyu.h(4) + 1);
    }

    private ley m28945b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f24879a == null) {
                        this.f24879a = new len();
                    }
                    nyt.a(this.f24879a);
                    continue;
                case 16:
                    this.f24880b = Boolean.valueOf(nyt.i());
                    continue;
                case wi.dx /*26*/:
                    if (this.f24881c == null) {
                        this.f24881c = new kis();
                    }
                    nyt.a(this.f24881c);
                    continue;
                case 32:
                    this.f24882d = Boolean.valueOf(nyt.i());
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
