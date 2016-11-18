package p000;

public final class knn extends nyx<knn> {
    public kog f22427a;
    public kmr apiHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26688b(nyt);
    }

    public knn() {
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.apiHeader != null) {
            nyu.b(1, this.apiHeader);
        }
        if (this.f22427a != null) {
            nyu.b(2, this.f22427a);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.apiHeader != null) {
            b += nyu.d(1, this.apiHeader);
        }
        if (this.f22427a != null) {
            return b + nyu.d(2, this.f22427a);
        }
        return b;
    }

    private knn m26688b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.apiHeader == null) {
                        this.apiHeader = new kmr();
                    }
                    nyt.a(this.apiHeader);
                    continue;
                case wi.dH /*18*/:
                    if (this.f22427a == null) {
                        this.f22427a = new kog();
                    }
                    nyt.a(this.f22427a);
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
