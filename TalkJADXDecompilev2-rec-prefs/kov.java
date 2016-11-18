package p000;

public final class kov extends nyx<kov> {
    public ksn f22582a;
    public kuv f22583b;
    public Boolean f22584c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26841b(nyt);
    }

    public kov() {
        m26842d();
    }

    private kov m26842d() {
        this.f22582a = null;
        this.f22583b = null;
        this.f22584c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22582a != null) {
            nyu.b(1, this.f22582a);
        }
        if (this.f22584c != null) {
            nyu.a(2, this.f22584c.booleanValue());
        }
        if (this.f22583b != null) {
            nyu.b(3, this.f22583b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22582a != null) {
            b += nyu.d(1, this.f22582a);
        }
        if (this.f22584c != null) {
            this.f22584c.booleanValue();
            b += nyu.h(2) + 1;
        }
        if (this.f22583b != null) {
            return b + nyu.d(3, this.f22583b);
        }
        return b;
    }

    private kov m26841b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f22582a == null) {
                        this.f22582a = new ksn();
                    }
                    nyt.a(this.f22582a);
                    continue;
                case 16:
                    this.f22584c = Boolean.valueOf(nyt.i());
                    continue;
                case wi.dx /*26*/:
                    if (this.f22583b == null) {
                        this.f22583b = new kuv();
                    }
                    nyt.a(this.f22583b);
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
