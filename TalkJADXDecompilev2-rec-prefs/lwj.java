package p000;

public final class lwj extends nyx<lwj> {
    public lwf f26681a;
    public String f26682b;
    public lod f26683c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30867b(nyt);
    }

    public lwj() {
        m30868d();
    }

    private lwj m30868d() {
        this.f26681a = null;
        this.f26682b = null;
        this.f26683c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26681a != null) {
            nyu.b(1, this.f26681a);
        }
        if (this.f26682b != null) {
            nyu.a(2, this.f26682b);
        }
        if (this.f26683c != null) {
            nyu.b(3, this.f26683c);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26681a != null) {
            b += nyu.d(1, this.f26681a);
        }
        if (this.f26682b != null) {
            b += nyu.b(2, this.f26682b);
        }
        if (this.f26683c != null) {
            return b + nyu.d(3, this.f26683c);
        }
        return b;
    }

    private lwj m30867b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f26681a == null) {
                        this.f26681a = new lwf();
                    }
                    nyt.a(this.f26681a);
                    continue;
                case wi.dH /*18*/:
                    this.f26682b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    if (this.f26683c == null) {
                        this.f26683c = new lod();
                    }
                    nyt.a(this.f26683c);
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
