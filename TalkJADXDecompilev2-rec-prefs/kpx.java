package p000;

public final class kpx extends nyx<kpx> {
    public kpw[] f22714a;
    public kqd f22715b;
    public kqd f22716c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26990b(nyt);
    }

    public kpx() {
        m26991d();
    }

    private kpx m26991d() {
        this.f22714a = kpw.m26985d();
        this.f22715b = null;
        this.f22716c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22714a != null && this.f22714a.length > 0) {
            for (nzf nzf : this.f22714a) {
                if (nzf != null) {
                    nyu.b(1, nzf);
                }
            }
        }
        if (this.f22715b != null) {
            nyu.b(2, this.f22715b);
        }
        if (this.f22716c != null) {
            nyu.b(3, this.f22716c);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22714a != null && this.f22714a.length > 0) {
            for (nzf nzf : this.f22714a) {
                if (nzf != null) {
                    b += nyu.d(1, nzf);
                }
            }
        }
        if (this.f22715b != null) {
            b += nyu.d(2, this.f22715b);
        }
        if (this.f22716c != null) {
            return b + nyu.d(3, this.f22716c);
        }
        return b;
    }

    private kpx m26990b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.b(nyt, 10);
                    if (this.f22714a == null) {
                        a = 0;
                    } else {
                        a = this.f22714a.length;
                    }
                    Object obj = new kpw[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f22714a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kpw();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kpw();
                    nyt.a(obj[a]);
                    this.f22714a = obj;
                    continue;
                case wi.dH /*18*/:
                    if (this.f22715b == null) {
                        this.f22715b = new kqd();
                    }
                    nyt.a(this.f22715b);
                    continue;
                case wi.dx /*26*/:
                    if (this.f22716c == null) {
                        this.f22716c = new kqd();
                    }
                    nyt.a(this.f22716c);
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
