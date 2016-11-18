package p000;

public final class kwk extends nyx<kwk> {
    public kwh f23772a;
    public String f23773b;
    public String f23774c;
    public kvl[] f23775d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27805b(nyt);
    }

    public kwk() {
        this.f23773b = null;
        this.f23774c = null;
        this.f23775d = kvl.m27700d();
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f23772a != null) {
            nyu.b(1, this.f23772a);
        }
        if (this.f23773b != null) {
            nyu.a(2, this.f23773b);
        }
        if (this.f23774c != null) {
            nyu.a(3, this.f23774c);
        }
        if (this.f23775d != null && this.f23775d.length > 0) {
            for (nzf nzf : this.f23775d) {
                if (nzf != null) {
                    nyu.b(4, nzf);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f23772a != null) {
            b += nyu.d(1, this.f23772a);
        }
        if (this.f23773b != null) {
            b += nyu.b(2, this.f23773b);
        }
        if (this.f23774c != null) {
            b += nyu.b(3, this.f23774c);
        }
        if (this.f23775d == null || this.f23775d.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f23775d) {
            if (nzf != null) {
                i += nyu.d(4, nzf);
            }
        }
        return i;
    }

    private kwk m27805b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f23772a == null) {
                        this.f23772a = new kwh();
                    }
                    nyt.a(this.f23772a);
                    continue;
                case wi.dH /*18*/:
                    this.f23773b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f23774c = nyt.j();
                    continue;
                case 34:
                    int b = nzl.b(nyt, 34);
                    if (this.f23775d == null) {
                        a = 0;
                    } else {
                        a = this.f23775d.length;
                    }
                    Object obj = new kvl[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f23775d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kvl();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kvl();
                    nyt.a(obj[a]);
                    this.f23775d = obj;
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
