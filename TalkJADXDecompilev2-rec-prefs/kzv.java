package p000;

public final class kzv extends nyx<kzv> {
    public kid f24303a;
    public String f24304b;
    public kig f24305c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28288b(nyt);
    }

    public kzv() {
        m28289d();
    }

    private kzv m28289d() {
        this.f24303a = null;
        this.f24304b = null;
        this.f24305c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f24303a != null) {
            nyu.b(1, this.f24303a);
        }
        if (this.f24304b != null) {
            nyu.a(2, this.f24304b);
        }
        if (this.f24305c != null) {
            nyu.b(3, this.f24305c);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24303a != null) {
            b += nyu.d(1, this.f24303a);
        }
        if (this.f24304b != null) {
            b += nyu.b(2, this.f24304b);
        }
        if (this.f24305c != null) {
            return b + nyu.d(3, this.f24305c);
        }
        return b;
    }

    private kzv m28288b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f24303a == null) {
                        this.f24303a = new kid();
                    }
                    nyt.a(this.f24303a);
                    continue;
                case wi.dH /*18*/:
                    this.f24304b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    if (this.f24305c == null) {
                        this.f24305c = new kig();
                    }
                    nyt.a(this.f24305c);
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
