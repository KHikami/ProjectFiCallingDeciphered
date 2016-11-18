package p000;

public final class mwn extends nyx<mwn> {
    public mwo f28604a;
    public Long f28605b;
    public mwt f28606c;
    public mwz[] f28607d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m33227b(nyt);
    }

    public mwn() {
        this.f28605b = null;
        this.f28607d = mwz.m33280d();
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f28604a != null) {
            nyu.b(1, this.f28604a);
        }
        if (this.f28605b != null) {
            nyu.b(2, this.f28605b.longValue());
        }
        if (this.f28606c != null) {
            nyu.b(3, this.f28606c);
        }
        if (this.f28607d != null && this.f28607d.length > 0) {
            for (nzf nzf : this.f28607d) {
                if (nzf != null) {
                    nyu.b(4, nzf);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f28604a != null) {
            b += nyu.d(1, this.f28604a);
        }
        if (this.f28605b != null) {
            b += nyu.f(2, this.f28605b.longValue());
        }
        if (this.f28606c != null) {
            b += nyu.d(3, this.f28606c);
        }
        if (this.f28607d == null || this.f28607d.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f28607d) {
            if (nzf != null) {
                i += nyu.d(4, nzf);
            }
        }
        return i;
    }

    private mwn m33227b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f28604a == null) {
                        this.f28604a = new mwo();
                    }
                    nyt.a(this.f28604a);
                    continue;
                case 16:
                    this.f28605b = Long.valueOf(nyt.e());
                    continue;
                case wi.dx /*26*/:
                    if (this.f28606c == null) {
                        this.f28606c = new mwt();
                    }
                    nyt.a(this.f28606c);
                    continue;
                case 34:
                    int b = nzl.b(nyt, 34);
                    if (this.f28607d == null) {
                        a = 0;
                    } else {
                        a = this.f28607d.length;
                    }
                    Object obj = new mwz[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f28607d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new mwz();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new mwz();
                    nyt.a(obj[a]);
                    this.f28607d = obj;
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
