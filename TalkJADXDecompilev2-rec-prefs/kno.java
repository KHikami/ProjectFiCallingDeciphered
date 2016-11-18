package p000;

public final class kno extends nyx<kno> {
    public koh f22428a;
    public kms apiHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26695b(nyt);
    }

    public kno() {
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.apiHeader != null) {
            nyu.b(1, this.apiHeader);
        }
        if (this.f22428a != null) {
            nyu.b(2, this.f22428a);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.apiHeader != null) {
            b += nyu.d(1, this.apiHeader);
        }
        if (this.f22428a != null) {
            return b + nyu.d(2, this.f22428a);
        }
        return b;
    }

    public kno m26695b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.apiHeader == null) {
                        this.apiHeader = new kms();
                    }
                    nyt.a(this.apiHeader);
                    continue;
                case wi.dH /*18*/:
                    if (this.f22428a == null) {
                        this.f22428a = new koh();
                    }
                    nyt.a(this.f22428a);
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
