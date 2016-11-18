package p000;

public final class kpr extends nyx<kpr> {
    public kqd f22689a;
    public kpq[] f22690b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26958b(nyt);
    }

    public kpr() {
        m26959d();
    }

    private kpr m26959d() {
        this.f22689a = null;
        this.f22690b = kpq.m26953d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22689a != null) {
            nyu.b(1, this.f22689a);
        }
        if (this.f22690b != null && this.f22690b.length > 0) {
            for (nzf nzf : this.f22690b) {
                if (nzf != null) {
                    nyu.b(2, nzf);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22689a != null) {
            b += nyu.d(1, this.f22689a);
        }
        if (this.f22690b == null || this.f22690b.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f22690b) {
            if (nzf != null) {
                i += nyu.d(2, nzf);
            }
        }
        return i;
    }

    private kpr m26958b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f22689a == null) {
                        this.f22689a = new kqd();
                    }
                    nyt.a(this.f22689a);
                    continue;
                case wi.dH /*18*/:
                    int b = nzl.b(nyt, 18);
                    if (this.f22690b == null) {
                        a = 0;
                    } else {
                        a = this.f22690b.length;
                    }
                    Object obj = new kpq[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f22690b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kpq();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kpq();
                    nyt.a(obj[a]);
                    this.f22690b = obj;
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
