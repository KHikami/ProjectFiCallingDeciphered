package p000;

public final class kxj extends nyx<kxj> {
    public String f23848a;
    public kxk[] f23849b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27926b(nyt);
    }

    public kxj() {
        this.f23848a = null;
        this.f23849b = kxk.m27931d();
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f23848a != null) {
            nyu.a(1, this.f23848a);
        }
        if (this.f23849b != null && this.f23849b.length > 0) {
            for (nzf nzf : this.f23849b) {
                if (nzf != null) {
                    nyu.b(2, nzf);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f23848a != null) {
            b += nyu.b(1, this.f23848a);
        }
        if (this.f23849b == null || this.f23849b.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f23849b) {
            if (nzf != null) {
                i += nyu.d(2, nzf);
            }
        }
        return i;
    }

    private kxj m27926b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f23848a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    int b = nzl.b(nyt, 18);
                    if (this.f23849b == null) {
                        a = 0;
                    } else {
                        a = this.f23849b.length;
                    }
                    Object obj = new kxk[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f23849b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kxk();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kxk();
                    nyt.a(obj[a]);
                    this.f23849b = obj;
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
