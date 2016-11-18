package p000;

public final class lqi extends nyx<lqi> {
    public lsf f26135a;
    public lsf f26136b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30035b(nyt);
    }

    public lqi() {
        m30036d();
    }

    private lqi m30036d() {
        this.f26135a = null;
        this.f26136b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26135a != null) {
            nyu.b(1, this.f26135a);
        }
        if (this.f26136b != null) {
            nyu.b(2, this.f26136b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26135a != null) {
            b += nyu.d(1, this.f26135a);
        }
        if (this.f26136b != null) {
            return b + nyu.d(2, this.f26136b);
        }
        return b;
    }

    private lqi m30035b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f26135a == null) {
                        this.f26135a = new lsf();
                    }
                    nyt.a(this.f26135a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f26136b == null) {
                        this.f26136b = new lsf();
                    }
                    nyt.a(this.f26136b);
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
