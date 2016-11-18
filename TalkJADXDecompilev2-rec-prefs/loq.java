package p000;

public final class loq extends nyx<loq> {
    public lor f25929a;
    public lpk f25930b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29786b(nyt);
    }

    public loq() {
        m29787d();
    }

    private loq m29787d() {
        this.f25929a = null;
        this.f25930b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f25929a != null) {
            nyu.b(1, this.f25929a);
        }
        if (this.f25930b != null) {
            nyu.b(2, this.f25930b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f25929a != null) {
            b += nyu.d(1, this.f25929a);
        }
        if (this.f25930b != null) {
            return b + nyu.d(2, this.f25930b);
        }
        return b;
    }

    private loq m29786b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f25929a == null) {
                        this.f25929a = new lor();
                    }
                    nyt.a(this.f25929a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f25930b == null) {
                        this.f25930b = new lpk();
                    }
                    nyt.a(this.f25930b);
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
