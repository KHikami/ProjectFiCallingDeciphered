package p000;

public final class kob extends nyx<kob> {
    public kof[] f22471a;
    public kos f22472b;
    public koe f22473c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26758b(nyt);
    }

    public kob() {
        this.f22471a = kof.m26775d();
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f22471a != null && this.f22471a.length > 0) {
            for (nzf nzf : this.f22471a) {
                if (nzf != null) {
                    nyu.b(1, nzf);
                }
            }
        }
        if (this.f22472b != null) {
            nyu.b(2, this.f22472b);
        }
        if (this.f22473c != null) {
            nyu.b(3, this.f22473c);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22471a != null && this.f22471a.length > 0) {
            for (nzf nzf : this.f22471a) {
                if (nzf != null) {
                    b += nyu.d(1, nzf);
                }
            }
        }
        if (this.f22472b != null) {
            b += nyu.d(2, this.f22472b);
        }
        if (this.f22473c != null) {
            return b + nyu.d(3, this.f22473c);
        }
        return b;
    }

    private kob m26758b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.b(nyt, 10);
                    if (this.f22471a == null) {
                        a = 0;
                    } else {
                        a = this.f22471a.length;
                    }
                    Object obj = new kof[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f22471a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kof();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kof();
                    nyt.a(obj[a]);
                    this.f22471a = obj;
                    continue;
                case wi.dH /*18*/:
                    if (this.f22472b == null) {
                        this.f22472b = new kos();
                    }
                    nyt.a(this.f22472b);
                    continue;
                case wi.dx /*26*/:
                    if (this.f22473c == null) {
                        this.f22473c = new koe();
                    }
                    nyt.a(this.f22473c);
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
