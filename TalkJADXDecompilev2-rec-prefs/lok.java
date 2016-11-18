package p000;

public final class lok extends nyx<lok> {
    public loi[] f25878a;
    public lpn f25879b;
    public Boolean f25880c;
    public Integer f25881d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29755b(nyt);
    }

    public lok() {
        m29756d();
    }

    private lok m29756d() {
        this.f25878a = loi.m29744d();
        this.f25879b = null;
        this.f25880c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f25878a != null && this.f25878a.length > 0) {
            for (nzf nzf : this.f25878a) {
                if (nzf != null) {
                    nyu.b(1, nzf);
                }
            }
        }
        if (this.f25879b != null) {
            nyu.b(2, this.f25879b);
        }
        if (this.f25880c != null) {
            nyu.a(3, this.f25880c.booleanValue());
        }
        if (this.f25881d != null) {
            nyu.a(4, this.f25881d.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f25878a != null && this.f25878a.length > 0) {
            for (nzf nzf : this.f25878a) {
                if (nzf != null) {
                    b += nyu.d(1, nzf);
                }
            }
        }
        if (this.f25879b != null) {
            b += nyu.d(2, this.f25879b);
        }
        if (this.f25880c != null) {
            this.f25880c.booleanValue();
            b += nyu.h(3) + 1;
        }
        if (this.f25881d != null) {
            return b + nyu.f(4, this.f25881d.intValue());
        }
        return b;
    }

    private lok m29755b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.b(nyt, 10);
                    if (this.f25878a == null) {
                        a = 0;
                    } else {
                        a = this.f25878a.length;
                    }
                    Object obj = new loi[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f25878a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new loi();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new loi();
                    nyt.a(obj[a]);
                    this.f25878a = obj;
                    continue;
                case wi.dH /*18*/:
                    if (this.f25879b == null) {
                        this.f25879b = new lpn();
                    }
                    nyt.a(this.f25879b);
                    continue;
                case wi.dA /*24*/:
                    this.f25880c = Boolean.valueOf(nyt.i());
                    continue;
                case 32:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f25881d = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
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
