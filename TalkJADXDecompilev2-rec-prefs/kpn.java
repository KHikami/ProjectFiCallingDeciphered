package p000;

public final class kpn extends nyx<kpn> {
    public kqd f22671a;
    public kqd f22672b;
    public kpm[] f22673c;
    public Boolean f22674d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26936b(nyt);
    }

    public kpn() {
        m26937d();
    }

    private kpn m26937d() {
        this.f22671a = null;
        this.f22672b = null;
        this.f22673c = kpm.m26931d();
        this.f22674d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22671a != null) {
            nyu.b(1, this.f22671a);
        }
        if (this.f22673c != null && this.f22673c.length > 0) {
            for (nzf nzf : this.f22673c) {
                if (nzf != null) {
                    nyu.b(2, nzf);
                }
            }
        }
        if (this.f22672b != null) {
            nyu.b(3, this.f22672b);
        }
        if (this.f22674d != null) {
            nyu.a(4, this.f22674d.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22671a != null) {
            b += nyu.d(1, this.f22671a);
        }
        if (this.f22673c != null && this.f22673c.length > 0) {
            int i = b;
            for (nzf nzf : this.f22673c) {
                if (nzf != null) {
                    i += nyu.d(2, nzf);
                }
            }
            b = i;
        }
        if (this.f22672b != null) {
            b += nyu.d(3, this.f22672b);
        }
        if (this.f22674d == null) {
            return b;
        }
        this.f22674d.booleanValue();
        return b + (nyu.h(4) + 1);
    }

    private kpn m26936b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f22671a == null) {
                        this.f22671a = new kqd();
                    }
                    nyt.a(this.f22671a);
                    continue;
                case wi.dH /*18*/:
                    int b = nzl.b(nyt, 18);
                    if (this.f22673c == null) {
                        a = 0;
                    } else {
                        a = this.f22673c.length;
                    }
                    Object obj = new kpm[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f22673c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kpm();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kpm();
                    nyt.a(obj[a]);
                    this.f22673c = obj;
                    continue;
                case wi.dx /*26*/:
                    if (this.f22672b == null) {
                        this.f22672b = new kqd();
                    }
                    nyt.a(this.f22672b);
                    continue;
                case 32:
                    this.f22674d = Boolean.valueOf(nyt.i());
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
