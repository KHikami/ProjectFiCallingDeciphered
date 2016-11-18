package p000;

public final class kpc extends nyx<kpc> {
    public kqd f22611a;
    public kpb[] f22612b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26879b(nyt);
    }

    public kpc() {
        m26880d();
    }

    private kpc m26880d() {
        this.f22611a = null;
        this.f22612b = kpb.m26874d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22611a != null) {
            nyu.b(1, this.f22611a);
        }
        if (this.f22612b != null && this.f22612b.length > 0) {
            for (nzf nzf : this.f22612b) {
                if (nzf != null) {
                    nyu.b(2, nzf);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22611a != null) {
            b += nyu.d(1, this.f22611a);
        }
        if (this.f22612b == null || this.f22612b.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f22612b) {
            if (nzf != null) {
                i += nyu.d(2, nzf);
            }
        }
        return i;
    }

    private kpc m26879b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f22611a == null) {
                        this.f22611a = new kqd();
                    }
                    nyt.a(this.f22611a);
                    continue;
                case wi.dH /*18*/:
                    int b = nzl.b(nyt, 18);
                    if (this.f22612b == null) {
                        a = 0;
                    } else {
                        a = this.f22612b.length;
                    }
                    Object obj = new kpb[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f22612b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kpb();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kpb();
                    nyt.a(obj[a]);
                    this.f22612b = obj;
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
