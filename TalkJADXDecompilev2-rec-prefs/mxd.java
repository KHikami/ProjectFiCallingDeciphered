package p000;

public final class mxd extends nyx<mxd> {
    public mxf[] f28663a;
    public mxc f28664b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m33298b(nyt);
    }

    public mxd() {
        m33299d();
    }

    private mxd m33299d() {
        this.f28663a = mxf.m33310d();
        this.f28664b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f28663a != null && this.f28663a.length > 0) {
            for (nzf nzf : this.f28663a) {
                if (nzf != null) {
                    nyu.b(1, nzf);
                }
            }
        }
        if (this.f28664b != null) {
            nyu.b(2, this.f28664b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f28663a != null && this.f28663a.length > 0) {
            for (nzf nzf : this.f28663a) {
                if (nzf != null) {
                    b += nyu.d(1, nzf);
                }
            }
        }
        if (this.f28664b != null) {
            return b + nyu.d(2, this.f28664b);
        }
        return b;
    }

    private mxd m33298b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.b(nyt, 10);
                    if (this.f28663a == null) {
                        a = 0;
                    } else {
                        a = this.f28663a.length;
                    }
                    Object obj = new mxf[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f28663a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new mxf();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new mxf();
                    nyt.a(obj[a]);
                    this.f28663a = obj;
                    continue;
                case wi.dH /*18*/:
                    if (this.f28664b == null) {
                        this.f28664b = new mxc();
                    }
                    nyt.a(this.f28664b);
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
