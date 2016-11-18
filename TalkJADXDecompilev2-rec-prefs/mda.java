package p000;

public final class mda extends nyx<mda> {
    public String f27431a;
    public Boolean f27432b;
    public Boolean f27433c;
    public Boolean f27434d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31800b(nyt);
    }

    public mda() {
        m31801d();
    }

    private mda m31801d() {
        this.f27431a = null;
        this.f27432b = null;
        this.f27433c = null;
        this.f27434d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f27431a != null) {
            nyu.a(1, this.f27431a);
        }
        if (this.f27432b != null) {
            nyu.a(2, this.f27432b.booleanValue());
        }
        if (this.f27433c != null) {
            nyu.a(3, this.f27433c.booleanValue());
        }
        if (this.f27434d != null) {
            nyu.a(4, this.f27434d.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f27431a != null) {
            b += nyu.b(1, this.f27431a);
        }
        if (this.f27432b != null) {
            this.f27432b.booleanValue();
            b += nyu.h(2) + 1;
        }
        if (this.f27433c != null) {
            this.f27433c.booleanValue();
            b += nyu.h(3) + 1;
        }
        if (this.f27434d == null) {
            return b;
        }
        this.f27434d.booleanValue();
        return b + (nyu.h(4) + 1);
    }

    private mda m31800b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f27431a = nyt.j();
                    continue;
                case 16:
                    this.f27432b = Boolean.valueOf(nyt.i());
                    continue;
                case wi.dA /*24*/:
                    this.f27433c = Boolean.valueOf(nyt.i());
                    continue;
                case 32:
                    this.f27434d = Boolean.valueOf(nyt.i());
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
