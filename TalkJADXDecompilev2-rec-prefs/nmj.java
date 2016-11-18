package p000;

public final class nmj extends nyx<nmj> {
    public Integer f30233a;
    public String f30234b;
    public Long f30235c;
    public String f30236d;
    public String f30237e;
    public Long f30238f;
    public String f30239g;
    public String f30240h;
    public String f30241i;

    public /* synthetic */ nzf m35637a(nyt nyt) {
        return m35635b(nyt);
    }

    public nmj() {
        m35636d();
    }

    private nmj m35636d() {
        this.f30234b = null;
        this.f30235c = null;
        this.f30236d = null;
        this.f30237e = null;
        this.f30238f = null;
        this.f30239g = null;
        this.f30240h = null;
        this.f30241i = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35638a(nyu nyu) {
        if (this.f30233a != null) {
            nyu.m37168a(1, this.f30233a.intValue());
        }
        if (this.f30234b != null) {
            nyu.m37170a(2, this.f30234b);
        }
        if (this.f30235c != null) {
            nyu.m37181b(3, this.f30235c.longValue());
        }
        if (this.f30237e != null) {
            nyu.m37170a(4, this.f30237e);
        }
        if (this.f30238f != null) {
            nyu.m37181b(5, this.f30238f.longValue());
        }
        if (this.f30236d != null) {
            nyu.m37170a(6, this.f30236d);
        }
        if (this.f30239g != null) {
            nyu.m37170a(7, this.f30239g);
        }
        if (this.f30240h != null) {
            nyu.m37170a(8, this.f30240h);
        }
        if (this.f30241i != null) {
            nyu.m37170a(9, this.f30241i);
        }
        super.a(nyu);
    }

    protected int m35639b() {
        int b = super.b();
        if (this.f30233a != null) {
            b += nyu.m37147f(1, this.f30233a.intValue());
        }
        if (this.f30234b != null) {
            b += nyu.m37137b(2, this.f30234b);
        }
        if (this.f30235c != null) {
            b += nyu.m37148f(3, this.f30235c.longValue());
        }
        if (this.f30237e != null) {
            b += nyu.m37137b(4, this.f30237e);
        }
        if (this.f30238f != null) {
            b += nyu.m37148f(5, this.f30238f.longValue());
        }
        if (this.f30236d != null) {
            b += nyu.m37137b(6, this.f30236d);
        }
        if (this.f30239g != null) {
            b += nyu.m37137b(7, this.f30239g);
        }
        if (this.f30240h != null) {
            b += nyu.m37137b(8, this.f30240h);
        }
        if (this.f30241i != null) {
            return b + nyu.m37137b(9, this.f30241i);
        }
        return b;
    }

    private nmj m35635b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            this.f30233a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    this.f30234b = nyt.m37117j();
                    continue;
                case wi.dA /*24*/:
                    this.f30235c = Long.valueOf(nyt.m37110e());
                    continue;
                case 34:
                    this.f30237e = nyt.m37117j();
                    continue;
                case 40:
                    this.f30238f = Long.valueOf(nyt.m37110e());
                    continue;
                case 50:
                    this.f30236d = nyt.m37117j();
                    continue;
                case 58:
                    this.f30239g = nyt.m37117j();
                    continue;
                case 66:
                    this.f30240h = nyt.m37117j();
                    continue;
                case 74:
                    this.f30241i = nyt.m37117j();
                    continue;
                default:
                    if (!super.a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
