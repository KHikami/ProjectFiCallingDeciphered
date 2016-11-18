package p000;

public final class lwc extends nyx<lwc> {
    public ltu f26635a;
    public Boolean f26636b;
    public Integer f26637c;
    public luq responseHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30831b(nyt);
    }

    public lwc() {
        m30832d();
    }

    private lwc m30832d() {
        this.responseHeader = null;
        this.f26635a = null;
        this.f26636b = null;
        this.f26637c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.responseHeader != null) {
            nyu.b(1, this.responseHeader);
        }
        if (this.f26635a != null) {
            nyu.b(2, this.f26635a);
        }
        if (this.f26636b != null) {
            nyu.a(3, this.f26636b.booleanValue());
        }
        if (this.f26637c != null) {
            nyu.c(4, this.f26637c.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.responseHeader != null) {
            b += nyu.d(1, this.responseHeader);
        }
        if (this.f26635a != null) {
            b += nyu.d(2, this.f26635a);
        }
        if (this.f26636b != null) {
            this.f26636b.booleanValue();
            b += nyu.h(3) + 1;
        }
        if (this.f26637c != null) {
            return b + nyu.g(4, this.f26637c.intValue());
        }
        return b;
    }

    private lwc m30831b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.responseHeader == null) {
                        this.responseHeader = new luq();
                    }
                    nyt.a(this.responseHeader);
                    continue;
                case wi.dH /*18*/:
                    if (this.f26635a == null) {
                        this.f26635a = new ltu();
                    }
                    nyt.a(this.f26635a);
                    continue;
                case wi.dA /*24*/:
                    this.f26636b = Boolean.valueOf(nyt.i());
                    continue;
                case 32:
                    this.f26637c = Integer.valueOf(nyt.l());
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
