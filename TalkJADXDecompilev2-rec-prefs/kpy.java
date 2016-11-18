package p000;

public final class kpy extends nyx<kpy> {
    public kqd f22717a;
    public kpz[] f22718b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26995b(nyt);
    }

    public kpy() {
        m26996d();
    }

    private kpy m26996d() {
        this.f22717a = null;
        this.f22718b = kpz.m27001d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22717a != null) {
            nyu.b(1, this.f22717a);
        }
        if (this.f22718b != null && this.f22718b.length > 0) {
            for (nzf nzf : this.f22718b) {
                if (nzf != null) {
                    nyu.b(2, nzf);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22717a != null) {
            b += nyu.d(1, this.f22717a);
        }
        if (this.f22718b == null || this.f22718b.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f22718b) {
            if (nzf != null) {
                i += nyu.d(2, nzf);
            }
        }
        return i;
    }

    private kpy m26995b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f22717a == null) {
                        this.f22717a = new kqd();
                    }
                    nyt.a(this.f22717a);
                    continue;
                case wi.dH /*18*/:
                    int b = nzl.b(nyt, 18);
                    if (this.f22718b == null) {
                        a = 0;
                    } else {
                        a = this.f22718b.length;
                    }
                    Object obj = new kpz[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f22718b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kpz();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kpz();
                    nyt.a(obj[a]);
                    this.f22718b = obj;
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
