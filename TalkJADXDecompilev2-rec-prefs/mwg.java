package p000;

public final class mwg extends nyx<mwg> {
    public mwh[] f28584a;
    public mwi f28585b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m33196b(nyt);
    }

    public mwg() {
        this.f28584a = mwh.m33201d();
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f28584a != null && this.f28584a.length > 0) {
            for (nzf nzf : this.f28584a) {
                if (nzf != null) {
                    nyu.b(1, nzf);
                }
            }
        }
        if (this.f28585b != null) {
            nyu.b(2, this.f28585b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f28584a != null && this.f28584a.length > 0) {
            for (nzf nzf : this.f28584a) {
                if (nzf != null) {
                    b += nyu.d(1, nzf);
                }
            }
        }
        if (this.f28585b != null) {
            return b + nyu.d(2, this.f28585b);
        }
        return b;
    }

    private mwg m33196b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.b(nyt, 10);
                    if (this.f28584a == null) {
                        a = 0;
                    } else {
                        a = this.f28584a.length;
                    }
                    Object obj = new mwh[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f28584a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new mwh();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new mwh();
                    nyt.a(obj[a]);
                    this.f28584a = obj;
                    continue;
                case wi.dH /*18*/:
                    if (this.f28585b == null) {
                        this.f28585b = new mwi();
                    }
                    nyt.a(this.f28585b);
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
