package p000;

public final class lsq extends nyx<lsq> {
    public oaq f26337a;
    public byte[] f26338b;
    public lod f26339c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30351b(nyt);
    }

    public lsq() {
        m30352d();
    }

    private lsq m30352d() {
        this.f26337a = null;
        this.f26338b = null;
        this.f26339c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26337a != null) {
            nyu.b(1, this.f26337a);
        }
        if (this.f26338b != null) {
            nyu.a(2, this.f26338b);
        }
        if (this.f26339c != null) {
            nyu.b(3, this.f26339c);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26337a != null) {
            b += nyu.d(1, this.f26337a);
        }
        if (this.f26338b != null) {
            b += nyu.b(2, this.f26338b);
        }
        if (this.f26339c != null) {
            return b + nyu.d(3, this.f26339c);
        }
        return b;
    }

    private lsq m30351b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f26337a == null) {
                        this.f26337a = new oaq();
                    }
                    nyt.a(this.f26337a);
                    continue;
                case wi.dH /*18*/:
                    this.f26338b = nyt.k();
                    continue;
                case wi.dx /*26*/:
                    if (this.f26339c == null) {
                        this.f26339c = new lod();
                    }
                    nyt.a(this.f26339c);
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
