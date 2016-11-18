package p000;

public final class lef extends nyx<lef> {
    public String f24816a;
    public leg[] f24817b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28849b(nyt);
    }

    public lef() {
        m28850d();
    }

    private lef m28850d() {
        this.f24816a = null;
        this.f24817b = leg.m28855d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f24816a != null) {
            nyu.a(1, this.f24816a);
        }
        if (this.f24817b != null && this.f24817b.length > 0) {
            for (nzf nzf : this.f24817b) {
                if (nzf != null) {
                    nyu.b(2, nzf);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24816a != null) {
            b += nyu.b(1, this.f24816a);
        }
        if (this.f24817b == null || this.f24817b.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f24817b) {
            if (nzf != null) {
                i += nyu.d(2, nzf);
            }
        }
        return i;
    }

    private lef m28849b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f24816a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    int b = nzl.b(nyt, 18);
                    if (this.f24817b == null) {
                        a = 0;
                    } else {
                        a = this.f24817b.length;
                    }
                    Object obj = new leg[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f24817b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new leg();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new leg();
                    nyt.a(obj[a]);
                    this.f24817b = obj;
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
