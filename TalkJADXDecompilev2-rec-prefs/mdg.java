package p000;

public final class mdg extends nyx<mdg> {
    public mcv f27447a = new mcv();
    public mdq f27448b;
    public mcc f27449c;
    public mdf f27450d;
    public off f27451e;
    public mca f27452f;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31830b(nyt);
    }

    public mdg() {
        m31831d();
    }

    private mdg m31831d() {
        this.f27447a = null;
        this.f27448b = null;
        this.f27449c = null;
        this.f27450d = null;
        this.f27451e = null;
        this.f27452f = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f27447a != null) {
            nyu.b(1, this.f27447a);
        }
        if (this.f27448b != null) {
            nyu.b(2, this.f27448b);
        }
        if (this.f27449c != null) {
            nyu.b(3, this.f27449c);
        }
        if (this.f27450d != null) {
            nyu.b(4, this.f27450d);
        }
        if (this.f27451e != null) {
            nyu.b(5, this.f27451e);
        }
        if (this.f27452f != null) {
            nyu.b(6, this.f27452f);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f27447a != null) {
            b += nyu.d(1, this.f27447a);
        }
        if (this.f27448b != null) {
            b += nyu.d(2, this.f27448b);
        }
        if (this.f27449c != null) {
            b += nyu.d(3, this.f27449c);
        }
        if (this.f27450d != null) {
            b += nyu.d(4, this.f27450d);
        }
        if (this.f27451e != null) {
            b += nyu.d(5, this.f27451e);
        }
        if (this.f27452f != null) {
            return b + nyu.d(6, this.f27452f);
        }
        return b;
    }

    private mdg m31830b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f27447a == null) {
                        this.f27447a = new mcv();
                    }
                    nyt.a(this.f27447a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f27448b == null) {
                        this.f27448b = new mdq();
                    }
                    nyt.a(this.f27448b);
                    continue;
                case wi.dx /*26*/:
                    if (this.f27449c == null) {
                        this.f27449c = new mcc();
                    }
                    nyt.a(this.f27449c);
                    continue;
                case 34:
                    if (this.f27450d == null) {
                        this.f27450d = new mdf();
                    }
                    nyt.a(this.f27450d);
                    continue;
                case 42:
                    if (this.f27451e == null) {
                        this.f27451e = new off();
                    }
                    nyt.a(this.f27451e);
                    continue;
                case 50:
                    if (this.f27452f == null) {
                        this.f27452f = new mca();
                    }
                    nyt.a(this.f27452f);
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
