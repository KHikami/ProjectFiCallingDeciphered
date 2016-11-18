package p000;

public final class lbe extends nyx<lbe> {
    public String f24463a;
    public String f24464b;
    public String f24465c;
    public Integer f24466d;
    public Integer f24467e;
    public String[] f24468f;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28451b(nyt);
    }

    public lbe() {
        m28452d();
    }

    private lbe m28452d() {
        this.f24463a = null;
        this.f24464b = null;
        this.f24465c = null;
        this.f24466d = null;
        this.f24468f = nzl.f;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f24463a != null) {
            nyu.a(1, this.f24463a);
        }
        if (this.f24464b != null) {
            nyu.a(2, this.f24464b);
        }
        if (this.f24465c != null) {
            nyu.a(3, this.f24465c);
        }
        if (this.f24466d != null) {
            nyu.a(4, this.f24466d.intValue());
        }
        if (this.f24467e != null) {
            nyu.a(5, this.f24467e.intValue());
        }
        if (this.f24468f != null && this.f24468f.length > 0) {
            for (String str : this.f24468f) {
                if (str != null) {
                    nyu.a(6, str);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b();
        if (this.f24463a != null) {
            b += nyu.b(1, this.f24463a);
        }
        if (this.f24464b != null) {
            b += nyu.b(2, this.f24464b);
        }
        if (this.f24465c != null) {
            b += nyu.b(3, this.f24465c);
        }
        if (this.f24466d != null) {
            b += nyu.f(4, this.f24466d.intValue());
        }
        if (this.f24467e != null) {
            b += nyu.f(5, this.f24467e.intValue());
        }
        if (this.f24468f == null || this.f24468f.length <= 0) {
            return b;
        }
        int i2 = 0;
        int i3 = 0;
        while (i < this.f24468f.length) {
            String str = this.f24468f[i];
            if (str != null) {
                i3++;
                i2 += nyu.b(str);
            }
            i++;
        }
        return (b + i2) + (i3 * 1);
    }

    private lbe m28451b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f24463a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f24464b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f24465c = nyt.j();
                    continue;
                case 32:
                    this.f24466d = Integer.valueOf(nyt.f());
                    continue;
                case 40:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                            this.f24467e = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 50:
                    int b = nzl.b(nyt, 50);
                    a = this.f24468f == null ? 0 : this.f24468f.length;
                    Object obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f24468f, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.f24468f = obj;
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
